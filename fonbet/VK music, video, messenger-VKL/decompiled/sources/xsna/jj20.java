package xsna;

/* compiled from: MethodCallInfo.kt */
/* loaded from: classes15.dex */
public final class jj20 {
    public final com.vk.api.sdk.a a;
    public final long b;

    public jj20(com.vk.api.sdk.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj20)) {
            return false;
        }
        jj20 jj20Var = (jj20) obj;
        return epx.f(this.a, jj20Var.a) && this.b == jj20Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodCallInfo(call=");
        sb.append(this.a);
        sb.append(", time=");
        return vu5.a(')', this.b, sb);
    }
}
