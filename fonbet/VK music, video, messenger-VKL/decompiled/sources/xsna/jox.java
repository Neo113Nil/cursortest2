package xsna;

/* compiled from: IntervalConfig.kt */
/* loaded from: classes14.dex */
public final class jox {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;

    public jox(boolean z, boolean z2, boolean z3, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jox)) {
            return false;
        }
        jox joxVar = (jox) obj;
        return this.a == joxVar.a && this.b == joxVar.b && this.c == joxVar.c && epx.f(this.d, joxVar.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntervalConfig(isEntryPointEnabled=");
        sb.append(this.a);
        sb.append(", isLandscape=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        sb.append(this.c);
        sb.append(", videoIsVkLive=");
        return tn.a(sb, this.d, ')');
    }
}
