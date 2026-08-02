package xsna;

import com.vk.ecomm.reviews.impl.reviewfriends.presentation.model.ReviewFriendsItem;

/* compiled from: ReviewFriendsViewState.kt */
/* loaded from: classes18.dex */
public final class uhg0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ReviewFriendsViewState.kt */
    public static final class a implements fm50<thg0> {
        public final yzt0<wow<ReviewFriendsItem>> a;
        public final yzt0<Integer> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<Boolean> e;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(friends=");
            sb.append(this.a);
            sb.append(", totalCount=");
            sb.append(this.b);
            sb.append(", canHandleNextPage=");
            sb.append(this.c);
            sb.append(", isNextPageLoading=");
            sb.append(this.d);
            sb.append(", isPaginationError=");
            return tr.c(sb, this.e, ')');
        }
    }

    /* compiled from: ReviewFriendsViewState.kt */
    public static final class b implements fm50<thg0> {
        public final yzt0<tlo0> a;
        public final yzt0<tlo0> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(title=");
            sb.append(this.a);
            sb.append(", description=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: ReviewFriendsViewState.kt */
    public static final class c implements fm50<thg0> {
        public static final c a = new c();
    }

    /* compiled from: ReviewFriendsViewState.kt */
    public static final class d implements fm50<thg0> {
        public static final d a = new d();
    }

    public uhg0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
