package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Column.kt */
/* loaded from: classes11.dex */
public interface q9g {
    static q630 a(q630 q630Var, float f) {
        if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            szw.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return q630Var.g(new xpy(f, true));
    }
}
