package defpackage;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.c;

/* loaded from: classes6.dex */
public final class as51 implements t1b0 {
    public final /* synthetic */ c a;

    public as51(rqo rqoVar) {
        this.a = uga1.b(rqoVar, YbWalletEntryPointExperiment.i);
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
        return (YbWalletEntryPointExperiment) this.a.c();
    }
}
