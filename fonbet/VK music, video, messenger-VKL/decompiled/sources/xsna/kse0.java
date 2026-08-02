package xsna;

/* compiled from: QuicEnabledConfig.kt */
/* loaded from: classes.dex */
public final class kse0 {
    public final gzs<Boolean> a;
    public final gzs<Boolean> b;
    public final gzs<Boolean> c;
    public final gzs<Boolean> d;
    public final gzs<Boolean> e;
    public final c24 f;

    public kse0() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kse0)) {
            return false;
        }
        kse0 kse0Var = (kse0) obj;
        return epx.f(this.a, kse0Var.a) && epx.f(this.b, kse0Var.b) && epx.f(this.c, kse0Var.c) && epx.f(this.d, kse0Var.d) && epx.f(this.e, kse0Var.e) && epx.f(this.f, kse0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + sf3.a(sf3.a(sf3.a(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "QuicEnabledConfig(isQuicEnabled=" + this.a + ", isQuicApi=" + this.b + ", isQuicImageLoader=" + this.c + ", isQuicSse=" + this.d + ", isQuicPlayerDownloader=" + this.e + ", isQuicOtherClient=" + this.f + ')';
    }

    public kse0(zf6 zf6Var, ag6 ag6Var, bg6 bg6Var, xsa xsaVar, c24 c24Var, int i) {
        gzs c24Var2 = (i & 1) != 0 ? new c24(0) : zf6Var;
        gzs c24Var3 = (i & 2) != 0 ? new c24(0) : ag6Var;
        gzs c24Var4 = (i & 4) != 0 ? new c24(0) : bg6Var;
        gzs c24Var5 = (i & 8) != 0 ? new c24(0) : xsaVar;
        c24Var = (i & 16) != 0 ? new c24(0) : c24Var;
        c24 c24Var6 = new c24(0);
        this.a = c24Var2;
        this.b = c24Var3;
        this.c = c24Var4;
        this.d = c24Var5;
        this.e = c24Var;
        this.f = c24Var6;
    }
}
