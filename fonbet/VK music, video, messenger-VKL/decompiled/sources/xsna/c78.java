package xsna;

/* compiled from: ContentWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class c78 {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public c78(float f, boolean z, boolean z2, boolean z3) {
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c78)) {
            return false;
        }
        c78 c78Var = (c78) obj;
        return Float.compare(this.a, c78Var.a) == 0 && this.b == c78Var.b && this.c == c78Var.c && this.d == c78Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomPlayerStateConfig(progress=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", isLiked=");
        sb.append(this.c);
        sb.append(", isKidsModeEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
