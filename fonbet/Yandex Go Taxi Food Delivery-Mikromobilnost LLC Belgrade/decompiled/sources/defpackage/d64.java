package defpackage;

/* loaded from: classes10.dex */
public final class d64 extends jzn {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public d64(int i, int i2, int i3, int i4, int i5, String str) {
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
    }

    @Override // defpackage.jzn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jzn
    public final int b() {
        return this.e;
    }

    @Override // defpackage.jzn
    public final int c() {
        return this.a;
    }

    @Override // defpackage.jzn
    public final String d() {
        return this.b;
    }

    @Override // defpackage.jzn
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jzn)) {
            return false;
        }
        jzn jznVar = (jzn) obj;
        return this.a == jznVar.c() && this.b.equals(jznVar.d()) && this.c == jznVar.a() && this.d == jznVar.f() && this.e == jznVar.b() && this.f == jznVar.e();
    }

    @Override // defpackage.jzn
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return oyr.m(this.f, "}", sb);
    }
}
