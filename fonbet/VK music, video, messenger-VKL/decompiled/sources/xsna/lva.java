package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelCommentRestoreApiCmd.kt */
/* loaded from: classes2.dex */
public final class lva extends nx2<Boolean> {
    public final long b;
    public final int c;
    public final int d;

    public lva(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId userId = new UserId(this.b);
        tfx tfxVar = new tfx("channels.restoreComment", new rq(7), new sq(7));
        tfx.l(tfxVar, "comment_id", this.d, 0, 0, 8);
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "cmid", this.c, 0, 0, 8);
        return Boolean.valueOf(((BaseOkResponseDto) bz2.d(tfxVar)) == BaseOkResponseDto.OK);
    }
}
