package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PosterPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class sac0 extends wn4 {
    public final /* synthetic */ tac0 a;

    public sac0(tac0 tac0Var) {
        this.a = tac0Var;
    }

    @Override // xsna.wn4
    public final i420 j(UserId userId) {
        iac0 iac0Var = new iac0(userId, this.a.c.l0().getTextColors().getDefaultColor());
        iac0Var.e = true;
        return iac0Var;
    }

    @Override // xsna.wn4
    public final Integer k() {
        tac0 tac0Var = this.a;
        Integer num = tac0Var.p;
        return Integer.valueOf(num != null ? num.intValue() : tac0Var.c.l0().getTextColors().getDefaultColor());
    }
}
