package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.channels.dto.ChannelsDeleteReactionItemTypeDto;
import com.vk.api.generated.channels.dto.ChannelsSendReactionItemTypeDto;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.wab;

/* compiled from: CommunityChannelMessageSetReactionApiCmd.kt */
/* loaded from: classes2.dex */
public final class nug extends nx2<BaseBoolIntDto> {
    public final int b;
    public final UserId c;
    public final wab d;

    public nug(int i, UserId userId, wab wabVar) {
        this.b = i;
        this.c = userId;
        this.d = wabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nug)) {
            return false;
        }
        nug nugVar = (nug) obj;
        return this.b == nugVar.b && epx.f(this.c, nugVar.c) && epx.f(this.d, nugVar.d);
    }

    @Override // xsna.nx2
    public final BaseBoolIntDto f(l7r0 l7r0Var) {
        wab wabVar = this.d;
        boolean z = wabVar instanceof wab.a;
        int i = this.b;
        UserId userId = this.c;
        if (z) {
            return (BaseBoolIntDto) bz2.l(new oib().c(userId, ChannelsSendReactionItemTypeDto.MESSAGE, i, ((wab.a) wabVar).a), true);
        }
        if (wabVar instanceof wab.b) {
            return (BaseBoolIntDto) bz2.l(new oib().b(userId, ChannelsDeleteReactionItemTypeDto.MESSAGE, i), true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
    }

    public final String toString() {
        return "CommunityChannelMessageSetReactionApiCmd(postId=" + this.b + ", ownerId=" + this.c + ", mode=" + this.d + ')';
    }
}
