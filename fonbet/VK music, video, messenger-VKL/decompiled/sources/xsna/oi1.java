package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.rmw;

/* compiled from: AlbumInfo.kt */
/* loaded from: classes16.dex */
public final class oi1 {
    public static final void a(al1 al1Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(-693903918);
        if ((i & 6) == 0) {
            i2 = (M.J(al1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-693903918, i2, -1, "com.vk.catalog.mvi.block.impl.albumauthor.AlbumInfo (AlbumInfo.kt:35)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            azl azlVar = (azl) M.r(uvi.h);
            long b = byc0.b(azlVar.j1(46), azlVar.j1(46));
            rmw rmwVar = al1Var.e;
            if (rmwVar == null) {
                M.K(-413675003);
                M.j();
                lg90Var = null;
            } else {
                M.K(-1121723012);
                lg90 a = rmw.b.a(new uco(b), rmwVar, M, 0, 2);
                M.j();
                lg90Var = a;
            }
            q630 H = s200.H(txj0.f(q630Var, 1.0f), 16, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 4);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar3 = q630.a.a;
            int i3 = i2;
            q630 c2 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            yqv0.c(al1Var.c, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).C, M, 100663344, 48, 5880);
            if (al1Var.f) {
                M.K(-1146539054);
            } else {
                M.K(-1144024768);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-806015042, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LockOutline16> (VkIcons.kt:6742)");
                }
                lg90 b2 = or.b(M, 1168207208, R.drawable.vk_icon_lock_outline_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(b2, null, null, wlb0.h(M).getIcon().l, M, 56, 4);
            }
            M.j();
            M.G();
            yqv0.c(al1Var.d.a(0, M), s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).d0, M, 100663344, 48, 5880);
            M = M;
            M.G();
            if (lg90Var == null) {
                M.K(80178407);
            } else {
                M.K(80178408);
                phw a5 = phw.a.a(lg90Var, null, null, null, null, M, 196616, 30);
                float f = 46;
                q630 H2 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                boolean y = ((i3 & 112) == 32) | ((i3 & 14) == 4) | M.y(context);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new mi1(izsVar, al1Var, context, 0);
                    M.R(x2);
                }
                ldu0.b(a5, f, ojc.b(H2, sg50Var, null, false, null, (gzs) x2, 28), null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                M = M;
                s3q0 s3q0Var = s3q0.a;
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ni1(i, 0, al1Var, izsVar, q630Var);
        }
    }
}
