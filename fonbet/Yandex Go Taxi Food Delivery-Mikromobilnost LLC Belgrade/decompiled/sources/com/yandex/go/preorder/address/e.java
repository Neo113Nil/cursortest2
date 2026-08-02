package com.yandex.go.preorder.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.PinDropOrderAddressAnalyticsData;
import com.yandex.go.preorder.mode.SourcePointMode;
import defpackage.a7u;
import defpackage.ber;
import defpackage.c9l0;
import defpackage.dht0;
import defpackage.dqe0;
import defpackage.dr40;
import defpackage.evr;
import defpackage.fu00;
import defpackage.h55;
import defpackage.h56;
import defpackage.i130;
import defpackage.jbh;
import defpackage.jev0;
import defpackage.jl40;
import defpackage.ket0;
import defpackage.kev0;
import defpackage.kjt0;
import defpackage.kr0;
import defpackage.l56;
import defpackage.m8t0;
import defpackage.m950;
import defpackage.mzb;
import defpackage.net0;
import defpackage.nq40;
import defpackage.nwx0;
import defpackage.ny61;
import defpackage.oi21;
import defpackage.p521;
import defpackage.pce0;
import defpackage.pv0;
import defpackage.qht0;
import defpackage.qqo;
import defpackage.rft0;
import defpackage.rqo;
import defpackage.so0;
import defpackage.tit0;
import defpackage.tpo0;
import defpackage.tte0;
import defpackage.urv0;
import defpackage.vvx0;
import defpackage.wb1;
import defpackage.yq40;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class e {
    public final ket0 A;
    public final jev0 B;
    public final vvx0 C;
    public final kr0 D;
    public final i E;
    public final so0 F;
    public final oi21 G;
    public final dht0 H;
    public final a I;
    public final ber J;
    public final h56 K;
    public final mzb L;
    public final c9l0 M;
    public final qqo N;
    public final ru.yandex.taxi.preorder.source.pickup.a a;
    public final dqe0 b;
    public final a7u c;
    public final rft0 d;
    public final l56 e;
    public final yq40 f;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e g;
    public final kjt0 h;
    public final com.yandex.go.route.interactor.c i;
    public final tit0 j;
    public final fu00 k;
    public final net0 l;
    public final nq40 m;
    public final com.yandex.go.route.interactor.b n;
    public final AddressResolveRepository o;
    public final ru.yandex.taxi.preorder.source.domain.a p;
    public final kev0 q;
    public final wb1 r;
    public final pce0 s;
    public final tte0 t;
    public final v u;
    public final evr v;
    public final urv0 w;
    public final dr40 x;
    public final r y;
    public final i130 z;

    public e(ru.yandex.taxi.preorder.source.pickup.a aVar, dqe0 dqe0Var, a7u a7uVar, rft0 rft0Var, l56 l56Var, yq40 yq40Var, ru.yandex.taxi.preorder.source.mode.interactor.e eVar, kjt0 kjt0Var, com.yandex.go.route.interactor.c cVar, tit0 tit0Var, fu00 fu00Var, net0 net0Var, nq40 nq40Var, com.yandex.go.route.interactor.b bVar, AddressResolveRepository addressResolveRepository, ru.yandex.taxi.preorder.source.domain.a aVar2, kev0 kev0Var, wb1 wb1Var, pce0 pce0Var, tte0 tte0Var, v vVar, evr evrVar, urv0 urv0Var, dr40 dr40Var, r rVar, i130 i130Var, ket0 ket0Var, jev0 jev0Var, vvx0 vvx0Var, kr0 kr0Var, i iVar, so0 so0Var, oi21 oi21Var, dht0 dht0Var, a aVar3, ber berVar, h56 h56Var, mzb mzbVar, c9l0 c9l0Var, rqo rqoVar) {
        this.a = aVar;
        this.b = dqe0Var;
        this.c = a7uVar;
        this.d = rft0Var;
        this.e = l56Var;
        this.f = yq40Var;
        this.g = eVar;
        this.h = kjt0Var;
        this.i = cVar;
        this.j = tit0Var;
        this.k = fu00Var;
        this.l = net0Var;
        this.m = nq40Var;
        this.n = bVar;
        this.o = addressResolveRepository;
        this.p = aVar2;
        this.q = kev0Var;
        this.r = wb1Var;
        this.s = pce0Var;
        this.t = tte0Var;
        this.u = vVar;
        this.v = evrVar;
        this.w = urv0Var;
        this.x = dr40Var;
        this.y = rVar;
        this.z = i130Var;
        this.A = ket0Var;
        this.B = jev0Var;
        this.C = vvx0Var;
        this.D = kr0Var;
        this.E = iVar;
        this.F = so0Var;
        this.G = oi21Var;
        this.H = dht0Var;
        this.I = aVar3;
        this.J = berVar;
        this.K = h56Var;
        this.L = mzbVar;
        this.M = c9l0Var;
        this.N = ((jbh) rqoVar).a(SimpleBooleanExperiment.DISABLE_ADDRESS_CACHE_USAGE);
    }

    public static boolean b(pv0 pv0Var) {
        com.yandex.go.analytics.e analyticsData = pv0Var.a.getAnalyticsData();
        if (!(analyticsData instanceof PinDropOrderAddressAnalyticsData)) {
            return false;
        }
        String str = ((PinDropOrderAddressAnalyticsData) analyticsData).f;
        return jl40.l(str, "manual") || jl40.l(str, "manual.pickup_point_tap") || jl40.l(str, "geo");
    }

    public final void a(pv0 pv0Var) {
        this.o.b(AddressResolveRepository.State.LOADED);
        this.y.i(pv0Var);
        c(pv0Var, true);
        this.l.d();
        this.r.i();
        Address e = this.b.e();
        if (e != null && !jl40.l(pv0Var.a.B(), e.B())) {
            pv0Var = pv0Var.c(e);
        }
        this.u.a(pv0Var);
    }

    public final void c(pv0 pv0Var, boolean z) {
        Address address = pv0Var.a;
        SourcePointMode a = this.g.a.a();
        if (a.u()) {
            return;
        }
        if (a.q()) {
            zzs B = address.B();
            Address g = this.i.g();
            if (jl40.l(B, g != null ? g.B() : null)) {
                return;
            }
            this.h.a(new m8t0(1, this), true, false);
            return;
        }
        ket0 ket0Var = this.A;
        ((nwx0) ket0Var.c).a.c().Rf();
        ket0Var.e.a.g(p521.a);
        tit0 tit0Var = this.j;
        if (tit0Var.b == null && tit0Var.c != null) {
            qht0 qht0Var = (qht0) this.d;
            m950 m950Var = qht0Var.a;
            if (m950Var != null) {
                ((h55) m950Var).i();
                qht0Var.a = null;
            }
            tit0Var.c = null;
            this.C.a();
        }
        this.a.i = address.B();
        this.l.b(pv0Var, z);
        this.I.q.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SourceAddressChangesInteractor$trackSourceAddressChanges$1 sourceAddressChangesInteractor$trackSourceAddressChanges$1;
        int i;
        boolean z;
        int i2;
        if (continuationImpl instanceof SourceAddressChangesInteractor$trackSourceAddressChanges$1) {
            sourceAddressChangesInteractor$trackSourceAddressChanges$1 = (SourceAddressChangesInteractor$trackSourceAddressChanges$1) continuationImpl;
            int i3 = sourceAddressChangesInteractor$trackSourceAddressChanges$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sourceAddressChangesInteractor$trackSourceAddressChanges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressChangesInteractor$trackSourceAddressChanges$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kr0 kr0Var = this.D;
                    sourceAddressChangesInteractor$trackSourceAddressChanges$1.label = 1;
                    obj = ((com.yandex.go.clarify_address.a) kr0Var).b(sourceAddressChangesInteractor$trackSourceAddressChanges$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                i2 = (this.G.a || ((Boolean) this.N.b()).booleanValue()) ? 0 : 1;
                int i4 = (this.w.a() || !(this.g.a.a() == SourcePointMode.POINT || this.g.a.a() == SourcePointMode.POINT_WITH_ROUTE)) ? 0 : 1;
                i iVar = this.E;
                RoutePointType routePointType = RoutePointType.POINT_A;
                if (i2 == 0 && (i4 == 0 || booleanValue)) {
                    z = false;
                }
                o oVar = new o(new o(new d(iVar.j(routePointType, z)), new SourceAddressChangesInteractor$trackSourceAddressChanges$3(3, null)), new SourceAddressChangesInteractor$trackSourceAddressChanges$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                tpo0 tpo0Var = new tpo0(22, this);
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$0 = null;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$1 = null;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$2 = null;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.Z$0 = booleanValue;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.I$0 = i2;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.I$1 = i4;
                sourceAddressChangesInteractor$trackSourceAddressChanges$1.label = 2;
                Object collect = oVar.collect(tpo0Var, sourceAddressChangesInteractor$trackSourceAddressChanges$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        sourceAddressChangesInteractor$trackSourceAddressChanges$1 = new SourceAddressChangesInteractor$trackSourceAddressChanges$1(this, continuationImpl);
        Object obj2 = sourceAddressChangesInteractor$trackSourceAddressChanges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressChangesInteractor$trackSourceAddressChanges$1.label;
        z = true;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (this.G.a) {
        }
        if (this.w.a()) {
        }
        i iVar2 = this.E;
        RoutePointType routePointType2 = RoutePointType.POINT_A;
        if (i2 == 0) {
            z = false;
        }
        o oVar2 = new o(new o(new d(iVar2.j(routePointType2, z)), new SourceAddressChangesInteractor$trackSourceAddressChanges$3(3, null)), new SourceAddressChangesInteractor$trackSourceAddressChanges$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
        tpo0 tpo0Var2 = new tpo0(22, this);
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$0 = null;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$1 = null;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.L$2 = null;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.Z$0 = booleanValue2;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.I$0 = i2;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.I$1 = i4;
        sourceAddressChangesInteractor$trackSourceAddressChanges$1.label = 2;
        Object collect2 = oVar2.collect(tpo0Var2, sourceAddressChangesInteractor$trackSourceAddressChanges$1);
        if (collect2 != coroutineSingletons2) {
        }
    }
}
