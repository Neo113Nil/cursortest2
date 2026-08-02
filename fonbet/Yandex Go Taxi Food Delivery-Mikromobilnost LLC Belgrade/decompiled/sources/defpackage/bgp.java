package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bgp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public /* synthetic */ bgp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, false, (i & 4096) == 0, (i & 8192) == 0, (i & 16384) == 0, (i & 32768) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgp)) {
            return false;
        }
        bgp bgpVar = (bgp) obj;
        return jl40.l(this.a, bgpVar.a) && jl40.l(this.b, bgpVar.b) && jl40.l(this.c, bgpVar.c) && jl40.l(this.d, bgpVar.d) && jl40.l(this.e, bgpVar.e) && jl40.l(this.f, bgpVar.f) && jl40.l(this.g, bgpVar.g) && jl40.l(this.h, bgpVar.h) && jl40.l(this.i, bgpVar.i) && jl40.l(this.j, bgpVar.j) && jl40.l(this.k, bgpVar.k) && this.l == bgpVar.l && this.m == bgpVar.m && this.n == bgpVar.n && this.o == bgpVar.o && this.p == bgpVar.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder v = b64.v("FavoriteEditUiState(screenTitle=", this.a, ", addressName=", this.b, ", address=");
        g8e.D(v, this.c, ", fullAddress=", this.d, ", porch=");
        g8e.D(v, this.e, ", comment=", this.f, ", addressSubtitle=");
        g8e.D(v, this.g, ", quartersNumber=", this.h, ", floorNumber=");
        g8e.D(v, this.i, ", doorphoneNumber=", this.j, ", commentCourier=");
        tse0.y(this.k, ", showDeleteButton=", ", enableTitleField=", v, this.l);
        nnm.v(", showSaveButton=", ", enableEditAddressField=", v, this.m, this.n);
        return smw0.k(", enableAddressSubtitle=", Extension.C_BRAKE, v, this.o, this.p);
    }

    public bgp() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, 65535);
    }

    public bgp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }
}
