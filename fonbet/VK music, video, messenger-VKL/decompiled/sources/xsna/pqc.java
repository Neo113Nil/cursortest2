package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c63;

/* compiled from: ClipDiscoverCatalogCache.kt */
/* loaded from: classes16.dex */
public final class pqc implements w2a {
    public static final /* synthetic */ qcy<Object>[] b = {new MutablePropertyReference1Impl(pqc.class, "requestDisposable", "getRequestDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, pqc.class, "responseDisposable", "getResponseDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public static final pqc a = new pqc();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final io.reactivex.rxjava3.subjects.f<c> f = new io.reactivex.rxjava3.subjects.f<>();
    public static final io.reactivex.rxjava3.subjects.d<a> g = io.reactivex.rxjava3.subjects.d.O0(a.d.a);
    public static final pgn h = new pgn();
    public static final pgn i = new pgn();
    public static final bpn0 j = new bpn0(new g13(8));
    public static final bpn0 k = new bpn0(new h13(6));

    /* compiled from: ClipDiscoverCatalogCache.kt */
    public static abstract class a {

        /* compiled from: ClipDiscoverCatalogCache.kt */
        /* renamed from: xsna.pqc$a$a, reason: collision with other inner class name */
        public static final class C3527a extends a {
            public final Throwable a;

            public C3527a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3527a) && epx.f(this.a, ((C3527a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: ClipDiscoverCatalogCache.kt */
        public static final class b extends a {
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

        /* compiled from: ClipDiscoverCatalogCache.kt */
        public static final class c extends a {
            public final hda a;

            public c(hda hdaVar) {
                this.a = hdaVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Remote(response=" + this.a + ')';
            }
        }

        /* compiled from: ClipDiscoverCatalogCache.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    /* compiled from: ClipDiscoverCatalogCache.kt */
    public static final class b extends c63.b {
        public final io.reactivex.rxjava3.disposables.c b;

        public b(io.reactivex.rxjava3.disposables.c cVar) {
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
    /* compiled from: ClipDiscoverCatalogCache.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c INIT;
        public static final c RESTORE;

        static {
            c cVar = new c("INIT", 0);
            INIT = cVar;
            c cVar2 = new c("RESTORE", 1);
            RESTORE = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipDiscoverCatalogCache.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.RESTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static io.reactivex.rxjava3.core.k c() {
        if (!d.compareAndSet(false, true)) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        io.reactivex.rxjava3.core.q<hda> a2 = ((vga) k.getValue()).a();
        a2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.e0 e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(a2);
        ez ezVar = new ez(new dz(7), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(e0Var, lVar, lVar, ezVar, kVar, kVar), new ps2(new com.vk.movika.sdk.base.observable.i(8), 9));
    }

    public static io.reactivex.rxjava3.core.k d() {
        if (!e.compareAndSet(false, true)) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        io.reactivex.rxjava3.internal.operators.observable.e0 e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(rsg0.T(new b6a(new wba(), o25.a().c(), null, 10)));
        qs2 qs2Var = new qs2(new x4(12), 7);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.a0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(e0Var, lVar, lVar, qs2Var, kVar, kVar), new pb(new n82(10), 6)), new pi0(new qb(11), 9));
    }

    @Override // xsna.w2a
    public final io.reactivex.rxjava3.core.q<hda> a() {
        gv gvVar = new gv(new oc0(11), 10);
        io.reactivex.rxjava3.subjects.d<a> dVar = g;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.q2(dVar, gvVar), new iu4(new g54(9), 6)).U(new nz(new p60(14), 11)), new oz(new rd1(7), 8), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // xsna.w2a
    public final void b(hda hdaVar) {
        g.onNext(new a.c(hdaVar));
    }

    @Override // xsna.w2a
    public final void clear() {
        if (c.compareAndSet(true, false)) {
            e.set(false);
            d.set(false);
            qcy<Object>[] qcyVarArr = b;
            qcy<Object> qcyVar = qcyVarArr[0];
            h.b(null);
            qcy<Object> qcyVar2 = qcyVarArr[1];
            i.b(null);
            g.onNext(a.d.a);
            ((vga) k.getValue()).clear();
        }
    }
}
