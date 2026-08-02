package xsna;

import java.util.List;

/* compiled from: CombinedItemModifier.kt */
/* loaded from: classes4.dex */
public final class aag implements wm60 {
    public final wm60 a;
    public final wm60 b;

    public aag(wm60 wm60Var, wm60 wm60Var2) {
        this.a = wm60Var;
        this.b = wm60Var2;
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return this.a.a(wm60Var) && this.b.a(wm60Var);
    }

    @Override // xsna.wm60
    public final wm60 b(wm60 wm60Var) {
        return wm60Var != null ? new aag(wm60Var, this) : this;
    }

    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        return this.a.c(this.b.c(list, i170Var), i170Var);
    }
}
