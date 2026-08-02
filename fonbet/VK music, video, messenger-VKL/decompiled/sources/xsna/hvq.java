package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import xsna.ycw0;

/* compiled from: FeatureStateToSettingsViewModelTransformer.kt */
/* loaded from: classes7.dex */
public final class hvq extends wcw0<x79, w79> {
    @Override // xsna.wcw0
    public final ycw0 a(VoipActionsFeatureState voipActionsFeatureState) {
        w79 w79Var = (w79) voipActionsFeatureState;
        VoipActionsFeatureState.p pVar = w79Var.b;
        ycw0.q qVar = new ycw0.q(pVar.a, pVar.c, pVar.b, pVar.d);
        VoipActionsFeatureState.c cVar = w79Var.c;
        ycw0.c cVar2 = new ycw0.c(cVar.a, cVar.b);
        VoipActionsFeatureState.g gVar = w79Var.d;
        ycw0.h hVar = new ycw0.h(gVar.a, gVar.b);
        VoipActionsFeatureState.h hVar2 = w79Var.e;
        return new x79(qVar, cVar2, hVar, new ycw0.i(hVar2.a, hVar2.b), new ycw0.f(w79Var.a.a));
    }
}
