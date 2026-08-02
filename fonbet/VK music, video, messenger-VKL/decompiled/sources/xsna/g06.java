package xsna;

import android.graphics.drawable.Icon;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder;
import com.vk.catalog2.feature.music.holders.ComposeMusicCuratorVh;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import com.vk.dto.fave.MarketFavable;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleEmbedItem;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.a;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.notifications.core.item.a;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.story.viewer.impl.presentation.stories.view.reactions.OnboardingType;
import java.util.ArrayList;
import xsna.b78;
import xsna.cri;
import xsna.cro;
import xsna.dt1;
import xsna.fn20;
import xsna.mt00;
import xsna.q630;
import xsna.q8z;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g06 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g06(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 4;
        int i3 = 3;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                BanReasonBottomSheet banReasonBottomSheet = (BanReasonBottomSheet) obj4;
                BanReasonBottomSheet.Params params = (BanReasonBottomSheet.Params) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                BanReasonBottomSheet.a aVar2 = BanReasonBottomSheet.g1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(951434959, intValue, -1, "com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Content.<anonymous> (BanReasonBottomSheet.kt:43)");
                    }
                    q630 f = txj0.f(s200.D(q630.a.a, 8), 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 D = s200.D(hr80.m(f, ylu0Var.getBackground().r, vog0.b(12)), 16);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c = qri.c(aVar, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D2, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    banReasonBottomSheet.co(params, null, aVar, 0);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                UIBlockGroup uIBlockGroup = (UIBlockGroup) obj4;
                ComposeMusicCuratorVh composeMusicCuratorVh = (ComposeMusicCuratorVh) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1914190450, intValue2, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicCuratorVh.bindData.<anonymous> (ComposeMusicCuratorVh.kt:76)");
                    }
                    rrv0.d(null, null, null, null, kai.c(427810931, new xx9(i3, uIBlockGroup, composeMusicCuratorVh), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((i0k) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
            case 3:
                final ArticleEmbedItem articleEmbedItem = (ArticleEmbedItem) obj4;
                final cto ctoVar = (cto) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar5.K(1565952216);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1565952216, intValue3, -1, "com.vk.dzenarticle.impl.ui.store.DzenArticleViewStateMapper.createArticleEmbedViewItem.<anonymous> (DzenArticleViewStateMapper.kt:272)");
                }
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(articleEmbedItem.c);
                int length = sb.length();
                String str = articleEmbedItem.d;
                tjo0 tjo0Var = new tjo0(new hik0(wlb0.h(aVar5).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0.c, null, 61438), new hik0(wlb0.h(aVar5).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, wlb0.h(aVar5).getBackground().b, 0.3f), null, null, 63486), new hik0(wlb0.h(aVar5).getText().f, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, wlb0.h(aVar5).getBackground().b, 0.3f), null, null, 63486), 4);
                boolean J = aVar5.J(ctoVar) | aVar5.y(articleEmbedItem);
                Object x = aVar5.x();
                if (J || x == a.C0011a.a) {
                    x = new i9z() { // from class: xsna.xso
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            cto.this.b.invoke(new cro.g(articleEmbedItem.d));
                        }
                    };
                    aVar5.R(x);
                }
                arrayList.add(new us2.b.a(0, length, 8, new q8z.b(str, tjo0Var, (i9z) x)));
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((us2.b.a) arrayList.get(i4)).a(sb.length()));
                }
                us2 us2Var = new us2(sb2, arrayList2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return us2Var;
            case 4:
                GenreActionsViewHolder genreActionsViewHolder = (GenreActionsViewHolder) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1297669922, intValue4, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder.createView.<anonymous>.<anonymous> (GenreActionsViewHolder.kt:63)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1103491101, new xx9(5, genreActionsViewHolder, composeView), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                MarketFavable marketFavable = (MarketFavable) obj4;
                a.C0945a c0945a = (a.C0945a) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                marketFavable.f = booleanValue;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = c0945a.b;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = c0945a.a;
                mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, booleanValue, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams.g, goodFragmentAnalyticsParams.b, goodFragmentAnalyticsParams.c, goodFragmentAnalyticsParams.d, goodFragmentAnalyticsParams.e, goodFragmentAnalyticsParams.f, 6144));
                c0945a.c.invoke(Integer.valueOf(marketFavable.f ? 1 : -1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                t110.b((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((fn20) obj4).a((fn20.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(391));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                n750.c((b78.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                fi70.a((a.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                jd80 jd80Var = (jd80) obj4;
                OnboardingType onboardingType = (OnboardingType) obj3;
                if (((q7v0) obj).d((VkOnboardingCampaign) obj2)) {
                    jd80Var.h.post(new mx5(i3, jd80Var, onboardingType));
                }
                return s3q0.a;
            case 11:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj4;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i5 = PodcastEpisodeFragment.u0;
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-213395363, intValue5, -1, "com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment.onLoadFailed.<anonymous> (PodcastEpisodeFragment.kt:288)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1949974872, new h0k(i2, podcastEpisodeFragment, fragmentActivity), aVar7), aVar7, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 12:
                com.vk.ecomm.market.good.ui.c cVar = (com.vk.ecomm.market.good.ui.c) obj4;
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2039598462, intValue6, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderImpl.updateCartQuantityControl.<anonymous> (ProductButtonsBinderImpl.kt:306)");
                    }
                    rrv0.d(null, null, null, null, kai.c(600369383, new xx9(9, cVar, eVar), aVar8), aVar8, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 13:
                j5k0 j5k0Var = (j5k0) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-91194131, intValue7, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.SmartCropScreen.<anonymous> (SmartCropScreen.kt:60)");
                    }
                    i5k0.a(j5k0Var, izsVar, null, aVar9, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 14:
                Long l = (Long) obj;
                l.getClass();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((zan0) obj4).d.c();
                ((xan0) obj3).f.invoke(l, bool);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((ddo0) obj4).b((Icon) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
        }
    }

    public /* synthetic */ g06(MarketFavable marketFavable, com.vk.ecomm.market.good.a aVar, a.C0945a c0945a) {
        this.b = 5;
        this.c = marketFavable;
        this.d = c0945a;
    }

    public /* synthetic */ g06(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
