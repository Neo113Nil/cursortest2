package com.yandex.go.taxi.tariffs.interactor;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import com.yandex.go.zone.model.Zone;
import defpackage.bbl0;
import defpackage.c5r;
import defpackage.ck31;
import defpackage.cwd;
import defpackage.dwj0;
import defpackage.g7j0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jst;
import defpackage.jy60;
import defpackage.l8j0;
import defpackage.ltj0;
import defpackage.m4r0;
import defpackage.m8j0;
import defpackage.mdh;
import defpackage.mi31;
import defpackage.mtj0;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uvw;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wij;
import defpackage.woe0;
import defpackage.xoe0;
import defpackage.yal0;
import defpackage.yoe0;
import defpackage.za31;
import defpackage.zoe0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes8.dex */
public final class v implements jy60 {
    public final com.yandex.go.taxi.tariffs.internal.factory.a a;
    public final com.yandex.go.taxi.tariffs.internal.routestats.interactor.c b;
    public final com.yandex.go.taxi.tariffs.internal.interactor.f c;
    public final uvw d;
    public final com.yandex.go.taxi.tariffs.factory.a e;
    public final h3y f;
    public final com.yandex.go.zone.repository.o g;
    public final m4r0 h;
    public final ck31 i;
    public final com.yandex.go.route.interactor.b j;
    public final Lifecycle k;
    public final tse l;
    public final com.yandex.go.analytics.b m;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final jse o;
    public final String p;

    public v(com.yandex.go.taxi.tariffs.internal.factory.a aVar, com.yandex.go.taxi.tariffs.internal.routestats.interactor.c cVar, com.yandex.go.taxi.tariffs.internal.interactor.f fVar, uvw uvwVar, com.yandex.go.taxi.tariffs.factory.a aVar2, h3y h3yVar, com.yandex.go.zone.repository.o oVar, m4r0 m4r0Var, ck31 ck31Var, com.yandex.go.route.interactor.b bVar, tt2 tt2Var, Lifecycle lifecycle, tse tseVar, com.yandex.go.analytics.b bVar2) {
        this.a = aVar;
        this.b = cVar;
        this.c = fVar;
        this.d = uvwVar;
        this.e = aVar2;
        this.f = h3yVar;
        this.g = oVar;
        this.h = m4r0Var;
        this.i = ck31Var;
        this.j = bVar;
        this.k = lifecycle;
        this.l = tseVar;
        this.m = bVar2;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.o = mdh.b.P(1);
        this.p = "RefreshTariffsInfoInteractor";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r11 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        r7.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return defpackage.zy11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r11 != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(g7j0 g7j0Var, dwj0 dwj0Var, boolean z, c5r c5rVar, ContinuationImpl continuationImpl) {
        RefreshTariffsInfoInteractor$loadTariffs$1 refreshTariffsInfoInteractor$loadTariffs$1;
        int i;
        com.yandex.go.taxi.tariffs.internal.interactor.f fVar = this.c;
        try {
            if (continuationImpl instanceof RefreshTariffsInfoInteractor$loadTariffs$1) {
                refreshTariffsInfoInteractor$loadTariffs$1 = (RefreshTariffsInfoInteractor$loadTariffs$1) continuationImpl;
                int i2 = refreshTariffsInfoInteractor$loadTariffs$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    refreshTariffsInfoInteractor$loadTariffs$1.label = i2 - Integer.MIN_VALUE;
                    RefreshTariffsInfoInteractor$loadTariffs$1 refreshTariffsInfoInteractor$loadTariffs$12 = refreshTariffsInfoInteractor$loadTariffs$1;
                    Object obj = refreshTariffsInfoInteractor$loadTariffs$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = refreshTariffsInfoInteractor$loadTariffs$12.label;
                    AtomicBoolean atomicBoolean = this.n;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        refreshTariffsInfoInteractor$loadTariffs$12.L$0 = g7j0Var;
                        refreshTariffsInfoInteractor$loadTariffs$12.L$1 = null;
                        refreshTariffsInfoInteractor$loadTariffs$12.L$2 = null;
                        refreshTariffsInfoInteractor$loadTariffs$12.Z$0 = z;
                        refreshTariffsInfoInteractor$loadTariffs$12.label = 1;
                        Object i3 = i(g7j0Var, dwj0Var, z, c5rVar, refreshTariffsInfoInteractor$loadTariffs$12);
                        this = i3;
                        if (i3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = refreshTariffsInfoInteractor$loadTariffs$12.Z$0;
                        g7j0Var = (g7j0) refreshTariffsInfoInteractor$loadTariffs$12.L$0;
                        kotlin.b.b(obj);
                        this = this;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            try {
                com.yandex.go.taxi.tariffs.internal.repository.a aVar = fVar.a;
                aVar.a.set(null);
                aVar.b.clear();
                if (!z) {
                    this.d.a.k(th instanceof CancellationException ? PriceUpdate$PriceLoadingState.LOADING_INTERRUPTED : PriceUpdate$PriceLoadingState.FAILED);
                }
                jst.e.k(th, "Got error while resolving tariff info for route");
                mtj0 mtj0Var = ntj0.a;
                fVar.e(g7j0Var, new ltj0(th));
            } finally {
            }
        }
        refreshTariffsInfoInteractor$loadTariffs$1 = new RefreshTariffsInfoInteractor$loadTariffs$1(this, continuationImpl);
        RefreshTariffsInfoInteractor$loadTariffs$1 refreshTariffsInfoInteractor$loadTariffs$122 = refreshTariffsInfoInteractor$loadTariffs$1;
        Object obj2 = refreshTariffsInfoInteractor$loadTariffs$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshTariffsInfoInteractor$loadTariffs$122.label;
        AtomicBoolean atomicBoolean2 = this.n;
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.p;
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.l, null, null, new RefreshTariffsInfoInteractor$onFirstContentfulPaint$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0336, code lost:
    
        if (r3 == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024c, code lost:
    
        if (r3 == r5) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0367 A[LOOP:5: B:70:0x0125->B:75:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(g7j0 g7j0Var, dwj0 dwj0Var, boolean z, c5r c5rVar, ContinuationImpl continuationImpl) {
        RefreshTariffsInfoInteractor$loadTariffsInternal$1 refreshTariffsInfoInteractor$loadTariffsInternal$1;
        int i;
        Object obj;
        c5r c5rVar2;
        dwj0 dwj0Var2;
        g7j0 g7j0Var2;
        boolean z2;
        dwj0 dwj0Var3;
        r0 r0Var;
        Object value;
        zoe0 zoe0Var;
        zoe0 yoe0Var;
        com.yandex.go.taxi.tariffs.factory.a aVar;
        boolean z3;
        dwj0 dwj0Var4;
        g7j0 g7j0Var3;
        Object obj2;
        if (continuationImpl instanceof RefreshTariffsInfoInteractor$loadTariffsInternal$1) {
            refreshTariffsInfoInteractor$loadTariffsInternal$1 = (RefreshTariffsInfoInteractor$loadTariffsInternal$1) continuationImpl;
            int i2 = refreshTariffsInfoInteractor$loadTariffsInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                refreshTariffsInfoInteractor$loadTariffsInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = refreshTariffsInfoInteractor$loadTariffsInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshTariffsInfoInteractor$loadTariffsInternal$1.label;
                com.yandex.go.taxi.tariffs.factory.a aVar2 = this.e;
                com.yandex.go.taxi.tariffs.internal.interactor.f fVar = this.c;
                obj = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    if (!z) {
                        this.d.a.k(PriceUpdate$PriceLoadingState.LOADING);
                        this.n.set(true);
                    }
                    dwj0 dwj0Var5 = new dwj0(g7j0Var, System.currentTimeMillis(), cwd.g);
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0 = g7j0Var;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1 = dwj0Var;
                    c5rVar2 = c5rVar;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2 = c5rVar2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3 = dwj0Var5;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0 = z;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.label = 1;
                    if (fVar.c(dwj0Var5, z, TariffChangeReason.DEFAULT, refreshTariffsInfoInteractor$loadTariffsInternal$1) != coroutineSingletons) {
                        dwj0Var2 = dwj0Var;
                        g7j0Var2 = g7j0Var;
                        z2 = z;
                        dwj0Var3 = dwj0Var5;
                    }
                }
                if (i == 1) {
                    z2 = refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0;
                    dwj0Var3 = (dwj0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3;
                    c5r c5rVar3 = (c5r) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2;
                    dwj0Var2 = (dwj0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1;
                    g7j0Var2 = (g7j0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0;
                    kotlin.b.b(obj3);
                    c5rVar2 = c5rVar3;
                } else if (i == 2) {
                    z3 = refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0;
                    dwj0Var4 = (dwj0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3;
                    g7j0Var3 = (g7j0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0;
                    kotlin.b.b(obj3);
                    aVar = aVar2;
                    bbl0 bbl0Var = g7j0Var3.a;
                    Zone zone = bbl0Var.b;
                    Address address = (Address) kotlin.collections.a.P(bbl0Var.c.b);
                    Address address2 = (Address) kotlin.collections.a.Z(bbl0Var.c.b);
                    String str = bbl0Var.n;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0 = g7j0Var3;
                    obj2 = null;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1 = null;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2 = null;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3 = dwj0Var4;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$4 = null;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0 = z3;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.label = 3;
                    com.yandex.go.taxi.tariffs.factory.a aVar3 = aVar;
                    obj3 = aVar3.b(zone, (yal0) obj3, address, address2, str);
                    aVar2 = aVar3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj3);
                            return obj3;
                        }
                        z3 = refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0;
                        dwj0Var4 = (dwj0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$8;
                        g7j0Var3 = (g7j0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$7;
                        fVar = (com.yandex.go.taxi.tariffs.internal.interactor.f) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$6;
                        kotlin.b.b(obj3);
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$4 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$5 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$6 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$7 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$8 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0 = z3;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.label = 5;
                        Object b = fVar.b(g7j0Var3, dwj0Var4, (cwd) obj3, z3, refreshTariffsInfoInteractor$loadTariffsInternal$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    z3 = refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0;
                    dwj0Var4 = (dwj0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3;
                    g7j0Var3 = (g7j0) refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0;
                    kotlin.b.b(obj3);
                    obj2 = null;
                    cwd cwdVar = (cwd) obj3;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$4 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$5 = obj2;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$6 = fVar;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$7 = g7j0Var3;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.L$8 = dwj0Var4;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0 = z3;
                    refreshTariffsInfoInteractor$loadTariffsInternal$1.label = 4;
                    List list = aVar2.h.a(cwdVar).a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = ((za31) it.next()).b;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((mi31) it2.next()).a);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (((pex0) next).K0) {
                                arrayList3.add(next);
                            }
                        }
                        arrayList.add(arrayList3);
                    }
                    ArrayList o = tcc.o(arrayList);
                    List list3 = cwdVar.c;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list3) {
                        pex0 pex0Var = (pex0) obj4;
                        if (!o.isEmpty()) {
                            Iterator it4 = o.iterator();
                            while (it4.hasNext()) {
                                if (jl40.l(((pex0) it4.next()).b, pex0Var.b)) {
                                    break;
                                }
                            }
                        }
                        arrayList4.add(obj4);
                    }
                    obj3 = new cwd(cwdVar.a, cwdVar.b, kotlin.collections.a.m0(o, arrayList4), cwdVar.d, cwdVar.e, cwdVar.f);
                }
                fVar.e(g7j0Var2, ntj0.a);
                ru.yandex.taxi.tariffs.interactor.f fVar2 = (ru.yandex.taxi.tariffs.interactor.f) this.f.get();
                Zone zone2 = g7j0Var2.a.b;
                r0Var = fVar2.h;
                while (true) {
                    value = r0Var.getValue();
                    zoe0Var = (zoe0) value;
                    if (!jl40.l(zoe0Var, woe0.a)) {
                        yoe0Var = new yoe0(zone2);
                    } else if (zoe0Var instanceof yoe0) {
                        yoe0 yoe0Var2 = (yoe0) zoe0Var;
                        boolean i3 = zone2.i(yoe0Var2.a);
                        yoe0Var = yoe0Var2;
                        if (!i3) {
                            yoe0Var = new yoe0(zone2);
                        }
                    } else {
                        if (!(zoe0Var instanceof xoe0)) {
                            Object obj5 = obj;
                            w511.b();
                            return obj5;
                        }
                        xoe0 xoe0Var = (xoe0) zoe0Var;
                        yoe0Var = zoe0Var;
                        if (!zone2.i(xoe0Var.a)) {
                            xoe0Var.b.a(null);
                            yoe0Var = new yoe0(zone2);
                        }
                    }
                    if (r0Var.k(value, yoe0Var)) {
                        obj = null;
                    } else {
                        m8j0 m8j0Var = c5rVar2.b;
                        boolean z4 = m8j0Var instanceof l8j0;
                        com.yandex.go.analytics.b bVar = this.m;
                        if (z4) {
                            List list4 = ((l8j0) m8j0Var).a;
                            int d = gw00.d(tcc.n(list4, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                wij wijVar = (wij) it5.next();
                                Pair pair = new Pair(wijVar.a, "oldValue: " + wijVar.b + " and newValue: " + wijVar.c);
                                linkedHashMap.put(pair.c(), pair.f());
                                it5 = it5;
                                aVar2 = aVar2;
                            }
                            aVar = aVar2;
                            bVar.b("RouteStats.Request.DataChanged", linkedHashMap);
                        } else {
                            aVar = aVar2;
                        }
                        bVar.b("RouteStats.Request", g8e.z(CRLReasonCodeExtension.REASON, c5rVar2.b.i()));
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$0 = g7j0Var2;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$1 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$2 = null;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.L$3 = dwj0Var3;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.Z$0 = z2;
                        refreshTariffsInfoInteractor$loadTariffsInternal$1.label = 2;
                        obj3 = this.b.d(g7j0Var2, dwj0Var2, refreshTariffsInfoInteractor$loadTariffsInternal$1);
                        if (obj3 != coroutineSingletons) {
                            z3 = z2;
                            dwj0Var4 = dwj0Var3;
                            g7j0Var3 = g7j0Var2;
                        }
                    }
                }
            }
        }
        refreshTariffsInfoInteractor$loadTariffsInternal$1 = new RefreshTariffsInfoInteractor$loadTariffsInternal$1(this, continuationImpl);
        Object obj32 = refreshTariffsInfoInteractor$loadTariffsInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshTariffsInfoInteractor$loadTariffsInternal$1.label;
        com.yandex.go.taxi.tariffs.factory.a aVar22 = this.e;
        com.yandex.go.taxi.tariffs.internal.interactor.f fVar3 = this.c;
        obj = null;
        if (i != 0) {
        }
        fVar3.e(g7j0Var2, ntj0.a);
        ru.yandex.taxi.tariffs.interactor.f fVar22 = (ru.yandex.taxi.tariffs.interactor.f) this.f.get();
        Zone zone22 = g7j0Var2.a.b;
        r0Var = fVar22.h;
        while (true) {
            value = r0Var.getValue();
            zoe0Var = (zoe0) value;
            if (!jl40.l(zoe0Var, woe0.a)) {
            }
            if (r0Var.k(value, yoe0Var)) {
            }
            obj = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1 refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1;
        int i;
        dwj0 dwj0Var;
        if (continuationImpl instanceof RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1) {
            refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1 = (RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1) continuationImpl;
            int i2 = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1.label = i2 - Integer.MIN_VALUE;
                RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1 refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12 = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1;
                Object obj = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.label = 1;
                    obj = this.c.a.a(refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12);
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
                dwj0Var = (dwj0) obj;
                zy11 zy11Var = zy11.a;
                if (dwj0Var != null) {
                    jst.e.c("Error try to prefetch toll roads");
                    return zy11Var;
                }
                g7j0 g7j0Var = dwj0Var.a;
                Boolean bool = g7j0Var.a.k;
                Boolean bool2 = Boolean.TRUE;
                if (!jl40.l(bool, bool2)) {
                    g7j0Var = g7j0.a(g7j0Var, bbl0.a(g7j0Var.a, null, false, bool2, 130047));
                }
                c5r b = this.b.b(dwj0Var, g7j0Var);
                if (!b.a) {
                    jst.e.getClass();
                    return zy11Var;
                }
                refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.L$0 = null;
                refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.L$1 = null;
                refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.L$2 = null;
                refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12.label = 2;
                Object d = d(g7j0Var, null, true, b, refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$12);
                return d == obj2 ? obj2 : d;
            }
        }
        refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1 = new RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1(this, continuationImpl);
        RefreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1 refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$122 = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$1;
        Object obj3 = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshTariffsInfoInteractor$prefetchTariffsInfoForTollRoads$122.label;
        if (i != 0) {
        }
        dwj0Var = (dwj0) obj3;
        zy11 zy11Var2 = zy11.a;
        if (dwj0Var != null) {
        }
    }
}
