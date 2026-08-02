package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.collages.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.vas.design.view.VKStickerPackView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwq0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xf4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        com.vk.attachpicker.collages.a aVar;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dg4.a((r1m) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                iq7.a((com.vk.ecomm.onlinebooking.impl.common.a) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                l7c.h((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                com.vk.attachpicker.collages.a aVar2 = (com.vk.attachpicker.collages.a) obj4;
                List list = (List) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = com.vk.attachpicker.collages.a.k1;
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(306489319, intValue, -1, "com.vk.attachpicker.collages.CollageOnboardingBottomSheet.ThemedContent.<anonymous> (CollageOnboardingBottomSheet.kt:55)");
                    }
                    float f = kqu0.v;
                    q630 d = txj0.d(rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 1.0f);
                    String str = (String) ((zak0) aVar2.j1).getValue();
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    boolean y = aVar3.y(aVar2);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new m4(aVar2, 28);
                        aVar3.R(x);
                    }
                    af90 af90Var = new af90(str, (gzs) x, buttonSize, buttonStyle, buttonAppearance);
                    boolean y2 = aVar3.y(aVar2);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == c0012a) {
                        aVar = aVar2;
                        a.b bVar = new a.b(0, aVar, com.vk.attachpicker.collages.a.class, "hide", "hide()V", 0);
                        aVar3.R(bVar);
                        x2 = bVar;
                    } else {
                        aVar = aVar2;
                    }
                    fcy fcyVar = (fcy) x2;
                    boolean y3 = aVar3.y(list) | aVar3.y(aVar);
                    Object x3 = aVar3.x();
                    if (y3 || x3 == c0012a) {
                        x3 = new zf1(6, list, aVar);
                        aVar3.R(x3);
                    }
                    twu0.d((izs) x3, af90Var, d, (gzs) fcyVar, aVar3, 0, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                uyh uyhVar = (uyh) obj4;
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = CommunityReviewsFragment.o0;
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1770375322, intValue2, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment.onBindViewState.<anonymous>.<anonymous>.<anonymous> (CommunityReviewsFragment.kt:440)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1452365301, new m9c(3, uyhVar, communityReviewsFragment), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                gyj.b((ArrayList) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 6:
                g8u g8uVar = (g8u) obj4;
                h8u h8uVar = (h8u) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-554884368, intValue3, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupBottomBlock.<anonymous> (GoodReviewsComposeHolder.kt:319)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1647604053, new cg4(5, g8uVar, h8uVar), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                se10.e(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj4, (izs) obj3);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((mn20) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                gnj0.a((fnj0) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                qk50 qk50Var = (qk50) obj;
                dpl0 dpl0Var = (dpl0) obj2;
                return dpl0Var instanceof sqd0 ? qk50Var.a((f64) obj4, dpl0Var) : qk50Var.a((f64) obj3, dpl0Var);
            case 11:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Cell.Middle.Text) obj4).a((com.vk.core.compose.component.topbar.k) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 12:
                e64 e64Var = (e64) obj4;
                e64 e64Var2 = (e64) obj3;
                em50 em50Var = (em50) obj;
                bwq0 bwq0Var = (bwq0) obj2;
                if (bwq0Var instanceof awq0) {
                    return em50Var.a(e64Var, bwq0Var);
                }
                if (bwq0Var instanceof bwq0.a) {
                    return em50Var.a(e64Var2, bwq0Var);
                }
                throw new NoWhenBranchMatchedException();
            default:
                ((Integer) obj).getClass();
                int intValue4 = ((Integer) obj2).intValue();
                t6g0 t6g0Var = t6g0.b;
                return t6g0.d().z0((StickerItem) ((StickerStockItemWithStickerId) obj4).d.getValue(), intValue4, dhr0.a.c(((VKStickerPackView) obj3).getContext()));
        }
    }

    public /* synthetic */ xf4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
