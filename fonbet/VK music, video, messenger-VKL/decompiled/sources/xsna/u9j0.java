package xsna;

import java.util.List;

/* compiled from: ShareViewState.kt */
/* loaded from: classes7.dex */
public final class u9j0 {
    public final List<r9j0> a;
    public final i9j0 b;

    public u9j0(List<r9j0> list, i9j0 i9j0Var) {
        this.a = list;
        this.b = i9j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9j0)) {
            return false;
        }
        u9j0 u9j0Var = (u9j0) obj;
        return epx.f(this.a, u9j0Var.a) && epx.f(this.b, u9j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareVs(externalApps=" + this.a + ", shareTimeVs=" + this.b + ')';
    }
}
