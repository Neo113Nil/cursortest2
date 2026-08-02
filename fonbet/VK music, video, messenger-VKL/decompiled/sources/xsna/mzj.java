package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Address;

/* compiled from: CourierMapPatch.kt */
/* loaded from: classes18.dex */
public interface mzj extends xl50 {

    /* compiled from: CourierMapPatch.kt */
    public static abstract class a implements mzj {

        /* compiled from: CourierMapPatch.kt */
        /* renamed from: xsna.mzj$a$a, reason: collision with other inner class name */
        public static final class C3378a extends a {
            public static final C3378a b = new C3378a();
        }

        /* compiled from: CourierMapPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: CourierMapPatch.kt */
    public static final class b implements mzj {
        public final qnt b;
        public final String c;

        public b() {
            this(null, null, 3);
        }

        public b(qnt qntVar, String str, int i) {
            qntVar = (i & 1) != 0 ? null : qntVar;
            str = (i & 2) != 0 ? null : str;
            this.b = qntVar;
            this.c = str;
        }
    }

    /* compiled from: CourierMapPatch.kt */
    public static abstract class c implements mzj {

        /* compiled from: CourierMapPatch.kt */
        public static final class b extends c {
            public static final b b = new b();
        }

        /* compiled from: CourierMapPatch.kt */
        /* renamed from: xsna.mzj$c$c, reason: collision with other inner class name */
        public static final class C3379c extends c {
            public static final C3379c b = new C3379c();
        }

        /* compiled from: CourierMapPatch.kt */
        public static final class d extends c {
            public static final d b = new d();
        }

        /* compiled from: CourierMapPatch.kt */
        public static final class e extends c {
            public final Address b;

            public e(Address address) {
                this.b = address;
            }
        }

        /* compiled from: CourierMapPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public a() {
                this(null);
            }
        }
    }

    /* compiled from: CourierMapPatch.kt */
    public static final class d implements mzj {
        public final pk00 b;

        public d(pk00 pk00Var) {
            this.b = pk00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "MapCenterChange(mapCenterPatch=" + this.b + ')';
        }
    }

    /* compiled from: CourierMapPatch.kt */
    public interface e extends mzj {

        /* compiled from: CourierMapPatch.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1713133301;
            }

            public final String toString() {
                return "Failed";
            }
        }

        /* compiled from: CourierMapPatch.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 788585940;
            }

            public final String toString() {
                return "Start";
            }
        }
    }
}
