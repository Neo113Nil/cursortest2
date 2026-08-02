package xsna;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
/* loaded from: classes13.dex */
public final class jmr {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: FitModeEvaluators.java */
    public class a implements imr {
        @Override // xsna.imr
        public final boolean a(kmr kmrVar) {
            return kmrVar.d > kmrVar.f;
        }

        @Override // xsna.imr
        public final void b(RectF rectF, float f, kmr kmrVar) {
            rectF.bottom -= Math.abs(kmrVar.f - kmrVar.d) * f;
        }

        @Override // xsna.imr
        public final kmr c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float d = fnp0.d(f4, f6, f2, f3, f, true);
            float f8 = d / f4;
            float f9 = d / f6;
            return new kmr(f8, f9, d, f5 * f8, d, f7 * f9);
        }
    }

    /* compiled from: FitModeEvaluators.java */
    public class b implements imr {
        @Override // xsna.imr
        public final boolean a(kmr kmrVar) {
            return kmrVar.c > kmrVar.e;
        }

        @Override // xsna.imr
        public final void b(RectF rectF, float f, kmr kmrVar) {
            float abs = (Math.abs(kmrVar.e - kmrVar.c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // xsna.imr
        public final kmr c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float d = fnp0.d(f5, f7, f2, f3, f, true);
            float f8 = d / f5;
            float f9 = d / f7;
            return new kmr(f8, f9, f4 * f8, d, f6 * f9, d);
        }
    }
}
