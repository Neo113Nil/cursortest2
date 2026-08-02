package xsna;

import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;

/* compiled from: DefaultViewController.kt */
/* loaded from: classes16.dex */
public abstract class hrl extends wtt0<ClipsInterestsViewState.d> {
    public boolean d;

    public hrl(pkn0 pkn0Var) {
        super(pkn0Var);
        this.d = true;
    }

    @Override // xsna.wtt0
    public final void a(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        ClipsInterestsViewState.UIScreenStep uIScreenStep;
        ClipsInterestsViewState.UIScreenStep uIScreenStep2;
        ClipsInterestsViewState.d dVar3 = dVar;
        ClipsInterestsViewState.d dVar4 = dVar2;
        if (dVar3 == null || (uIScreenStep = dVar3.a) == (uIScreenStep2 = ClipsInterestsViewState.UIScreenStep.FINISH_RESET_VIEW)) {
            e(dVar4);
            c(new bu1(this, 25));
            return;
        }
        ClipsInterestsViewState.UIScreenStep uIScreenStep3 = ClipsInterestsViewState.UIScreenStep.FINISH_KEEP_VIEW;
        if (uIScreenStep == uIScreenStep3) {
            e(dVar4);
            return;
        }
        ClipsInterestsViewState.UIScreenStep uIScreenStep4 = dVar4.a;
        if (uIScreenStep == uIScreenStep4) {
            e(dVar4);
            return;
        }
        if (uIScreenStep4 == uIScreenStep2) {
            d(new lb6(8, this, dVar4), new tbh(this, 6));
            return;
        }
        if (uIScreenStep4 == uIScreenStep3) {
            e(dVar4);
        } else if (!this.d) {
            d(new com.vk.movika.tools.controls.seekbar.f(7, this, dVar4), new gbj(this, 4));
        } else {
            e(dVar4);
            c(new p1y0(this, 1));
        }
    }

    @Override // xsna.wtt0
    public final boolean b(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        ClipsInterestsViewState.d dVar3 = dVar;
        ClipsInterestsViewState.d dVar4 = dVar2;
        return dVar3.a != dVar4.a || f(dVar3, dVar4);
    }

    public abstract void c(gzs gzsVar);

    public abstract void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    public abstract void e(ClipsInterestsViewState.d dVar);

    public abstract boolean f(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2);
}
