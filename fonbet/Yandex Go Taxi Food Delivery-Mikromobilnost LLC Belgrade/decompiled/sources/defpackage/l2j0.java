package defpackage;

/* loaded from: classes2.dex */
public final class l2j0 implements m2j0 {
    public final String a;
    public final String b;

    public l2j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.m2j0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2j0)) {
            return false;
        }
        l2j0 l2j0Var = (l2j0) obj;
        return this.a.equals(l2j0Var.a) && jl40.l(this.b, l2j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(questionId=");
        sb.append(this.a);
        sb.append(", text=");
        return b64.p(sb, this.b, ')');
    }
}
