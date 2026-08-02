package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.analytics.MarketAnalyticsAdCampaign;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vkontakte.android.attachments.MarketAttachment;
import java.util.Collections;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: MarketGoodRouterImpl.kt */
/* loaded from: classes18.dex */
public final class tz00 implements sz00 {
    public final pyb a;

    public tz00(pyb pybVar) {
        this.a = pybVar;
    }

    @Override // xsna.sz00
    public final void a(Context context, j910 j910Var) {
        pyb.b(this.a, context, null, j910Var.b.b, j910Var.c, Collections.singletonList(new MarketAttachment(new Good(j910Var.d, j910Var.a, j910Var.e, j910Var.f, j910Var.g))), null, null, 33554354);
    }

    @Override // xsna.sz00
    public final void b(Context context, MarketItemLabelActionDto marketItemLabelActionDto) {
        new e5u(context).a(marketItemLabelActionDto);
    }

    @Override // xsna.sz00
    public final void c(e1o0 e1o0Var, Context context) {
        TaggedItemsBottomSheet.a aVar = new TaggedItemsBottomSheet.a(e1o0Var, context);
        aVar.x(0);
        aVar.u(0);
        aVar.c(new ts90(1.0f, 2));
        aVar.F0(true);
        aVar.d.C1 = true;
        aVar.I0(null);
    }

    @Override // xsna.sz00
    public final void d(Context context, qz00 qz00Var) {
        String str = qz00Var.j;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = qz00Var.c;
        UserId userId = qz00Var.b;
        long j = qz00Var.a;
        String str2 = qz00Var.f;
        GoodFragment.a aVar = new GoodFragment.a(GoodFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putLong("id", j);
        bundle.putString("source", commonMarketStat$TypeRefSource.name());
        bundle.putParcelable("analytics_params", new GoodFragmentAnalyticsParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null));
        if (str2 != null) {
            bundle.putString("access_key", str2);
        }
        Integer num = qz00Var.d;
        String str3 = qz00Var.e;
        bundle.putParcelable("analytics_params", new GoodFragmentAnalyticsParams(num, null, null, null, qz00Var.h, null, str3, qz00Var.k, qz00Var.l, qz00Var.m, (str == null || str.length() == 0) ? null : MarketAnalyticsAdCampaign.AFFILIATE_PROGRAM.h(), qz00Var.j, qz00Var.n, qz00Var.o, qz00Var.p, 32, null));
        bundle.putString("ref_post_id", qz00Var.g);
        Boolean bool = qz00Var.i;
        bundle.putBoolean("is_service", bool != null ? bool.booleanValue() : false);
        bundle.putString("ads_label", str);
        bundle.putParcelable("business_onboarding_params", null);
        aVar.k(context);
    }

    @Override // xsna.sz00
    @ozl
    public final void e(Context context, rz00 rz00Var) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = rz00Var.b;
        Good good = rz00Var.a;
        String str = null;
        GoodFragment.a aVar = new GoodFragment.a(GoodFragment.class, null, null);
        UserId userId = good.c;
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putLong("id", good.b);
        bundle.putString("source", commonMarketStat$TypeRefSource.name());
        bundle.putParcelable("analytics_params", new GoodFragmentAnalyticsParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null));
        bundle.putParcelable("search_stat_log_info", rz00Var.e);
        String str2 = rz00Var.c;
        Integer num = rz00Var.d;
        Integer num2 = rz00Var.f;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = rz00Var.h;
        Long l = rz00Var.g;
        String str3 = rz00Var.k;
        CommonMarketStat$TypeMarketContextContent.Type type = rz00Var.m;
        Integer num3 = rz00Var.n;
        Long l2 = rz00Var.o;
        String str4 = rz00Var.l;
        if (str4 != null && str4.length() != 0) {
            str = MarketAnalyticsAdCampaign.AFFILIATE_PROGRAM.h();
        }
        bundle.putParcelable("analytics_params", new GoodFragmentAnalyticsParams(num, num2, l, mobileOfficialAppsMarketStat$ReferrerItemType, str2, null, str3, type, num3, l2, str, rz00Var.l, null, null, null, 28704, null));
        bundle.putString("root_ref_screen", rz00Var.i);
        bundle.putString("ref_post_id", rz00Var.j);
        bundle.putString("ads_label", str4);
        bundle.putParcelable("business_onboarding_params", rz00Var.p);
        aVar.k(context);
    }

    @Override // xsna.sz00
    public final void f(Context context, UserId userId, String str, Good good) {
        pyb.b(this.a, context, null, userId.b, str, Collections.singletonList(new MarketAttachment(good)), null, null, 33554354);
    }

    @Override // xsna.sz00
    public final void g(Context context, qz00 qz00Var) {
        GoodPreviewFragment.a aVar = new GoodPreviewFragment.a(GoodPreviewFragment.class, null, null);
        long j = qz00Var.a;
        Bundle bundle = aVar.j;
        bundle.putLong("good_id", j);
        bundle.putParcelable("owner_id", qz00Var.b);
        Integer num = qz00Var.d;
        bundle.putInt("item_position", num != null ? num.intValue() : 0);
        bundle.putString("item_track_code", qz00Var.h);
        aVar.k(context);
    }
}
