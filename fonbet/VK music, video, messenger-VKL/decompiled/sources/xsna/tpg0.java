package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dt1;

/* compiled from: Row.kt */
/* loaded from: classes11.dex */
public final class tpg0 implements spg0 {
    public static final tpg0 a = new tpg0();

    @Override // xsna.spg0
    public final q630 a(q630 q630Var, dt1.c cVar) {
        return q630Var.g(new gor0(cVar));
    }

    @Override // xsna.spg0
    public final q630 b(float f, q630 q630Var, boolean z) {
        if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            szw.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return q630Var.g(new xpy(f, z));
    }

    public final q630 c(q630 q630Var) {
        return q630Var.g(new esx0(ht1.a));
    }
}
