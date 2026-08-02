package xsna;

/* compiled from: AdRedirectData.kt */
/* loaded from: classes8.dex */
public final class sh0 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final kiw e;

    public sh0(String str, Integer num, Integer num2, String str2, kiw kiwVar) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = kiwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return epx.f(this.a, sh0Var.a) && epx.f(this.b, sh0Var.b) && epx.f(this.c, sh0Var.c) && epx.f(this.d, sh0Var.d) && epx.f(this.e, sh0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        kiw kiwVar = this.e;
        return hashCode4 + (kiwVar != null ? kiwVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder d = jq.d(this.b, "AdRedirectData(btnText=", this.a, ", btnColor=", ", btnTextColor=");
        mq.b(this.c, ", urlText=", this.d, ", icon=", d);
        d.append(this.e);
        d.append(")");
        return d.toString();
    }
}
