package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.r070;

/* compiled from: NewsfeedAppLovinTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class nc60 extends evg0<qz60, on50, r070.a, r070, jv60, xh60> {
    public final Lazy f;

    public nc60(Lazy lazy, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        String Z;
        if (!(((r070.a) hn50Var) instanceof r070.a.C3586a)) {
            throw new NoWhenBranchMatchedException();
        }
        hv50 hv50Var = (hv50) this.f.getValue();
        return h((!((Boolean) hv50Var.d.getValue()).booleanValue() || (Z = ((AuthBridgeComponent) hv50Var.b.getValue()).s().Z()) == null || drm0.N(Z)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.Q(0L, 500L, TimeUnit.MILLISECONDS, asu0.a.c()), new nm3(new h630(hv50Var, 7), 23))).o(30L, TimeUnit.SECONDS)).g(new jf1(hv50Var, 4)), new wha(0), new va4(0));
    }
}
