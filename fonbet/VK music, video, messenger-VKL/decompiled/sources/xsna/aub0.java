package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.dto.common.id.UserId;

/* compiled from: PollsDeleteVote.kt */
/* loaded from: classes18.dex */
public final class aub0 extends awi<onb0> {
    public final UserId s;
    public final int t;
    public final boolean u;
    public final String v;
    public final String w;

    public aub0(int i, UserId userId, String str, String str2, boolean z) {
        this.s = userId;
        this.t = i;
        this.u = z;
        this.v = str;
        this.w = str2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        kub0 kub0Var = new kub0();
        tfx tfxVar = new tfx("polls.deleteVote", new hr(28), new az60(2));
        tfx.l(tfxVar, "poll_id", this.t, 0, 0, 8);
        UserId userId = this.s;
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        boolean z = this.u;
        tfxVar.j("is_board", z);
        String str = this.v;
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        String str2 = this.w;
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        return new onb0(fub0.a(new fub0(), (PollsPollExtendedDto) yfb.x(jub0.a(kub0Var, this.t, userId, Boolean.valueOf(z), 96)).f(l7r0Var)), ((BaseBoolIntDto) yfb.x(tfxVar).f(l7r0Var)) == BaseBoolIntDto.YES);
    }
}
