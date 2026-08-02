package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.f;

/* compiled from: EarlyDataExtension.java */
/* loaded from: classes8.dex */
public final class sb00 extends pt50 {
    public Long a;

    @Override // xsna.pt50
    public final byte[] b() {
        Long l = this.a;
        int i = l == null ? 0 : 4;
        ByteBuffer allocate = ByteBuffer.allocate(i + 4);
        allocate.putShort(f.c.early_data.k);
        allocate.putShort((short) i);
        if (l != null) {
            allocate.putInt((int) l.longValue());
        }
        return allocate.array();
    }

    public final String toString() {
        String str;
        Long l = this.a;
        if (l == null) {
            str = "(empty)";
        } else {
            str = X3.j.d + l + X3.j.e;
        }
        return go9.b("EarlyDataExtension ", str);
    }
}
