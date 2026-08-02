package xsna;

/* compiled from: RelatedPinCodeEvents.kt */
/* loaded from: classes6.dex */
public interface lsf0 {

    /* compiled from: RelatedPinCodeEvents.kt */
    public static final class a implements lsf0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -170733527;
        }

        public final String toString() {
            return "RelatedPinCodeChangedEvent";
        }
    }

    /* compiled from: RelatedPinCodeEvents.kt */
    public static final class b implements lsf0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1980980261;
        }

        public final String toString() {
            return "RelatedPinCodeCloseEvent";
        }
    }

    /* compiled from: RelatedPinCodeEvents.kt */
    public static final class c implements lsf0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1695528911;
        }

        public final String toString() {
            return "UnsupportedEvent";
        }
    }
}
