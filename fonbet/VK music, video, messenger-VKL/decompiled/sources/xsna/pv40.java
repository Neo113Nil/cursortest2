package xsna;

/* compiled from: MusicPlayerAdvertisingMviAction.kt */
/* loaded from: classes3.dex */
public interface pv40 extends kj50 {

    /* compiled from: MusicPlayerAdvertisingMviAction.kt */
    public static final class a implements pv40 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ConfigurationChanged(isVertical="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerAdvertisingMviAction.kt */
    public static final class b implements pv40 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnParentStateChanged(parentIsVisible="), this.b, ')');
        }
    }
}
