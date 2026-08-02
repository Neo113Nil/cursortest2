package xsna;

import android.util.Log;
import java.util.UUID;
import one.video.stat.transport.SequencePosition;
import xsna.u8r;

/* compiled from: StatLogWriter.kt */
/* loaded from: classes8.dex */
public final class lsk0 implements z000 {
    public static final a b = new a();
    public static mrk0 c;
    public final UUID a;

    /* compiled from: StatLogWriter.kt */
    public static final class a {
    }

    public lsk0(UUID uuid) {
        this.a = uuid;
    }

    @Override // xsna.z000
    public final void a(yi80 yi80Var, boolean z, SequencePosition sequencePosition) {
        mrk0 mrk0Var = c;
        if (mrk0Var == null) {
            Log.e("StatLogWriter", "Call StatLogWriter.init() first!");
            return;
        }
        bpn0 bpn0Var = u8r.a;
        boolean z2 = z || mrk0Var.d;
        if (!u8r.b) {
            u8r.b().b(false, u8r.a.PUT_USING_INVALID_CONFIG, new f4(17));
            return;
        }
        u8r.b d = u8r.d();
        d.getClass();
        d.obtainMessage(1, new u8r.b.C3790b(yi80Var, z2, sequencePosition, this.a)).sendToTarget();
    }
}
