package xsna;

import androidx.recyclerview.widget.m;
import xsna.p820;

/* compiled from: MenuV3ItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class q820 extends m.e<p820> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(p820 p820Var, p820 p820Var2) {
        p820 p820Var3 = p820Var;
        p820 p820Var4 = p820Var2;
        return ((p820Var3 instanceof p820.b) && (p820Var4 instanceof p820.b)) ? epx.f(((p820.b) p820Var3).c.b, ((p820.b) p820Var4).c.b) : p820Var3.equals(p820Var4);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(p820 p820Var, p820 p820Var2) {
        p820 p820Var3 = p820Var;
        return !drm0.N(p820Var3.c()) && epx.f(p820Var3.c(), p820Var2.c());
    }
}
