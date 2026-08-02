package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mdb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final sz01 p;
    public final boolean q;

    public mdb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, sz01 sz01Var, boolean z11, int i2) {
        boolean z12 = (i2 & 2) != 0;
        boolean z13 = (i2 & 4) != 0;
        boolean z14 = (i2 & 8) != 0 ? true : z;
        boolean z15 = (i2 & 16) != 0 ? true : z2;
        boolean z16 = (i2 & 32) != 0 ? true : z3;
        boolean z17 = (i2 & 64) != 0 ? true : z4;
        boolean z18 = (i2 & 128) != 0 ? true : z5;
        boolean z19 = (i2 & 256) != 0 ? true : z6;
        boolean z20 = (i2 & 512) != 0 ? true : z7;
        boolean z21 = (i2 & 1024) != 0 ? false : z8;
        int i3 = (i2 & 2048) != 0 ? 0 : i;
        boolean z22 = (i2 & 4096) != 0 ? true : z9;
        boolean z23 = (i2 & 8192) != 0 ? true : z10;
        boolean z24 = (i2 & 16384) != 0;
        sz01 sz01Var2 = (i2 & 32768) != 0 ? null : sz01Var;
        boolean z25 = (i2 & 131072) != 0 ? true : z11;
        this.a = true;
        this.b = z12;
        this.c = z13;
        this.d = z14;
        this.e = z15;
        this.f = z16;
        this.g = z17;
        this.h = z18;
        this.i = z19;
        this.j = z20;
        this.k = z21;
        this.l = i3;
        this.m = z22;
        this.n = z23;
        this.o = z24;
        this.p = sz01Var2;
        this.q = z25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdb)) {
            return false;
        }
        mdb mdbVar = (mdb) obj;
        return this.a == mdbVar.a && this.b == mdbVar.b && this.c == mdbVar.c && this.d == mdbVar.d && this.e == mdbVar.e && this.f == mdbVar.f && this.g == mdbVar.g && this.h == mdbVar.h && this.i == mdbVar.i && this.j == mdbVar.j && this.k == mdbVar.k && this.l == mdbVar.l && this.m == mdbVar.m && this.n == mdbVar.n && this.o == mdbVar.o && jl40.l(this.p, mdbVar.p) && this.q == mdbVar.q;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(oyr.b(this.l, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n), 31, this.o);
        sz01 sz01Var = this.p;
        return Boolean.hashCode(this.q) + unr0.e((e + (sz01Var == null ? 0 : sz01Var.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ChatViewConfig(showSkillStore=", ", showToolbar=", ", forwardsEnabled=", this.a, this.b);
        nnm.v(", showEmojiButton=", ", showInput=", u, this.c, this.d);
        nnm.v(", showScrollToBottomFab=", ", messageClickEnabled=", u, this.e, this.f);
        nnm.v(", messageLongClickEnabled=", ", messageSwipeEnabled=", u, this.g, this.h);
        nnm.v(", showAttachmentButton=", ", fadingEdgeEnabled=", u, this.i, this.j);
        u.append(this.k);
        u.append(", fadingEdgeLength=");
        u.append(this.l);
        u.append(", allowMakeStarredMessages=");
        nnm.v(", allowSilentMessages=", ", showCopyLinkToMessageMenu=", u, this.m, this.n);
        u.append(this.o);
        u.append(", translatorConfig=");
        u.append(this.p);
        u.append(", showMarkReadButton=false, showMetadataPanel=");
        return x4e.i(u, this.q, Extension.C_BRAKE);
    }

    public mdb() {
        this(false, false, false, false, false, false, false, false, 0, false, false, null, false, 262143);
    }
}
