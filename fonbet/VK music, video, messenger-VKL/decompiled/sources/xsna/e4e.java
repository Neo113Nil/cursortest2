package xsna;

import xsna.d4e;
import xsna.hg1;

/* compiled from: ClipsFavoritesEventsSourceImpl.kt */
/* loaded from: classes16.dex */
public final class e4e implements d4e {
    public final io.reactivex.rxjava3.subjects.f<d4e.a> a = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: RxExt.kt */
    public static final class a implements izs {
        public static final a b = new a();

        @Override // xsna.izs
        public final d4e.a.C2703a invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.C2703a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.ClipsAddedToFolder");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class b implements izs {
        public static final b b = new b();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.c);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final d4e.a.c invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.c) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.ClipsRemovedFromFolder");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.e);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final d4e.a.e invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.e) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.FolderRemoved");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class f implements izs {
        public static final f b = new f();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.d);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class g implements izs {
        public static final g b = new g();

        @Override // xsna.izs
        public final d4e.a.d invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.d) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.FolderCreated");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class h implements izs {
        public static final h b = new h();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.f);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class i implements izs {
        public static final i b = new i();

        @Override // xsna.izs
        public final d4e.a.f invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.f) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.FolderUpdated");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class j implements izs {
        public static final j b = new j();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.b);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class k implements izs {
        public static final k b = new k();

        @Override // xsna.izs
        public final d4e.a.b invoke(Object obj) {
            if (obj != null) {
                return (d4e.a.b) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.favorites.api.ClipsFavoritesEventsSource.ClipsFavoritesEvent.ClipsMoved");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class l implements izs {
        public static final l b = new l();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof d4e.a.C2703a);
        }
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.e> a() {
        hg1.n0 n0Var = new hg1.n0(d.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(e.b));
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.f> b() {
        hg1.n0 n0Var = new hg1.n0(h.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(i.b));
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.b> c() {
        hg1.n0 n0Var = new hg1.n0(j.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(k.b));
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.C2703a> d() {
        hg1.n0 n0Var = new hg1.n0(l.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(a.b));
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.c> e() {
        hg1.n0 n0Var = new hg1.n0(b.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(c.b));
    }

    @Override // xsna.d4e
    public final io.reactivex.rxjava3.core.q<d4e.a.d> f() {
        hg1.n0 n0Var = new hg1.n0(f.b);
        io.reactivex.rxjava3.subjects.f<d4e.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, n0Var).U(new hg1.m0(g.b));
    }

    public final void g(d4e.a aVar) {
        this.a.onNext(aVar);
    }
}
