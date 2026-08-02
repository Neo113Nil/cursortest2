package xsna;

/* compiled from: VideoProfileCreatorOnboardingData.kt */
/* loaded from: classes6.dex */
public final class p7t0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public p7t0(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7t0)) {
            return false;
        }
        p7t0 p7t0Var = (p7t0) obj;
        return this.a == p7t0Var.a && this.b == p7t0Var.b && this.c == p7t0Var.c && this.d == p7t0Var.d && this.e == p7t0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileCreatorOnboardingData(isAvatarPassed=");
        sb.append(this.a);
        sb.append(", isDescriptionPassed=");
        sb.append(this.b);
        sb.append(", isCoverPassed=");
        sb.append(this.c);
        sb.append(", isVideoPassed=");
        sb.append(this.d);
        sb.append(", videosPublished=");
        return vu5.b(sb, this.e, ')');
    }
}
