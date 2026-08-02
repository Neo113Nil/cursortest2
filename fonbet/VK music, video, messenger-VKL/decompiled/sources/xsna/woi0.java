package xsna;

/* compiled from: ServiceEvent.kt */
/* loaded from: classes3.dex */
public abstract class woi0 {

    /* compiled from: ServiceEvent.kt */
    public static final class a extends woi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1049322096;
        }

        public final String toString() {
            return "ConnectionLost";
        }
    }

    /* compiled from: ServiceEvent.kt */
    public static final class b extends woi0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -230146046;
        }

        public final String toString() {
            return "ConnectionRestored";
        }
    }

    /* compiled from: ServiceEvent.kt */
    public static final class c extends woi0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1892887099;
        }

        public final String toString() {
            return "ReAuthInProgress";
        }
    }
}
