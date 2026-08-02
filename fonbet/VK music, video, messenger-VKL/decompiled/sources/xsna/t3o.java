package xsna;

/* compiled from: DonutTeaserSideEffects.kt */
/* loaded from: classes4.dex */
public interface t3o {

    /* compiled from: DonutTeaserSideEffects.kt */
    public static final class a implements t3o {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1121471513;
        }

        public final String toString() {
            return "CancelFlow";
        }
    }

    /* compiled from: DonutTeaserSideEffects.kt */
    public static final class b implements t3o {
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
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("FinishFlow(donutTeaserText="), this.a, ')');
        }
    }

    /* compiled from: DonutTeaserSideEffects.kt */
    public static final class c implements t3o {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowToast(textResId="), this.a, ')');
        }
    }
}
