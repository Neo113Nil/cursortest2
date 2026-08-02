package defpackage;

import com.yandex.go.overdraft.experiments.DebtsAutoChangePaymentExperiment;
import com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class kug implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public kug(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ForcedPaymentMethodChangeExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(ForcedPaymentMethodChangeExperiment.g);
                break;
            case 2:
                s1g0.Companion.getClass();
                this.b = ((jbh) rqoVar).d(s1g0.e);
                break;
            default:
                DebtsAutoChangePaymentExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(DebtsAutoChangePaymentExperiment.c);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
            case 0:
                return (DebtsAutoChangePaymentExperiment) this.b.c();
            case 1:
                return (ForcedPaymentMethodChangeExperiment) this.b.c();
            default:
                return (s1g0) this.b.c();
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.f(continuation);
    }
}
