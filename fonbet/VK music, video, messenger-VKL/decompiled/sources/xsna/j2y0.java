package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import com.vk.im.chat.api.ChatComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.data.b;
import java.util.Collections;
import java.util.List;

/* compiled from: WriteOwnerHelper.kt */
/* loaded from: classes18.dex */
public final class j2y0 {
    @SuppressLint({"ResourceType"})
    public static void a(String str, i2y0 i2y0Var, String str2) {
        b.d dVar = new b.d("market_contact");
        StringBuilder sb = new StringBuilder();
        cxo cxoVar = i2y0Var.c;
        Good good = cxoVar.r;
        sb.append(good != null ? good.c : null);
        sb.append('_');
        Good good2 = cxoVar.r;
        sb.append(good2 != null ? Long.valueOf(good2.b) : null);
        dVar.b(sb.toString(), "item_id");
        dVar.b("start", "action");
        dVar.e();
        pyb Cf = ((ChatComponent) ((k7m) m7m.f((w8i) i2y0Var.b)).a(fpf0.a(ChatComponent.class))).Cf();
        Long valueOf = Long.valueOf(i2y0Var.d);
        UserId userId = i2y0Var.e;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = i2y0Var.f;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM;
        UserId userId2 = i2y0Var.a;
        OwnerResponseTime ownerResponseTime = cxoVar.W;
        ChatAnalyticsParamsNoLogging chatAnalyticsParamsNoLogging = new ChatAnalyticsParamsNoLogging(valueOf, userId, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, true, str, userId2, ownerResponseTime != null ? Integer.valueOf((int) ownerResponseTime.b) : null);
        Good good3 = cxoVar.r;
        if (good3 != null) {
            Context context = i2y0Var.b;
            long j = i2y0Var.a.b;
            List singletonList = Collections.singletonList(new MarketAttachment(good3));
            UserId userId3 = good3.c;
            pyb.b(Cf, context, null, j, str2, singletonList, "market" + userId3.b + '_' + good3.b, chatAnalyticsParamsNoLogging, 31455794);
        }
    }
}
