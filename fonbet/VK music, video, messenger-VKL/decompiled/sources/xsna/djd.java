package xsna;

/* compiled from: ClipsAutoplayConfig.kt */
/* loaded from: classes11.dex */
public final class djd {
    public static final a c = new a();
    public final boolean a;
    public final Long b;

    /* compiled from: ClipsAutoplayConfig.kt */
    public static final class a {
    }

    public djd(boolean z, Long l) {
        this.a = z;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djd)) {
            return false;
        }
        djd djdVar = (djd) obj;
        return this.a == djdVar.a && epx.f(this.b, djdVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAutoplayConfig(shouldPlayFull=");
        sb.append(this.a);
        sb.append(", autoplayDuration=");
        return iq.b(sb, this.b, ')');
    }
}
