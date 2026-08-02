package defpackage;

import coil.graphics.d;

/* loaded from: classes.dex */
public final class ixw0 implements gyg {
    public final boolean a;

    public ixw0(int i) {
        this.a = true;
    }

    @Override // defpackage.gyg
    public final hyg a(pjt0 pjt0Var, qg70 qg70Var) {
        if (jl40.l(pjt0Var.b(), "image/svg+xml") || hxw0.a(pjt0Var.c().source())) {
            return new d(pjt0Var.c(), qg70Var, this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ixw0) {
            return this.a == ((ixw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public ixw0() {
        this(0);
    }
}
