package xsna;

import com.vk.api.generated.channels.dto.ChannelsCommentThreadDto;
import com.vk.api.generated.channels.dto.ChannelsGetCommentsResponseDto;
import com.vk.api.generated.channels.dto.ChannelsGetCommentsSortDto;
import com.vk.api.generated.channels.dto.ChannelsMessageCommentDto;
import com.vk.channels.api.CommentsHistory;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.xdg;

/* compiled from: ChannelCommentsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class gwa extends nx2<dcq<a>> {
    public final long b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final int j;
    public final int k;
    public final CommentsHistory.Order l;
    public final boolean m;
    public final boolean n;

    /* compiled from: ChannelCommentsGetApiCmd.kt */
    public static final class a implements dux0 {
        public final ChannelsGetCommentsResponseDto a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public a(ChannelsGetCommentsResponseDto channelsGetCommentsResponseDto, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = channelsGetCommentsResponseDto;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Response(comments=" + this.a + ", profiles=" + this.b + ", requestedProfiles=" + this.c + ')';
        }
    }

    public gwa(long j, int i, Integer num, Integer num2, Integer num3, String str, int i2, CommentsHistory.Order order, boolean z, int i3) {
        num2 = (i3 & 8) != 0 ? null : num2;
        num3 = (i3 & 16) != 0 ? null : num3;
        str = (i3 & 32) != 0 ? null : str;
        int i4 = (i3 & 512) != 0 ? 2 : 1;
        order = (i3 & 1024) != 0 ? CommentsHistory.Order.ASC : order;
        boolean z2 = (i3 & 2048) == 0;
        this.b = j;
        this.c = i;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = str;
        this.h = null;
        this.i = null;
        this.j = i2;
        this.k = i4;
        this.l = order;
        this.m = z2;
        this.n = z;
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        ChannelsGetCommentsSortDto channelsGetCommentsSortDto;
        List<ChannelsMessageCommentDto> d;
        UserId userId = new UserId(this.b);
        int i = xdg.a.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i == 1) {
            channelsGetCommentsSortDto = ChannelsGetCommentsSortDto.ASC;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            channelsGetCommentsSortDto = ChannelsGetCommentsSortDto.DESC;
        }
        tfx tfxVar = new tfx("channels.getComments", new vq(8), new wq(10));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        tfx.l(tfxVar, "cmid", this.c, 0, 0, 8);
        Integer num = this.e;
        if (num != null) {
            tfx.l(tfxVar, "start_comment_id", num.intValue(), 0, 0, 8);
        }
        Integer num2 = this.f;
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 12);
        }
        tfx.l(tfxVar, "count", this.j, 0, 0, 8);
        if (channelsGetCommentsSortDto != null) {
            tfx.o(tfxVar, "sort", channelsGetCommentsSortDto.i(), 0, 0, 12);
        }
        String str = this.g;
        if (str != null) {
            tfx.o(tfxVar, "next_from", str, 0, 0, 12);
        }
        String str2 = this.h;
        if (str2 != null) {
            tfx.o(tfxVar, "prev_from", str2, 0, 0, 12);
        }
        Boolean bool = this.i;
        if (bool != null) {
            tfxVar.j("tail", bool.booleanValue());
        }
        Integer num3 = this.d;
        if (num3 != null) {
            tfx.l(tfxVar, "comment_id", num3.intValue(), 0, 0, 8);
        }
        tfxVar.f(this.k, 0, 10, "thread_items_count");
        tfxVar.j("hide_negative_replies", this.m);
        boolean z = this.n;
        ChannelsGetCommentsResponseDto channelsGetCommentsResponseDto = (ChannelsGetCommentsResponseDto) bz2.l(tfxVar, z);
        f1e0 f1e0Var = new f1e0();
        for (ChannelsMessageCommentDto channelsMessageCommentDto : channelsGetCommentsResponseDto.e()) {
            f1e0Var.c(com.vk.dto.common.a.a(channelsMessageCommentDto.i()));
            ChannelsCommentThreadDto p = channelsMessageCommentDto.p();
            if (p != null && (d = p.d()) != null) {
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    f1e0Var.c(com.vk.dto.common.a.a(((ChannelsMessageCommentDto) it.next()).i()));
                }
            }
        }
        return fo50.M(new a(channelsGetCommentsResponseDto, new ProfilesSimpleInfo(), f1e0Var), false, z, new hwa(2, this, gwa.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelCommentsGetApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelCommentsGetApiCmd$Response;", 0), Source.ACTUAL);
    }
}
