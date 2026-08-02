package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.toggle.features.ComFeatures;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class zol0 implements lm50 {
    public final b b;
    public final a c;

    /* compiled from: StorefrontServicesViewState.kt */
    public static final class b {
        public final sol0 a;

        public b(sol0 sol0Var) {
            this.a = sol0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TopBar(searchState=" + this.a + ')';
        }
    }

    public zol0(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zol0)) {
            return false;
        }
        zol0 zol0Var = (zol0) obj;
        return epx.f(this.b, zol0Var.b) && epx.f(this.c, zol0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.a.hashCode() * 31);
    }

    public final String toString() {
        return "StorefrontServicesViewState(topBar=" + this.b + ", content=" + this.c + ')';
    }

    /* compiled from: StorefrontServicesViewState.kt */
    public interface a {

        /* compiled from: StorefrontServicesViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -723517938;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: StorefrontServicesViewState.kt */
        public interface c extends a {

            /* compiled from: StorefrontServicesViewState.kt */
            /* renamed from: xsna.zol0$a$c$a, reason: collision with other inner class name */
            public static final class C4189a implements c {
                public static final C4189a a = new C4189a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4189a);
                }

                public final int hashCode() {
                    return -906010704;
                }

                public final String toString() {
                    return "Albums";
                }
            }

            /* compiled from: StorefrontServicesViewState.kt */
            public static final class b implements c {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -397183628;
                }

                public final String toString() {
                    return "Search";
                }
            }

            /* compiled from: StorefrontServicesViewState.kt */
            /* renamed from: xsna.zol0$a$c$c, reason: collision with other inner class name */
            public static final class C4190c implements c {
                public static final C4190c a = new C4190c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4190c);
                }

                public final int hashCode() {
                    return 1049189674;
                }

                public final String toString() {
                    return "Services";
                }
            }

            /* compiled from: StorefrontServicesViewState.kt */
            public static final class d implements c {
                public static final d a = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 1607046068;
                }

                public final String toString() {
                    return "Storefront";
                }
            }
        }

        /* compiled from: StorefrontServicesViewState.kt */
        public static final class d implements a {
            public final ir1 a;
            public final nsi0 b;
            public final LoadingState c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            public d(ir1 ir1Var, nsi0 nsi0Var, LoadingState loadingState, boolean z) {
                ComFeatures comFeatures = ComFeatures.COM_SERVICES_SHOWCASE_SETTINGS;
                comFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                boolean a = bVar.a(comFeatures);
                ComFeatures comFeatures2 = ComFeatures.COM_SERVICES_SHOWCASE_LIST;
                comFeatures2.getClass();
                boolean a2 = bVar.a(comFeatures2);
                this.a = ir1Var;
                this.b = nsi0Var;
                this.c = loadingState;
                this.d = z;
                this.e = a;
                this.f = a2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
            }

            public final int hashCode() {
                ir1 ir1Var = this.a;
                int hashCode = (ir1Var == null ? 0 : ir1Var.hashCode()) * 31;
                nsi0 nsi0Var = this.b;
                return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((hashCode + (nsi0Var != null ? nsi0Var.hashCode() : 0)) * 31)) * 961, 31, this.d), 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(albumsState=");
                sb.append(this.a);
                sb.append(", servicesState=");
                sb.append(this.b);
                sb.append(", loadingState=");
                sb.append(this.c);
                sb.append(", snackBarState=null, isAdmin=");
                sb.append(this.d);
                sb.append(", isServiceSettingToggleEnabled=");
                sb.append(this.e);
                sb.append(", isServiceListViewToggleEnabled=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }

        /* compiled from: StorefrontServicesViewState.kt */
        /* renamed from: xsna.zol0$a$a, reason: collision with other inner class name */
        public static final class C4188a implements a {
            public final PlaceholderState a;
            public final boolean b;
            public final LoadingState c;

            public C4188a(PlaceholderState placeholderState, boolean z, LoadingState loadingState) {
                this.a = placeholderState;
                this.b = z;
                this.c = loadingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4188a)) {
                    return false;
                }
                C4188a c4188a = (C4188a) obj;
                return this.a == c4188a.a && this.b == c4188a.b && this.c == c4188a.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "Empty(placeholderState=" + this.a + ", isAddAvailable=" + this.b + ", loadingState=" + this.c + ')';
            }

            public /* synthetic */ C4188a(PlaceholderState placeholderState, boolean z) {
                this(placeholderState, z, LoadingState.None);
            }
        }
    }
}
