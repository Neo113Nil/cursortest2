package defpackage;

import com.yandex.go.scooters.subscription.upsale_on_book.data.model.ScootersSubscriptionUpsaleOnBookExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class dzo0 implements q {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ q a;

    public dzo0(rqo rqoVar) {
        ScootersSubscriptionUpsaleOnBookExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersSubscriptionUpsaleOnBookExperiment.f);
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
        return (ScootersSubscriptionUpsaleOnBookExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
