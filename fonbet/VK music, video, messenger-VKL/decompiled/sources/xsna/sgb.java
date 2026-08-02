package xsna;

import com.vk.channels.api.ChannelFilter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ogb;
import xsna.wgb;

/* compiled from: ChannelsListLoaderImpl.kt */
/* loaded from: classes16.dex */
public final class sgb implements ogb {
    public final a a;
    public final px0 b;
    public final com.vk.movika.sdk.base.ui.t c;
    public final f9w d;
    public final ChannelFilter e;
    public final gz9 f;
    public final cau0 g;
    public final io.reactivex.rxjava3.subjects.d<wgb.b> h;
    public final io.reactivex.rxjava3.internal.operators.observable.y i;
    public final io.reactivex.rxjava3.subjects.f<ogb.b> j;
    public final io.reactivex.rxjava3.subjects.f k;
    public final io.reactivex.rxjava3.disposables.b l;
    public volatile wgb m;
    public volatile boolean n;
    public final xeb o;
    public final io.reactivex.rxjava3.disposables.c p;

    /* compiled from: ChannelsListLoaderImpl.kt */
    public static final class a {
        public final rfb a;
        public final rfb b;
        public final bib c;
        public final uvf0 d;

        public a(rfb rfbVar, rfb rfbVar2, bib bibVar, uvf0 uvf0Var) {
            this.a = rfbVar;
            this.b = rfbVar2;
            this.c = bibVar;
            this.d = uvf0Var;
        }
    }

    /* compiled from: ChannelsListLoaderImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<wgb.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wgb.b bVar) {
            ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext(bVar);
            return s3q0.a;
        }
    }

    /* compiled from: ChannelsListLoaderImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ogb.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ogb.b bVar) {
            ((io.reactivex.rxjava3.subjects.f) this.receiver).onNext(bVar);
            return s3q0.a;
        }
    }

    public sgb(a aVar, d1w d1wVar, px0 px0Var, com.vk.movika.sdk.base.ui.t tVar, f9w f9wVar, ChannelFilter channelFilter) {
        this.a = aVar;
        this.b = px0Var;
        this.c = tVar;
        this.d = f9wVar;
        this.e = channelFilter;
        this.f = new gz9(f9wVar);
        a1w a1wVar = q1w.a;
        this.g = (a1wVar == null ? null : a1wVar).r().h;
        io.reactivex.rxjava3.subjects.d<wgb.b> O0 = io.reactivex.rxjava3.subjects.d.O0(new wgb.b(0));
        this.h = O0;
        this.i = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(O0, new np1(new y40(9), 8)).U(new ft0(new ci7(7), 13)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        io.reactivex.rxjava3.subjects.f<ogb.b> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.j = fVar;
        this.k = fVar;
        this.l = new io.reactivex.rxjava3.disposables.b();
        this.m = a();
        c1w a2 = d1wVar.a();
        this.o = a2;
        this.p = io.reactivex.rxjava3.kotlin.c.f(3, a2.b, null, null, new com.vk.movika.sdk.base.logic.interactor.e(this, 14));
    }

    public final wgb a() {
        a aVar = this.a;
        wgb wgbVar = new wgb(this.e, new wgb.a(aVar.a, aVar.b, aVar.c, aVar.d), new gz9(this.d), (io.reactivex.rxjava3.core.w) this.b.invoke(), (io.reactivex.rxjava3.core.w) this.c.invoke(), this.g);
        b bVar = new b(1, this.h, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(2, wgbVar.k, null, new kf1(this, 12), bVar);
        io.reactivex.rxjava3.disposables.b bVar2 = this.l;
        bVar2.b(f);
        c cVar = new c(1, this.j, io.reactivex.rxjava3.subjects.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        bVar2.b(io.reactivex.rxjava3.kotlin.c.f(2, wgbVar.n, null, new ka(this, 17), cVar));
        return wgbVar;
    }

    @Override // xsna.pgb
    public final io.reactivex.rxjava3.core.q<ogb.b> b() {
        return this.k;
    }

    public final synchronized void c() {
        if (!this.n) {
            wgb wgbVar = this.m;
            wgbVar.getClass();
            wgbVar.b(new tb(wgbVar, 24));
        }
    }

    @Override // xsna.pgb
    public final void d() {
        if (this.n) {
            return;
        }
        wgb wgbVar = this.m;
        if (wgbVar.l.compareAndSet(false, true)) {
            wgbVar.b(new com.vk.movika.sdk.base.observable.p(wgbVar, 20));
        }
    }

    @Override // xsna.pgb
    public final synchronized void destroy() {
        this.n = true;
        this.o.destroy();
        this.p.dispose();
        this.l.dispose();
        this.m.a();
    }

    @Override // xsna.pgb
    public final io.reactivex.rxjava3.core.q<ogb.a> e() {
        return this.i;
    }
}
