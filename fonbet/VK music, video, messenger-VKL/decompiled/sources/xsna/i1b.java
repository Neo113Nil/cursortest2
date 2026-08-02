package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelMarkAsReadApiCmd.kt */
/* loaded from: classes2.dex */
public final class i1b extends nx2<Boolean> {
    public final long b;
    public final int c;
    public final boolean d = true;

    public i1b(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        long j = this.b;
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(j);
        int i = this.c;
        tfx tfxVar = new tfx("channels.markAsRead", new com.vk.movika.sdk.base.model.n(6), new eq(4));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        tfx.l(tfxVar, "last_read_cmid", i, 1, 0, 8);
        return Boolean.valueOf(l7r0Var.e(bz2.n(tfxVar, new jm0(this, 8))) == BaseBoolIntDto.YES);
    }
}
