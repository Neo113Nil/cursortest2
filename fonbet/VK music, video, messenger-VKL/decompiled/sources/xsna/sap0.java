package xsna;

/* compiled from: TopshelfCardContent.kt */
/* loaded from: classes2.dex */
public final class sap0 {
    public final boolean a;
    public final boolean b;

    public sap0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sap0)) {
            return false;
        }
        sap0 sap0Var = (sap0) obj;
        return this.a == sap0Var.a && this.b == sap0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardContentLayout(fillPrimaryButton=");
        sb.append(this.a);
        sb.append(", reservePaginationSpace=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
