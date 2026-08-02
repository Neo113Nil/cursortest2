package xsna;

/* compiled from: OverflowDetectionPolicy.kt */
/* loaded from: classes18.dex */
public interface t190 {

    /* compiled from: OverflowDetectionPolicy.kt */
    public static final class a implements t190 {
        public final int a;

        public a(int i) {
            this.a = i;
            if (i < 0) {
                throw new IllegalArgumentException("Width should be at least 0");
            }
        }

        @Override // xsna.t190
        public final boolean a(int i, int i2) {
            return i < Math.min(this.a, i2);
        }
    }

    boolean a(int i, int i2);
}
