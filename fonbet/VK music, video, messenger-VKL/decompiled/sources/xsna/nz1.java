package xsna;

import androidx.compose.runtime.a;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import one.video.player.OneVideoPlayer;
import xsna.q630;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nz1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nz1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 2;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((dz1) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).element = floatValue;
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((f15) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                xn50.a.c((ynb) obj4, new wmb.d(((Msg) obj3).d, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue()));
                break;
            case 3:
                ((Integer) obj2).getClass();
                iqi.a((ijb0) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((kkk) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((axq) obj4).j((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bgr.c(ne7.I(385), (androidx.compose.runtime.a) obj, (List) obj4, (izs) obj3);
                break;
            case 7:
                EditStorefrontAlbumError editStorefrontAlbumError = (EditStorefrontAlbumError) obj4;
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = MarketEditAlbumGoodsFragment.c1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(64384952, intValue, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.bindErrorView.<anonymous>.<anonymous> (MarketEditAlbumGoodsFragment.kt:425)");
                    }
                    boolean y = aVar.y(marketEditAlbumGoodsFragment);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new m1y(marketEditAlbumGoodsFragment, i2);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j1p.a(editStorefrontAlbumError, gzsVar, hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 8:
                ((ohk0) obj).c("onPlayerResumed");
                ks80.g((ks80) obj4, (OneVideoPlayer) obj3, "STATE:PLAYING", (String) obj2);
                break;
            case 9:
                zem0 zem0Var = (zem0) obj4;
                yem0 yem0Var = (yem0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-275042973, intValue2, -1, "com.vk.stories.design.view.stats.tabs.header.StoryStatisticsHeaderHolder.bind.<anonymous> (StoryStatisticsHeaderHolder.kt:23)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(98044640, new qg(9, zem0Var, yem0Var), aVar2), aVar2, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                y4t0.b((xow) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                g7v0 g7v0Var = (g7v0) obj4;
                VkOnboarding$TintColor vkOnboarding$TintColor = (VkOnboarding$TintColor) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1301128934, intValue3, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingBanner.<anonymous> (VkOnboardingBanner.kt:99)");
                    }
                    o7v0.b(g7v0Var, vkOnboarding$TintColor, aVar3, 0);
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

    public /* synthetic */ nz1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
