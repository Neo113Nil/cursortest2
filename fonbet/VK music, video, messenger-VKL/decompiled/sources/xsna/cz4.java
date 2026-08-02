package xsna;

/* compiled from: AudioTrackDebugInfo.kt */
/* loaded from: classes5.dex */
public final class cz4 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;

    public cz4(int i, int i2, int i3, String str, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz4)) {
            return false;
        }
        cz4 cz4Var = (cz4) obj;
        return epx.f(this.a, cz4Var.a) && this.b == cz4Var.b && this.c == cz4Var.c && epx.f(this.d, cz4Var.d) && this.e == cz4Var.e && epx.f(this.f, cz4Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        int a2 = shy.a(this.e, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        return a2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "mime=" + this.a + ", channelCount=" + this.b + ", sampleRate=" + this.c + ", lang=" + this.d + ", bitrate=" + this.e + " Kbps, codecs=" + this.f;
    }
}
