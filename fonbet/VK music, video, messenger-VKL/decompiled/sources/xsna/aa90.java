package xsna;

/* compiled from: PageSize.kt */
/* loaded from: classes11.dex */
public interface aa90 {

    /* compiled from: PageSize.kt */
    public static final class b implements aa90 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // xsna.aa90
        public final int a(qty qtyVar, int i) {
            return qtyVar.c.r0(this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return pco.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }
    }

    int a(qty qtyVar, int i);

    /* compiled from: PageSize.kt */
    public static final class a implements aa90 {
        public static final a a = new a();

        @Override // xsna.aa90
        public final int a(qty qtyVar, int i) {
            return i;
        }
    }
}
