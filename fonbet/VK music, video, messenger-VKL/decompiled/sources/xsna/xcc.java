package xsna;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CircleOverlapShape.kt */
/* loaded from: classes17.dex */
public final class xcc implements r5j0 {
    public final float a;
    public final float b;
    public final a c;
    public final r5j0 d;

    /* compiled from: CircleOverlapShape.kt */
    public static abstract class a {

        /* compiled from: CircleOverlapShape.kt */
        /* renamed from: xsna.xcc$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3993a extends a {
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class b extends j {
            public static final b a = new b();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class c extends d {
            public static final c a = new c();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static abstract class d extends a {
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class e extends f {
            public static final e a = new e();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static abstract class f extends AbstractC3993a {
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class g extends f {
            public static final g a = new g();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class h extends j {
            public static final h a = new h();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static final class i extends d {
            public static final i a = new i();
        }

        /* compiled from: CircleOverlapShape.kt */
        public static abstract class j extends AbstractC3993a {
        }
    }

    public xcc(float f, float f2, a aVar, r5j0 r5j0Var) {
        this.a = f;
        this.b = f2;
        this.c = aVar;
        this.d = r5j0Var;
    }

    public static void b(androidx.compose.ui.graphics.a aVar, float f, float f2, androidx.compose.ui.graphics.c cVar) {
        androidx.compose.ui.graphics.d.a(aVar, cVar);
        aVar.e((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        float density = azlVar.getDensity() * this.b;
        float density2 = azlVar.getDensity() * this.a;
        int i = (int) (j >> 32);
        float f = 2 * density2;
        float intBitsToFloat = Float.intBitsToFloat(i) + f;
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) + f;
        r5j0 r5j0Var = this.d;
        androidx.compose.ui.graphics.c a2 = r5j0Var.a(j, layoutDirection, azlVar);
        androidx.compose.ui.graphics.c a3 = r5j0Var.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), layoutDirection, azlVar);
        androidx.compose.ui.graphics.a a4 = androidx.compose.ui.graphics.b.a();
        a4.reset();
        androidx.compose.ui.graphics.d.a(a4, a2);
        androidx.compose.ui.graphics.a a5 = androidx.compose.ui.graphics.b.a();
        a5.reset();
        a.g gVar = a.g.a;
        a aVar = this.c;
        if (epx.f(aVar, gVar)) {
            b(a5, ((-Float.intBitsToFloat(i)) + density) - density2, -density2, a3);
        } else if (epx.f(aVar, a.e.a)) {
            b(a5, (Float.intBitsToFloat(i) - density) - density2, -density2, a3);
        } else if (epx.f(aVar, a.h.a)) {
            b(a5, -density2, ((-Float.intBitsToFloat(i2)) + density) - density2, a3);
        } else if (epx.f(aVar, a.b.a)) {
            b(a5, -density2, (Float.intBitsToFloat(i2) - density) - density2, a3);
        } else if (epx.f(aVar, a.c.a)) {
            b(a5, ((-Float.intBitsToFloat(i)) + density) - density2, (Float.intBitsToFloat(i2) - density) - density2, a3);
        } else {
            if (!epx.f(aVar, a.i.a)) {
                throw new NoWhenBranchMatchedException();
            }
            b(a5, (Float.intBitsToFloat(i) - density) - density2, ((-Float.intBitsToFloat(i2)) + density) - density2, a3);
        }
        androidx.compose.ui.graphics.a a6 = androidx.compose.ui.graphics.b.a();
        if (a6.x(a4, a5, 0)) {
            return new c.a(a6);
        }
        throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
    }
}
