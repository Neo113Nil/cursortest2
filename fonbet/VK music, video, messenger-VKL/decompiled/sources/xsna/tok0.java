package xsna;

/* compiled from: LazyStaggeredGridCells.kt */
/* loaded from: classes11.dex */
public interface tok0 {

    /* compiled from: LazyStaggeredGridCells.kt */
    public static final class a implements tok0 {
        public final float a;

        public a(float f) {
            this.a = f;
            if (pco.a(f, 0) > 0) {
                return;
            }
            xzw.a("invalid minSize");
        }

        @Override // xsna.tok0
        public final int[] a(azl azlVar, int i, int i2) {
            int i3;
            int max = Math.max((i + i2) / (azlVar.r0(this.a) + i2), 1);
            int i4 = i - ((max - 1) * i2);
            int i5 = i4 / max;
            int i6 = i4 % max;
            int[] iArr = new int[max];
            int i7 = 0;
            while (i7 < max) {
                if (i5 < 0) {
                    i3 = 0;
                } else {
                    i3 = (i7 < i6 ? 1 : 0) + i5;
                }
                iArr[i7] = i3;
                i7++;
            }
            return iArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return pco.b(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }
    }

    int[] a(azl azlVar, int i, int i2);
}
