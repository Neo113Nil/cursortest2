package xsna;

/* compiled from: AccountGetAdAwayTokenResponse.kt */
/* loaded from: classes18.dex */
public final class rn {
    public final String a;
    public final Integer b;

    public rn(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn)) {
            return false;
        }
        rn rnVar = (rn) obj;
        return epx.f(this.a, rnVar.a) && epx.f(this.b, rnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetAdAwayTokenResponse(token=");
        sb.append(this.a);
        sb.append(", tokenExpired=");
        return uqi.b(sb, this.b, ')');
    }
}
