package xsna;

/* compiled from: SuggestionsContext.kt */
/* loaded from: classes5.dex */
public final class k6n0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public k6n0() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6n0)) {
            return false;
        }
        k6n0 k6n0Var = (k6n0) obj;
        return this.a == k6n0Var.a && this.b == k6n0Var.b && this.c == k6n0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionsContext(isDialog=");
        sb.append(this.a);
        sb.append(", isGiftsAllowed=");
        sb.append(this.b);
        sb.append(", canShowGiftsPromo=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public k6n0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
