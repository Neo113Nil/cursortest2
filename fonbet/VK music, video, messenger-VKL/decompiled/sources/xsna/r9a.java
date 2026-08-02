package xsna;

import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import java.util.concurrent.TimeUnit;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CatalogMusicCombinerWithCacheImpl.kt */
/* loaded from: classes16.dex */
public final class r9a implements q9a {
    public final ListBuilder a;

    public r9a(bpn0 bpn0Var, ida... idaVarArr) {
        ListBuilder listBuilder = new ListBuilder(idaVarArr.length + 1);
        listBuilder.add(new n4a(bpn0Var));
        g5g.A(listBuilder, idaVarArr);
        this.a = listBuilder.g();
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.x a(io.reactivex.rxjava3.internal.operators.single.r rVar) {
        io.reactivex.rxjava3.internal.operators.single.b0 m = rVar.m(io.reactivex.rxjava3.schedulers.a.b());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new io.reactivex.rxjava3.internal.operators.single.r(m, new rf1(new gr3(new m7(this, 20)), 9));
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<hda> b(io.reactivex.rxjava3.core.q<hda> qVar) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = qVar.a0(io.reactivex.rxjava3.schedulers.a.b());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a0.L(new q7(new sf1(new dg(this, 12)), 7), false).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<CatalogReplacementResponse> h(io.reactivex.rxjava3.core.q<CatalogReplacementResponse> qVar) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = qVar.a0(io.reactivex.rxjava3.schedulers.a.b());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a0.L(new q7(new sf1(new zx(this, 15)), 7), false).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
