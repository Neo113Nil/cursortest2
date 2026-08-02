package xsna;

import com.vk.im.engine.models.channels.ChannelsCounters;
import java.util.concurrent.TimeUnit;

/* compiled from: ChannelsCountersObserverImpl.kt */
/* loaded from: classes16.dex */
public final class veb implements reb {
    public final d1w b;
    public final iv3 c;
    public final f9w d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<ChannelsCounters> f;
    public final io.reactivex.rxjava3.subjects.d g;

    public veb(d1w d1wVar, iv3 iv3Var, f9w f9wVar) {
        this.b = d1wVar;
        this.c = iv3Var;
        this.d = f9wVar;
        ChannelsCounters.f.getClass();
        io.reactivex.rxjava3.subjects.d<ChannelsCounters> O0 = io.reactivex.rxjava3.subjects.d.O0(ChannelsCounters.a.a());
        this.f = O0;
        this.g = O0;
    }

    @Override // xsna.reb
    public final io.reactivex.rxjava3.core.q<ChannelsCounters> H() {
        return this.g;
    }

    @Override // xsna.reb
    public final void c() {
        d();
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.o0(fVar.v0(300L, TimeUnit.MILLISECONDS).a0(asu0.a.c()), new d22(new on(this, 14), 10)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new l00(this, 13), new n40(this, 17));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        bVar.b(f);
        fVar.onNext(s3q0.a);
        com.vk.movika.sdk.base.ui.g gVar = new com.vk.movika.sdk.base.ui.g(fVar, 19);
        c1w a = this.b.a();
        io.reactivex.rxjava3.subjects.f fVar2 = a.b;
        com.vk.movika.sdk.base.hooks.f fVar3 = new com.vk.movika.sdk.base.hooks.f(new dj1(7), 7);
        fVar2.getClass();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, fVar3), new ueb(a, 0)), null, new p1(this, 20), new t9(gVar, 18)));
    }

    @Override // xsna.reb
    public final void d() {
        this.e.e();
    }

    @Override // xsna.reb
    public final void destroy() {
        this.e.dispose();
    }
}
