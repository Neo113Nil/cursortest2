package xsna;

/* compiled from: MarketCatalogEvents.kt */
/* loaded from: classes16.dex */
public final class qu00 extends lu00 {
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final boolean f;

    public qu00(String str, String str2, double d, double d2, boolean z) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = z;
    }

    @Override // xsna.lu00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu00)) {
            return false;
        }
        qu00 qu00Var = (qu00) obj;
        return epx.f(this.b, qu00Var.b) && epx.f(this.c, qu00Var.c) && Double.compare(this.d, qu00Var.d) == 0 && Double.compare(this.e, qu00Var.e) == 0 && this.f == qu00Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + zjh0.b(this.e, zjh0.b(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogActionUpdateLocation(entryPointToken=");
        sb.append(this.b);
        sb.append(", address=");
        sb.append(this.c);
        sb.append(", lat=");
        sb.append(this.d);
        sb.append(", lng=");
        sb.append(this.e);
        sb.append(", saveGeo=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
