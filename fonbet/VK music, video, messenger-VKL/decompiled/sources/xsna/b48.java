package xsna;

import xsna.tlo0;

/* compiled from: BottomBarViewState.kt */
/* loaded from: classes7.dex */
public final class b48 {
    public final tlo0.f a;
    public final boolean b;

    public b48(tlo0.f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b48)) {
            return false;
        }
        b48 b48Var = (b48) obj;
        return this.a.equals(b48Var.a) && this.b == b48Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomBarButtonViewState(text=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
