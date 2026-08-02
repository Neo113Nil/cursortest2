package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vkontakte.android.R;

/* compiled from: GoodQuickMessageClickListenerImpl.kt */
/* loaded from: classes18.dex */
public final class m7u implements l7u {
    public cxo a;
    public CommonMarketStat$TypeRefSource b;
    public long c;
    public UserId d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l7u
    public final void a(QuickMessageItem quickMessageItem, Context context) {
        cxo cxoVar = this.a;
        ffp0 e = cxoVar.a.e();
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER_SUGGESTIONS;
        String str = quickMessageItem.d;
        cxo cxoVar2 = this.a;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.b;
        e.getClass();
        ffp0.a(eventType, str, cxoVar2, commonMarketStat$TypeRefSource, null);
        j2y0 j2y0Var = (j2y0) cxoVar.a.p0.getValue();
        String str2 = quickMessageItem.d;
        i2y0 i2y0Var = new i2y0(quickMessageItem.e, context, this.a, this.c, this.d, this.b);
        String string = quickMessageItem.f ? context.getString(R.string.market_chat_greetings) : quickMessageItem.c;
        j2y0Var.getClass();
        j2y0.a(str2, i2y0Var, string);
    }
}
