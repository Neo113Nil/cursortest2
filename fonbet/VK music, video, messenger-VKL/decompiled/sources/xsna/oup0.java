package xsna;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes11.dex */
public interface oup0 extends mtk0<Object> {

    /* compiled from: FontFamilyResolver.kt */
    public static final class a implements oup0, mtk0<Object> {
        public final hy3 b;

        public a(hy3 hy3Var) {
            this.b = hy3Var;
        }

        @Override // xsna.oup0
        public final boolean B() {
            return this.b.h;
        }

        @Override // xsna.mtk0
        public final Object getValue() {
            return this.b.getValue();
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    public static final class b implements oup0 {
        public final Object b;
        public final boolean c;

        public b(Object obj, boolean z) {
            this.b = obj;
            this.c = z;
        }

        @Override // xsna.oup0
        public final boolean B() {
            return this.c;
        }

        @Override // xsna.mtk0
        public final Object getValue() {
            return this.b;
        }
    }

    boolean B();
}
