package xsna;

import com.vk.dto.common.Source;

/* compiled from: ChannelSubscribersCountDataSource.kt */
/* loaded from: classes16.dex */
public final class edb implements ddb {
    public final io.reactivex.rxjava3.subjects.d<Integer> a;
    public final io.reactivex.rxjava3.subjects.d b;

    public edb(ixa ixaVar, a1w a1wVar, io.reactivex.rxjava3.disposables.b bVar) {
        io.reactivex.rxjava3.subjects.d<Integer> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.a = N0;
        this.b = N0;
        bVar.b(io.reactivex.rxjava3.core.g.h(new io.reactivex.rxjava3.internal.operators.single.r(ixaVar.a().K(), new mm6(new jh3(a1wVar, this, Source.CACHE, 2), 8)), new io.reactivex.rxjava3.internal.operators.single.r(ixaVar.a().K(), new mm6(new jh3(a1wVar, this, Source.ACTUAL, 2), 8))).d(true).m(asu0.a.c()).subscribe(io.reactivex.rxjava3.kotlin.c.a(new com.vk.movika.sdk.base.observable.a(this, 20)), io.reactivex.rxjava3.kotlin.c.c(io.reactivex.rxjava3.kotlin.c.b), io.reactivex.rxjava3.kotlin.c.b(io.reactivex.rxjava3.kotlin.c.c)));
    }
}
