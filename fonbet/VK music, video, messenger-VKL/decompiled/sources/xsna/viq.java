package xsna;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: classes13.dex */
public final class viq {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: FadeModeEvaluators.java */
    public class a implements uiq {
        @Override // xsna.uiq
        public final wiq a(float f, float f2, float f3) {
            return new wiq(255, fnp0.e(f2, f3, f, 0, 255), true);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    public class b implements uiq {
        @Override // xsna.uiq
        public final wiq a(float f, float f2, float f3) {
            return new wiq(fnp0.e(f2, f3, f, 255, 0), 255, false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    public class c implements uiq {
        @Override // xsna.uiq
        public final wiq a(float f, float f2, float f3) {
            return new wiq(fnp0.e(f2, f3, f, 255, 0), fnp0.e(f2, f3, f, 0, 255), false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    public class d implements uiq {
        @Override // xsna.uiq
        public final wiq a(float f, float f2, float f3) {
            float b = u11.b(f3, f2, 0.35f, f2);
            return new wiq(fnp0.e(f2, b, f, 255, 0), fnp0.e(b, f3, f, 0, 255), false);
        }
    }
}
