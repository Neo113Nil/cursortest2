package defpackage;

import com.yandex.go.safety.center.car.crash.status.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class iql0 implements vpr {
    public final /* synthetic */ a a;

    public iql0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        a aVar = this.a;
        fql0 fql0Var = (fql0) aVar.Dg();
        SafetyCenterExperiment safetyCenterExperiment = aVar.x;
        String a = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_SCREEN_TITLE);
        String a2 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_SCREEN_DESCRIPTION);
        String a3 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_TRUE_POSITIVE_LINK_TITLE);
        String a4 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_FALSE_POSITIVE_LINK_TITLE);
        String str = safetyCenterExperiment.i;
        fql0Var.showModalContent(new eql0(a, a2, a3, a4, str != null ? ((m7x0) aVar.D).a(str) : null));
        return zy11.a;
    }
}
