package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek4 implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ek4(wh50 wh50Var, izs izsVar, d9k d9kVar) {
        this.d = wh50Var;
        this.c = izsVar;
        this.e = d9kVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                dlv0 dlv0Var = (dlv0) this.d;
                f3b0 f3b0Var = (f3b0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1442811560, intValue, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:238)");
                    }
                    d4b0.a(dlv0Var, f3b0Var.b().a, null, this.c, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                d9k d9kVar = (d9k) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-759838032, intValue2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView.ThemedContent.<anonymous> (CreateMarketItemReviewView.kt:86)");
                    }
                    jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 15);
                    ijk.a((fm50) mtk0Var.getValue(), txj0.d(q630.a.a, 1.0f), null, "StateChange", kai.c(2092044701, new q3c(this.c, d9kVar), aVar2), aVar2, 27696, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ek4(dlv0 dlv0Var, f3b0 f3b0Var, izs izsVar) {
        this.d = dlv0Var;
        this.e = f3b0Var;
        this.c = izsVar;
    }
}
