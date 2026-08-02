package xsna;

/* compiled from: GeoPostsMapHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class tlt extends ol60 {
    public final double h;
    public final double i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final int o;

    public tlt(double d, double d2, String str, boolean z, boolean z2, boolean z3, String str2, int i) {
        super(1124, 0, i, 6, null);
        this.h = d;
        this.i = d2;
        this.j = str;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = str2;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlt)) {
            return false;
        }
        tlt tltVar = (tlt) obj;
        return Double.compare(this.h, tltVar.h) == 0 && Double.compare(this.i, tltVar.i) == 0 && epx.f(this.j, tltVar.j) && this.k == tltVar.k && this.l == tltVar.l && this.m == tltVar.m && epx.f(this.n, tltVar.n) && this.o == tltVar.o;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.o;
    }

    public final int hashCode() {
        int b = zjh0.b(this.i, Double.hashCode(this.h) * 31, 31);
        String str = this.j;
        int b2 = qoy.b(qoy.b(qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        return Integer.hashCode(this.o) + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoPostsMapHolderUiDto(latitude=");
        sb.append(this.h);
        sb.append(", longitude=");
        sb.append(this.i);
        sb.append(", address=");
        sb.append(this.j);
        sb.append(", isAddressVisible=");
        sb.append(this.k);
        sb.append(", isMapAvailable=");
        sb.append(this.l);
        sb.append(", isUserLocationEnabled=");
        sb.append(this.m);
        sb.append(", distance=");
        sb.append(this.n);
        sb.append(", seqId=");
        return vu5.b(sb, this.o, ')');
    }
}
