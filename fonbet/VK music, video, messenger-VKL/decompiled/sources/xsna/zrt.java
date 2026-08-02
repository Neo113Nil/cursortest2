package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import org.json.JSONObject;
import xsna.bex0;
import xsna.gna0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zrt implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zrt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                bst bstVar = (bst) this.c;
                int intValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                long longValue = ((Long) obj3).longValue();
                r6y r6yVar = bstVar.b;
                if (r6yVar != null) {
                    bex0.a.b(r6yVar, JsApiMethodType.GET_WORKOUTS, new JSONObject().put("result", new JSONObject().put("count", intValue).put("description", str).put("load_time", longValue)), null, 12);
                }
                r6y r6yVar2 = bstVar.b;
                if (r6yVar2 != null) {
                    r6yVar2.x(JsApiEvent.WORKOUTS_SYNC_COMPLETED, new JSONObject().put("count", intValue));
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                gna0 gna0Var = (gna0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar.J(gna0Var) ? 4 : 2;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1302185172, intValue2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceScreen.<anonymous>.<anonymous> (PinReviewManageServiceScreen.kt:35)");
                    }
                    if (gna0Var instanceof gna0.c) {
                        aVar.K(1564470387);
                        yma0.a(null, aVar, 0);
                        aVar.j();
                    } else if (gna0Var instanceof gna0.b) {
                        aVar.K(1564473337);
                        wma0.a(0, aVar, izsVar, null);
                        aVar.j();
                    } else {
                        if (!(gna0Var instanceof gna0.a)) {
                            throw alb0.c(1564468221, aVar);
                        }
                        aVar.K(1564476546);
                        vma0.g((gna0.a) gna0Var, izsVar, aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                d.c cVar = (d.c) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(324215589, intValue3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.PlaylistVideoItem.<anonymous>.<anonymous> (SearchPlaylistCard.kt:499)");
                    }
                    lg90 lg90Var = cVar.e.c;
                    if (lg90Var == null) {
                        aVar2.K(-674773688);
                    } else {
                        aVar2.K(-674773687);
                        pzu0.b(lg90Var, null, s200.H(txj0.q(q630.a.a, 16), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 0L, aVar2, 440, 8);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                jai jaiVar = (jai) this.c;
                q9g q9gVar = (q9g) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar3.J(q9gVar) ? 4 : 2;
                }
                if (aVar3.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1447370209, intValue4, -1, "com.vk.core.compose.component.VkDropdown.<anonymous> (VkDropdown.kt:91)");
                    }
                    jaiVar.invoke(q9gVar, aVar3, Integer.valueOf(intValue4 & 14));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
