package xsna;

/* compiled from: VkConsentScreenContract.kt */
/* loaded from: classes15.dex */
public final class cnu0 {
    public final String a;
    public final String b;
    public final Integer c;

    public cnu0(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnu0)) {
            return false;
        }
        cnu0 cnu0Var = (cnu0) obj;
        return epx.f(this.a, cnu0Var.a) && epx.f(this.b, cnu0Var.b) && epx.f(this.c, cnu0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScopeUI(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", iconId=");
        return uqi.b(sb, this.c, ')');
    }
}
