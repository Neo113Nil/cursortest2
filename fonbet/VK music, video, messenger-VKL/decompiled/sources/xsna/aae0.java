package xsna;

/* compiled from: ProxyInfo.kt */
/* loaded from: classes3.dex */
public final class aae0 {
    public final String a;
    public final zvf b;

    public aae0(String str, zvf zvfVar) {
        this.a = str;
        this.b = zvfVar;
    }

    public final ewf<Double> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aae0)) {
            return false;
        }
        aae0 aae0Var = (aae0) obj;
        return epx.f(this.a, aae0Var.a) && this.b.equals(aae0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProxyInfo(ip=" + this.a + ", weight=" + this.b + ')';
    }
}
