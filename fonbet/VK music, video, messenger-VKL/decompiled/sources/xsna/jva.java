package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelCommentEditApiCmd.kt */
/* loaded from: classes2.dex */
public final class jva extends nx2<Boolean> {
    public final long b;
    public final int c;
    public final int d;
    public final String e;

    public jva(int i, long j, int i2, String str) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = str;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId userId = new UserId(this.b);
        tfx tfxVar = new tfx("channels.editComment", new io.reactivex.rxjava3.internal.operators.mixed.j(8), new io.reactivex.rxjava3.internal.operators.mixed.k(11));
        tfx.l(tfxVar, "cmid", this.c, 0, 0, 8);
        tfx.l(tfxVar, "comment_id", this.d, 0, 0, 8);
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        String str = this.e;
        if (str != null) {
            tfx.o(tfxVar, "text", str, 0, 0, 12);
        }
        return Boolean.valueOf(((BaseOkResponseDto) bz2.d(tfxVar)) == BaseOkResponseDto.OK);
    }
}
