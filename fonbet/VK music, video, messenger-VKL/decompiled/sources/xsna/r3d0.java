package xsna;

/* compiled from: GoodPreviewButtonsItemRefactored.kt */
/* loaded from: classes18.dex */
public final class r3d0 {
    public final oad0 a;
    public final a1i0 b;
    public final qx9 c;
    public final boolean d;

    public r3d0(oad0 oad0Var, a1i0 a1i0Var, qx9 qx9Var, boolean z) {
        this.a = oad0Var;
        this.b = a1i0Var;
        this.c = qx9Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3d0)) {
            return false;
        }
        r3d0 r3d0Var = (r3d0) obj;
        return epx.f(this.a, r3d0Var.a) && epx.f(this.b, r3d0Var.b) && epx.f(this.c, r3d0Var.c) && this.d == r3d0Var.d;
    }

    public final int hashCode() {
        oad0 oad0Var = this.a;
        int hashCode = (oad0Var == null ? 0 : oad0Var.a.hashCode()) * 31;
        a1i0 a1i0Var = this.b;
        int hashCode2 = (hashCode + (a1i0Var == null ? 0 : a1i0Var.a.hashCode())) * 31;
        qx9 qx9Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (qx9Var != null ? Boolean.hashCode(qx9Var.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewButtonsState(primaryPreviewState=");
        sb.append(this.a);
        sb.append(", secondaryPreviewState=");
        sb.append(this.b);
        sb.append(", cartPreviewState=");
        sb.append(this.c);
        sb.append(", isBookmarked=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
