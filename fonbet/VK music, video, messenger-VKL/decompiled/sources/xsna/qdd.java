package xsna;

import com.vk.catalog2.common.dto.api.video.ShortVideoType;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c63;
import xsna.hg1;

/* compiled from: ClipTrendsCatalogCache.kt */
/* loaded from: classes16.dex */
public final class qdd implements w2a {
    public static final d b = new d();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final io.reactivex.rxjava3.subjects.f<f> f = new io.reactivex.rxjava3.subjects.f<>();
    public static final io.reactivex.rxjava3.subjects.d<c> g = io.reactivex.rxjava3.subjects.d.O0(c.d.a);
    public static final pgn h = new pgn();
    public static final pgn i = new pgn();
    public final bpn0 a = new bpn0(new se0(9));

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<f, io.reactivex.rxjava3.core.g<c>> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.g<c> invoke(f fVar) {
            qdd qddVar = (qdd) this.receiver;
            d dVar = qdd.b;
            qddVar.getClass();
            int i = g.$EnumSwitchMapping$0[fVar.ordinal()];
            if (i == 1) {
                return qddVar.c().d(qdd.d());
            }
            if (i == 2) {
                return qddVar.c().d(qdd.d());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(c cVar) {
            ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext(cVar);
            return s3q0.a;
        }
    }

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static abstract class c {

        /* compiled from: ClipTrendsCatalogCache.kt */
        public static final class a extends c {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: ClipTrendsCatalogCache.kt */
        public static final class b extends c {
            public final hda a;

            public b(hda hdaVar) {
                this.a = hdaVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Persistent(response=" + this.a + ')';
            }
        }

        /* compiled from: ClipTrendsCatalogCache.kt */
        /* renamed from: xsna.qdd$c$c, reason: collision with other inner class name */
        public static final class C3559c extends c {
            public final hda a;

            public C3559c(hda hdaVar) {
                this.a = hdaVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3559c) && epx.f(this.a, ((C3559c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Remote(response=" + this.a + ')';
            }
        }

        /* compiled from: ClipTrendsCatalogCache.kt */
        public static final class d extends c {
            public static final d a = new d();
        }
    }

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final class d {
        public static final /* synthetic */ qcy<Object>[] a = {new MutablePropertyReference1Impl(d.class, "requestDisposable", "getRequestDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, d.class, "responseDisposable", "getResponseDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    }

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final class e extends c63.b {
        public final io.reactivex.rxjava3.disposables.c b;

        public e(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.c63.b
        public final void w() {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.dispose();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final class f {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;
        public static final f INIT;
        public static final f RESTORE;

        static {
            f fVar = new f("INIT", 0);
            INIT = fVar;
            f fVar2 = new f("RESTORE", 1);
            RESTORE = fVar2;
            f[] fVarArr = {fVar, fVar2};
            $VALUES = fVarArr;
            $ENTRIES = new asp(fVarArr);
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipTrendsCatalogCache.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.RESTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qdd() {
        if (c.compareAndSet(false, true)) {
            BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
            io.reactivex.rxjava3.subjects.f<f> fVar = f;
            io.reactivex.rxjava3.core.g<R> b2 = fVar.D0(backpressureStrategy).b(new vx6(new a(1, this, qdd.class, "loadDiscover", "loadDiscover(Lcom/vk/catalog2/common/ui/mvp/clip/cache/ClipTrendsCatalogCache$RequestType;)Lio/reactivex/rxjava3/core/Flowable;", 0), 7));
            io.reactivex.rxjava3.subjects.d<c> dVar = g;
            io.reactivex.rxjava3.disposables.c subscribe = b2.subscribe(new mp0(new b(1, dVar, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0), 8));
            c63 c63Var = c63.a;
            c63.a(new e(subscribe));
            b.getClass();
            qcy<Object>[] qcyVarArr = d.a;
            qcy<Object> qcyVar = qcyVarArr[0];
            h.b(subscribe);
            hg1.l0 l0Var = new hg1.l0();
            dVar.getClass();
            io.reactivex.rxjava3.disposables.c h2 = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, l0Var).U(new hg1.k0()), new com.vk.movika.sdk.base.logic.interactor.d(this, 27));
            c63.a(new e(h2));
            qcy<Object> qcyVar2 = qcyVarArr[1];
            i.b(h2);
            fVar.onNext(f.INIT);
        }
    }

    public static io.reactivex.rxjava3.core.k d() {
        if (!e.compareAndSet(false, true)) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        io.reactivex.rxjava3.internal.operators.observable.e0 e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(rsg0.T(new b6a(new wba(), o25.a().c(), ShortVideoType.TRENDS, 2)));
        int i2 = 11;
        cp0 cp0Var = new cp0(new dj1(i2), i2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.a0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.maybe.b0(e0Var, lVar, lVar, cp0Var, kVar, kVar), lVar, lVar, lVar, kVar, new odd(0)), new r41(new ve0(11), 13)), new s41(new md(16), 12));
    }

    @Override // xsna.w2a
    public final io.reactivex.rxjava3.core.q<hda> a() {
        ux0 ux0Var = new ux0(new y90(10), 13);
        io.reactivex.rxjava3.subjects.d<c> dVar = g;
        dVar.getClass();
        int i2 = 9;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.q2(dVar, ux0Var), new ai3(new z90(16), i2)).U(new com.vk.movika.sdk.base.ui.p0(new xx0(14), i2)), new defpackage.i0(new dh5(5), 10), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // xsna.w2a
    public final void b(hda hdaVar) {
        g.onNext(new c.C3559c(hdaVar));
    }

    public final io.reactivex.rxjava3.core.k<c> c() {
        if (!d.compareAndSet(false, true)) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        io.reactivex.rxjava3.core.q<hda> a2 = ((vga) this.a.getValue()).a();
        a2.getClass();
        io.reactivex.rxjava3.internal.operators.maybe.h0 o = new io.reactivex.rxjava3.internal.operators.observable.e0(a2).o(5L, TimeUnit.SECONDS);
        w00 w00Var = new w00(new pl2(10), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.z(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.maybe.b0(o, lVar, lVar, w00Var, kVar, kVar), lVar, lVar, lVar, kVar, new pdd()), new rx0(new c2(13), 7)), new io.reactivex.rxjava3.processors.b(new y40(14), 9));
    }

    @Override // xsna.w2a
    public final void clear() {
        if (c.compareAndSet(true, false)) {
            e.set(false);
            d.set(false);
            b.getClass();
            qcy<Object>[] qcyVarArr = d.a;
            qcy<Object> qcyVar = qcyVarArr[0];
            h.b(null);
            qcy<Object> qcyVar2 = qcyVarArr[1];
            i.b(null);
            g.onNext(c.d.a);
            ((vga) this.a.getValue()).clear();
        }
    }
}
