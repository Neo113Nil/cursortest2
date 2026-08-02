package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ContentProductsAction.kt */
/* loaded from: classes18.dex */
public interface xij extends lj50 {

    /* compiled from: ContentProductsAction.kt */
    public static final class a implements xij {
        public final hpd0 b;

        public a(hpd0 hpd0Var) {
            this.b = hpd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AddToCart(productItem=" + this.b + ')';
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class b implements xij {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -314624541;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static abstract class c implements xij {

        /* compiled from: ContentProductsAction.kt */
        public static final class a extends c {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Cart(quantity="), this.b, ')');
            }
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class d implements xij {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -608673307;
        }

        public final String toString() {
            return "LoadData";
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class e implements xij {
        public final long b;
        public final UserId c;
        public final boolean d;

        public e(long j, UserId userId, boolean z) {
            this.b = j;
            this.c = userId;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnFaveChange(productItem=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", isFave=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class f implements xij {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1336016063;
        }

        public final String toString() {
            return "OpenCart";
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class g implements xij {
        public final hpd0 b;

        public g(hpd0 hpd0Var) {
            this.b = hpd0Var;
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
            return "RemoveFromCart(productItem=" + this.b + ')';
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class h implements xij {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -300975469;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class i implements xij {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TrackOnViewItem(index="), this.b, ')');
        }
    }

    /* compiled from: ContentProductsAction.kt */
    public static final class j implements xij {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1413820444;
        }

        public final String toString() {
            return "UpdateModerationItems";
        }
    }
}
