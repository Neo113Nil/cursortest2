package xsna;

import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;

/* compiled from: ItemsController.kt */
/* loaded from: classes16.dex */
public final class wvx extends wtt0<ClipsInterestsViewState.d> {
    public final tge d;

    public wvx(tge tgeVar, pkn0 pkn0Var) {
        super(pkn0Var);
        this.d = tgeVar;
    }

    @Override // xsna.wtt0
    public final void a(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        ClipsInterestsViewState.d dVar3 = dVar;
        ClipsInterestsViewState.d dVar4 = dVar2;
        ClipsInterestsViewState.UIScreenStep uIScreenStep = dVar4.a;
        ClipsInterestsViewState.g gVar = dVar4.c;
        tge tgeVar = this.d;
        if (dVar3 == null) {
            tgeVar.setItems(gVar.a);
            return;
        }
        ClipsInterestsViewState.UIScreenStep uIScreenStep2 = dVar3.a;
        ClipsInterestsViewState.UIScreenStep uIScreenStep3 = ClipsInterestsViewState.UIScreenStep.MAIN_CATEGORIES;
        if (uIScreenStep2 == uIScreenStep3 && uIScreenStep == ClipsInterestsViewState.UIScreenStep.SUB_CATEGORIES) {
            tgeVar.N0(gVar.a, true);
            return;
        }
        ClipsInterestsViewState.UIScreenStep uIScreenStep4 = ClipsInterestsViewState.UIScreenStep.SUB_CATEGORIES;
        if (uIScreenStep2 == uIScreenStep4 && uIScreenStep == uIScreenStep3) {
            tgeVar.N0(gVar.a, false);
            return;
        }
        if (uIScreenStep2 == uIScreenStep4 && uIScreenStep == ClipsInterestsViewState.UIScreenStep.FINISH_RESET_VIEW) {
            tgeVar.N0(gVar.a, true);
        } else if (uIScreenStep2 == uIScreenStep4 && uIScreenStep == ClipsInterestsViewState.UIScreenStep.FINISH_KEEP_VIEW) {
            tgeVar.setItems(gVar.a);
        } else {
            tgeVar.setItems(gVar.a);
        }
    }

    @Override // xsna.wtt0
    public final /* bridge */ /* synthetic */ boolean b(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        return true;
    }
}
