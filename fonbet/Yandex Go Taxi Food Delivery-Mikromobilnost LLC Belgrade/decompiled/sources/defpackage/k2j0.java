package defpackage;

/* loaded from: classes2.dex */
public final class k2j0 implements m2j0 {
    public final String a;
    public final String b;
    public final String c;

    public k2j0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.m2j0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2j0)) {
            return false;
        }
        k2j0 k2j0Var = (k2j0) obj;
        return jl40.l(this.a, k2j0Var.a) && jl40.l(this.b, k2j0Var.b) && this.c.equals(k2j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUrl(questionId=");
        sb.append(this.a);
        sb.append(", dataUrl=");
        sb.append(this.b);
        sb.append(", fileName=");
        return b64.p(sb, this.c, ')');
    }
}
