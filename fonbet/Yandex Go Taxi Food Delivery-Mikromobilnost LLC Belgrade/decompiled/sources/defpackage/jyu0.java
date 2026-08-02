package defpackage;

import androidx.compose.ui.input.pointer.b;
import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public final class jyu0 extends b {
    public final String w;

    public jyu0(tb2 tb2Var, d8m d8mVar) {
        super(tb2Var, d8mVar);
        this.w = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final void F0(wvd0 wvd0Var) {
        xvd0 xvd0Var = (xvd0) npb1.c(this, j.v);
        if (xvd0Var != null) {
            ((i82) xvd0Var).a = wvd0Var;
        }
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final boolean H0(int i) {
        return i == 3 || i == 4;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.w;
    }
}
