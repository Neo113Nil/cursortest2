package xsna;

import android.app.Activity;
import xsna.c63;

/* compiled from: TrafficMonitoringTask.kt */
/* loaded from: classes7.dex */
public final class oip0 extends c63.b {
    public volatile boolean b = true;

    @Override // xsna.c63.b
    public final void u() {
        this.b = false;
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.b = true;
    }
}
