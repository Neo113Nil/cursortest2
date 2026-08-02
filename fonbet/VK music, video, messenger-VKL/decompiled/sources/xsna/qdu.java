package xsna;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.er9;

/* compiled from: GraphicsLayer.kt */
/* loaded from: classes11.dex */
public final class qdu {
    public static final void a(oio oioVar, mdu mduVar) {
        d52 d52Var;
        boolean z;
        boolean z2;
        boolean z3;
        yq9 a = oioVar.a0().a();
        mdu mduVar2 = oioVar.a0().b;
        pdu pduVar = mduVar.a;
        if (mduVar.s) {
            return;
        }
        mduVar.a();
        if (!pduVar.D()) {
            try {
                mduVar.a.T(mduVar.b, mduVar.c, mduVar, mduVar.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = pduVar.F() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z4) {
            a.s();
        }
        Canvas canvas = e52.a;
        d52 d52Var2 = (d52) a;
        Canvas canvas2 = d52Var2.a;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            d52Var = d52Var2;
        } else {
            long j = mduVar.t;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long j2 = mduVar.u;
            d52Var = d52Var2;
            float f3 = ((int) (j2 >> 32)) + f;
            float f4 = f2 + ((int) (j2 & 4294967295L));
            float a2 = pduVar.a();
            d6g c = pduVar.c();
            int U = pduVar.U();
            if (a2 < 1.0f || U != 3 || c != null || pduVar.Q() == 1) {
                va2 va2Var = mduVar.p;
                if (va2Var == null) {
                    va2Var = new va2();
                    mduVar.p = va2Var;
                }
                va2Var.b(a2);
                va2Var.i(U);
                va2Var.j(c);
                canvas2.saveLayer(f, f2, f3, f4, wa2.a(va2Var));
            } else {
                canvas2.save();
            }
            canvas2.translate(f, f2);
            canvas2.concat(pduVar.P());
        }
        boolean z5 = !isHardwareAccelerated && mduVar.w;
        if (z5) {
            a.e();
            androidx.compose.ui.graphics.c d = mduVar.d();
            if (d instanceof c.b) {
                a.b(((c.b) d).a);
            } else if (d instanceof c.C0013c) {
                androidx.compose.ui.graphics.a aVar = mduVar.m;
                if (aVar != null) {
                    aVar.rewind();
                } else {
                    aVar = androidx.compose.ui.graphics.b.a();
                    mduVar.m = aVar;
                }
                aVar.q(((c.C0013c) d).a, Path.Direction.CounterClockwise);
                a.j(aVar, 1);
            } else {
                if (!(d instanceof c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.j(((c.a) d).a, 1);
            }
        }
        if (mduVar2 != null) {
            u9c u9cVar = mduVar2.r;
            if (!u9cVar.e) {
                tzw.a("Only add dependencies during a tracking");
            }
            qh50<mdu> qh50Var = u9cVar.c;
            if (qh50Var != null) {
                qh50Var.e(mduVar);
            } else if (u9cVar.a != null) {
                qh50<mdu> a3 = k5h0.a();
                a3.e(u9cVar.a);
                a3.e(mduVar);
                u9cVar.c = a3;
                u9cVar.a = null;
            } else {
                u9cVar.a = mduVar;
            }
            qh50<mdu> qh50Var2 = u9cVar.d;
            if (qh50Var2 != null) {
                z3 = !qh50Var2.m(mduVar);
            } else if (u9cVar.b != mduVar) {
                z3 = true;
            } else {
                u9cVar.b = null;
                z3 = false;
            }
            if (z3) {
                mduVar.q++;
            }
        }
        if (d52Var.a.isHardwareAccelerated()) {
            z = z4;
            z2 = isHardwareAccelerated;
            pduVar.V(a);
        } else {
            er9 er9Var = mduVar.o;
            if (er9Var == null) {
                er9Var = new er9();
                mduVar.o = er9Var;
            }
            er9.b bVar = er9Var.c;
            azl azlVar = mduVar.b;
            LayoutDirection layoutDirection = mduVar.c;
            long w = pli.w(mduVar.u);
            azl b = bVar.b();
            LayoutDirection c2 = bVar.c();
            yq9 a4 = bVar.a();
            z2 = isHardwareAccelerated;
            long d2 = bVar.d();
            z = z4;
            mdu mduVar3 = bVar.b;
            bVar.f(azlVar);
            bVar.g(layoutDirection);
            bVar.e(a);
            bVar.h(w);
            bVar.b = mduVar;
            a.e();
            try {
                mduVar.c(er9Var);
            } finally {
                a.a();
                bVar.f(b);
                bVar.g(c2);
                bVar.e(a4);
                bVar.h(d2);
                bVar.b = mduVar3;
            }
        }
        if (z5) {
            a.a();
        }
        if (z) {
            a.f();
        }
        if (z2) {
            return;
        }
        canvas2.restore();
    }
}
