package xsna;

/* compiled from: ProxyInitConfig.kt */
/* loaded from: classes.dex */
public final class bae0 {
    public final boolean a;
    public final gzs<Boolean> b;
    public final gzs<Boolean> c;
    public final gzs<Boolean> d;

    public bae0(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, boolean z) {
        this.a = z;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bae0)) {
            return false;
        }
        bae0 bae0Var = (bae0) obj;
        return this.a == bae0Var.a && epx.f(this.b, bae0Var.b) && epx.f(this.c, bae0Var.c) && epx.f(this.d, bae0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + sf3.a(sf3.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyInitConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", isProxyDebug=");
        sb.append(this.b);
        sb.append(", isBlocked=");
        sb.append(this.c);
        sb.append(", isProxyCombinedState=");
        return uf3.d(sb, this.d, ')');
    }

    public bae0() {
        this(new ml7(17), new ml7(17), new ml7(17), false);
    }
}
