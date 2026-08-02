package xsna;

/* compiled from: TrackedScreen.kt */
/* loaded from: classes3.dex */
public final class nhp0 {
    public final String a;
    public final Object b;

    public /* synthetic */ nhp0(String str) {
        this(str, null);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhp0)) {
            return false;
        }
        nhp0 nhp0Var = (nhp0) obj;
        return epx.f(this.a, nhp0Var.a) && epx.f(this.b, nhp0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackedScreen(name=");
        sb.append(this.a);
        sb.append(", payload=");
        return k73.c(sb, this.b, ')');
    }

    public nhp0(String str, ip20 ip20Var) {
        this.a = str;
        this.b = ip20Var;
    }
}
