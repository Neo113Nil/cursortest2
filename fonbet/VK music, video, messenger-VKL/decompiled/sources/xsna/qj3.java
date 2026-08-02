package xsna;

/* compiled from: ArchivedCommentViewHolderV2.kt */
/* loaded from: classes4.dex */
public final class qj3 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public qj3(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj3)) {
            return false;
        }
        qj3 qj3Var = (qj3) obj;
        return this.a == qj3Var.a && this.b == qj3Var.b && epx.f(this.c, qj3Var.c) && epx.f(this.d, qj3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchivedCommentAction(actionId=");
        sb.append(this.a);
        sb.append(", iconId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", shortTitle=");
        return ho8.a(sb, this.d, ')');
    }
}
