package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import java.util.List;
import xsna.cri;
import xsna.dg70;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o1k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1k(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        float f;
        cri.a.e eVar;
        cri.a.C2678a c2678a;
        cri.a.b bVar;
        LayoutNode.a aVar;
        cri.a.c cVar;
        cri.a.d dVar;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                q1k.b(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                vzo.d((gzs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                String str = (String) this.c;
                mkx0 mkx0Var = (mkx0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(302816675, intValue, -1, "com.vk.games.presentation.components.GiftCard.<anonymous> (GamesCatalogWhatInsideModalBottomSheetContent.kt:194)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 d = txj0.d(aVar3, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(aVar2, d2, cVar2);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(aVar2, D, eVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar2);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar2, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar2, c, dVar2);
                    if (str != null) {
                        aVar2.K(1570875631);
                        dVar = dVar2;
                        f = 1.0f;
                        eVar = eVar2;
                        c2678a = c2678a2;
                        bVar = bVar2;
                        aVar = aVar4;
                        cVar = cVar2;
                        fwu0.c(txj0.d(aVar3, 1.0f), null, str, null, null, null, null, hgi.b, aVar2, 100663302, 250);
                    } else {
                        f = 1.0f;
                        eVar = eVar2;
                        c2678a = c2678a2;
                        bVar = bVar2;
                        aVar = aVar4;
                        cVar = cVar2;
                        dVar = dVar2;
                        aVar2.K(1563732921);
                    }
                    aVar2.j();
                    q630 H = s200.H(txj0.d(aVar3, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aft.c, 7);
                    cp10 d3 = ja8.d(dt1.a.i, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, H);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d3, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    String str2 = mkx0Var.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, null, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.O, aVar2, 0, 0, 8122);
                    if (kr.f(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                fg70.c((dg70.k) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((qd80) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                t8k0.a((jai) this.c, (wzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                xsq0 xsq0Var = (xsq0) this.c;
                f.e.r1 r1Var = (f.e.r1) this.d;
                ((Boolean) obj).getClass();
                kpq0 kpq0Var = xsq0Var.g;
                r1Var.getClass();
                kpq0Var.a(new UserProfileAction.d.e.f());
                return s3q0.a;
        }
    }

    public /* synthetic */ o1k(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
