package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.channels.dto.ChannelsDeleteReactionItemTypeDto;
import com.vk.api.generated.channels.dto.ChannelsSendReactionItemTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelCommentSetReactionApiCmd.kt */
/* loaded from: classes2.dex */
public final class nva extends nx2<BaseBoolIntDto> {
    public final long b;
    public final int c;
    public final Integer d;

    public nva(long j, int i, Integer num) {
        this.b = j;
        this.c = i;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nva)) {
            return false;
        }
        nva nvaVar = (nva) obj;
        return this.b == nvaVar.b && this.c == nvaVar.c && epx.f(this.d, nvaVar.d);
    }

    @Override // xsna.nx2
    public final BaseBoolIntDto f(l7r0 l7r0Var) {
        int i = this.c;
        long j = this.b;
        Integer num = this.d;
        if (num == null) {
            return (BaseBoolIntDto) bz2.d(new oib().b(new UserId(j), ChannelsDeleteReactionItemTypeDto.COMMENT, i));
        }
        return (BaseBoolIntDto) bz2.d(new oib().c(new UserId(j), ChannelsSendReactionItemTypeDto.COMMENT, i, num.intValue()));
    }

    public final int hashCode() {
        int a = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentSetReactionApiCmd(channelId=");
        sb.append(this.b);
        sb.append(", commentId=");
        sb.append(this.c);
        sb.append(", reactionId=");
        return uqi.b(sb, this.d, ')');
    }
}
