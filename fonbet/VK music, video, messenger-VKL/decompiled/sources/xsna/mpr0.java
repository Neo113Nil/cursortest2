package xsna;

/* compiled from: VerticalizationModeAction.kt */
/* loaded from: classes16.dex */
public abstract class mpr0 implements kj50 {

    /* compiled from: VerticalizationModeAction.kt */
    public static final class a extends mpr0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1328103829;
        }

        public final String toString() {
            return "Apply";
        }
    }

    /* compiled from: VerticalizationModeAction.kt */
    public static final class b extends mpr0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1821791005;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: VerticalizationModeAction.kt */
    public static final class c extends mpr0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 927225459;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VerticalizationModeAction.kt */
    public static final class d extends mpr0 {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectPickerItem(position="), this.b, ')');
        }
    }
}
