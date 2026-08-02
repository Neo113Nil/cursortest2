package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yf0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                dg0 dg0Var = (dg0) this.c;
                sh0 sh0Var = dg0Var.a;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1968792261, intValue, -1, "com.vk.catalog.mvi.block.video.impl.video.autoplay.player.AdInstreamRedirectView.<anonymous> (AdInstreamRedirectView.kt:39)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                Object x = aVar.x();
                Object obj4 = a.C0011a.a;
                if (x == obj4) {
                    x = androidx.compose.runtime.k.b(sh0Var);
                    aVar.R(x);
                }
                wh50 wh50Var = (wh50) x;
                if (sh0Var != null) {
                    wh50Var.setValue(sh0Var);
                }
                q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), 48);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                float f = 12;
                float f2 = 16;
                q630 H = s200.H(hr80.m(h, ylu0Var2.getBackground().x, vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3)), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4, 2);
                Object x2 = aVar.x();
                if (x2 == obj4) {
                    x2 = new oa(2);
                    aVar.R(x2);
                }
                izs izsVar = (izs) x2;
                boolean p = aVar.p(j) | aVar.J(wh50Var) | aVar.J(dg0Var);
                Object x3 = aVar.x();
                if (p || x3 == obj4) {
                    x3 = new ag0(j, wh50Var, dg0Var);
                    aVar.R(x3);
                }
                ae2.a(6, 0, aVar, izsVar, (izs) x3, H);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(839774748, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:89)");
                    }
                    axqVar.c(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                d8d0 d8d0Var = (d8d0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-944436526, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ContentItems.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsContentImpl.kt:135)");
                    }
                    d8d0Var.u(null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
