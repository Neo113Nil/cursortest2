package xsna;

/* compiled from: AudioBookPersonEvent.kt */
/* loaded from: classes3.dex */
public interface ei4 {

    /* compiled from: AudioBookPersonEvent.kt */
    public static final class a implements ei4 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1044414577;
        }

        public final String toString() {
            return "CopyLinkClick";
        }
    }

    /* compiled from: AudioBookPersonEvent.kt */
    public static final class b implements ei4 {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    /* compiled from: AudioBookPersonEvent.kt */
    public static final class c implements ei4 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -118985005;
        }

        public final String toString() {
            return "ShareClick";
        }
    }

    /* compiled from: AudioBookPersonEvent.kt */
    public static final class d implements ei4 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1313047591;
        }

        public final String toString() {
            return "ShowKidsContentRestriction";
        }
    }
}
