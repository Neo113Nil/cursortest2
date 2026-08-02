package xsna;

import com.vk.search.params.api.domain.model.SearchLocation;

/* compiled from: LocationSearchSideEffect.kt */
/* loaded from: classes5.dex */
public interface tyz {

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class a implements tyz {
        public static final a a = new a();
    }

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class b implements tyz {
        public static final b a = new b();
    }

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class c implements tyz {
        public static final c a = new c();
    }

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class d implements tyz {
        public static final d a = new d();
    }

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class e implements tyz {
        public static final e a = new e();
    }

    /* compiled from: LocationSearchSideEffect.kt */
    public static final class f implements tyz {
        public final SearchLocation a;

        public f(SearchLocation searchLocation) {
            this.a = searchLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            SearchLocation searchLocation = this.a;
            if (searchLocation == null) {
                return 0;
            }
            return searchLocation.hashCode();
        }

        public final String toString() {
            return "SetResult(currentLocation=" + this.a + ')';
        }
    }
}
