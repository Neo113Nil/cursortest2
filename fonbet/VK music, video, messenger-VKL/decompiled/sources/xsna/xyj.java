package xsna;

import com.vk.ecomm.cart.impl.common.models.exception.MapServicesNotSuppoertedException;
import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;

/* compiled from: CourierMapAction.kt */
/* loaded from: classes18.dex */
public abstract class xyj implements kj50 {

    /* compiled from: CourierMapAction.kt */
    public static abstract class a extends xyj {

        /* compiled from: CourierMapAction.kt */
        /* renamed from: xsna.xyj$a$a, reason: collision with other inner class name */
        public static final class C4053a extends a {
            public static final C4053a b = new C4053a();
        }

        /* compiled from: CourierMapAction.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static abstract class b extends xyj {

        /* compiled from: CourierMapAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: CourierMapAction.kt */
        /* renamed from: xsna.xyj$b$b, reason: collision with other inner class name */
        public static final class C4054b extends b {
            public final String b;

            public C4054b(String str) {
                this.b = str;
            }
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static abstract class c extends xyj {

        /* compiled from: CourierMapAction.kt */
        public static abstract class b extends c {

            /* compiled from: CourierMapAction.kt */
            public static final class a extends b {
                public static final a b = new a();
            }

            /* compiled from: CourierMapAction.kt */
            /* renamed from: xsna.xyj$c$b$b, reason: collision with other inner class name */
            public static final class C4055b extends b {
                public final Coordinates b;

                public C4055b(Coordinates coordinates) {
                    this.b = coordinates;
                }
            }
        }

        /* compiled from: CourierMapAction.kt */
        /* renamed from: xsna.xyj$c$c, reason: collision with other inner class name */
        public static final class C4056c extends c {
            public static final C4056c b = new C4056c();
        }

        /* compiled from: CourierMapAction.kt */
        public static final class d extends c {
            public static final d b = new d();
        }

        /* compiled from: CourierMapAction.kt */
        public static final class e extends c {
            public final Address b;

            public e(Address address) {
                this.b = address;
            }
        }

        /* compiled from: CourierMapAction.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(MapServicesNotSuppoertedException mapServicesNotSuppoertedException) {
                this.b = mapServicesNotSuppoertedException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failed(error="), this.b, ')');
            }

            public a() {
                this(null);
            }
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static final class d extends xyj {
    }

    /* compiled from: CourierMapAction.kt */
    public static final class e extends xyj {
        public final gk9 b;

        public e(gk9 gk9Var) {
            this.b = gk9Var;
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static final class f extends xyj {
    }

    /* compiled from: CourierMapAction.kt */
    public static final class g extends xyj {
        public final SearchAddressResult b;

        public g(SearchAddressResult searchAddressResult) {
            this.b = searchAddressResult;
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static final class h extends xyj {
        public final Coordinates b;

        public h(Coordinates coordinates) {
            this.b = coordinates;
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static abstract class j extends xyj {

        /* compiled from: CourierMapAction.kt */
        public static final class a extends j {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2041658945;
            }

            public final String toString() {
                return "FindLocationError";
            }
        }

        /* compiled from: CourierMapAction.kt */
        public static final class b extends j {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1791819712;
            }

            public final String toString() {
                return "LocationUnavailable";
            }
        }

        /* compiled from: CourierMapAction.kt */
        public static final class c extends j {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1576462851;
            }

            public final String toString() {
                return "PermissionRequestStart";
            }
        }

        /* compiled from: CourierMapAction.kt */
        public static final class d extends j {
            public final Coordinates b;

            public d(Coordinates coordinates) {
                this.b = coordinates;
            }
        }

        /* compiled from: CourierMapAction.kt */
        public static final class e extends j {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 341654407;
            }

            public final String toString() {
                return "Start";
            }
        }
    }

    /* compiled from: CourierMapAction.kt */
    public static final class i extends xyj {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public i() {
            this(false);
        }
    }
}
