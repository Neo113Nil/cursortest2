package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import one.video.calls.sdk_private.f;

/* compiled from: ServerNameExtension.java */
/* loaded from: classes8.dex */
public final class nwg0 extends pt50 {
    public String a;

    public static void c(int i, ByteBuffer byteBuffer) throws one.video.calls.sdk_private.j {
        if (byteBuffer.remaining() < i) {
            throw new one.video.calls.sdk_private.j("extension underflow");
        }
    }

    @Override // xsna.pt50
    public final byte[] b() {
        String str = this.a;
        short length = (short) str.length();
        short s = (short) (length + 5);
        ByteBuffer allocate = ByteBuffer.allocate(s + 4);
        allocate.putShort(f.c.server_name.k);
        allocate.putShort(s);
        allocate.putShort((short) (length + 3));
        allocate.put((byte) 0);
        allocate.putShort(length);
        allocate.put(str.getBytes(Charset.forName("ASCII")));
        return allocate.array();
    }
}
