package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;

/* compiled from: VideoDeleteApiCmd.kt */
/* loaded from: classes2.dex */
public final class pes0 extends nx2<Boolean> {
    public final long b;
    public final UserId c;

    public pes0(long j, UserId userId) {
        this.b = j;
        this.c = userId;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        int i = (int) this.b;
        tfx tfxVar = new tfx("video.delete", new bjn0(4), new hun0(3));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        UserId userId = this.c;
        if (userId != null) {
            tfx.n(tfxVar, "target_id", userId, 0L, 0L, 12);
        }
        return Boolean.valueOf(bz2.l(tfxVar, false) == BaseOkResponseDto.OK);
    }
}
