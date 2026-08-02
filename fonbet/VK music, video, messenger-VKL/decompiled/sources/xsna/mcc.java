package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChunkStreamWriter.java */
/* loaded from: classes8.dex */
public final class mcc {
    public final int a;
    public int b = -1;
    public int c = -1;
    public byte d = -1;
    public byte[] e;
    public boolean f;

    public mcc(int i) {
        if (i < 2 || i > 65599) {
            throw new IllegalArgumentException(lhg.a(i, "Incorrect chunk stream id: "));
        }
        this.a = i;
    }

    public final void a(DataOutputStream dataOutputStream, List list, byte b, int i) throws IOException {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((ByteBuffer) it.next()).remaining();
        }
        int i3 = this.c;
        int i4 = (i3 <= 0 || this.b != 0) ? 0 : (i2 == i3 && b == this.d) ? 2 : 1;
        int i5 = this.a;
        if (i5 < 64) {
            dataOutputStream.writeByte((i4 << 6) | i5);
        } else if (i5 < 320) {
            dataOutputStream.writeByte(i4 << 6);
            dataOutputStream.writeByte(i5 - 64);
        } else {
            dataOutputStream.writeByte((i4 << 6) | 1);
            int i6 = i5 - 64;
            dataOutputStream.writeByte(i6 & 255);
            dataOutputStream.writeByte(i6 >>> 8);
        }
        this.f = false;
        for (int i7 = 2; i7 >= 0; i7--) {
            dataOutputStream.writeByte(0);
        }
        if (i4 < 2) {
            for (int i8 = 2; i8 >= 0; i8--) {
                dataOutputStream.writeByte((i2 >>> (i8 * 8)) & 255);
            }
            dataOutputStream.writeByte(b);
        }
        if (i4 < 1) {
            dataOutputStream.writeInt(Integer.reverseBytes(0));
        }
        if (this.f) {
            dataOutputStream.writeInt(0);
        }
        this.b = 0;
        this.d = b;
        this.c = i2;
        if (list.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            i9 += ((ByteBuffer) it2.next()).remaining();
        }
        Iterator it3 = list.iterator();
        ByteBuffer byteBuffer = (ByteBuffer) it3.next();
        while (true) {
            int min = Math.min(i, i9);
            i9 -= min;
            while (true) {
                int min2 = Math.min(min, byteBuffer.remaining());
                if (byteBuffer.hasArray()) {
                    dataOutputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), min2);
                    byteBuffer.position(byteBuffer.position() + min2);
                } else {
                    byte[] bArr = this.e;
                    if (bArr == null || bArr.length < min2) {
                        this.e = new byte[min2];
                    }
                    byte[] bArr2 = this.e;
                    byteBuffer.get(bArr2, 0, min2);
                    dataOutputStream.write(bArr2, 0, min2);
                }
                min -= min2;
                if (min <= 0) {
                    break;
                } else {
                    byteBuffer = (ByteBuffer) it3.next();
                }
            }
            if (i9 <= 0) {
                return;
            }
            if (i5 < 64) {
                dataOutputStream.writeByte(i5 | PsExtractor.AUDIO_STREAM);
            } else if (i5 < 320) {
                dataOutputStream.writeByte(PsExtractor.AUDIO_STREAM);
                dataOutputStream.writeByte(i5 - 64);
            } else {
                dataOutputStream.writeByte(193);
                int i10 = i5 - 64;
                dataOutputStream.writeByte(i10 & 255);
                dataOutputStream.writeByte(i10 >>> 8);
            }
            if (this.f) {
                dataOutputStream.writeInt(0);
            }
        }
    }
}
