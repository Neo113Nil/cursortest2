package xsna;

/* compiled from: TrendEngagementGrowthState.kt */
/* loaded from: classes17.dex */
public final class rpp0 {
    public static final rpp0 d = new rpp0(false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rpp0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpp0)) {
            return false;
        }
        rpp0 rpp0Var = (rpp0) obj;
        return this.a == rpp0Var.a && this.b == rpp0Var.b && this.c == rpp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendEngagementGrowthState(isTrendHashtagBadgeAnimationAvailable=");
        sb.append(this.a);
        sb.append(", isTrendMusicBadgeAnimationAvailable=");
        sb.append(this.b);
        sb.append(", isTrendButtonVisibilityAvailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
