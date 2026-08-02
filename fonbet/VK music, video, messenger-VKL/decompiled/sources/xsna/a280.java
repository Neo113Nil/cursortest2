package xsna;

/* compiled from: OnBoardingHintBanner.kt */
/* loaded from: classes5.dex */
public final class a280 {
    public final a.b a;
    public final dac0 b;
    public final fk c;

    /* compiled from: OnBoardingHintBanner.kt */
    public static abstract class a {

        /* compiled from: OnBoardingHintBanner.kt */
        /* renamed from: xsna.a280$a$a, reason: collision with other inner class name */
        public static final class C2518a extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2518a)) {
                    return false;
                }
                ((C2518a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(0) + shy.a(0, Integer.hashCode(0) * 31, 31);
            }

            public final String toString() {
                return "LocalRes(title=0, subtitle=0, icon=0)";
            }
        }

        /* compiled from: OnBoardingHintBanner.kt */
        public static final class b extends a {
            public final String a;
            public final String b;
            public final String c;

            public b(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RemoteRes(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                sb.append(this.b);
                sb.append(", imageUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    public a280(a.b bVar, dac0 dac0Var, fk fkVar) {
        this.a = bVar;
        this.b = dac0Var;
        this.c = fkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a280)) {
            return false;
        }
        a280 a280Var = (a280) obj;
        a280Var.getClass();
        return this.a.equals(a280Var.a) && this.b.equals(a280Var.b) && this.c.equals(a280Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnBoardingHintBanner(isVisible=true, res=" + this.a + ", onClose=" + this.b + ", onClick=" + this.c + ')';
    }
}
