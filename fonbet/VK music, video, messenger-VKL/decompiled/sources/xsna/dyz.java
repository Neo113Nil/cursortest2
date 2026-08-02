package xsna;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.SearchLocation;

/* compiled from: LocationSearchAction.kt */
/* loaded from: classes5.dex */
public interface dyz extends kj50 {

    /* compiled from: LocationSearchAction.kt */
    public static final class a implements dyz {
        public static final a b = new a();
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class b implements dyz {
        public final City b;

        public b(City city) {
            this.b = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            City city = this.b;
            if (city == null) {
                return 0;
            }
            return city.hashCode();
        }

        public final String toString() {
            return "DatabaseItemSelected(city=" + this.b + ')';
        }
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class c implements dyz {
        public static final c b = new c();
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class d implements dyz {
        public static final d b = new d();
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class e implements dyz {
        public static final e b = new e();
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class f implements dyz {
        public final SearchLocation b;

        public f(SearchLocation searchLocation) {
            this.b = searchLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            SearchLocation searchLocation = this.b;
            if (searchLocation == null) {
                return 0;
            }
            return searchLocation.hashCode();
        }

        public final String toString() {
            return "Init(initialSearchLocation=" + this.b + ')';
        }
    }

    /* compiled from: LocationSearchAction.kt */
    public static final class g implements dyz {
        public final boolean b;
        public final boolean c;

        public g(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && this.c == gVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LocationRequirementsResultReceived(isPermissionsGranted=");
            sb.append(this.b);
            sb.append(", isServiceEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
