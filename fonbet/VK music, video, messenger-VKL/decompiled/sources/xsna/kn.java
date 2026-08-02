package xsna;

import com.vk.api.generated.account.dto.AccountBanSourceDto;
import com.vk.dto.common.Peer;

/* compiled from: AccountBanApiCmd.kt */
/* loaded from: classes2.dex */
public final class kn extends nx2<s3q0> {
    public final Peer b;
    public final boolean c;
    public final AccountBanSourceDto d;

    public kn(Peer peer, boolean z, AccountBanSourceDto accountBanSourceDto) {
        this.b = peer;
        this.c = z;
        this.d = accountBanSourceDto;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        bz2.l(new es().j(com.vk.dto.common.a.b(this.b), this.d), this.c);
        return s3q0.a;
    }
}
