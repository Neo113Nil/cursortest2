package xsna;

import android.view.View;
import xsna.q630;

/* compiled from: FocusGroupNode.android.kt */
/* loaded from: classes11.dex */
public final class fxr extends q630.c implements owr {
    @Override // xsna.owr
    public final void f1(jwr jwrVar) {
        View a = mvr.a(this);
        jwrVar.c(this.b.o && mvr.a(this).hasFocusable());
        View findFocus = a.findFocus();
        if (findFocus != null) {
            jwrVar.d(svr.a(findFocus, a));
        }
    }
}
