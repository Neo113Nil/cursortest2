package xsna;

/* compiled from: VideoFullscreenRedesignDiscoveryConfig.kt */
/* loaded from: classes11.dex */
public final class ans0 {
    public static final a f = new a();
    public static final ans0 g = new ans0(false, 0, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;

    /* compiled from: VideoFullscreenRedesignDiscoveryConfig.kt */
    public static final class a {
    }

    public ans0(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i == 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ans0)) {
            return false;
        }
        ans0 ans0Var = (ans0) obj;
        return this.a == ans0Var.a && this.b == ans0Var.b && this.c == ans0Var.c && this.d == ans0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFullscreenRedesignDiscoveryConfig(is3dotButtonsReplacementEnabled=");
        sb.append(this.a);
        sb.append(", isGearButtonsReplacementEnabled=");
        sb.append(this.b);
        sb.append(", isCounterShareEnabled=");
        sb.append(this.c);
        sb.append(", controlsBarRedesignValue=");
        return vu5.b(sb, this.d, ')');
    }
}
