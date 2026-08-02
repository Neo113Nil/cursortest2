package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.instructions.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class nsl0 implements vpr {
    public final /* synthetic */ a a;

    public nsl0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        a aVar = this.a;
        lsl0 lsl0Var = (lsl0) aVar.Dg();
        SafetyCenterExperiment safetyCenterExperiment = aVar.C;
        String a = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.INSTRUCTIONS_SCREEN_TITLE);
        String str = safetyCenterExperiment.h;
        lsl0Var.showModalContent(new ksl0(a, str != null ? ((m7x0) aVar.A).a(str) : null, safetyCenterExperiment.j));
        return zy11.a;
    }
}
