package xsna;

/* compiled from: Variant.kt */
/* loaded from: classes16.dex */
public final class ikr0 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;

    public ikr0(Integer num, Integer num2, String str, String str2) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikr0)) {
            return false;
        }
        ikr0 ikr0Var = (ikr0) obj;
        return epx.f(this.a, ikr0Var.a) && epx.f(this.b, ikr0Var.b) && epx.f(this.c, ikr0Var.c) && epx.f(this.d, ikr0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return this.d.hashCode() + urd0.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Variant(answerNumeric=");
        sb.append(this.a);
        sb.append(", questionId=");
        sb.append(this.b);
        sb.append(", trigger=");
        sb.append(this.c);
        sb.append(", text=");
        return ho8.a(sb, this.d, ')');
    }
}
