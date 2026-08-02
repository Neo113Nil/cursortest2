package xsna;

import com.vk.api.generated.channels.dto.ChannelsChannelReactionIdToMessageReactionIdDto;
import com.vk.api.generated.channels.dto.ChannelsGetReactionsMappingResponseDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ChannelsGetReactionsMappingApiCmd.kt */
/* loaded from: classes2.dex */
public final class jfb extends nx2<Map<Integer, ? extends Integer>> {
    @Override // xsna.nx2
    public final Map<Integer, ? extends Integer> f(l7r0 l7r0Var) {
        List<ChannelsChannelReactionIdToMessageReactionIdDto> d = ((ChannelsGetReactionsMappingResponseDto) bz2.l(new tfx("channels.getReactionsMapping", new qr(8), new rr(9)), false)).d();
        int e = on00.e(c5g.u(d, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (ChannelsChannelReactionIdToMessageReactionIdDto channelsChannelReactionIdToMessageReactionIdDto : d) {
            Pair pair = new Pair(Integer.valueOf(channelsChannelReactionIdToMessageReactionIdDto.d()), Integer.valueOf(channelsChannelReactionIdToMessageReactionIdDto.e()));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}
