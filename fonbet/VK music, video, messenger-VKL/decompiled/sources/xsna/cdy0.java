package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.f;

/* compiled from: NewSessionTicketMessage.java */
/* loaded from: classes8.dex */
public final class cdy0 extends bdy0 {
    public long a;
    public byte[] b;
    public byte[] c;
    public int d;
    public sb00 e;

    public static byte[] e(ByteBuffer byteBuffer, int i, int i2, String str) throws one.video.calls.sdk_private.j {
        if (i2 < i) {
            throw new one.video.calls.sdk_private.j("No length specified for ".concat(str));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
        }
        if (i2 - i < i3) {
            throw new one.video.calls.sdk_private.j("Message too short for given length of ".concat(str));
        }
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // xsna.bdy0
    public final f.d c() {
        return f.d.new_session_ticket;
    }

    @Override // xsna.bdy0
    public final byte[] d() {
        sb00 sb00Var = this.e;
        int length = sb00Var != null ? sb00Var.b().length : 0;
        int a = lr.a(this.c.length + 11, this.b.length, 2, length);
        ByteBuffer allocate = ByteBuffer.allocate(a + 4);
        allocate.putInt(a | (f.d.new_session_ticket.i << 24));
        allocate.putInt(this.d);
        allocate.putInt((int) this.a);
        allocate.put((byte) this.c.length);
        allocate.put(this.c);
        allocate.putShort((short) this.b.length);
        allocate.put(this.b);
        allocate.putShort((short) length);
        sb00 sb00Var2 = this.e;
        if (sb00Var2 != null) {
            allocate.put(sb00Var2.b());
        }
        return allocate.array();
    }
}
