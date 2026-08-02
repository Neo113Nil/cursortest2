package xsna;

/* compiled from: PinReviewManageServiceViewState.kt */
/* loaded from: classes18.dex */
public interface gna0 extends lm50 {

    /* compiled from: PinReviewManageServiceViewState.kt */
    public static final class a implements gna0 {
        public final tlo0 b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final rxm0 g;
        public final g770 h;
        public final n80 i;
        public final rkn0 j;

        public a(tlo0 tlo0Var, String str, String str2, String str3, String str4, rxm0 rxm0Var, g770 g770Var, n80 n80Var, rkn0 rkn0Var) {
            this.b = tlo0Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = rxm0Var;
            this.h = g770Var;
            this.i = n80Var;
            this.j = rkn0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            rxm0 rxm0Var = this.g;
            int hashCode = (a + (rxm0Var == null ? 0 : rxm0Var.hashCode())) * 31;
            g770 g770Var = this.h;
            int hashCode2 = (hashCode + (g770Var == null ? 0 : g770Var.hashCode())) * 31;
            n80 n80Var = this.i;
            int hashCode3 = (hashCode2 + (n80Var == null ? 0 : n80Var.hashCode())) * 31;
            rkn0 rkn0Var = this.j;
            return hashCode3 + (rkn0Var != null ? rkn0Var.a.hashCode() : 0);
        }

        public final String toString() {
            return "Content(subscriptionStatusText=" + this.b + ", subscriptionName=" + this.c + ", communityName=" + this.d + ", communityImageUrl=" + this.e + ", communitySubscribersCount=" + this.f + ", subscriptionBuyerInfo=" + this.g + ", notSubscriptionBuyerInfo=" + this.h + ", activeSubscriptionInfo=" + this.i + ", suspendedSubscriptionInfo=" + this.j + ')';
        }
    }

    /* compiled from: PinReviewManageServiceViewState.kt */
    public static final class b implements gna0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -14832042;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: PinReviewManageServiceViewState.kt */
    public static final class c implements gna0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 446947850;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
