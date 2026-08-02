package xsna;

/* compiled from: OnBoardingScreenData.kt */
/* loaded from: classes5.dex */
public interface b280 {

    /* compiled from: OnBoardingScreenData.kt */
    public static final class a implements b280 {
        public static final a a = new a();

        @Override // xsna.b280
        public final String a() {
            return "";
        }
    }

    /* compiled from: OnBoardingScreenData.kt */
    public static final class b implements b280 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // xsna.b280
        public final String a() {
            return this.a;
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
            StringBuilder sb = new StringBuilder("Main(nextButton=");
            sb.append(this.a);
            sb.append(", closeButton=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: OnBoardingScreenData.kt */
    public static final class c implements b280 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // xsna.b280
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Step(nextButton="), this.a, ')');
        }
    }

    String a();
}
