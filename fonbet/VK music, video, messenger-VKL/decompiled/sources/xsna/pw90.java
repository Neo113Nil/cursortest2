package xsna;

import android.app.Activity;
import java.util.Iterator;
import xsna.c63;

/* compiled from: PerformanceReporter.kt */
/* loaded from: classes.dex */
public final class pw90 extends c63.b {
    @Override // xsna.c63.b
    public final void u() {
        ow90 ow90Var = ow90.a;
        ((p) ow90.h.getValue()).a = true;
        Iterator<aw90> it = ow90.b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        ow90.b(0L);
    }

    @Override // xsna.c63.b
    public final void q(Activity activity, boolean z) {
    }
}
