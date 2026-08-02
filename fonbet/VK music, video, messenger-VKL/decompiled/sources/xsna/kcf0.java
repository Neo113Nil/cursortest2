package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelHolder.kt */
/* loaded from: classes4.dex */
public final class kcf0 extends vif0<ChannelsRecommendation> implements ldb {
    public final ecf0 n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final gtl0 p;
    public final x1e0 q;
    public final jcf0 r;
    public ChannelsRecommendation s;

    public kcf0(ecf0 ecf0Var, io.reactivex.rxjava3.disposables.b bVar, gtl0 gtl0Var) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = ecf0Var;
        this.o = bVar;
        this.p = gtl0Var;
        this.q = new x1e0(this, 3);
        this.r = new jcf0(this, 0);
    }

    @Override // xsna.ldb
    public final SchemeStat$TypeChannelSource K4() {
        return SchemeStat$TypeChannelSource.FEED_RECOMM;
    }

    @Override // xsna.ldb
    public final String h2() {
        ChannelsRecommendation channelsRecommendation = this.s;
        if (channelsRecommendation != null) {
            return channelsRecommendation.f;
        }
        return null;
    }

    @Override // xsna.vif0
    public final void i6(ChannelsRecommendation channelsRecommendation) {
        RecommendationsCarouselItemUiDto.ActionButtonData actionButtonData;
        ChannelsRecommendation channelsRecommendation2 = channelsRecommendation;
        this.itemView.getContext();
        this.n.getClass();
        String str = channelsRecommendation2.c;
        if (str == null) {
            str = "";
        }
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(str, null, null, 18);
        String str2 = channelsRecommendation2.e;
        String str3 = str2 != null ? str2 : "";
        Image image = channelsRecommendation2.d;
        RecommendationsCarouselItemUiDto.b bVar = image != null ? new RecommendationsCarouselItemUiDto.b(image, null) : null;
        if (channelsRecommendation2.g) {
            actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(y8g0.e(R.string.channel_status_button_subscribed), y8g0.e(R.string.channel_status_button_subscribed), null, RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.COMPLETED, 4);
        } else {
            actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(y8g0.e(R.string.channel_status_button_join), y8g0.e(R.string.channel_status_button_join), null, channelsRecommendation2.h ? RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.IN_PROGRESS : RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE, 4);
        }
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = new RecommendationsCarouselItemUiDto(cVar, str3, bVar, null, actionButtonData);
        x1e0 x1e0Var = this.q;
        gtl0 gtl0Var = this.p;
        gtl0Var.q6(x1e0Var);
        gtl0Var.s6(this.r);
        gtl0Var.V5(recommendationsCarouselItemUiDto);
        f4m.j(gtl0Var.itemView.findViewById(R.id.carousel_card_top_action_button));
        this.s = channelsRecommendation2;
    }
}
