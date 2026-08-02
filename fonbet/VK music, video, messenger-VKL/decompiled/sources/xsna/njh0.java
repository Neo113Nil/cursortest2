package xsna;

/* compiled from: SdkForbiddenReasons.kt */
/* loaded from: classes17.dex */
public interface njh0 {

    /* compiled from: SdkForbiddenReasons.kt */
    public static final class a implements njh0 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Ad(description="), this.a, ')');
        }
    }

    /* compiled from: SdkForbiddenReasons.kt */
    public static final class b implements njh0 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Test(description="), this.a, ')');
        }
    }
}
