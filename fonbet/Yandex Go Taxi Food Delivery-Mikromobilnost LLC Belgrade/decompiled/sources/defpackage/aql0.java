package defpackage;

import com.yandex.go.safety.center.car.crash.share.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class aql0 implements vpr {
    public final /* synthetic */ a a;

    public aql0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        a aVar = this.a;
        zpl0 zpl0Var = (zpl0) aVar.Dg();
        SafetyCenterExperiment safetyCenterExperiment = aVar.F;
        String a = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SCREEN_TITLE);
        String a2 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_DESCRIPTION);
        String a3 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SEND);
        String a4 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_CANCEL);
        String str = safetyCenterExperiment.i;
        zpl0Var.render(new ypl0(a, a2, a3, a4, str != null ? ((m7x0) aVar.E).a(str) : null));
        return zy11.a;
    }
}
