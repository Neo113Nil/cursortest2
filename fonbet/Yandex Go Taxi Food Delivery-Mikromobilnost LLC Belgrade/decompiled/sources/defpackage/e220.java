package defpackage;

import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment;
import com.yandex.messaging.sdk.a;

/* loaded from: classes8.dex */
public final class e220 extends lqo {
    public final /* synthetic */ a a;

    public e220(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.lqo
    public final boolean a(oqo oqoVar) {
        zzf zzfVar = (zzf) this.a.b();
        rqo rqoVar = (rqo) zzfVar.C.get();
        NativeMessengerOverloadedFlagsExperiment.Companion.getClass();
        ((jbh) rqoVar).e(NativeMessengerOverloadedFlagsExperiment.e);
        if (((dne0) zzfVar.d.get()).b().n("OVERLOADED_FLAGS").contains(oqoVar.a)) {
            return true;
        }
        return ((Boolean) oqoVar.b).booleanValue();
    }
}
