package xsna;

/* compiled from: OverrideHostChipInterceptor.kt */
/* loaded from: classes.dex */
public final class cgv {
    public final String a;
    public final String b;

    public cgv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgv)) {
            return false;
        }
        cgv cgvVar = (cgv) obj;
        return epx.f(this.a, cgvVar.a) && epx.f(this.b, cgvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostFly(originalHost=");
        sb.append(this.a);
        sb.append(", replacedHost=");
        return ho8.a(sb, this.b, ')');
    }
}
