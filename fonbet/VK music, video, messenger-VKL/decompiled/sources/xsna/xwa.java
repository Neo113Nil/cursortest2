package xsna;

import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.channels.dto.ChannelsChannelWithLastMessageDto;
import com.vk.api.generated.channels.dto.ChannelsCreateCreateTypeDto;
import com.vk.api.generated.channels.dto.ChannelsCreateResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ChannelCreateApiCmd.kt */
/* loaded from: classes2.dex */
public final class xwa extends nx2<a> {
    public final String b;
    public final String c;
    public final UserId d;
    public final boolean e;

    /* compiled from: ChannelCreateApiCmd.kt */
    public static final class a {
        public final Peer a;

        public a(Peer peer) {
            this.a = peer;
        }
    }

    public xwa(UserId userId, boolean z, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = userId;
        this.e = z;
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        ChannelsChannelWithLastMessageDto channelsChannelWithLastMessageDto;
        ChannelsChannelDto d;
        UserId d2;
        Peer a2;
        try {
            oib oibVar = new oib();
            String str = this.b;
            String str2 = this.c;
            UserId userId = this.d;
            List<ChannelsChannelWithLastMessageDto> d3 = ((ChannelsCreateResponseDto) bz2.d(nib.d(oibVar, str, userId == null ? ChannelsCreateCreateTypeDto.PUBLIC : null, userId, str2, Boolean.valueOf(this.e), 65470))).d();
            if (d3 == null || (channelsChannelWithLastMessageDto = (ChannelsChannelWithLastMessageDto) j5g.Y(d3)) == null || (d = channelsChannelWithLastMessageDto.d()) == null || (d2 = d.d()) == null || (a2 = com.vk.dto.common.a.a(d2)) == null) {
                throw new IllegalStateException("The server didn't return an id of the channel.");
            }
            return new a(a2);
        } catch (Throwable th) {
            th.printStackTrace();
            throw th;
        }
    }
}
