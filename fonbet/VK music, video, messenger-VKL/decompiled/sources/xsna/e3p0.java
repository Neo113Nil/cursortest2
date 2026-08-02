package xsna;

/* compiled from: CollapsableHeaderViewState.kt */
/* loaded from: classes6.dex */
public interface e3p0 {

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class a implements e3p0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -122015164;
        }

        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class b implements e3p0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1987291910;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CollapsableHeaderViewState.kt */
    public static final class c implements e3p0 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemoteImage(url="), this.a, ')');
        }
    }
}
