package xsna;

/* compiled from: VideoTrackDebugInfo.kt */
/* loaded from: classes5.dex */
public final class jlt0 {
    public final String a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public jlt0(String str, int i, int i2, float f, int i3, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlt0)) {
            return false;
        }
        jlt0 jlt0Var = (jlt0) obj;
        return epx.f(this.a, jlt0Var.a) && this.b == jlt0Var.b && this.c == jlt0Var.c && Float.compare(this.d, jlt0Var.d) == 0 && this.e == jlt0Var.e && epx.f(this.f, jlt0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31);
        String str2 = this.f;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "mime=" + this.a + ", w=" + this.b + ", h=" + this.c + ", frameRate=" + this.d + ", bitrate=" + this.e + " Kbps, codecs=" + this.f;
    }
}
