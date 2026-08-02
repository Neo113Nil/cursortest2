package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.scg0;

/* compiled from: TransferMethod.kt */
/* loaded from: classes3.dex */
public interface njp0 {
    int a();

    default scg0 c(int i) {
        int e = e();
        int a = a();
        double d = d(i);
        return i < e ? new scg0.d(e) : i > a ? new scg0.c(a) : d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? new scg0.b(d) : new scg0.f();
    }

    double d(int i);

    int e();
}
