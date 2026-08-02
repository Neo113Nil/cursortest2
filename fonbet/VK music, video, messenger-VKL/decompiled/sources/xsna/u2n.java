package xsna;

import java.util.List;

/* compiled from: DiscoverMediaBlockModifier.kt */
/* loaded from: classes4.dex */
public final class u2n implements wm60 {
    public final Object a;

    public u2n() {
        this(null);
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return true;
    }

    @Override // xsna.wm60
    public final wm60 b(wm60 wm60Var) {
        u2n u2nVar = wm60Var instanceof u2n ? (u2n) wm60Var : null;
        return new u2n(u2nVar != null ? u2nVar.a : null);
    }

    public u2n(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        return list;
    }
}
