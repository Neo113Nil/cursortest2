package xsna;

/* compiled from: SeekBarState.kt */
/* loaded from: classes16.dex */
public interface l3i0 {

    /* compiled from: SeekBarState.kt */
    public static final class a implements l3i0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1136781112;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: SeekBarState.kt */
    public static final class b implements l3i0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -474910416;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SeekBarState.kt */
    public static final class c implements l3i0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1333803706;
        }

        public final String toString() {
            return "Paused";
        }
    }

    /* compiled from: SeekBarState.kt */
    public static final class d implements l3i0 {
        public final float a;
        public final float b;

        public d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playing(currentPositionMs=");
            sb.append(this.a);
            sb.append(", totalDurationMs=");
            return xq.c(')', this.b, sb);
        }
    }
}
