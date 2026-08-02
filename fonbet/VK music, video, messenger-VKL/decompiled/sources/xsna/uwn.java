package xsna;

/* compiled from: DonutBannerUiModel.kt */
/* loaded from: classes5.dex */
public interface uwn {

    /* compiled from: DonutBannerUiModel.kt */
    public static final class a implements uwn {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 889128081;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: DonutBannerUiModel.kt */
    public static final class b<T extends syn> implements uwn {
        public final T a;

        public b(T t) {
            this.a = t;
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
            return "OneCard(card=" + this.a + ')';
        }
    }

    /* compiled from: DonutBannerUiModel.kt */
    public static final class c implements uwn {
        public final twm0 a;
        public final q3u b;

        public c(twm0 twm0Var, q3u q3uVar) {
            this.a = twm0Var;
            this.b = q3uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TwoCards(regular=" + this.a + ", goal=" + this.b + ')';
        }
    }
}
