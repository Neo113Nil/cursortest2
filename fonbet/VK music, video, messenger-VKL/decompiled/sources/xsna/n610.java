package xsna;

/* compiled from: MarketItemsForReviewViewState.kt */
/* loaded from: classes18.dex */
public final class n610 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: MarketItemsForReviewViewState.kt */
    public static final class a implements fm50<g610> {
        public final yzt0<h610> a;
        public final yzt0<wow<s110>> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(stateModel=");
            sb.append(this.a);
            sb.append(", composeItems=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: MarketItemsForReviewViewState.kt */
    public static final class b implements fm50<g610> {
        public static final b a = new b();
    }

    /* compiled from: MarketItemsForReviewViewState.kt */
    public static final class c implements fm50<g610> {
        public static final c a = new c();
    }

    /* compiled from: MarketItemsForReviewViewState.kt */
    public static final class d implements fm50<g610> {
        public static final d a = new d();
    }

    public n610(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
