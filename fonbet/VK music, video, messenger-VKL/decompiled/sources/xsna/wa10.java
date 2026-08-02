package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;

/* compiled from: MarketProductBaseMediaItemHolder.kt */
/* loaded from: classes18.dex */
public abstract class wa10 extends d6t {
    public final w6e c;
    public final kdg0 d;
    public final VkImage e;
    public final VkImageSimple f;
    public MediaContentItem g;

    public wa10(ViewGroup viewGroup, int i, w6e w6eVar, kdg0 kdg0Var) {
        super(viewGroup, i);
        this.c = w6eVar;
        this.d = kdg0Var;
        this.e = (VkImage) viewGroup.findViewById(R.id.image);
        this.f = (VkImageSimple) viewGroup.findViewById(R.id.badge_container);
    }

    public void a(MediaContentItem mediaContentItem) {
        int i;
        this.g = mediaContentItem;
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        if (marketProductLinkedContentItemDto.d() != MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO || marketProductLinkedContentItemDto.f() == null) {
            MarketProductLinkedContentItemDto.ContentTypeDto d = marketProductLinkedContentItemDto.d();
            MarketProductLinkedContentItemDto.ContentTypeDto contentTypeDto = MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO;
            if (d == contentTypeDto) {
                VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
                if ((g != null ? g.R2() : null) == VideoVideoTypeDto.SHORT_VIDEO) {
                    i = R.drawable.vk_icon_logo_clips_outline_shadow_20;
                }
            }
            i = marketProductLinkedContentItemDto.d() == contentTypeDto ? R.drawable.vk_icon_logo_vk_video_outline_shadow_28 : 0;
        } else {
            i = R.drawable.vk_icon_picture_on_square_outline_shadow_28;
        }
        this.f.setImageResource(i);
        w6e w6eVar = this.c;
        cxo cxoVar = (cxo) w6eVar.b;
        Good good = cxoVar.r;
        if (good != null) {
            hc10 c = cxoVar.a.c();
            long j = good.b;
            long j2 = good.c.b;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) w6eVar.c;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
            LinkedContentAnalyticsParams linkedContentAnalyticsParams = new LinkedContentAnalyticsParams(j, j2, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null);
            c.getClass();
            hc10.f(mediaContentItem, linkedContentAnalyticsParams);
        }
    }
}
