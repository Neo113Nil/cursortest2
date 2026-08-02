package com.yandex.go.route.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.av1;
import defpackage.d0l0;
import defpackage.del0;
import defpackage.ew40;
import defpackage.ex1;
import defpackage.fid0;
import defpackage.fw40;
import defpackage.gid0;
import defpackage.gl2;
import defpackage.i2d0;
import defpackage.j2d0;
import defpackage.jjj0;
import defpackage.jl40;
import defpackage.njc;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.ojc;
import defpackage.p8f;
import defpackage.pex0;
import defpackage.pl2;
import defpackage.pnx0;
import defpackage.py1;
import defpackage.q8f;
import defpackage.qnx0;
import defpackage.tpr;
import defpackage.tr40;
import defpackage.tt2;
import defpackage.u0h;
import defpackage.umd0;
import defpackage.ur40;
import defpackage.uy1;
import defpackage.uyj;
import defpackage.v2h;
import defpackage.vmd0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wu1;
import defpackage.xu1;
import defpackage.xx00;
import defpackage.yu1;
import defpackage.yx00;
import defpackage.zo40;
import defpackage.zu1;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.RouteVehicleType;

/* loaded from: classes8.dex */
public final class c {
    public final wiq0 a;
    public final b b;
    public final del0 c;
    public final fw40 d;
    public final tt2 e;

    public c(wiq0 wiq0Var, b bVar, del0 del0Var, fw40 fw40Var, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = bVar;
        this.c = del0Var;
        this.d = fw40Var;
        this.e = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, d0l0 d0l0Var, pex0 pex0Var, ContinuationImpl continuationImpl) {
        TariffRouteInteractorImpl$resolveMultimodalRoute$1 tariffRouteInteractorImpl$resolveMultimodalRoute$1;
        int i;
        d0l0 d0l0Var2;
        ew40 ew40Var;
        Zone zone;
        cVar.getClass();
        if (continuationImpl instanceof TariffRouteInteractorImpl$resolveMultimodalRoute$1) {
            tariffRouteInteractorImpl$resolveMultimodalRoute$1 = (TariffRouteInteractorImpl$resolveMultimodalRoute$1) continuationImpl;
            int i2 = tariffRouteInteractorImpl$resolveMultimodalRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffRouteInteractorImpl$resolveMultimodalRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffRouteInteractorImpl$resolveMultimodalRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffRouteInteractorImpl$resolveMultimodalRoute$1.label;
                Zone zone2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RouteVehicleType a = cVar.c.a(pex0Var);
                    d0l0 d0l0Var3 = a == d0l0Var.c ? d0l0Var : new d0l0(d0l0Var.a, d0l0Var.b, a);
                    fw40 fw40Var = cVar.d;
                    tariffRouteInteractorImpl$resolveMultimodalRoute$1.L$0 = d0l0Var;
                    tariffRouteInteractorImpl$resolveMultimodalRoute$1.L$1 = null;
                    tariffRouteInteractorImpl$resolveMultimodalRoute$1.L$2 = d0l0Var3;
                    tariffRouteInteractorImpl$resolveMultimodalRoute$1.label = 1;
                    com.yandex.go.multimodal_route.interactors.g gVar = (com.yandex.go.multimodal_route.interactors.g) fw40Var;
                    gVar.getClass();
                    wu1 wu1Var = pex0Var.O;
                    ur40 ur40Var = wu1Var instanceof ur40 ? (ur40) wu1Var : null;
                    obj = ur40Var == null ? null : gVar.a(ur40Var.b, tariffRouteInteractorImpl$resolveMultimodalRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d0l0Var2 = d0l0Var3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d0l0Var2 = (d0l0) tariffRouteInteractorImpl$resolveMultimodalRoute$1.L$2;
                    d0l0Var = (d0l0) tariffRouteInteractorImpl$resolveMultimodalRoute$1.L$0;
                    kotlin.b.b(obj);
                }
                ew40Var = (ew40) obj;
                if (ew40Var != null) {
                    return d0l0Var2;
                }
                ZoneAddress zoneAddress = d0l0Var.a;
                if (zoneAddress != null && (zone = zoneAddress.b) != null && jl40.l(zone.a, ((PlainAddress) ew40Var.b()).getZoneName())) {
                    zone2 = zone;
                }
                return d0l0Var2.l(new ZoneAddress(ew40Var.b(), zone2)).f(ew40Var.a(), false);
            }
        }
        tariffRouteInteractorImpl$resolveMultimodalRoute$1 = new TariffRouteInteractorImpl$resolveMultimodalRoute$1(cVar, continuationImpl);
        Object obj2 = tariffRouteInteractorImpl$resolveMultimodalRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffRouteInteractorImpl$resolveMultimodalRoute$1.label;
        Zone zone22 = null;
        if (i != 0) {
        }
        ew40Var = (ew40) obj2;
        if (ew40Var != null) {
        }
    }

    public final List b() {
        return c().a();
    }

    public final d0l0 c() {
        d0l0 c = this.b.c();
        pex0 m = ((k) this.a).m();
        return m == null ? c : e(c, m);
    }

    public final Address d() {
        return c().b();
    }

    public final d0l0 e(d0l0 d0l0Var, pex0 pex0Var) {
        Address address;
        ex1 ex1Var;
        zu1 zu1Var;
        Address address2;
        Zone zone;
        ru.yandex.taxi.tariffs.model.a aVar;
        List list;
        Object obj;
        if (!d0l0Var.c() && pex0Var != null) {
            RouteVehicleType a = this.c.a(pex0Var);
            if (a != d0l0Var.c) {
                d0l0Var = new d0l0(d0l0Var.a, d0l0Var.b, a);
            }
            wu1 wu1Var = pex0Var.O;
            Zone zone2 = null;
            if (wu1Var instanceof py1) {
                pex0 pex0Var2 = pex0Var.M0;
                if (pex0Var2 == null || (aVar = pex0Var2.t0) == null || (list = aVar.a) == null) {
                    ex1Var = null;
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ex1) obj).a() == pex0Var) {
                            break;
                        }
                    }
                    ex1Var = (ex1) obj;
                }
                if (ex1Var instanceof zu1) {
                    zu1Var = (zu1) ex1Var;
                } else {
                    if (!(ex1Var instanceof av1) && !(ex1Var instanceof fid0) && !(ex1Var instanceof q8f) && !(ex1Var instanceof xu1) && !(ex1Var instanceof v2h) && !(ex1Var instanceof tr40) && !(ex1Var instanceof umd0) && !(ex1Var instanceof i2d0) && !(ex1Var instanceof pnx0) && !(ex1Var instanceof nu1) && !(ex1Var instanceof gl2) && !(ex1Var instanceof njc) && !(ex1Var instanceof xx00) && ex1Var != null) {
                        w511.b();
                        return null;
                    }
                    zu1Var = null;
                }
                if (zu1Var != null && (address2 = zu1Var.b) != null) {
                    ZoneAddress zoneAddress = d0l0Var.a;
                    if (zoneAddress != null && (zone = zoneAddress.b) != null && jl40.l(zone.a, address2.getZoneName())) {
                        zone2 = zone;
                    }
                    return d0l0Var.l(new ZoneAddress(address2, zone2));
                }
            } else if (wu1Var instanceof uy1) {
                av1 d = ru.yandex.taxi.tariffs.model.b.d(pex0Var);
                if (d != null && (address = d.b) != null) {
                    return d0l0Var.f(address, false);
                }
            } else if (!(wu1Var instanceof ur40) && !(wu1Var instanceof yu1) && !(wu1Var instanceof u0h) && !(wu1Var instanceof pl2) && !(wu1Var instanceof ojc) && !(wu1Var instanceof p8f) && !(wu1Var instanceof zo40) && !(wu1Var instanceof gid0) && !(wu1Var instanceof jjj0) && !(wu1Var instanceof qnx0) && !(wu1Var instanceof yx00) && !(wu1Var instanceof vmd0) && !(wu1Var instanceof j2d0) && wu1Var != null) {
                w511.b();
                return null;
            }
        }
        return d0l0Var;
    }

    public final tpr f() {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(new m0(this.b.k(), ((k) this.a).g(), new TariffRouteInteractorImpl$routeFlow$1(3, null)), new TariffRouteInteractorImpl$routeFlow$2(this, null)));
        this.e.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public final Address g() {
        return c().h();
    }
}
