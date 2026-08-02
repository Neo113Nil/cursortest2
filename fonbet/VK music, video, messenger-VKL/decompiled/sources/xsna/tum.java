package xsna;

import java.util.ArrayList;
import kotlin.collections.EmptySet;

/* compiled from: DialogsMetaLoaderImpl.kt */
/* loaded from: classes18.dex */
public final class tum {
    public final a1w a;
    public final io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();

    public tum(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 a() {
        return this.a.C("DialogsListRepositoryImpl", new asi()).l(new ps2(new com.vk.movika.sdk.base.observable.i(26), 17)).q(this.b);
    }

    public final io.reactivex.rxjava3.core.x b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(EmptySet.b);
        }
        return this.a.C("DialogsListRepositoryImpl", new cfj(arrayList)).l(new lh3(new dz(21), 13)).q(this.b);
    }

    public final io.reactivex.rxjava3.core.x c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(EmptySet.b);
        }
        return this.a.C("DialogsListRepositoryImpl", new dfj(arrayList)).l(new fq1(new bz(19), 12)).q(this.b);
    }
}
