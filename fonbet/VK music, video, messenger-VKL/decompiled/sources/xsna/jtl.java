package xsna;

import android.view.View;

/* compiled from: DelegatableNode.android.kt */
/* loaded from: classes11.dex */
public final class jtl {
    public static final View a(htl htlVar) {
        if (!htlVar.z().o) {
            uzw.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) voy.a(itl.f(htlVar));
    }
}
