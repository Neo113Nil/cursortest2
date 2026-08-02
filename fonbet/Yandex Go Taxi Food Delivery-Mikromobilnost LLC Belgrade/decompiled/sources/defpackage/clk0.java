package defpackage;

import com.yandex.go.taxi.order.experiments.RideCardOrderTrackingVisibilityExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class clk0 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public clk0(rqo rqoVar) {
        RideCardOrderTrackingVisibilityExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(RideCardOrderTrackingVisibilityExperiment.d);
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
        return (RideCardOrderTrackingVisibilityExperiment) this.a.c();
    }

    public final boolean d() {
        return ((RideCardOrderTrackingVisibilityExperiment) c()).getB();
    }

    public final boolean g() {
        return d() && !((RideCardOrderTrackingVisibilityExperiment) c()).c;
    }
}
