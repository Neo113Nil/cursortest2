package xsna;

import java.util.List;

/* compiled from: MarketItemCommentsViewState.kt */
/* loaded from: classes17.dex */
public final class l110 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: MarketItemCommentsViewState.kt */
    public static final class a implements fm50<k110> {
        public final yzt0<Boolean> a;
        public final yzt0<List<j010>> b;

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
            StringBuilder sb = new StringBuilder("Content(isCommentBarVisible=");
            sb.append(this.a);
            sb.append(", items=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: MarketItemCommentsViewState.kt */
    public static final class b implements fm50<k110> {
        public final yzt0<Boolean> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: MarketItemCommentsViewState.kt */
    public static final class c implements fm50<k110> {
    }

    /* compiled from: MarketItemCommentsViewState.kt */
    public static final class d implements fm50<k110> {
        public final yzt0<Boolean> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public l110(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
