package xsna;

import android.view.View;
import xsna.q630;

/* compiled from: FocusGroupNode.android.kt */
/* loaded from: classes11.dex */
public final class mvr {
    public static final View a(q630.c cVar) {
        dxt0 dxt0Var = itl.f(cVar.b).p;
        View interopView = dxt0Var != null ? dxt0Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
