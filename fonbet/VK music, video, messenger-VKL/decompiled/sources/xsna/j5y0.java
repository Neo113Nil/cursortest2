package xsna;

import com.ironsource.InterfaceC4413l1;

/* compiled from: YandexNativeAdUiDto.kt */
/* loaded from: classes4.dex */
public final class j5y0 extends ol60 {
    public final z4y0 h;
    public final int i;
    public final Object j;
    public final a k;
    public final s1q l;
    public final Integer m;
    public final iko0 n;

    /* compiled from: YandexNativeAdUiDto.kt */
    public static abstract class a {

        /* compiled from: YandexNativeAdUiDto.kt */
        /* renamed from: xsna.j5y0$a$a, reason: collision with other inner class name */
        public static final class C3107a extends a {
            public final CharSequence a;
            public final int b;
            public final int c;
            public final int d;
            public final int e;

            public C3107a(String str, int i, int i2, int i3, int i4) {
                super(str);
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = i4;
            }

            @Override // xsna.j5y0.a
            public final CharSequence a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3107a)) {
                    return false;
                }
                C3107a c3107a = (C3107a) obj;
                return epx.f(this.a, c3107a.a) && this.b == c3107a.b && this.c == c3107a.c && this.d == c3107a.d && this.e == c3107a.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CtaWithRecolor(text=");
                sb.append((Object) this.a);
                sb.append(", initialBackgroundColor=");
                sb.append(this.b);
                sb.append(", finalBackgroundColor=");
                sb.append(this.c);
                sb.append(", initialTextColor=");
                sb.append(this.d);
                sb.append(", finalTextColor=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: YandexNativeAdUiDto.kt */
        public static final class b extends a {
            public final CharSequence a;
            public final int b;
            public final int c;

            public b(CharSequence charSequence, int i, int i2) {
                super(charSequence);
                this.a = charSequence;
                this.b = i;
                this.c = i2;
            }

            @Override // xsna.j5y0.a
            public final CharSequence a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CtaWithoutRecolor(text=");
                sb.append((Object) this.a);
                sb.append(", backgroundColor=");
                sb.append(this.b);
                sb.append(", textColor=");
                return vu5.b(sb, this.c, ')');
            }
        }

        public a(CharSequence charSequence) {
        }

        public abstract CharSequence a();
    }

    public j5y0(z4y0 z4y0Var, int i, CharSequence charSequence, a aVar, s1q s1qVar, Integer num, iko0 iko0Var) {
        super(InterfaceC4413l1.a.b.f, 0, 0, 0, null);
        this.h = z4y0Var;
        this.i = i;
        this.j = charSequence;
        this.k = aVar;
        this.l = s1qVar;
        this.m = num;
        this.n = iko0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5y0)) {
            return false;
        }
        j5y0 j5y0Var = (j5y0) obj;
        j5y0Var.getClass();
        return epx.f(this.h, j5y0Var.h) && this.i == j5y0Var.i && epx.f(this.j, j5y0Var.j) && epx.f(this.k, j5y0Var.k) && epx.f(this.l, j5y0Var.l) && epx.f(this.m, j5y0Var.m) && epx.f(this.n, j5y0Var.n);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + vul0.a(shy.a(this.i, (this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31, 31), 31, this.j)) * 31;
        s1q s1qVar = this.l;
        int hashCode2 = (hashCode + (s1qVar == null ? 0 : s1qVar.hashCode())) * 31;
        Integer num = this.m;
        return this.n.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "YandexNativeAdUiDto(seqId=0, ad=" + this.h + ", adRequestId=" + this.i + ", subtitle=" + this.j + ", cta=" + this.k + ", textExcerptConfig=" + this.l + ", warningImageRes=" + this.m + ", textPostDisplayItem=" + this.n + ')';
    }
}
