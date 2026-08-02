package xsna;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class sne0 {
    public final rtd0 a;
    public final n55 b;
    public final Integer c;

    public sne0(rtd0 rtd0Var, n55 n55Var, Integer num) {
        this.a = rtd0Var;
        this.b = n55Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sne0)) {
            return false;
        }
        sne0 sne0Var = (sne0) obj;
        return epx.f(this.a, sne0Var.a) && epx.f(this.b, sne0Var.b) && epx.f(this.c, sne0Var.c);
    }

    public final int hashCode() {
        rtd0 rtd0Var = this.a;
        int hashCode = (rtd0Var == null ? 0 : rtd0Var.hashCode()) * 31;
        n55 n55Var = this.b;
        int hashCode2 = (hashCode + (n55Var == null ? 0 : n55Var.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrInfoResponse(profile=");
        sb.append(this.a);
        sb.append(", authClientInfo=");
        sb.append(this.b);
        sb.append(", status=");
        return uqi.b(sb, this.c, ')');
    }
}
