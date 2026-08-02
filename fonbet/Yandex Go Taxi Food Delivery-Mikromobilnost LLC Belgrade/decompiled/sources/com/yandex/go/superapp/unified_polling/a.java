package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.superapp.unified_polling.data.api.TrackingApi;
import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersParamDto;
import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import defpackage.bg5;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.d9;
import defpackage.gci0;
import defpackage.gn2;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy11;
import defpackage.m2e0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.py11;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.ry11;
import defpackage.s0k0;
import defpackage.sbc;
import defpackage.sbx;
import defpackage.scc;
import defpackage.tje;
import defpackage.urm;
import defpackage.vmx;
import defpackage.wg10;
import defpackage.wnt;
import defpackage.ycc;
import defpackage.ycw0;
import defpackage.zp1;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes8.dex */
public final class a implements jy11 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final wnt f;
    public final h3y g;
    public final y h;
    public final r0 i;
    public final gci0 j;
    public final r0 k;
    public final gci0 l;
    public final TrackingApi m;
    public final ScheduledExecutorService n;
    public final ike o;
    public final CopyOnWriteArrayList p;
    public zp1 q;
    public pzt0 r;
    public m2e0 s;
    public int t;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, wnt wntVar, h3y h3yVar6, y yVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = wntVar;
        this.g = h3yVar6;
        this.h = yVar;
        r0 c = bvf0.c(Boolean.FALSE);
        this.i = c;
        this.j = kotlinx.coroutines.flow.e.d(c);
        r0 c2 = bvf0.c(ycw0.f);
        this.k = c2;
        this.l = kotlinx.coroutines.flow.e.d(c2);
        i3y a = kotlin.a.a(new d9(14, new sbc(19, this)));
        s0k0 s0k0Var = new s0k0();
        int i = 0;
        s0k0Var.b(cvu0.s("http://localhost/", "/", false) ? "http://localhost/" : "http://localhost//");
        sbx a2 = vmx.a.a();
        Regex regex = wg10.e;
        s0k0Var.a(bvf0.o(a2, qje.o("application/json; charset=utf-8")));
        s0k0Var.a = new gn2(i, a);
        this.m = (TrackingApi) s0k0Var.c().b(TrackingApi.class);
        this.n = Executors.newSingleThreadScheduledExecutor();
        this.o = bvf0.a(jl40.a());
        this.p = new CopyOnWriteArrayList();
        this.t = 90;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(a aVar, m2e0 m2e0Var, zzs zzsVar, ContinuationImpl continuationImpl) {
        EatsKitPollingRepositoryImpl$createCall$1 eatsKitPollingRepositoryImpl$createCall$1;
        int i;
        TrackingApi trackingApi;
        Map b;
        String str;
        Integer num;
        aVar.getClass();
        if (continuationImpl instanceof EatsKitPollingRepositoryImpl$createCall$1) {
            eatsKitPollingRepositoryImpl$createCall$1 = (EatsKitPollingRepositoryImpl$createCall$1) continuationImpl;
            int i2 = eatsKitPollingRepositoryImpl$createCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsKitPollingRepositoryImpl$createCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsKitPollingRepositoryImpl$createCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsKitPollingRepositoryImpl$createCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingApi = aVar.m;
                    String str2 = m2e0Var.a;
                    b = m2e0Var.b.b();
                    Integer num2 = new Integer(((bg5) aVar.c.get()).a());
                    y yVar = aVar.h;
                    eatsKitPollingRepositoryImpl$createCall$1.L$0 = null;
                    eatsKitPollingRepositoryImpl$createCall$1.L$1 = null;
                    eatsKitPollingRepositoryImpl$createCall$1.L$2 = trackingApi;
                    eatsKitPollingRepositoryImpl$createCall$1.L$3 = str2;
                    eatsKitPollingRepositoryImpl$createCall$1.L$4 = b;
                    eatsKitPollingRepositoryImpl$createCall$1.L$5 = zzsVar;
                    eatsKitPollingRepositoryImpl$createCall$1.L$6 = num2;
                    eatsKitPollingRepositoryImpl$createCall$1.label = 1;
                    Object Q = yVar.Q(eatsKitPollingRepositoryImpl$createCall$1);
                    if (Q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    obj = Q;
                    num = num2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = (Integer) eatsKitPollingRepositoryImpl$createCall$1.L$6;
                    zzsVar = (zzs) eatsKitPollingRepositoryImpl$createCall$1.L$5;
                    b = (Map) eatsKitPollingRepositoryImpl$createCall$1.L$4;
                    str = (String) eatsKitPollingRepositoryImpl$createCall$1.L$3;
                    trackingApi = (TrackingApi) eatsKitPollingRepositoryImpl$createCall$1.L$2;
                    kotlin.b.b(obj);
                }
                return trackingApi.a(str, b, new EatsOrdersParamDto(zzsVar, num, !((Boolean) obj).booleanValue() ? TrackingsGroupMethodDto.Aggregate : TrackingsGroupMethodDto.InappWidgets));
            }
        }
        eatsKitPollingRepositoryImpl$createCall$1 = new EatsKitPollingRepositoryImpl$createCall$1(aVar, continuationImpl);
        Object obj2 = eatsKitPollingRepositoryImpl$createCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsKitPollingRepositoryImpl$createCall$1.label;
        if (i != 0) {
        }
        return trackingApi.a(str, b, new EatsOrdersParamDto(zzsVar, num, !((Boolean) obj2).booleanValue() ? TrackingsGroupMethodDto.Aggregate : TrackingsGroupMethodDto.InappWidgets));
    }

    @Override // defpackage.ky11
    public final n4u0 a() {
        return this.j;
    }

    @Override // defpackage.ky11
    public final void b(String str, ry11 ry11Var) {
        if (ry11Var instanceof py11) {
            j();
        }
    }

    @Override // defpackage.jy11
    public final void c(m2e0 m2e0Var) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.i;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.TRUE));
        this.s = m2e0Var;
        j();
    }

    @Override // defpackage.ky11
    public final n4u0 d() {
        return this.l;
    }

    @Override // defpackage.ky11
    public final void e(String str, ry11 ry11Var) {
        if (ry11Var instanceof py11) {
            h1p b = ((py11) ry11Var).b();
            if (b != EatsService.MARKET && b != EatsService.MARKET_VIEWER) {
                tje.N(this.o, null, null, new EatsKitPollingRepositoryImpl$onOrderCreated$1(b, this, null), 3);
                return;
            }
            ru.yandex.taxi.logistics.sdk.management.f fVar = (ru.yandex.taxi.logistics.sdk.management.f) this.e.get();
            if (str == null) {
                jst.e.j(new IllegalArgumentException("SuperAppOrderTracking: missing actual Market order id"));
            } else {
                fVar.a.f(str);
            }
            fVar.d();
            j();
        }
    }

    @Override // defpackage.ky11
    public final void f(ry11 ry11Var) {
        if (ry11Var instanceof py11) {
            j();
        }
    }

    @Override // defpackage.jy11
    public final void h() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.i;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.FALSE));
        this.s = null;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((ScheduledFuture) it.next()).cancel(true);
        }
        copyOnWriteArrayList.clear();
        i();
    }

    public final void i() {
        zp1 zp1Var = this.q;
        if (zp1Var != null) {
            zp1Var.f();
        }
        pzt0 pzt0Var = this.r;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        int i = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) it.next();
                if (scheduledFuture.isDone() || scheduledFuture.isCancelled()) {
                    i++;
                    if (i < 0) {
                        scc.l();
                        throw null;
                    }
                }
            }
        }
        if (i == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
        ycc.w(arrayList, new urm(24), true);
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
    }

    public final void j() {
        if (((Boolean) this.i.getValue()).booleanValue()) {
            i();
            m2e0 m2e0Var = this.s;
            if (m2e0Var == null) {
                return;
            }
            this.r = tje.N(this.o, null, CoroutineStart.UNDISPATCHED, new EatsKitPollingRepositoryImpl$forceUpdate$1(this, m2e0Var, null), 1);
        }
    }
}
