package ru.ok.tracer.heap.dumps.exceptions;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import xsna.h5s;
import xsna.ji;
import xsna.tgw;

@Deprecated
/* loaded from: classes9.dex */
public class HprofFastInputStream extends InputStream {
    private static final int BUFFER_SIZE = 65536;
    private static final byte FIXED_BYTE = -2;
    private static final int HPROF_GC_CLASS_DUMP = 32;
    private static final int HPROF_GC_INSTANCE_DUMP = 33;
    private static final int HPROF_GC_OBJ_ARRAY_DUMP = 34;
    private static final int HPROF_GC_PRIMITIVE_ARRAY_DUMP = 35;
    private static final int HPROF_GC_ROOT_JAVA_FRAME = 3;
    private static final int HPROF_GC_ROOT_JNI_GLOBAL = 1;
    private static final int HPROF_GC_ROOT_JNI_LOCAL = 2;
    private static final int HPROF_GC_ROOT_MONITOR_USED = 7;
    private static final int HPROF_GC_ROOT_NATIVE_STACK = 4;
    private static final int HPROF_GC_ROOT_STICKY_CLASS = 5;
    private static final int HPROF_GC_ROOT_THREAD_BLOCK = 6;
    private static final int HPROF_GC_ROOT_THREAD_OBJ = 8;
    private static final int HPROF_GC_ROOT_UNKNOWN = 255;
    private static final int HPROF_HEAP_DUMP = 12;
    private static final int HPROF_HEAP_DUMP_INFO = 254;
    private static final int HPROF_HEAP_DUMP_SEGMENT = 28;
    private static final int HPROF_PRIMITIVE_ARRAY_NODATA_DUMP = 195;
    private static final int HPROF_ROOT_DEBUGGER = 139;
    private static final int HPROF_ROOT_FINALIZING = 138;
    private static final int HPROF_ROOT_INTERNED_STRING = 137;
    private static final int HPROF_ROOT_JNI_MONITOR = 142;
    private static final int HPROF_ROOT_REFERENCE_CLEANUP = 140;
    private static final int HPROF_ROOT_VM_INTERNAL = 141;
    private static final int HPROF_UNREACHABLE = 144;
    private static final int T_BOOLEAN = 4;
    private static final int T_BYTE = 8;
    private static final int T_CHAR = 5;
    private static final int T_DOUBLE = 7;
    private static final int T_FLOAT = 6;
    private static final int T_INT = 10;
    private static final int T_LONG = 11;
    private static final int T_SHORT = 9;
    private boolean fileCompressed;
    private int identifierSize;
    private final DataInputStream in;
    private final Mode mode;
    private int primitiveArraysSize = 0;
    private int objectArraysSize = 0;
    private int instancesSize = 0;
    private int classesSize = 0;
    private int nonHeapData = 0;
    private int pos = 0;
    private int nextTokenPosition = 4;
    private int heapParsingLength = 0;
    private int fixedByteLength = 0;
    private byte[] buffer = new byte[65536];
    private int bufferReadPointer = 0;
    private int bufferWritePointer = 0;

    public enum Mode {
        INFLATE,
        DEFLATE
    }

    public HprofFastInputStream(DataInputStream dataInputStream, Mode mode) {
        this.in = dataInputStream;
        this.mode = mode;
    }

    public static HprofFastInputStream deflate(InputStream inputStream) {
        return new HprofFastInputStream(new DataInputStream(new BufferedInputStream(inputStream)), Mode.DEFLATE);
    }

    private void discardFromInput(int i) throws IOException {
        while (i > 0) {
            int skipBytes = this.in.skipBytes(i);
            if (skipBytes == -1) {
                throw new EOFException();
            }
            this.pos += skipBytes;
            i -= skipBytes;
        }
    }

    private int heapReadByte() throws IOException {
        int read = this.in.read();
        maybeExpandBuffer(1);
        byte[] bArr = this.buffer;
        int i = this.bufferWritePointer;
        this.bufferWritePointer = i + 1;
        bArr[i] = (byte) read;
        this.heapParsingLength--;
        this.pos++;
        return read;
    }

    private long heapReadId() throws IOException {
        long heapReadInt = heapReadInt();
        return this.identifierSize == 8 ? (heapReadInt << 32) | heapReadInt() : heapReadInt;
    }

    private int heapReadInt() throws IOException {
        this.heapParsingLength -= 4;
        return readIntAndBuffer();
    }

    private int heapReadShort() throws IOException {
        int read = this.in.read();
        int read2 = this.in.read();
        maybeExpandBuffer(2);
        byte[] bArr = this.buffer;
        int i = this.bufferWritePointer;
        int i2 = i + 1;
        this.bufferWritePointer = i2;
        bArr[i] = (byte) read;
        this.bufferWritePointer = i + 2;
        bArr[i2] = (byte) read2;
        this.heapParsingLength -= 2;
        this.pos += 2;
        return (read << 8) | read2;
    }

    private void maybeExpandBuffer(int i) {
        if (this.bufferWritePointer + i > this.buffer.length) {
            byte[] bArr = new byte[(int) (r5.length * 1.5d)];
            byte[] bArr2 = this.buffer;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.buffer = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseHeap() throws IOException {
        if (this.heapParsingLength < 0) {
            throw new IllegalArgumentException(h5s.c(this.heapParsingLength, " heap length", new StringBuilder("Heap parsing reached ")));
        }
        int heapReadByte = heapReadByte();
        int i = 0;
        if (heapReadByte != HPROF_UNREACHABLE) {
            if (heapReadByte != HPROF_PRIMITIVE_ARRAY_NODATA_DUMP) {
                int i2 = 4;
                if (heapReadByte != HPROF_HEAP_DUMP_INFO) {
                    if (heapReadByte != 255) {
                        switch (heapReadByte) {
                            case 1:
                                skipHeap(this.identifierSize * 2);
                                break;
                            case 2:
                            case 3:
                            case 8:
                                skipHeap(this.identifierSize + 8);
                                break;
                            case 4:
                            case 6:
                                break;
                            case 5:
                            case 7:
                                break;
                            default:
                                switch (heapReadByte) {
                                    case 32:
                                        this.classesSize -= this.bufferWritePointer;
                                        skipHeap((this.identifierSize * 7) + 8);
                                        int heapReadShort = heapReadShort();
                                        for (int i3 = 0; i3 < heapReadShort; i3++) {
                                            skipHeap(2);
                                            skipValue();
                                        }
                                        int heapReadShort2 = heapReadShort();
                                        for (int i4 = 0; i4 < heapReadShort2; i4++) {
                                            skipHeap(this.identifierSize);
                                            skipValue();
                                        }
                                        skipHeap((this.identifierSize + 1) * heapReadShort());
                                        this.classesSize += this.bufferWritePointer;
                                        break;
                                    case 33:
                                        this.instancesSize -= this.bufferWritePointer;
                                        skipHeap((this.identifierSize * 2) + 4);
                                        skipHeap(heapReadInt());
                                        this.instancesSize += this.bufferWritePointer;
                                        break;
                                    case 34:
                                    case 35:
                                        heapReadId();
                                        heapReadInt();
                                        int heapReadInt = heapReadInt();
                                        switch ((int) (heapReadByte == 35 ? heapReadByte() : heapReadId())) {
                                            case 4:
                                            case 8:
                                                i2 = 1;
                                                break;
                                            case 5:
                                            case 9:
                                                i2 = 2;
                                                break;
                                            case 6:
                                            case 10:
                                                break;
                                            case 7:
                                            case 11:
                                                i2 = 8;
                                                break;
                                            default:
                                                i2 = 0;
                                                break;
                                        }
                                        boolean z = i2 == 0;
                                        if (z) {
                                            i2 = this.identifierSize;
                                        }
                                        int i5 = i2 * heapReadInt;
                                        if (z) {
                                            this.objectArraysSize += i5;
                                            i = i5;
                                        } else {
                                            if (this.mode == Mode.DEFLATE) {
                                                if (!this.fileCompressed) {
                                                    discardFromInput(i5);
                                                }
                                            } else if (this.fileCompressed) {
                                                this.fixedByteLength = i5;
                                            } else {
                                                i = i5;
                                            }
                                            this.primitiveArraysSize += i5;
                                        }
                                        this.heapParsingLength -= i5;
                                        break;
                                    default:
                                        switch (heapReadByte) {
                                            case 137:
                                            case 138:
                                            case HPROF_ROOT_DEBUGGER /* 139 */:
                                            case 140:
                                            case HPROF_ROOT_VM_INTERNAL /* 141 */:
                                                break;
                                            case HPROF_ROOT_JNI_MONITOR /* 142 */:
                                                break;
                                            default:
                                                StringBuilder b = ji.b(heapReadByte, "Type ", " is not supported! ");
                                                b.append(this.pos);
                                                throw new IllegalArgumentException(b.toString());
                                        }
                                }
                        }
                    }
                }
                skipHeap(this.identifierSize + 4);
            } else {
                skipHeap(this.identifierSize + 9);
            }
            this.nextTokenPosition = this.pos + i;
        }
        skipHeap(this.identifierSize);
        this.nextTokenPosition = this.pos + i;
    }

    private boolean parseNextToken() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            return false;
        }
        maybeExpandBuffer(1);
        byte[] bArr = this.buffer;
        int i = this.bufferWritePointer;
        this.bufferWritePointer = i + 1;
        bArr[i] = (byte) read;
        this.pos++;
        readIntAndBuffer();
        int readIntAndBuffer = readIntAndBuffer();
        if (read == 12 || read == 28) {
            this.nextTokenPosition = this.pos;
            this.heapParsingLength = readIntAndBuffer;
        } else {
            this.nextTokenPosition = this.pos + readIntAndBuffer;
            this.nonHeapData += readIntAndBuffer;
        }
        return true;
    }

    private boolean prepareNextTokenBuffer() throws IOException {
        this.bufferReadPointer = 0;
        this.bufferWritePointer = 0;
        if (this.heapParsingLength == 0) {
            return parseNextToken();
        }
        parseHeap();
        return true;
    }

    private int readDirectly() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.pos++;
        }
        return read;
    }

    private int readFromBuffer(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.bufferWritePointer - this.bufferReadPointer);
        System.arraycopy(this.buffer, this.bufferReadPointer, bArr, i, min);
        this.bufferReadPointer += min;
        return min;
    }

    private void readHeader() throws IOException {
        byte readByte;
        this.fileCompressed = this.in.readByte() == 67;
        if (this.mode == Mode.DEFLATE) {
            byte[] bArr = this.buffer;
            int i = this.bufferWritePointer;
            this.bufferWritePointer = i + 1;
            bArr[i] = 67;
        } else {
            byte[] bArr2 = this.buffer;
            int i2 = this.bufferWritePointer;
            this.bufferWritePointer = i2 + 1;
            bArr2[i2] = 74;
        }
        do {
            readByte = this.in.readByte();
            byte[] bArr3 = this.buffer;
            int i3 = this.bufferWritePointer;
            this.bufferWritePointer = i3 + 1;
            bArr3[i3] = readByte;
        } while (readByte != 0);
        this.identifierSize = readIntAndBuffer();
        this.in.readFully(this.buffer, this.bufferWritePointer, 8);
        int i4 = this.bufferWritePointer + 8;
        this.bufferWritePointer = i4;
        this.pos = i4;
        this.nextTokenPosition = i4;
    }

    private int readIntAndBuffer() throws IOException {
        maybeExpandBuffer(4);
        this.in.readFully(this.buffer, this.bufferWritePointer, 4);
        byte[] bArr = this.buffer;
        int i = this.bufferWritePointer;
        int i2 = i + 1;
        this.bufferWritePointer = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.bufferWritePointer = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.bufferWritePointer = i6;
        int i7 = bArr[i4] & 255;
        this.bufferWritePointer = i + 4;
        int i8 = bArr[i6] & 255;
        this.pos += 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | i8;
    }

    private int readOneByteFromBuffer() {
        byte[] bArr = this.buffer;
        int i = this.bufferReadPointer;
        this.bufferReadPointer = i + 1;
        return bArr[i];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int sizeForTypeSignature(int i) {
        if (i != 2) {
            if (i == 70) {
                return 4;
            }
            if (i != 76) {
                if (i != 83) {
                    if (i == 73) {
                        return 4;
                    }
                    if (i == 74) {
                        return 8;
                    }
                    if (i == 90) {
                        return 1;
                    }
                    if (i != 91) {
                        switch (i) {
                            case 4:
                            case 8:
                                return 1;
                            case 5:
                            case 9:
                                break;
                            case 6:
                            case 10:
                                return 4;
                            case 7:
                            case 11:
                                return 8;
                            default:
                                switch (i) {
                                    case 66:
                                        return 1;
                                    case 67:
                                        break;
                                    case 68:
                                        return 8;
                                    default:
                                        throw new IllegalArgumentException(tgw.b(i, "Signature type ", " is not supported"));
                                }
                        }
                    }
                }
                return 2;
            }
        }
        return this.identifierSize;
    }

    private void skipHeap(int i) throws IOException {
        maybeExpandBuffer(i);
        this.in.readFully(this.buffer, this.bufferWritePointer, i);
        this.bufferWritePointer += i;
        this.pos += i;
        this.heapParsingLength -= i;
    }

    private void skipValue() throws IOException {
        skipHeap(sizeForTypeSignature(heapReadByte()));
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.pos;
        if (i == 0) {
            readHeader();
            return readOneByteFromBuffer();
        }
        if (this.bufferWritePointer > this.bufferReadPointer) {
            return readOneByteFromBuffer();
        }
        int i2 = this.fixedByteLength;
        if (i2 > 0) {
            this.fixedByteLength = i2 - 1;
            return -2;
        }
        if (this.nextTokenPosition > i) {
            return readDirectly();
        }
        if (prepareNextTokenBuffer()) {
            return readOneByteFromBuffer();
        }
        return -1;
    }

    private int readDirectly(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.pos += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.pos;
        if (i3 == 0) {
            readHeader();
            return readFromBuffer(bArr, i, i2);
        }
        if (this.bufferWritePointer > this.bufferReadPointer) {
            return readFromBuffer(bArr, i, i2);
        }
        int i4 = this.fixedByteLength;
        if (i4 > 0) {
            int min = Math.min(i2, i4);
            Arrays.fill(bArr, i, i + min, FIXED_BYTE);
            this.fixedByteLength -= min;
            return min;
        }
        int i5 = this.nextTokenPosition;
        if (i5 > i3) {
            return readDirectly(bArr, i, Math.min(i2, i5 - i3));
        }
        if (prepareNextTokenBuffer()) {
            return readFromBuffer(bArr, i, i2);
        }
        return -1;
    }
}
