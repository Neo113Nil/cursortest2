package xsna;

/* compiled from: VideoFullscreenRedesignVerticalConfig.kt */
/* loaded from: classes11.dex */
public final class cns0 {
    public static final a e = new a();
    public static final cns0 f = new cns0(false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* compiled from: VideoFullscreenRedesignVerticalConfig.kt */
    public static final class a {
    }

    public cns0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cns0)) {
            return false;
        }
        cns0 cns0Var = (cns0) obj;
        return this.a == cns0Var.a && this.b == cns0Var.b && this.c == cns0Var.c && this.d == cns0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFullscreenRedesignVerticalConfig(is3dotButtonsReplacementEnabled=");
        sb.append(this.a);
        sb.append(", isGearButtonsReplacementEnabled=");
        sb.append(this.b);
        sb.append(", isCounterForLikeComEnabled=");
        sb.append(this.c);
        sb.append(", isSubscribeButtonEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
