package defpackage;

/* loaded from: classes10.dex */
public final class f64 extends lzn {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public f64(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        if (str == null) {
            ny61.t("Null mediaType");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }

    @Override // defpackage.lzn
    public final int a() {
        return this.h;
    }

    @Override // defpackage.lzn
    public final int b() {
        return this.c;
    }

    @Override // defpackage.lzn
    public final int c() {
        return this.i;
    }

    @Override // defpackage.lzn
    public final int d() {
        return this.a;
    }

    @Override // defpackage.lzn
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lzn)) {
            return false;
        }
        lzn lznVar = (lzn) obj;
        return this.a == lznVar.d() && this.b.equals(lznVar.h()) && this.c == lznVar.b() && this.d == lznVar.e() && this.e == lznVar.k() && this.f == lznVar.g() && this.g == lznVar.i() && this.h == lznVar.a() && this.i == lznVar.c() && this.j == lznVar.f();
    }

    @Override // defpackage.lzn
    public final int f() {
        return this.j;
    }

    @Override // defpackage.lzn
    public final int g() {
        return this.f;
    }

    @Override // defpackage.lzn
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.j ^ ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003);
    }

    @Override // defpackage.lzn
    public final int i() {
        return this.g;
    }

    @Override // defpackage.lzn
    public final int k() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", profile=");
        sb.append(this.g);
        sb.append(", bitDepth=");
        sb.append(this.h);
        sb.append(", chromaSubsampling=");
        sb.append(this.i);
        sb.append(", hdrFormat=");
        return oyr.m(this.j, "}", sb);
    }
}
