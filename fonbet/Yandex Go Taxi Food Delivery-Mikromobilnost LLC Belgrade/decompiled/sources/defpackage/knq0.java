package defpackage;

import android.view.autofill.AutofillManager;
import androidx.compose.ui.autofill.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.state.ToggleableState;

/* loaded from: classes.dex */
public final class knq0 {
    public final LayoutNode a;
    public final hxn b;
    public final x5w c;
    public final xy40 d = new xy40(2);

    public knq0(LayoutNode layoutNode, hxn hxnVar, wx40 wx40Var) {
        this.a = layoutNode;
        this.b = hxnVar;
        this.c = wx40Var;
    }

    public final c a() {
        return new c(this.b, false, this.a, new cnq0());
    }

    public final void b(LayoutNode layoutNode, cnq0 cnq0Var) {
        kk2 kk2Var;
        kk2 kk2Var2;
        xy40 xy40Var = this.d;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = (a) objArr[i2];
            qc20 qc20Var = aVar.a;
            AndroidComposeView androidComposeView = aVar.c;
            cnq0 u = layoutNode.u();
            int i3 = layoutNode.b;
            String str = (cnq0Var == null || (kk2Var2 = (kk2) b.a(cnq0Var, d.F)) == null) ? null : kk2Var2.b;
            String str2 = (u == null || (kk2Var = (kk2) b.a(u, d.F)) == null) ? null : kk2Var.b;
            if (str != str2) {
                if (str == null) {
                    qc20Var.A(i3, androidComposeView, true);
                } else if (str2 == null) {
                    qc20Var.A(i3, androidComposeView, false);
                } else if (jl40.l((w82) b.a(u, d.s), qtb1.z)) {
                    ((AutofillManager) qc20Var.a).notifyValueChanged(androidComposeView, i3, l94.b(str2));
                }
            }
            ToggleableState toggleableState = cnq0Var != null ? (ToggleableState) b.a(cnq0Var, d.K) : null;
            ToggleableState toggleableState2 = u != null ? (ToggleableState) b.a(u, d.K) : null;
            if (toggleableState != toggleableState2) {
                if (toggleableState == null) {
                    qc20Var.A(i3, androidComposeView, true);
                } else if (toggleableState2 == null) {
                    qc20Var.A(i3, androidComposeView, false);
                } else if (jl40.l((w82) b.a(u, d.s), qtb1.A)) {
                    int i4 = r72.a[toggleableState2.ordinal()];
                    Boolean bool = i4 != 1 ? i4 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        ((AutofillManager) qc20Var.a).notifyValueChanged(androidComposeView, i3, l94.c(bool.booleanValue()));
                    }
                }
            }
            v3r v3rVar = cnq0Var != null ? (v3r) b.a(cnq0Var, d.t) : null;
            v3r v3rVar2 = u != null ? (v3r) b.a(u, d.t) : null;
            if (!jl40.l(v3rVar, v3rVar2)) {
                if (v3rVar == null) {
                    qc20Var.A(i3, androidComposeView, true);
                } else if (v3rVar2 == null) {
                    qc20Var.A(i3, androidComposeView, false);
                } else {
                    ((AutofillManager) qc20Var.a).notifyValueChanged(androidComposeView, i3, ((k92) v3rVar2).a());
                }
            }
            boolean z = cnq0Var != null && cnq0Var.a.a(d.r);
            boolean z2 = u != null && u.a.a(d.r);
            if (z != z2) {
                xx40 xx40Var = aVar.A;
                if (z2) {
                    xx40Var.a(i3);
                } else {
                    xx40Var.g(i3);
                }
            }
        }
    }
}
