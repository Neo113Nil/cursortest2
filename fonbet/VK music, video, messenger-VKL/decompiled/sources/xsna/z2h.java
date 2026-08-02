package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.chs;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z2h implements a0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.b) {
            case 0:
                wkj wkjVar = (wkj) this.c;
                chs chsVar = (chs) obj2;
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 48) == 0) {
                    i = (aVar.J(chsVar) ? 32 : 16) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 384) == 0) {
                    i |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(280318291, i, -1, "com.vk.community.design.compose.image.CommunityFrescoImage.<anonymous> (CommunityFrescoImage.kt:51)");
                    }
                    if ((chsVar instanceof chs.e) || (chsVar instanceof chs.d)) {
                        aVar.K(1545887082);
                        vjw.a(lg90Var, null, null, null, wkjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 8 | ((i >> 6) & 14), 108);
                    } else {
                        aVar.K(1544052719);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List list = (List) this.c;
                q630 q630Var = (q630) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue3 = ((Integer) obj5).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1961898124, intValue3, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCards.<anonymous>.<anonymous> (SlidingCards.kt:53)");
                }
                p1k0.a((r1k0.a) list.get(intValue2), q630Var, aVar2, intValue3 & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
