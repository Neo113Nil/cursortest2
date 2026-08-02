package xsna;

import com.vk.api.generated.channels.dto.ChannelsCreateCommentResponseDto;
import com.vk.api.generated.channels.dto.ChannelsMessageCommentDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.stability.ImMsgSendDisabledByUnstableConnection;
import com.vk.network.kbh.state.NetworkState;

/* compiled from: ChannelCommentCreateApiCmd.kt */
/* loaded from: classes2.dex */
public final class eva extends nx2<dcq<a>> {
    public final long b;
    public final int c;
    public final Integer d;
    public final String e;
    public final UserId f;

    /* compiled from: ChannelCommentCreateApiCmd.kt */
    public static final class a implements dux0 {
        public final int a;
        public final ChannelsMessageCommentDto b;
        public final ProfilesSimpleInfo c;
        public final f1e0 d;

        public a(int i, ChannelsMessageCommentDto channelsMessageCommentDto, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = i;
            this.b = channelsMessageCommentDto;
            this.c = profilesSimpleInfo;
            this.d = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            ChannelsMessageCommentDto channelsMessageCommentDto = this.b;
            return this.d.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.c, (hashCode + (channelsMessageCommentDto == null ? 0 : channelsMessageCommentDto.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "Response(commentId=" + this.a + ", comment=" + this.b + ", profiles=" + this.c + ", requestedProfiles=" + this.d + ')';
        }
    }

    public eva(long j, int i, Integer num, String str, UserId userId) {
        this.b = j;
        this.c = i;
        this.d = num;
        this.e = str;
        this.f = userId;
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        UserId i;
        Peer a2;
        if (d6q0.t == NetworkState.UNSTABLE) {
            throw new ImMsgSendDisabledByUnstableConnection();
        }
        UserId userId = new UserId(this.b);
        int i2 = this.c;
        Integer num = this.d;
        String str = this.e;
        UserId userId2 = this.f;
        tfx tfxVar = new tfx("channels.createComment", new xq(10), new yq(6));
        tfx.l(tfxVar, "cmid", i2, 0, 0, 8);
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "text", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "reply_to_comment", num.intValue(), 0, 0, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "from_group", userId2, 0L, 0L, 8);
        }
        ChannelsCreateCommentResponseDto channelsCreateCommentResponseDto = (ChannelsCreateCommentResponseDto) bz2.d(tfxVar);
        f1e0 f1e0Var = new f1e0();
        ChannelsMessageCommentDto d = channelsCreateCommentResponseDto.d();
        if (d != null && (i = d.i()) != null && (a2 = com.vk.dto.common.a.a(i)) != null) {
            f1e0Var.c(a2);
        }
        return fo50.M(new a(channelsCreateCommentResponseDto.e(), channelsCreateCommentResponseDto.d(), new ProfilesSimpleInfo(), f1e0Var), false, false, new fva(2, this, eva.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelCommentCreateApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelCommentCreateApiCmd$Response;", 0), Source.ACTUAL);
    }
}
