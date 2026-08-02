package xsna;

import android.text.SpannedString;

/* compiled from: ProductCardRejectBanner.kt */
/* loaded from: classes18.dex */
public final class hmd0 {
    public final String a;
    public final String b;
    public final a c;
    public final a d;
    public final CharSequence e;

    /* compiled from: ProductCardRejectBanner.kt */
    public interface a {

        /* compiled from: ProductCardRejectBanner.kt */
        /* renamed from: xsna.hmd0$a$a, reason: collision with other inner class name */
        public static final class C3009a implements a {
            public final String a;

            public C3009a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3009a) && epx.f(this.a, ((C3009a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Edit(url="), this.a, ')');
            }
        }

        /* compiled from: ProductCardRejectBanner.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1400788071;
            }

            public final String toString() {
                return "Remove";
            }
        }
    }

    public hmd0(String str, String str2, a.C3009a c3009a, a.b bVar, SpannedString spannedString) {
        this.a = str;
        this.b = str2;
        this.c = c3009a;
        this.d = bVar;
        this.e = spannedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmd0)) {
            return false;
        }
        hmd0 hmd0Var = (hmd0) obj;
        return epx.f(this.a, hmd0Var.a) && epx.f(this.b, hmd0Var.b) && epx.f(this.c, hmd0Var.c) && epx.f(this.d, hmd0Var.d) && epx.f(this.e, hmd0Var.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
        a aVar = this.c;
        int hashCode = (a2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        return hashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardRejectBanner(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", primaryAction=");
        sb.append(this.c);
        sb.append(", secondaryAction=");
        sb.append(this.d);
        sb.append(", infoLink=");
        return thl0.a(sb, this.e, ')');
    }
}
