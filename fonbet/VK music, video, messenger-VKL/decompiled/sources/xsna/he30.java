package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.a280;
import xsna.cri;
import xsna.dt1;
import xsna.ee30;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class he30 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ he30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1497287038, intValue, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfo.<anonymous>.<anonymous> (MovieInfoView.kt:178)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                float f = kqu0.t;
                a.j g = androidx.compose.foundation.layout.a.g(f);
                q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar, 0);
                int hashCode = Long.hashCode(n34.n(aVar));
                sy90 D = aVar.D();
                q630 c = qri.c(aVar, H);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (aVar.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar.H();
                if (aVar.L()) {
                    aVar.I(aVar2);
                } else {
                    aVar.f();
                }
                k9q0.w(aVar, a, cri.a.f);
                k9q0.w(aVar, D, cri.a.e);
                k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar, cri.a.h);
                k9q0.w(aVar, c, cri.a.d);
                aVar.K(1821459046);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ie30.b((ee30.a) it.next(), aVar, 0);
                }
                if (gp.d(aVar)) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                return com.vk.sharing.core.view.f.K0((com.vk.sharing.core.view.f) obj4);
            case 2:
                ep10 ep10Var = (ep10) obj;
                zo10 zo10Var = (zo10) obj2;
                o6j o6jVar = (o6j) obj3;
                float f2 = ((pco) ((gzs) obj4).invoke()).b;
                tra0 N = zo10Var.N(o6j.b(0, o6jVar.a, 0, s6j.f(pco.b(f2, Float.NaN) ? 0 : ep10Var.r0(f2), o6jVar.a), 0, 11));
                return ep10Var.Q(N.b, N.c, jgp.b, new b8e0(N, 15));
            case 3:
                a280 a280Var = (a280) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-490381727, intValue2, -1, "com.vk.profile.design.view.onboarding.InternalContent.<anonymous> (UserProfileOnBoardingBannerView.kt:55)");
                }
                if (a280Var != null) {
                    aVar3.K(-1778214687);
                    a280.a.b bVar = a280Var.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1619281279, 0, -1, "com.vk.profile.design.view.onboarding.uiState (UserProfileOnBoardingBannerView.kt:70)");
                    }
                    aVar3.K(-1063668969);
                    o36 o36Var = new o36(bVar.a, bVar.b, xus.s(bVar.c, 0L, aVar3, 0, 2));
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    nyu0.d(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), (lg90) o36Var.d, o36Var.b, (String) o36Var.c, false, a280Var.c, a280Var.b, aVar3, 70, 16);
                    aVar3 = aVar3;
                } else {
                    aVar3.K(-1780230431);
                }
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                jai jaiVar = (jai) obj4;
                anx anxVar = (anx) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar4.J(anxVar) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1399423864, intValue3, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:261)");
                    }
                    jaiVar.invoke(ziv0.f(intValue3 & 14, aVar4), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
