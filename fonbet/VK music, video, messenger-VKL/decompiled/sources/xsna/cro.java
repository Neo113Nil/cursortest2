package xsna;

/* compiled from: DzenArticleAction.kt */
/* loaded from: classes18.dex */
public interface cro extends lj50 {

    /* compiled from: DzenArticleAction.kt */
    public static final class a implements cro {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ActionAdCancelled(newsEntryType="), this.b, ')');
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class b implements cro {
        public final String b;
        public final String c;

        public b(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionAdReported(optionText=");
            sb.append(this.b);
            sb.append(", newsEntryType=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class c implements cro {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1299229663;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class d implements cro {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 74031319;
        }

        public final String toString() {
            return "HideMiddleAd";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class e implements cro {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 821360761;
        }

        public final String toString() {
            return "HideTopAd";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class f implements cro {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1183527357;
        }

        public final String toString() {
            return "InfoClick";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class g implements cro {
        public final String b;

        public g(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkClick(url="), this.b, ')');
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class h implements cro {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -360024066;
        }

        public final String toString() {
            return "MiddleAdComplain";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class i implements cro {
        public final zu50 b;
        public final cw50 c;
        public final fe0 d;

        public i(zu50 zu50Var, cw50 cw50Var, fe0 fe0Var) {
            this.b = zu50Var;
            this.c = cw50Var;
            this.d = fe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c) && epx.f(this.d, iVar.d);
        }

        public final int hashCode() {
            zu50 zu50Var = this.b;
            int hashCode = (zu50Var == null ? 0 : zu50Var.hashCode()) * 31;
            cw50 cw50Var = this.c;
            int hashCode2 = (hashCode + (cw50Var == null ? 0 : cw50Var.hashCode())) * 31;
            fe0 fe0Var = this.d;
            return hashCode2 + (fe0Var != null ? fe0Var.hashCode() : 0);
        }

        public final String toString() {
            return "MiddleAdInit(nativeAd=" + this.b + ", promoBanner=" + this.c + ", adChoicesController=" + this.d + ')';
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class j implements cro {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1661113892;
        }

        public final String toString() {
            return "OnDismissInfoDialog";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class k implements cro {
        public final int b;

        public k(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnScrollPercent(percents="), this.b, ')');
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class l implements cro {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -655445015;
        }

        public final String toString() {
            return "RetryInitialLoadClick";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class m implements cro {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 300650673;
        }

        public final String toString() {
            return "ScreenDestroy";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class n implements cro {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 257087597;
        }

        public final String toString() {
            return "ScreenPause";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class o implements cro {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -559324010;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class p implements cro {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1798315270;
        }

        public final String toString() {
            return "ShareClick";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class q implements cro {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1970622979;
        }

        public final String toString() {
            return "ToolbarBackClick";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class r implements cro {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1045258204;
        }

        public final String toString() {
            return "TopAdComplain";
        }
    }

    /* compiled from: DzenArticleAction.kt */
    public static final class s implements cro {
        public final zu50 b;
        public final cw50 c;
        public final fe0 d;

        public s(zu50 zu50Var, cw50 cw50Var, fe0 fe0Var) {
            this.b = zu50Var;
            this.c = cw50Var;
            this.d = fe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return epx.f(this.b, sVar.b) && epx.f(this.c, sVar.c) && epx.f(this.d, sVar.d);
        }

        public final int hashCode() {
            zu50 zu50Var = this.b;
            int hashCode = (zu50Var == null ? 0 : zu50Var.hashCode()) * 31;
            cw50 cw50Var = this.c;
            int hashCode2 = (hashCode + (cw50Var == null ? 0 : cw50Var.hashCode())) * 31;
            fe0 fe0Var = this.d;
            return hashCode2 + (fe0Var != null ? fe0Var.hashCode() : 0);
        }

        public final String toString() {
            return "TopAdInit(nativeAd=" + this.b + ", promoBanner=" + this.c + ", adChoicesController=" + this.d + ')';
        }
    }
}
