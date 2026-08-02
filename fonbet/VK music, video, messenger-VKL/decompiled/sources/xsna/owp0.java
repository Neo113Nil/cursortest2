package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.nwp0;

/* compiled from: UIBlockProfileTimeCache.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class owp0 extends FunctionReferenceImpl implements izs<UIBlockProfile, io.reactivex.rxjava3.core.q<Pair<? extends UIBlockProfile, ? extends nwp0.a>>> {
    @Override // xsna.izs
    public final io.reactivex.rxjava3.core.q<Pair<? extends UIBlockProfile, ? extends nwp0.a>> invoke(UIBlockProfile uIBlockProfile) {
        UIBlockProfile uIBlockProfile2 = uIBlockProfile;
        nwp0 nwp0Var = (nwp0) this.receiver;
        nwp0Var.getClass();
        io.reactivex.rxjava3.internal.operators.observable.v vVar = new io.reactivex.rxjava3.internal.operators.observable.v(io.reactivex.rxjava3.core.q.T(new Pair(uIBlockProfile2, nwp0.a.REMOVE)), io.reactivex.rxjava3.core.q.C0(zno.e(nwp0Var.a), TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a()));
        io.reactivex.rxjava3.subjects.f<UIBlockProfile> fVar = nwp0Var.b;
        xw70 xw70Var = new xw70(new hsc0(uIBlockProfile2, 21), 8);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p2(vVar, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, xw70Var)).n0(io.reactivex.rxjava3.core.q.T(new Pair(uIBlockProfile2, nwp0.a.ADD)));
    }
}
