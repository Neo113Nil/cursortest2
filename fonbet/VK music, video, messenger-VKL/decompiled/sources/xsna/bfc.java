package xsna;

import com.vk.search.params.api.City;

/* compiled from: CityParameterSideEffect.kt */
/* loaded from: classes5.dex */
public interface bfc {

    /* compiled from: CityParameterSideEffect.kt */
    public static final class a implements bfc {
        public final City a;

        public a(City city) {
            this.a = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetResult(city=" + this.a + ')';
        }
    }
}
