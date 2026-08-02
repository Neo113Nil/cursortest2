package xsna;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class g3k {
    public final boolean a;
    public final boolean b;
    public final String c;

    public g3k(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3k)) {
            return false;
        }
        g3k g3kVar = (g3k) obj;
        return this.a == g3kVar.a && this.b == g3kVar.b && epx.f(this.c, g3kVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverState(shouldShowCoverOverlay=");
        sb.append(this.a);
        sb.append(", shouldShowCover=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }
}
