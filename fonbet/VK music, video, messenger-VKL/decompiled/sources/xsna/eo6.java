package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.StickerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh;
import com.vk.clips.design.view.nps.internal.stars.CatalogStarsFeedbackView;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.er9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class eo6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eo6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                BaseStickerPackVh baseStickerPackVh = (BaseStickerPackVh) obj4;
                UIBlock uIBlock = (UIBlock) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                baseStickerPackVh.g.a(new cfp0(uIBlock, new StickerAnalyticsInfo(StickerAnalyticsInfo.ClickTarget.Tap)));
                SearchStatInfoProvider searchStatInfoProvider = baseStickerPackVh.h;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.STICKERS;
                dfp0 dfp0Var = uIBlock instanceof dfp0 ? (dfp0) uIBlock : null;
                if (dfp0Var == null || (str = dfp0Var.r()) == null) {
                    str = "";
                }
                SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, str, false);
                f9l0 f9l0Var = baseStickerPackVh.c;
                Context context = baseStickerPackVh.i;
                f9l0Var.f(context != null ? context : null, stickerStockItem, baseStickerPackVh.d, baseStickerPackVh.e, baseStickerPackVh.f, b);
                return s3q0.a;
            case 1:
                VkButton vkButton = new VkButton((Context) obj, null, 6, 0);
                vkButton.setText("Test Loader - " + ((ButtonSize) obj4).name());
                vkButton.setMode(VkButton.Mode.Primary);
                vkButton.setSize((VkButton.Size) obj3);
                vkButton.setAppearance(VkButton.Appearance.Accent);
                vkButton.setHideContentOnLoading(true);
                vkButton.setOnClickListener(new vq8(i3, (wh50) obj2, vkButton));
                return vkButton;
            case 2:
                ((gwc) obj4).j(((SdkVideoFile) obj3).r1());
                ((gzs) obj2).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 3:
                NewsComment newsComment = (NewsComment) obj4;
                aa aaVar = (aa) obj2;
                newsComment.p = ((t9x0) obj).a;
                ((mdg) obj3).M.remove(Integer.valueOf(newsComment.i));
                ib6 ib6Var = aaVar instanceof ib6 ? (ib6) aaVar : null;
                if (ib6Var != null) {
                    ib6Var.E6(newsComment);
                }
                return s3q0.a;
            case 4:
                kjx kjxVar = (kjx) obj4;
                QuestionsTexts questionsTexts = (QuestionsTexts) obj;
                View view = kjxVar.c;
                view.setBackground(kjxVar.g);
                ((VkText) view.findViewById(R.id.title_text)).setText(questionsTexts.b);
                ((VkText) view.findViewById(R.id.subtitle)).setText(questionsTexts.c);
                bwt0.i0(view.findViewById(R.id.close), new jjx(kjxVar, i3));
                ((CatalogStarsFeedbackView) obj3).setFeedbackListener(new ojg(kjxVar, (NpsFeatureModel) obj2, questionsTexts, i2));
                return s3q0.a;
            case 5:
                s890 s890Var = (s890) obj3;
                dt1.b bVar = (dt1.b) obj2;
                ggj ggjVar = (ggj) obj;
                long j = ((mxj0) ((xfo0) obj4).invoke()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float I0 = ggjVar.I0(h190.a);
                    float a = bVar.a(an10.b(intBitsToFloat), an10.b((Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - r11) - ggjVar.I0(s890Var.a(ggjVar.getLayoutDirection()))), ggjVar.getLayoutDirection()) + ggjVar.I0(s890Var.c(ggjVar.getLayoutDirection()));
                    float f = 2;
                    float f2 = intBitsToFloat / f;
                    float f3 = a + f2;
                    float f4 = (f3 - f2) - I0;
                    float f5 = f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f4;
                    float f6 = f3 + f2 + I0;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                    float f7 = f6 > intBitsToFloat2 ? intBitsToFloat2 : f6;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                    float f8 = (-intBitsToFloat3) / f;
                    float f9 = intBitsToFloat3 / f;
                    er9.b a0 = ggjVar.a0();
                    long d = a0.d();
                    a0.a().e();
                    try {
                        a0.a.c(f5, f8, f7, f9, 0);
                        ggjVar.s1();
                    } finally {
                        nq.b(a0, d);
                    }
                } else {
                    ggjVar.s1();
                }
                return s3q0.a;
            default:
                woh0 woh0Var = (woh0) obj4;
                UserId userId = (UserId) obj3;
                SubscribeStatus subscribeStatus = (SubscribeStatus) obj2;
                woh0Var.a.a();
                woh0Var.c.b(new kym0((SubscribeStatus) obj, userId, null, null, 12));
                woh0Var.d.a(new h8q0(userId, false));
                if (subscribeStatus == SubscribeStatus.MEMBER_STATUS_INVITED) {
                    int i4 = dpu.a;
                    o1e0.a.a(new a9l(2));
                }
                return s3q0.a;
        }
    }
}
