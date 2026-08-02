package xsna;

/* compiled from: BottomPanelVisibility.kt */
/* loaded from: classes2.dex */
public interface a78 {

    /* compiled from: BottomPanelVisibility.kt */
    public static final class a implements a78 {
        public final sk a;

        public a(sk skVar) {
            this.a = skVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Custom(isHidden=" + this.a + ')';
        }
    }

    /* compiled from: BottomPanelVisibility.kt */
    public static final class b implements a78 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 943702588;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: BottomPanelVisibility.kt */
    public static final class c implements a78 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1160810139;
        }

        public final String toString() {
            return "ShowOnlyInPortrait";
        }
    }
}
