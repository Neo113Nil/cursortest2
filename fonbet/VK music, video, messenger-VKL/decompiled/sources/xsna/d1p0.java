package xsna;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: Toggleable.kt */
/* loaded from: classes11.dex */
public final class d1p0 {
    public static q630 a(q630 q630Var, boolean z, boolean z2, plg0 plg0Var, izs izsVar, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return q630Var.g(new b1p0(z, null, true, z2, plg0Var, izsVar));
    }

    public static q630 b(q630 q630Var, ToggleableState toggleableState, boolean z, plg0 plg0Var, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return q630Var.g(new cqp0(toggleableState, null, null, true, z, plg0Var, gzsVar));
    }
}
