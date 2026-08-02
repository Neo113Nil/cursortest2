package xsna;

import com.vk.clips.precache.api.RefreshType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.utils.Logger;
import xsna.lgj0;
import xsna.qie;

/* compiled from: ClipsItemsCacheImpl.kt */
/* loaded from: classes16.dex */
public final class qie implements oie {
    public static final /* synthetic */ qcy<Object>[] i;
    public final b a;
    public final yie b;
    public final rhh0 c;
    public final vie d;
    public final hwe e;
    public final d80 f = new d80();
    public final io.reactivex.rxjava3.subjects.d<List<a>> g = io.reactivex.rxjava3.subjects.d.N0();
    public final io.reactivex.rxjava3.subjects.d<List<SdkVideoFile>> h = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: ClipsItemsCacheImpl.kt */
    public static abstract class a {
        public final SdkVideoFile a;

        /* compiled from: ClipsItemsCacheImpl.kt */
        /* renamed from: xsna.qie$a$a, reason: collision with other inner class name */
        public static final class C3564a extends a {
        }

        /* compiled from: ClipsItemsCacheImpl.kt */
        public static final class b extends a {
        }

        public a(SdkVideoFile sdkVideoFile) {
            this.a = sdkVideoFile;
        }
    }

    /* compiled from: ClipsItemsCacheImpl.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final RefreshType c;

        public b(int i, int i2, RefreshType refreshType) {
            this.a = i;
            this.b = i2;
            this.c = refreshType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "Config(storageSize=" + this.a + ", retrievalSize=" + this.b + ", refreshType=" + this.c + ')';
        }
    }

    /* compiled from: ClipsItemsCacheImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshType.values().length];
            try {
                iArr[RefreshType.RefreshOnInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshType.RefreshOnEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshType.NotRefresh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsItemsCacheImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(qie.class, "subscription", "getSubscription()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        i = new qcy[]{mutablePropertyReference1Impl};
    }

    public qie(b bVar, yie yieVar, rhh0 rhh0Var, vie vieVar, hwe hweVar) {
        this.a = bVar;
        this.b = yieVar;
        this.c = rhh0Var;
        this.d = vieVar;
        this.e = hweVar;
    }

    @Override // xsna.oie
    public final void a(fgg0 fgg0Var, ArrayList arrayList) {
        ListBuilder listBuilder = new ListBuilder(arrayList.size() + fgg0Var.size());
        Iterator<T> it = fgg0Var.iterator();
        while (it.hasNext()) {
            listBuilder.add(new a.C3564a((SdkVideoFile) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            listBuilder.add(new a.b((SdkVideoFile) it2.next()));
        }
        this.g.onNext(listBuilder.g());
    }

    @Override // xsna.oie
    public final int b() {
        return this.a.a;
    }

    @Override // xsna.oie
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c() {
        return this.h.U(new ft0(new op1(this, 25), 18));
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.k d() {
        wmi0 wmi0Var = wmi0.a;
        rhh0 rhh0Var = this.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.single.c0(wmi0Var.f("clips_feed_items_cache", (io.reactivex.rxjava3.core.w) rhh0Var.b).U(new rf1(new a60(15), 13)).F(new c60(new ht(rhh0Var), 9)).K()), new bk1(new nk(11), 5));
    }

    @Override // xsna.oie
    public final void init() {
        qcy<Object>[] qcyVarArr = i;
        qcy<Object> qcyVar = qcyVarArr[0];
        d80 d80Var = this.f;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) d80Var.b;
        if (cVar == null || !hg1.d(cVar)) {
            final io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
            final io.reactivex.rxjava3.internal.operators.observable.t2 w0 = fVar.w0(1000L, TimeUnit.MILLISECONDS);
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.pie
                @Override // io.reactivex.rxjava3.functions.n
                public final Object get() {
                    io.reactivex.rxjava3.internal.operators.single.y l;
                    io.reactivex.rxjava3.internal.operators.maybe.a d0Var;
                    io.reactivex.rxjava3.internal.operators.single.y l2;
                    qie qieVar = qie.this;
                    vie vieVar = qieVar.d;
                    io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.z(qieVar.g.a0(qieVar.e.b()), new f50(new com.vk.movika.sdk.base.logic.interactor.e(fVar, 18), 14)).c(w0).U(new e10(new z90(17), 15));
                    int i2 = qie.c.$EnumSwitchMapping$0[qieVar.a.c.ordinal()];
                    if (i2 == 1) {
                        hwe hweVar = vieVar.a;
                        if (hweVar.a().o()) {
                            l = ((nkh0) hweVar.e.getValue()).a(lgj0.a.i(new ogj0(), Integer.valueOf(hweVar.a().N().b), null, "clips_precache", null, xfj0.a, null, qyk0.a().getDeviceInfo(), null, null, null, null, 32682)).l(new n7(new i4e(vieVar, 2), 13));
                        } else {
                            l = rsg0.T(new faf("clips_precache", PaginationKey.Initial.b, null, hweVar.a().N().b, null, null, true)).U(new io.reactivex.rxjava3.subjects.c(new c2(16), 10)).K().l(new ux0(new com.vk.movika.sdk.base.logic.interactor.e(hweVar, 19), 18));
                        }
                        d0Var = new io.reactivex.rxjava3.internal.operators.maybe.d0(new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.single.c0(l), new h7(new gv3(9), 12)), qieVar.d());
                    } else if (i2 == 2) {
                        io.reactivex.rxjava3.internal.operators.maybe.k d2 = qieVar.d();
                        hwe hweVar2 = vieVar.a;
                        if (hweVar2.a().o()) {
                            l2 = ((nkh0) hweVar2.e.getValue()).a(lgj0.a.i(new ogj0(), Integer.valueOf(hweVar2.a().N().b), null, "clips_precache", null, xfj0.a, null, qyk0.a().getDeviceInfo(), null, null, null, null, 32682)).l(new n7(new i4e(vieVar, 2), 13));
                        } else {
                            l2 = rsg0.T(new faf("clips_precache", PaginationKey.Initial.b, null, hweVar2.a().N().b, null, null, true)).U(new io.reactivex.rxjava3.subjects.c(new c2(16), 10)).K().l(new ux0(new com.vk.movika.sdk.base.logic.interactor.e(hweVar2, 19), 18));
                        }
                        io.reactivex.rxjava3.internal.operators.maybe.k kVar = new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.single.c0(l2), new h7(new gv3(9), 12));
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        asu0.a.getClass();
                        d0Var = new io.reactivex.rxjava3.internal.operators.maybe.d0(d2, new io.reactivex.rxjava3.internal.operators.maybe.h0(new io.reactivex.rxjava3.internal.operators.maybe.o(new io.reactivex.rxjava3.internal.operators.flowable.o(new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.o0(io.reactivex.rxjava3.core.k.p(2000L, timeUnit, asu0.p()).q()), new qa(new com.vk.movika.sdk.base.utils.b(qieVar), 10))), new ox0(new jm0(kVar, 14), 12)), io.reactivex.rxjava3.core.k.p(16000L, timeUnit, io.reactivex.rxjava3.schedulers.a.a()), kVar));
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0Var = qieVar.d();
                    }
                    io.reactivex.rxjava3.internal.operators.maybe.u uVar = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.g(d0Var, new w00(new yp1(qieVar, 3), 12)), new tp1(new lt0(17), 6));
                    EmptyList emptyList = EmptyList.b;
                    return new io.reactivex.rxjava3.internal.operators.observable.j2(U.n0(new io.reactivex.rxjava3.internal.operators.maybe.e0(uVar, io.reactivex.rxjava3.core.x.k(emptyList)).w()).j0(emptyList, new c7(new bn7(qieVar, 3), 16)));
                }
            }).r0(this.e.b()).subscribe(new vl0(new s6(this, 23), 12), new ea(new d(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 19));
            qcy<Object> qcyVar2 = qcyVarArr[0];
            d80Var.g(subscribe);
        }
    }
}
