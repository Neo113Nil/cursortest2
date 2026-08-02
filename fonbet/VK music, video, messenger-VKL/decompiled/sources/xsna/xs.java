package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.Peer;

/* compiled from: AccountUnbanApiCmd.kt */
/* loaded from: classes2.dex */
public final class xs extends nx2<Boolean> {
    public final Peer b;

    public xs(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        return Boolean.valueOf(bz2.l(new es().l(com.vk.dto.common.a.b(this.b)), false) == BaseOkResponseDto.OK);
    }
}
