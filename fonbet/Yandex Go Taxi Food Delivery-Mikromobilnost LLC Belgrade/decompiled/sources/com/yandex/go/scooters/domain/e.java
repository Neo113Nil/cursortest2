package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.scooters.tariff_fix.domain.model.ScootersFixTariffOfferBuildingException;
import defpackage.b4p0;
import defpackage.con0;
import defpackage.cpm0;
import defpackage.eer;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.o1b1;
import defpackage.q1b1;
import defpackage.rbn0;
import defpackage.sbn0;
import defpackage.sco0;
import defpackage.two0;
import defpackage.ubn0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.y7o;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final ru.yandex.taxi.scooters.data.mapper.c a;
    public final com.yandex.go.scooters.data.a b;
    public final ru.yandex.taxi.scooters.data.h c;
    public final com.yandex.go.scooters.payments.data.c d;

    public e(ru.yandex.taxi.scooters.data.mapper.c cVar, com.yandex.go.scooters.data.a aVar, ru.yandex.taxi.scooters.data.h hVar, com.yandex.go.scooters.payments.data.c cVar2) {
        this.a = cVar;
        this.b = aVar;
        this.c = hVar;
        this.d = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc A[EDGE_INSN: B:30:0x00fc->B:21:0x00fc BREAK  A[LOOP:0: B:15:0x00ea->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, zzs zzsVar, vbn0 vbn0Var, ContinuationImpl continuationImpl) {
        ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1 scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1;
        e eVar;
        int i;
        zzs zzsVar2;
        vbn0 ubn0Var;
        Iterator it;
        b4p0 b4p0Var;
        vbn0 vbn0Var2 = vbn0Var;
        if (continuationImpl instanceof ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1) {
            scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1 = (ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1) continuationImpl;
            int i2 = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1.label = i2 - Integer.MIN_VALUE;
                eVar = this;
                ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1 scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12 = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1;
                Object obj = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List c = q1b1.c(vbn0Var2);
                    boolean a = o1b1.a(vbn0Var2.b);
                    scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.L$0 = null;
                    scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.L$1 = zzsVar;
                    scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.L$2 = vbn0Var2;
                    scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.label = 1;
                    obj = eVar.b(str, zzsVar, c, a, scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    zzsVar2 = zzsVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vbn0Var2 = (vbn0) scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.L$2;
                    zzsVar2 = (zzs) scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$12.L$1;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                List<cpm0> list = (List) pair.getFirst();
                List list2 = (List) pair.getSecond();
                if (!(vbn0Var2 instanceof rbn0)) {
                    ubn0Var = new rbn0(vbn0Var2.a, vbn0Var2.b, list2, vbn0Var2.d, (cpm0) kotlin.collections.a.P(list));
                } else {
                    if (!(vbn0Var2 instanceof sbn0)) {
                        if (!(vbn0Var2 instanceof ubn0)) {
                            w511.b();
                            return null;
                        }
                        sco0 sco0Var = vbn0Var2.a;
                        ScootersComeFrom scootersComeFrom = vbn0Var2.b;
                        two0 two0Var = vbn0Var2.d;
                        for (cpm0 cpm0Var : list) {
                            ubn0 ubn0Var2 = (ubn0) vbn0Var2;
                            if (cpm0Var.a.equals(ubn0Var2.e.a)) {
                                ubn0Var = new ubn0(sco0Var, scootersComeFrom, list2, two0Var, cpm0Var, ubn0Var2.f, ubn0Var2.g);
                            }
                        }
                        w511.i("Collection contains no element matching the predicate.");
                        return null;
                    }
                    ubn0Var = new sbn0(vbn0Var2.a, vbn0Var2.b, list2, vbn0Var2.d, list);
                }
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((b4p0) next) instanceof eer) {
                        obj3 = next;
                        break;
                    }
                }
                b4p0Var = (b4p0) obj3;
                if (b4p0Var != null || (r0 = b4p0Var.f) == null) {
                    CharSequence charSequence = "";
                }
                return new con0(zzsVar2, charSequence, ubn0Var);
            }
        }
        eVar = this;
        scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1 = new ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1(eVar, continuationImpl);
        ScootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1 scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$122 = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$1;
        Object obj4 = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBuildFixTariffOfferInteractor$generateFixTariffOffer$122.label;
        Object obj32 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj4;
        List<cpm0> list3 = (List) pair2.getFirst();
        List list22 = (List) pair2.getSecond();
        if (!(vbn0Var2 instanceof rbn0)) {
        }
        it = list22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        b4p0Var = (b4p0) obj32;
        if (b4p0Var != null) {
        }
        CharSequence charSequence2 = "";
        return new con0(zzsVar2, charSequence2, ubn0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r0 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, zzs zzsVar, List list, boolean z, ContinuationImpl continuationImpl) {
        ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1 scootersBuildFixTariffOfferInteractor$requestScooterOffers$1;
        int i;
        Throwable th;
        boolean z2;
        try {
            if (continuationImpl instanceof ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1) {
                scootersBuildFixTariffOfferInteractor$requestScooterOffers$1 = (ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1) continuationImpl;
                int i2 = scootersBuildFixTariffOfferInteractor$requestScooterOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersBuildFixTariffOfferInteractor$requestScooterOffers$1.label = i2 - Integer.MIN_VALUE;
                    ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1 scootersBuildFixTariffOfferInteractor$requestScooterOffers$12 = scootersBuildFixTariffOfferInteractor$requestScooterOffers$1;
                    Object obj = scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        try {
                            com.yandex.go.scooters.data.a aVar = this.b;
                            ScootersInsuranceType scootersInsuranceType = this.c.a().g.a;
                            m6a0 c = this.d.c();
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$0 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$1 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$2 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.Z$0 = z;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.label = 1;
                            obj = aVar.b(str, zzsVar, scootersInsuranceType, c, list, z, scootersBuildFixTariffOfferInteractor$requestScooterOffers$12);
                            if (obj != coroutineSingletons) {
                                z2 = z;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$0 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$1 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$2 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$3 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$4 = null;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.Z$0 = z2;
                            scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.label = 2;
                            obj = this.a.c(th, scootersBuildFixTariffOfferInteractor$requestScooterOffers$12);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        y7o y7oVar = (y7o) obj;
                        throw new ScootersFixTariffOfferBuildingException(y7oVar.a, y7oVar.d);
                    }
                    z2 = scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.Z$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$0 = null;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$1 = null;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$2 = null;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$3 = null;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.L$4 = null;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.Z$0 = z2;
                        scootersBuildFixTariffOfferInteractor$requestScooterOffers$12.label = 2;
                        obj = this.a.c(th, scootersBuildFixTariffOfferInteractor$requestScooterOffers$12);
                    }
                    return (Pair) obj;
                }
            }
            if (i != 0) {
            }
            return (Pair) obj;
        } catch (CancellationException e) {
            throw e;
        }
        scootersBuildFixTariffOfferInteractor$requestScooterOffers$1 = new ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1(this, continuationImpl);
        ScootersBuildFixTariffOfferInteractor$requestScooterOffers$1 scootersBuildFixTariffOfferInteractor$requestScooterOffers$122 = scootersBuildFixTariffOfferInteractor$requestScooterOffers$1;
        Object obj2 = scootersBuildFixTariffOfferInteractor$requestScooterOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBuildFixTariffOfferInteractor$requestScooterOffers$122.label;
    }
}
