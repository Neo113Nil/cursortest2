package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: AmfString.java */
/* loaded from: classes8.dex */
public final class cw1 implements wv1 {
    public String a;

    public cw1(String str) {
        this.a = str;
    }

    public static String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        int i2 = 65535 & byteBuffer.getShort();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.position() + byteBuffer.arrayOffset();
            wr.c(i2, byteBuffer);
        } else {
            bArr = new byte[i2];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, i2, Charset.forName(C.UTF8_NAME));
    }

    public static void b(ByteBuffer byteBuffer, String str) {
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        byteBuffer.putShort((short) bytes.length);
        byteBuffer.put(bytes);
    }

    @Override // xsna.wv1
    public final void deserialize(ByteBuffer byteBuffer) {
        this.a = a(byteBuffer);
    }

    @Override // xsna.wv1
    public final int getSize() {
        return this.a.getBytes(Charset.forName(C.UTF8_NAME)).length + 2;
    }

    @Override // xsna.wv1
    public final byte getType() {
        return (byte) 2;
    }

    @Override // xsna.wv1
    public final void serialize(ByteBuffer byteBuffer) {
        b(byteBuffer, this.a);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("\""), this.a, "\"");
    }
}
