package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class mof0 extends wof0 {
    public final r600 a;
    public final Long b;
    public final String c = "1.0.21";

    public mof0(r600 r600Var, Long l) {
        this.a = r600Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mof0)) {
            return false;
        }
        mof0 mof0Var = (mof0) obj;
        return epx.f(this.a, mof0Var.a) && epx.f(this.b, mof0Var.b) && epx.f(this.c, mof0Var.c);
    }

    public final int hashCode() {
        r600 r600Var = this.a;
        int hashCode = (r600Var == null ? 0 : r600Var.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReefSdkState(lostEventCounters=");
        sb.append(this.a);
        sb.append(", phoneStateListenerErrors=");
        sb.append(this.b);
        sb.append(", sdkVersion=");
        return i5s.a(sb, this.c, ")");
    }
}
