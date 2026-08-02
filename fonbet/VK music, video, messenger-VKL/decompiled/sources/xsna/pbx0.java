package xsna;

/* compiled from: CollapsableHeaderViewState.kt */
/* loaded from: classes6.dex */
public interface pbx0 {

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class a implements pbx0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -968516727;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class b implements pbx0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1995379228;
        }

        public final String toString() {
            return "IconOnly";
        }
    }

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class c implements pbx0 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Text(title="), this.a, ')');
        }
    }
}
