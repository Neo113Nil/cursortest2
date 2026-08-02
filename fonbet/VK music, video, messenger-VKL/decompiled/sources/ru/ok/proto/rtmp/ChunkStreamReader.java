package ru.ok.proto.rtmp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import xsna.wlb0;

/* loaded from: classes9.dex */
public class ChunkStreamReader {
    private static final int MAX_ALLOCATED_SIZE = 512000;
    private static String TAG = "ru.ok.proto.rtmp.ChunkStreamReader";
    private final AtomicLong allocatedBytes;
    private final int chunkStreamId;
    private boolean extendedTimestamp;
    private int headerTimestamp;
    private ByteBuffer incompleteMessage;
    private int messageSize;
    private int messageStreamId;
    private int messageTimestamp;
    private byte messageType = 0;

    public ChunkStreamReader(int i, AtomicLong atomicLong) {
        this.chunkStreamId = i;
        this.allocatedBytes = atomicLong;
    }

    private void read(InputStream inputStream, ByteBuffer byteBuffer, int i) throws IOException {
        if (!byteBuffer.hasArray()) {
            byte[] bArr = new byte[i];
            wlb0.r(inputStream, bArr, 0, i);
            byteBuffer.put(bArr);
        } else {
            wlb0.r(inputStream, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    private void readMessageHeader(DataInputStream dataInputStream, int i) throws IOException {
        ByteBuffer byteBuffer;
        if (i < 3) {
            int readU24 = readU24(dataInputStream);
            this.headerTimestamp = readU24;
            this.extendedTimestamp = readU24 == 16777215;
            if (i < 2) {
                this.messageSize = readU24(dataInputStream);
                this.messageType = dataInputStream.readByte();
                if (i < 1) {
                    this.messageStreamId = Integer.reverseBytes(dataInputStream.readInt());
                }
            }
        }
        if (this.extendedTimestamp) {
            this.headerTimestamp = dataInputStream.readInt();
        }
        if (this.headerTimestamp == 16777215) {
            this.headerTimestamp = dataInputStream.readInt();
        }
        if (i == 0) {
            this.messageTimestamp = this.headerTimestamp;
        } else {
            if (!(3 == i && ((byteBuffer = this.incompleteMessage) == null || byteBuffer.position() == 0)) && 3 == i) {
                return;
            }
            this.messageTimestamp += this.headerTimestamp;
        }
    }

    private int readU24(DataInputStream dataInputStream) throws IOException {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i = (i << 8) | (dataInputStream.readByte() & 255);
        }
        return i;
    }

    public void abortMessage() {
        this.incompleteMessage.position(0);
    }

    public void readData(DataInputStream dataInputStream, int i, int i2) throws IOException, ProtocolException {
        ChunkStreamReader chunkStreamReader;
        ByteBuffer byteBuffer;
        readMessageHeader(dataInputStream, i);
        if (3 != i && (byteBuffer = this.incompleteMessage) != null && byteBuffer.position() != 0) {
            abortMessage();
        }
        ByteBuffer byteBuffer2 = this.incompleteMessage;
        int min = Math.min(i2, this.messageSize - (byteBuffer2 == null ? 0 : byteBuffer2.position()));
        ByteBuffer byteBuffer3 = this.incompleteMessage;
        if (byteBuffer3 == null || byteBuffer3.capacity() < this.messageSize) {
            long andAdd = this.allocatedBytes.getAndAdd(this.messageSize);
            int i3 = this.messageSize;
            if (i3 + andAdd > 512000) {
                throw new ProtocolException("Trying to allocate too many bytes on this connection: sz=" + this.messageSize + " allocatedBytes=" + andAdd);
            }
            this.incompleteMessage = ByteBuffer.allocate(i3);
        }
        this.incompleteMessage.limit(this.messageSize);
        read(dataInputStream, this.incompleteMessage, min);
        int position = this.incompleteMessage.position();
        int i4 = this.messageSize;
        if (position != i4 || i4 <= 0) {
            return;
        }
        try {
            this.incompleteMessage.position(0);
            try {
                processPacket(this.messageType, this.chunkStreamId, this.messageStreamId, this.messageTimestamp, this.incompleteMessage);
                this.allocatedBytes.addAndGet(-this.messageSize);
                this.incompleteMessage = null;
            } catch (Throwable th) {
                th = th;
                chunkStreamReader = this;
                Throwable th2 = th;
                chunkStreamReader.allocatedBytes.addAndGet(-chunkStreamReader.messageSize);
                chunkStreamReader.incompleteMessage = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            chunkStreamReader = this;
        }
    }

    public void processPacket(byte b, int i, int i2, int i3, ByteBuffer byteBuffer) throws ProtocolException, IOException {
    }
}
