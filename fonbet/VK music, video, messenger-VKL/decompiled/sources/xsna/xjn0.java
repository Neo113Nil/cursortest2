package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: Surface.kt */
/* loaded from: classes11.dex */
public final class xjn0 {
    public static final pqo a = new pqo(new x1c0(10));

    public static final void a(q630 q630Var, r5j0 r5j0Var, long j, long j2, float f, float f2, jai jaiVar, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        r5j0 r5j0Var2 = r5j0Var;
        long a2 = (i2 & 8) != 0 ? u7g.a((i >> 6) & 14, j, aVar) : j2;
        float f3 = (i2 & 16) != 0 ? 0 : f;
        float f4 = (i2 & 32) != 0 ? 0 : f2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        pqo pqoVar = a;
        float f5 = ((pco) aVar.r(pqoVar)).b + f3;
        rvi.b(new c9e0[]{vcl0.b(a2, zfj.a), pqoVar.b(new pco(f5))}, kai.c(421772006, new ujn0(q630Var, r5j0Var2, j, f5, f4, jaiVar), aVar), aVar, 56);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void b(boolean z, gzs gzsVar, q630 q630Var, boolean z2, r5j0 r5j0Var, long j, y18 y18Var, jai jaiVar, androidx.compose.runtime.a aVar, int i, int i2) {
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        long a2 = u7g.a((i >> 15) & 14, j, aVar);
        float f = 0;
        float f2 = 0;
        y18 y18Var2 = (i2 & 512) != 0 ? null : y18Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1416521139, i, 48, "androidx.compose.material3.Surface (Surface.kt:313)");
        }
        aVar.K(1528143336);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = ir.h(aVar);
        }
        sg50 sg50Var = (sg50) x;
        aVar.j();
        pqo pqoVar = a;
        float f3 = ((pco) aVar.r(pqoVar)).b + f;
        rvi.b(new c9e0[]{vcl0.b(a2, zfj.a), pqoVar.b(new pco(f3))}, kai.c(1508735219, new wjn0(q630Var, r5j0Var, j, f3, y18Var2, z, sg50Var, z3, gzsVar, f2, jaiVar), aVar), aVar, 56);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void c(gzs gzsVar, q630 q630Var, boolean z, r5j0 r5j0Var, long j, long j2, float f, float f2, sg50 sg50Var, jai jaiVar, androidx.compose.runtime.a aVar, int i, int i2) {
        sg50 sg50Var2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0 : f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1472753265, i, 6, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (sg50Var == null) {
            aVar.K(-1701037204);
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = ir.h(aVar);
            }
            aVar.j();
            sg50Var2 = (sg50) x;
        } else {
            aVar.K(2023337163);
            aVar.j();
            sg50Var2 = sg50Var;
        }
        pqo pqoVar = a;
        float f4 = ((pco) aVar.r(pqoVar)).b + f3;
        rvi.b(new c9e0[]{vcl0.b(j2, zfj.a), pqoVar.b(new pco(f4))}, kai.c(849208527, new vjn0(q630Var, r5j0Var, j, f4, null, sg50Var2, z2, gzsVar, f2, jaiVar), aVar), aVar, 56);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final q630 d(q630 q630Var, r5j0 r5j0Var, long j, y18 y18Var, float f) {
        r5j0 r5j0Var2;
        q630 q630Var2;
        q630 q630Var3 = q630.a.a;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            r5j0Var2 = r5j0Var;
            q630Var2 = rdu.b(q630Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, r5j0Var2, 124895);
        } else {
            r5j0Var2 = r5j0Var;
            q630Var2 = q630Var3;
        }
        q630 g = q630Var.g(q630Var2);
        if (y18Var != null) {
            q630Var3 = r18.b(y18Var.a, y18Var.b, q630Var3, r5j0Var2);
        }
        return rte0.d(hr80.m(g.g(q630Var3), j, r5j0Var2), r5j0Var2);
    }

    public static final long e(long j, float f, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2079918090, 0, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        t7g t7gVar = (t7g) aVar.r(u7g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1610977682, 0, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean booleanValue = ((Boolean) aVar.r(u7g.b)).booleanValue();
        long j2 = t7gVar.p;
        if (l5g.d(j, j2) && booleanValue) {
            if (pco.b(f, 0)) {
                j = j2;
            } else {
                j = f870.i(l5g.c(14, t7gVar.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j2);
            }
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
