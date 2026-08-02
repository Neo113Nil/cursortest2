package com.yandex.go.taxi.order.tariff_upgrade.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TariffUpgradeDto;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.a3y0;
import defpackage.aqx0;
import defpackage.d0l0;
import defpackage.evu0;
import defpackage.jgv;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.kpx0;
import defpackage.lpx0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.npx0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.obh;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wpx0;
import defpackage.xd61;
import defpackage.xpx0;
import defpackage.yd61;
import defpackage.ypx0;
import defpackage.zd61;
import defpackage.zzs;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.yaplus.YaPlusStatusRepository;

/* loaded from: classes14.dex */
public final class l {
    public final pav a;
    public final com.yandex.go.zone.interactors.b b;
    public final ru.yandex.taxi.yaplus.b c;
    public final tt2 d;
    public final k7x0 e;
    public final jgv f;
    public final npx0 g;

    public l(pav pavVar, com.yandex.go.zone.interactors.b bVar, ru.yandex.taxi.yaplus.b bVar2, tt2 tt2Var, k7x0 k7x0Var, jgv jgvVar, npx0 npx0Var) {
        this.a = pavVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = tt2Var;
        this.e = k7x0Var;
        this.f = jgvVar;
        this.g = npx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TariffUpgradeInteractor$createTariffUpgrade$1 tariffUpgradeInteractor$createTariffUpgrade$1;
        int i;
        TariffUpgradeDto tariffUpgradeDto;
        zd61 zd61Var;
        Object obj;
        lVar.getClass();
        if (continuationImpl instanceof TariffUpgradeInteractor$createTariffUpgrade$1) {
            tariffUpgradeInteractor$createTariffUpgrade$1 = (TariffUpgradeInteractor$createTariffUpgrade$1) continuationImpl;
            int i2 = tariffUpgradeInteractor$createTariffUpgrade$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$createTariffUpgrade$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffUpgradeInteractor$createTariffUpgrade$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$createTariffUpgrade$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TariffUpgradeDto tariffUpgradeDto2 = taxiOrder.V().z;
                    if (tariffUpgradeDto2 == TariffUpgradeDto.e || evu0.J(tariffUpgradeDto2.b) || evu0.J(tariffUpgradeDto2.c)) {
                        return wpx0.a;
                    }
                    tariffUpgradeInteractor$createTariffUpgrade$1.L$0 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$1.L$1 = tariffUpgradeDto2;
                    tariffUpgradeInteractor$createTariffUpgrade$1.label = 1;
                    Object c = lVar.c(taxiOrder, tariffUpgradeInteractor$createTariffUpgrade$1);
                    if (c != obj3) {
                        obj2 = c;
                        tariffUpgradeDto = tariffUpgradeDto2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                tariffUpgradeDto = (TariffUpgradeDto) tariffUpgradeInteractor$createTariffUpgrade$1.L$1;
                kotlin.b.b(obj2);
                zd61Var = (zd61) obj2;
                if (zd61Var instanceof yd61) {
                    if (zd61Var instanceof xd61) {
                        return ((xd61) zd61Var).a;
                    }
                    w511.b();
                    return null;
                }
                Zone zone = ((yd61) zd61Var).a;
                String str = tariffUpgradeDto.d;
                Iterator it = zone.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((ZoneTariffInfo) obj).e, str)) {
                        break;
                    }
                }
                ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) obj;
                if (zoneTariffInfo == null) {
                    a3y0.e((a3y0) lVar.g.b.getValue(), new String[]{"TaxiOrder:TariffUpgrade", "Zone", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX}, null, new obh(str, zone.a, i3), 2);
                }
                tariffUpgradeInteractor$createTariffUpgrade$1.L$0 = null;
                tariffUpgradeInteractor$createTariffUpgrade$1.L$1 = null;
                tariffUpgradeInteractor$createTariffUpgrade$1.L$2 = null;
                tariffUpgradeInteractor$createTariffUpgrade$1.L$3 = null;
                tariffUpgradeInteractor$createTariffUpgrade$1.label = 2;
                Object b = lVar.b(tariffUpgradeDto, zoneTariffInfo, zone, tariffUpgradeInteractor$createTariffUpgrade$1);
                return b == obj3 ? obj3 : b;
            }
        }
        tariffUpgradeInteractor$createTariffUpgrade$1 = new TariffUpgradeInteractor$createTariffUpgrade$1(lVar, continuationImpl);
        Object obj22 = tariffUpgradeInteractor$createTariffUpgrade$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$createTariffUpgrade$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        zd61Var = (zd61) obj22;
        if (zd61Var instanceof yd61) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TariffUpgradeDto tariffUpgradeDto, ZoneTariffInfo zoneTariffInfo, Zone zone, ContinuationImpl continuationImpl) {
        TariffUpgradeInteractor$createTariffUpgrade$2 tariffUpgradeInteractor$createTariffUpgrade$2;
        int i;
        String str;
        String str2;
        lpx0 lpx0Var;
        Result result;
        if (continuationImpl instanceof TariffUpgradeInteractor$createTariffUpgrade$2) {
            tariffUpgradeInteractor$createTariffUpgrade$2 = (TariffUpgradeInteractor$createTariffUpgrade$2) continuationImpl;
            int i2 = tariffUpgradeInteractor$createTariffUpgrade$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$createTariffUpgrade$2.label = i2 - Integer.MIN_VALUE;
                TariffUpgradeInteractor$createTariffUpgrade$2 tariffUpgradeInteractor$createTariffUpgrade$22 = tariffUpgradeInteractor$createTariffUpgrade$2;
                Object obj = tariffUpgradeInteractor$createTariffUpgrade$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$createTariffUpgrade$22.label;
                kpx0 kpx0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lpx0 lpx0Var2 = new lpx0(tariffUpgradeDto.b, tariffUpgradeDto.c, tariffUpgradeDto.d, zoneTariffInfo, zone, null);
                    String a = ((m7x0) this.e).a(tariffUpgradeDto.a);
                    if (a.length() <= 0) {
                        a = null;
                    }
                    String a2 = this.f.a(zoneTariffInfo != null ? zoneTariffInfo.c : null);
                    if (a2 == null || a2.length() <= 0) {
                        a2 = null;
                    }
                    Pair pair = a != null ? new Pair(a, a2) : new Pair(a2, null);
                    str = (String) pair.getFirst();
                    str2 = (String) pair.getSecond();
                    if (str == null || str.length() == 0) {
                        return new aqx0(lpx0Var2);
                    }
                    TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1 tariffUpgradeInteractor$createTariffUpgrade$preloadResult$1 = new TariffUpgradeInteractor$createTariffUpgrade$preloadResult$1(this, str, null);
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$0 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$1 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$2 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$3 = lpx0Var2;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$4 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$5 = null;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$6 = str;
                    tariffUpgradeInteractor$createTariffUpgrade$22.L$7 = str2;
                    tariffUpgradeInteractor$createTariffUpgrade$22.label = 1;
                    Object w = kotlinx.coroutines.a.w(500L, tariffUpgradeInteractor$createTariffUpgrade$preloadResult$1, tariffUpgradeInteractor$createTariffUpgrade$22);
                    if (w == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lpx0Var = lpx0Var2;
                    obj = w;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) tariffUpgradeInteractor$createTariffUpgrade$22.L$7;
                    str = (String) tariffUpgradeInteractor$createTariffUpgrade$22.L$6;
                    lpx0Var = (lpx0) tariffUpgradeInteractor$createTariffUpgrade$22.L$3;
                    kotlin.b.b(obj);
                }
                result = (Result) obj;
                if (result == null && !(result.getValue() instanceof Result.Failure)) {
                    kpx0Var = new kpx0(str, this.c.b.g.a == YaPlusStatusRepository.JoinPlusStatus.GOT_PLUS);
                } else if (str2 != null) {
                    kpx0Var = new kpx0(str2, this.c.b.g.a == YaPlusStatusRepository.JoinPlusStatus.GOT_PLUS);
                }
                return new aqx0(new lpx0(lpx0Var.a, lpx0Var.b, lpx0Var.c, lpx0Var.d, lpx0Var.e, kpx0Var));
            }
        }
        tariffUpgradeInteractor$createTariffUpgrade$2 = new TariffUpgradeInteractor$createTariffUpgrade$2(this, continuationImpl);
        TariffUpgradeInteractor$createTariffUpgrade$2 tariffUpgradeInteractor$createTariffUpgrade$222 = tariffUpgradeInteractor$createTariffUpgrade$2;
        Object obj2 = tariffUpgradeInteractor$createTariffUpgrade$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$createTariffUpgrade$222.label;
        kpx0 kpx0Var2 = null;
        if (i != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
        if (str2 != null) {
        }
        return new aqx0(new lpx0(lpx0Var.a, lpx0Var.b, lpx0Var.c, lpx0Var.d, lpx0Var.e, kpx0Var2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:29|30))(3:31|32|33))(2:34|(2:36|37)(4:38|(1:40)(1:53)|41|(3:46|(2:48|49)|33)))|14|15|(2:17|(4:19|(1:21)|22|23)(2:25|26))(2:27|28)))|58|6|7|(0)(0)|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        r0.L$0 = r8;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r9 = r7.d(r9, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
    
        if (r9 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0038, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a4, code lost:
    
        r9 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TariffUpgradeInteractor$getZone$1 tariffUpgradeInteractor$getZone$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof TariffUpgradeInteractor$getZone$1) {
            tariffUpgradeInteractor$getZone$1 = (TariffUpgradeInteractor$getZone$1) continuationImpl;
            int i2 = tariffUpgradeInteractor$getZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$getZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffUpgradeInteractor$getZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$getZone$1.label;
                Zone zone = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Zone M = taxiOrder.M();
                    if (M != null) {
                        return new yd61(M);
                    }
                    Address u = taxiOrder.u();
                    String zoneName = u != null ? u.getZoneName() : null;
                    zzs v = taxiOrder.v();
                    com.yandex.go.zone.interactors.b bVar = this.b;
                    if (zoneName != null && zoneName.length() != 0) {
                        tariffUpgradeInteractor$getZone$1.L$0 = taxiOrder;
                        tariffUpgradeInteractor$getZone$1.L$1 = null;
                        tariffUpgradeInteractor$getZone$1.L$2 = null;
                        tariffUpgradeInteractor$getZone$1.label = 1;
                        obj = bVar.a(zoneName, tariffUpgradeInteractor$getZone$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zone = (Zone) obj;
                    }
                } else if (i == 1) {
                    taxiOrder = (TaxiOrder) tariffUpgradeInteractor$getZone$1.L$0;
                    kotlin.b.b(obj);
                    zone = (Zone) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    taxiOrder = (TaxiOrder) tariffUpgradeInteractor$getZone$1.L$0;
                    kotlin.b.b(obj);
                    zone = (Zone) obj;
                }
                Object failure = zone;
                a = Result.a(failure);
                if (a == null) {
                    return new xd61(new ypx0(a));
                }
                Zone zone2 = (Zone) failure;
                if (zone2 == null) {
                    return new xd61(xpx0.a);
                }
                d0l0 t = taxiOrder.t();
                ZoneAddress zoneAddress = t.a;
                if (zoneAddress != null) {
                    taxiOrder.Q(t.l(new ZoneAddress(zoneAddress.a, zone2)));
                }
                return new yd61(zone2);
            }
        }
        tariffUpgradeInteractor$getZone$1 = new TariffUpgradeInteractor$getZone$1(this, continuationImpl);
        Object obj2 = tariffUpgradeInteractor$getZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$getZone$1.label;
        Zone zone3 = null;
        if (i != 0) {
        }
        Object failure2 = zone3;
        a = Result.a(failure2);
        if (a == null) {
        }
    }

    public final tpr d(o2y0 o2y0Var) {
        k kVar = new k(new g(new jqr(new i(new e(o2y0Var.a(), this), this), new TariffUpgradeInteractor$tariffUpgradeFlow$3(this, null), 3)));
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(kVar, mdh.b);
    }
}
