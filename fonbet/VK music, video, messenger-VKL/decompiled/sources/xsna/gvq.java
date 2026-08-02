package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import xsna.ycw0;

/* compiled from: FeatureStateToPermissionsViewModelTransformer.kt */
/* loaded from: classes7.dex */
public final class gvq extends wcw0<o79, n79> {
    @Override // xsna.wcw0
    public final ycw0 a(VoipActionsFeatureState voipActionsFeatureState) {
        n79 n79Var = (n79) voipActionsFeatureState;
        VoipActionsFeatureState.o oVar = n79Var.b;
        ycw0.p pVar = new ycw0.p(oVar.a, oVar.b);
        VoipActionsFeatureState.n nVar = n79Var.a;
        ycw0.o oVar2 = new ycw0.o(nVar.a, nVar.b);
        VoipActionsFeatureState.y yVar = n79Var.c;
        return new o79(pVar, oVar2, new ycw0.w(yVar.a, yVar.b), n79Var.d, n79Var.e, n79Var.f);
    }
}
