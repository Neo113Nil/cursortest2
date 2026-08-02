package xsna;

import android.graphics.Matrix;
import android.view.SurfaceView;
import androidx.compose.runtime.a;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: AndroidExternalSurface.android.kt */
/* loaded from: classes11.dex */
public final class q82 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var, final boolean z) {
        int i2;
        final q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(217541314);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                i3 = i5 & (-897);
                z = true;
            } else {
                M.h();
                i3 = i5 & (-897);
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(217541314, i3, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1057437053, 0, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:370)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new f82(yvjVar);
                new Matrix();
                M.R(x2);
            }
            f82 f82Var = (f82) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new n82(0);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new ob(1);
                M.R(x4);
            }
            izs izsVar3 = (izs) x4;
            boolean p = ((57344 & i3) == 16384) | M.p(0L) | M.y(f82Var) | ((i3 & 112) == 32) | M.y(null);
            Object x5 = M.x();
            if (p || x5 == c0012a) {
                x5 = new o82(f82Var, izsVar, z, 0);
                M.R(x5);
            }
            q630Var2 = q630Var;
            ae2.b(izsVar2, q630Var2, izsVar3, null, (izs) x5, M, ((i3 << 3) & 112) | 390, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p82
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q82.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var2, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final izs izsVar, final q630 q630Var, boolean z) {
        q630 q630Var2;
        int i3;
        final boolean z2;
        int i4;
        final boolean z3;
        androidx.compose.runtime.a M = aVar.M(640888974);
        if ((i2 & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i2;
        } else {
            q630Var2 = q630Var;
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i5 |= M.o(i) ? 2048 : 1024;
        }
        int i6 = i5 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i6 & 1, (74899 & i6) != 74898)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                i4 = i6 & (-897);
                z3 = true;
            } else {
                M.h();
                i4 = i6 & (-897);
                z3 = z;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(640888974, i4, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-873615933, 0, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:187)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            Object obj = x2;
            if (x2 == c0012a) {
                j82 j82Var = new j82(yvjVar);
                j82Var.g = -1;
                j82Var.h = -1;
                M.R(j82Var);
                obj = j82Var;
            }
            j82 j82Var2 = (j82) obj;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean y = ((458752 & i4) == 131072) | M.y(j82Var2);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new k82(0, izsVar, j82Var2);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new j60(1);
                M.R(x4);
            }
            izs izsVar3 = (izs) x4;
            boolean p = ((i4 & 7168) == 2048) | M.p(0L) | ((i4 & 112) == 32) | ((57344 & i4) == 16384);
            Object x5 = M.x();
            if (p || x5 == c0012a) {
                x5 = new izs() { // from class: xsna.l82
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        SurfaceView surfaceView = (SurfaceView) obj2;
                        if (q9x.b(0L, 0L)) {
                            surfaceView.getHolder().setSizeFromLayout();
                        } else {
                            surfaceView.getHolder().setFixedSize((int) 0, (int) 0);
                        }
                        surfaceView.getHolder().setFormat(z3 ? -1 : -3);
                        int i7 = i;
                        if (i7 == 0) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (i7 == 1) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (i7 == 2) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(false);
                        return s3q0.a;
                    }
                };
                M.R(x5);
            }
            ae2.b(izsVar2, q630Var2, izsVar3, null, (izs) x5, M, ((i4 << 3) & 112) | 384, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z2 = z3;
        } else {
            M.h();
            z2 = z;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m82
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i2 | 1);
                    q82.b(i, I, (androidx.compose.runtime.a) obj2, izsVar, q630Var, z2);
                    return s3q0.a;
                }
            };
        }
    }
}
