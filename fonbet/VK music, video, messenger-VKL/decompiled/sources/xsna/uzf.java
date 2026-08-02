package xsna;

import android.media.MediaCodec;

/* compiled from: CodecStat.kt */
/* loaded from: classes3.dex */
public final class uzf {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    /* compiled from: CodecStat.kt */
    public static final class a {
        public final String a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;

        public a(MediaCodec mediaCodec) {
            String str;
            try {
                str = mediaCodec.getName();
            } catch (IllegalStateException unused) {
                str = "failed to get mediacodec name, released?";
            }
            this.a = str;
        }

        public final uzf a() {
            return new uzf(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l);
        }
    }

    public uzf(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzf)) {
            return false;
        }
        uzf uzfVar = (uzf) obj;
        return epx.f(this.a, uzfVar.a) && this.b == uzfVar.b && this.c == uzfVar.c && this.d == uzfVar.d && this.e == uzfVar.e && this.f == uzfVar.f && this.g == uzfVar.g && this.h == uzfVar.h && this.i == uzfVar.i && this.j == uzfVar.j && this.k == uzfVar.k && this.l == uzfVar.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodecStat(");
        sb.append(this.a);
        sb.append("|rel=");
        sb.append(this.b);
        sb.append("|fl=");
        sb.append(this.c);
        sb.append("|eos=");
        sb.append(this.d);
        sb.append("|d_eos=");
        sb.append(this.e);
        sb.append("|dib=");
        sb.append(this.g);
        sb.append("|un_dib=");
        sb.append(this.h);
        sb.append("|qib=");
        sb.append(this.f);
        sb.append("|dob=");
        sb.append(this.i);
        sb.append("|un_dob=");
        sb.append(this.j);
        sb.append("|renob=");
        sb.append(this.k);
        sb.append("|relob=");
        return vu5.b(sb, this.l, ')');
    }
}
