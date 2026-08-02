package xsna;

import java.util.ArrayList;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes11.dex */
public interface efu {

    /* compiled from: LazyGridDsl.kt */
    public static final class a implements efu {
        public final float a;

        public a(float f) {
            this.a = f;
            if (pco.a(f, 0) > 0) {
                return;
            }
            xzw.a("Provided min size should be larger than zero.");
        }

        @Override // xsna.efu
        public final ArrayList a(azl azlVar, int i, int i2) {
            return uqy.c(i, Math.max((i + i2) / (azlVar.r0(this.a) + i2), 1), i2);
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

    /* compiled from: LazyGridDsl.kt */
    public static final class b implements efu {
        public final int a;

        public b(int i) {
            this.a = i;
            if (i > 0) {
                return;
            }
            xzw.a("Provided count should be larger than zero");
        }

        @Override // xsna.efu
        public final ArrayList a(azl azlVar, int i, int i2) {
            return uqy.c(i, this.a, i2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return -this.a;
        }
    }

    ArrayList a(azl azlVar, int i, int i2);
}
