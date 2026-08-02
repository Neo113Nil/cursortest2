package ru.ok.proto.rtmp;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import xsna.lhg;

/* loaded from: classes9.dex */
public class ChunkStreamWriter {
    private static final String TAG = "ru.ok.proto.rtmp.ChunkStreamWriter";
    private final int chunkStreamId;
    private boolean extendedTs;
    private int prevMessageTimestamp;
    private byte[] writeBuffer;
    private int prevMessageStreamId = -1;
    private int prevMessageSize = -1;
    private byte prevMessageType = -1;

    public ChunkStreamWriter(int i) {
        if (i < 2 || i > 65599) {
            throw new IllegalArgumentException(lhg.a(i, "Incorrect chunk stream id: "));
        }
        this.chunkStreamId = i;
    }

    private byte[] reallocWriteBuffer(int i) {
        byte[] bArr = this.writeBuffer;
        if (bArr == null || bArr.length < i) {
            this.writeBuffer = new byte[i];
        }
        return this.writeBuffer;
    }

    private void write(OutputStream outputStream, ByteBuffer byteBuffer, int i) throws IOException {
        if (!byteBuffer.hasArray()) {
            byte[] reallocWriteBuffer = reallocWriteBuffer(i);
            byteBuffer.get(reallocWriteBuffer, 0, i);
            outputStream.write(reallocWriteBuffer, 0, i);
        } else {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    private void writeChunkHeader(DataOutputStream dataOutputStream, int i, int i2, int i3, byte b) throws IOException {
        int i4 = i2 - this.prevMessageTimestamp;
        int i5 = this.prevMessageSize;
        int i6 = (i5 <= 0 || i4 < 0 || this.prevMessageStreamId != i) ? 0 : (i3 == i5 && b == this.prevMessageType) ? 2 : 1;
        int i7 = this.chunkStreamId;
        if (i7 < 64) {
            dataOutputStream.writeByte(i7 | (i6 << 6));
        } else if (i7 < 320) {
            dataOutputStream.writeByte(i6 << 6);
            dataOutputStream.writeByte(this.chunkStreamId - 64);
        } else {
            dataOutputStream.writeByte((i6 << 6) | 1);
            dataOutputStream.writeByte((this.chunkStreamId - 64) & 255);
            dataOutputStream.writeByte((this.chunkStreamId - 64) >>> 8);
        }
        if (i6 == 0) {
            i4 = i2;
        }
        boolean z = i4 >= 16777215;
        this.extendedTs = z;
        if (z) {
            i4 = 16777215;
        }
        writeU24(dataOutputStream, i4);
        if (i6 < 2) {
            writeU24(dataOutputStream, i3);
            dataOutputStream.writeByte(b);
        }
        if (i6 < 1) {
            dataOutputStream.writeInt(Integer.reverseBytes(i));
        }
        if (this.extendedTs) {
            dataOutputStream.writeInt(i2);
        }
        this.prevMessageStreamId = i;
        this.prevMessageType = b;
        this.prevMessageSize = i3;
        this.prevMessageTimestamp = i2;
    }

    private void writeT3ChunkHeader(DataOutputStream dataOutputStream) throws IOException {
        int i = this.chunkStreamId;
        if (i < 64) {
            dataOutputStream.writeByte(i | PsExtractor.AUDIO_STREAM);
        } else if (i < 320) {
            dataOutputStream.writeByte(PsExtractor.AUDIO_STREAM);
            dataOutputStream.writeByte(this.chunkStreamId - 64);
        } else {
            dataOutputStream.writeByte(193);
            dataOutputStream.writeByte((this.chunkStreamId - 64) & 255);
            dataOutputStream.writeByte((this.chunkStreamId - 64) >>> 8);
        }
        if (this.extendedTs) {
            dataOutputStream.writeInt(this.prevMessageTimestamp);
        }
    }

    private void writeU24(DataOutputStream dataOutputStream, int i) throws IOException {
        for (int i2 = 2; i2 >= 0; i2--) {
            dataOutputStream.writeByte((i >>> (i2 * 8)) & 255);
        }
    }

    public int getBuffersRemaining(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining();
        }
        return i;
    }

    public void writeChunks(DataOutputStream dataOutputStream, List<ByteBuffer> list, int i) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        int buffersRemaining = getBuffersRemaining(list);
        Iterator<ByteBuffer> it = list.iterator();
        ByteBuffer next = it.next();
        while (true) {
            int min = Math.min(i, buffersRemaining);
            buffersRemaining -= min;
            while (true) {
                int min2 = Math.min(min, next.remaining());
                write(dataOutputStream, next, min2);
                min -= min2;
                if (min <= 0) {
                    break;
                } else {
                    next = it.next();
                }
            }
            if (buffersRemaining <= 0) {
                return;
            } else {
                writeT3ChunkHeader(dataOutputStream);
            }
        }
    }

    public void writeMessage(DataOutputStream dataOutputStream, List<ByteBuffer> list, int i, byte b, int i2, int i3) throws IOException {
        writeChunkHeader(dataOutputStream, i2, i, getBuffersRemaining(list), b);
        writeChunks(dataOutputStream, list, i3);
    }
}
