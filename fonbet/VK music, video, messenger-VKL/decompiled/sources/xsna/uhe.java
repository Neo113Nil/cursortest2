package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c63;
import xsna.fld;
import xsna.jge;
import xsna.yge;

/* compiled from: ClipsInterestsRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final class uhe implements qhe {
    public final fhe a;
    public final phe b;
    public final yhe c;
    public final ix3 d;
    public final io.reactivex.rxjava3.subjects.d<ClipsInterestsStatusProvider.Status> e = io.reactivex.rxjava3.subjects.d.N0();
    public final io.reactivex.rxjava3.subjects.f<List<Integer>> f = new io.reactivex.rxjava3.subjects.f<>();
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: ClipsInterestsRepositoryImpl.kt */
    public static final class a extends c63.b {
        public final io.reactivex.rxjava3.disposables.c b;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.c63.b
        public final void w() {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.dispose();
        }
    }

    /* compiled from: ClipsInterestsRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<List<? extends jge.a>, e2f, ohe> {
        @Override // xsna.wzs
        public final ohe invoke(List<? extends jge.a> list, e2f e2fVar) {
            List<? extends jge.a> list2 = list;
            ((yhe) this.receiver).getClass();
            List<Integer> list3 = e2fVar.c;
            ArrayList arrayList = new ArrayList();
            for (jge.a aVar : list2) {
                uki0 ulp0Var = new ulp0(rli0.j(new i5g(aVar.d), new po1(list3, 21)), new d40(11));
                fld.b bVar = aVar.a;
                if (list3.contains(Integer.valueOf(bVar.a))) {
                    ulp0Var = rli0.x(new fli0(bVar), ulp0Var);
                }
                g5g.z(arrayList, ulp0Var);
            }
            return new ohe(arrayList, list2);
        }
    }

    public uhe(fhe fheVar, phe pheVar, yhe yheVar, ix3 ix3Var) {
        this.a = fheVar;
        this.b = pheVar;
        this.c = yheVar;
        this.d = ix3Var;
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.internal.operators.single.s a() {
        io.reactivex.rxjava3.core.x m;
        Object obj = yge.a.a;
        if (obj.equals(obj)) {
            m = new io.reactivex.rxjava3.internal.operators.maybe.e0(this.a.a(), m());
        } else if (obj.equals(yge.b.a)) {
            m = new io.reactivex.rxjava3.internal.operators.single.e0(m(), new kf3(new com.vk.movika.sdk.base.observable.o(this, 20), 9));
        } else {
            if (!obj.equals(yge.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m = m();
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(m.l(new kb(new i8(20), 17)), new iu1(new xhe(1, this.e, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0), 10)), new ju1(new com.vk.movika.sdk.base.observable.k(this, 22), 13));
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.internal.operators.completable.l b() {
        return io.reactivex.rxjava3.core.a.l(new is2(this, 2));
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.internal.operators.single.v c() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new she(this, 0));
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.internal.operators.completable.u d() {
        fhe fheVar = this.a;
        fheVar.getClass();
        io.reactivex.rxjava3.internal.operators.completable.y q = io.reactivex.rxjava3.core.a.l(new ahe(fheVar, 0)).q(fheVar.b());
        asu0.a.getClass();
        return q.o(asu0.i());
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.subjects.f e() {
        return this.f;
    }

    @Override // xsna.qhe
    public final void f() {
        this.e.onNext(ClipsInterestsStatusProvider.Status.COMPLETED);
    }

    @Override // xsna.qhe
    public final void g(Set set) {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new the(set, 0)), new z8(new vw4(1, this, uhe.class, "uploadInterests", "uploadInterests(Ljava/util/List;)Lio/reactivex/rxjava3/core/Completable;", 0, 4), 6)).subscribe(new va4(0), new jv(new uw4(com.vk.metrics.eventtracking.b.a, 5), 16));
        c63 c63Var = c63.a;
        c63.a(new a(subscribe));
        this.g = subscribe;
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.core.x<ohe> h(yge ygeVar) {
        io.reactivex.rxjava3.core.b0 k;
        io.reactivex.rxjava3.core.b0 l;
        yge.a aVar = yge.a.a;
        boolean equals = ygeVar.equals(aVar);
        yge.c cVar = yge.c.a;
        yge.b bVar = yge.b.a;
        fhe fheVar = this.a;
        if (equals) {
            fheVar.getClass();
            io.reactivex.rxjava3.internal.operators.maybe.c0 n = new io.reactivex.rxjava3.internal.operators.maybe.p(new bhe(fheVar, 0)).n(fheVar.b());
            asu0.a.getClass();
            k = new io.reactivex.rxjava3.internal.operators.maybe.e0(n.k(asu0.i()), k());
        } else if (ygeVar.equals(bVar)) {
            k = new io.reactivex.rxjava3.internal.operators.single.e0(k(), new yh1(new u8(this, 28), 9));
        } else {
            if (!ygeVar.equals(cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            k = k();
        }
        if (ygeVar.equals(aVar)) {
            l = new io.reactivex.rxjava3.internal.operators.maybe.e0(fheVar.a(), l());
        } else if (ygeVar.equals(bVar)) {
            l = new io.reactivex.rxjava3.internal.operators.single.e0(l(), new dg1(new w8(this, 26), 11));
        } else {
            if (!ygeVar.equals(cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            l = l();
        }
        return io.reactivex.rxjava3.core.x.B(k, l, new nb(new b(2, this.c, yhe.class, "map", "map(Ljava/util/List;Lcom/vk/dto/shortvideo/ClipsSavedInterests;)Lcom/vk/clips/interests/impl/domain/model/ClipsInterestsRemoteState;", 0), 9));
    }

    @Override // xsna.qhe
    public final io.reactivex.rxjava3.internal.operators.observable.y i() {
        io.reactivex.rxjava3.subjects.d<ClipsInterestsStatusProvider.Status> dVar = this.e;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.qhe
    public final void j() {
        this.e.onNext(ClipsInterestsStatusProvider.Status.SHOWN);
    }

    public final io.reactivex.rxjava3.internal.operators.single.r k() {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.a(), new qj4(new vhe(1, this.a, fhe.class, "cacheAllInterests", "cacheAllInterests(Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", 0), 6));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r l() {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.d(), new mm6(new whe(this.a, 0), 11));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r m() {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.b(), new pi0(new tw4(this.a, 3), 12));
    }
}
