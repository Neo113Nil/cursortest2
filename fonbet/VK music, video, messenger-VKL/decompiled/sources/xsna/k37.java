package xsna;

import java.util.List;

/* compiled from: BindPayloadModifier.kt */
/* loaded from: classes4.dex */
public final class k37 implements wm60 {
    public final Object a;

    public k37() {
        this(null);
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return true;
    }

    @Override // xsna.wm60
    public final wm60 b(wm60 wm60Var) {
        return wm60Var != null ? new aag(wm60Var, this) : this;
    }

    public k37(p6s p6sVar) {
        this.a = p6sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        return list;
    }
}
