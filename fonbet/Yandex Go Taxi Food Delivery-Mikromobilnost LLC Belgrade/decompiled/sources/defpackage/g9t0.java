package defpackage;

import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class g9t0 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public g9t0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(SoulAiAssistantExperiment.i);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SoulAiAssistantExperiment) this.a.c();
    }
}
