package defpackage;

import com.yandex.go.promocodes.experiment.BenefitsCenterExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class an5 implements t1b0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public an5(rqo rqoVar) {
        BenefitsCenterExperiment.Companion.getClass();
        this.b = ((jbh) rqoVar).d(BenefitsCenterExperiment.c);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
            case 0:
                return ((q) this.b).a();
            default:
                return new g92(2, this.b);
        }
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
            case 0:
                return ((q) this.b).b(continuation);
            default:
                return this.b;
        }
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
            case 0:
                return (BenefitsCenterExperiment) ((q) this.b).c();
            default:
                return this.b;
        }
    }

    public an5(Object obj) {
        this.b = obj;
    }
}
