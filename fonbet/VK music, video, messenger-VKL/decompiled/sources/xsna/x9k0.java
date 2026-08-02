package xsna;

/* compiled from: SnapPosition.kt */
/* loaded from: classes11.dex */
public interface x9k0 {

    /* compiled from: SnapPosition.kt */
    public static final class a implements x9k0 {
        public static final a a = new a();

        @Override // xsna.x9k0
        public final int d(int i, int i2, int i3, int i4) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    /* compiled from: SnapPosition.kt */
    public static final class b implements x9k0 {
        public static final b a = new b();

        @Override // xsna.x9k0
        public final int d(int i, int i2, int i3, int i4) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int d(int i, int i2, int i3, int i4);
}
