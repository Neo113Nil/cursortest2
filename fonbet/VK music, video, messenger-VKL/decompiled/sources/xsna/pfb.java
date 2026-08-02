package xsna;

import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.feed.core.models.channels.ChannelsRecommendations;

/* compiled from: ChannelsGetRecommendationsResponseDtoToChannelsRecommendationsMapper.kt */
/* loaded from: classes3.dex */
public final class pfb {
    public final ChannelsRecommendations a;

    public pfb(ChannelsRecommendations channelsRecommendations) {
        this.a = channelsRecommendations;
    }

    public static ChannelsRecommendation a(ChannelsChannelDto channelsChannelDto, String str, String str2) {
        long j = channelsChannelDto.d().b;
        String title = channelsChannelDto.getTitle();
        Serializer.c<Image> cVar = Image.CREATOR;
        return new ChannelsRecommendation(j, title, Image.b.a(channelsChannelDto.g()), str, str2, channelsChannelDto.i().d(), false);
    }
}
