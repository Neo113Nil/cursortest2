package xsna;

import java.util.List;

/* compiled from: CityParameterPatch.kt */
/* loaded from: classes5.dex */
public interface xec extends xl50 {

    /* compiled from: CityParameterPatch.kt */
    public static final class a implements xec {
        public final List<uec> b;

        public a(List<uec> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("CitiesLoaded(cities="), this.b);
        }
    }

    /* compiled from: CityParameterPatch.kt */
    public static final class b implements xec {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("CitiesLoadingFailed(error="), this.b, ')');
        }
    }

    /* compiled from: CityParameterPatch.kt */
    public static final class c implements xec {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CitiesRequested(query="), this.b, ')');
        }
    }
}
