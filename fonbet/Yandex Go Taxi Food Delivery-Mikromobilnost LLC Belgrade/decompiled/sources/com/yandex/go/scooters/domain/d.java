package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.domain.model.ScootersBookingException;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.scooters.domain.model.ScootersDriverLicenseVerificationRequiredException;
import com.yandex.go.scooters.domain.model.ScootersInvalidPaymentMethodException;
import com.yandex.go.scooters.domain.model.ScootersPhotoVerificationRequiredException;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import defpackage.b4p0;
import defpackage.b590;
import defpackage.bvf0;
import defpackage.cpm0;
import defpackage.e3n0;
import defpackage.eer;
import defpackage.gvn0;
import defpackage.hen0;
import defpackage.j2n0;
import defpackage.j73;
import defpackage.jhs;
import defpackage.k2n0;
import defpackage.kqm0;
import defpackage.l2n0;
import defpackage.m2n0;
import defpackage.m6a0;
import defpackage.mkn0;
import defpackage.n2n0;
import defpackage.nkn0;
import defpackage.ny61;
import defpackage.o2n0;
import defpackage.okn0;
import defpackage.pjn0;
import defpackage.pkn0;
import defpackage.qco0;
import defpackage.qkn0;
import defpackage.qoi0;
import defpackage.qwo0;
import defpackage.rbn0;
import defpackage.rco0;
import defpackage.rdn0;
import defpackage.rho0;
import defpackage.sbn0;
import defpackage.sco0;
import defpackage.sho0;
import defpackage.tcc;
import defpackage.two0;
import defpackage.ubn0;
import defpackage.v1n0;
import defpackage.vbn0;
import defpackage.vj90;
import defpackage.w511;
import defpackage.xzt0;
import defpackage.ywm0;
import defpackage.zgz;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class d {
    public final ru.yandex.taxi.scooters.data.mapper.c a;
    public final com.yandex.go.scooters.data.a b;
    public final qwo0 c;
    public final hen0 d;
    public final com.yandex.go.scooters.payments.domain.b e;
    public final com.yandex.go.scooters.payments.data.c f;
    public final com.yandex.go.scooters.passes.domain.i g;
    public final gvn0 h;
    public final ru.yandex.taxi.scooters.domain.e i;
    public final com.yandex.go.scooters.insurance.data.c j;
    public final ywm0 k;
    public final com.yandex.go.scooters.packages.upsale_on_book.data.a l;
    public final com.yandex.go.scooters.super_passes.upsale_on_book.data.a m;
    public final com.yandex.go.scooters.subscription.upsale_on_book.data.a n;
    public final kqm0 o;

    public d(ru.yandex.taxi.scooters.data.mapper.c cVar, com.yandex.go.scooters.data.a aVar, qwo0 qwo0Var, hen0 hen0Var, com.yandex.go.scooters.payments.domain.b bVar, com.yandex.go.scooters.payments.data.c cVar2, com.yandex.go.scooters.passes.domain.i iVar, gvn0 gvn0Var, ru.yandex.taxi.scooters.domain.e eVar, com.yandex.go.scooters.insurance.data.c cVar3, ywm0 ywm0Var, com.yandex.go.scooters.packages.upsale_on_book.data.a aVar2, com.yandex.go.scooters.super_passes.upsale_on_book.data.a aVar3, com.yandex.go.scooters.subscription.upsale_on_book.data.a aVar4, kqm0 kqm0Var) {
        this.a = cVar;
        this.b = aVar;
        this.c = qwo0Var;
        this.d = hen0Var;
        this.e = bVar;
        this.f = cVar2;
        this.g = iVar;
        this.h = gvn0Var;
        this.i = eVar;
        this.j = cVar3;
        this.k = ywm0Var;
        this.l = aVar2;
        this.m = aVar3;
        this.n = aVar4;
        this.o = kqm0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(3:25|26|(2:28|29)(1:30))|22|(1:24)|13|14))|37|6|7|(0)(0)|22|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r8.h(r9, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, m6a0 m6a0Var, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$tryBook$1 scootersBookOfferInteractor$tryBook$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        com.yandex.go.scooters.data.a aVar;
        dVar.getClass();
        if (continuationImpl instanceof ScootersBookOfferInteractor$tryBook$1) {
            scootersBookOfferInteractor$tryBook$1 = (ScootersBookOfferInteractor$tryBook$1) continuationImpl;
            int i2 = scootersBookOfferInteractor$tryBook$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBookOfferInteractor$tryBook$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersBookOfferInteractor$tryBook$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBookOfferInteractor$tryBook$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.scooters.data.a aVar2 = dVar.b;
                    com.yandex.go.scooters.payments.domain.b bVar = dVar.e;
                    scootersBookOfferInteractor$tryBook$1.L$0 = null;
                    scootersBookOfferInteractor$tryBook$1.L$1 = null;
                    scootersBookOfferInteractor$tryBook$1.L$2 = str;
                    scootersBookOfferInteractor$tryBook$1.L$3 = aVar2;
                    scootersBookOfferInteractor$tryBook$1.label = 1;
                    Object a = bVar.a(m6a0Var, scootersBookOfferInteractor$tryBook$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    aVar = aVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                        }
                        return zy11.a;
                    }
                    aVar = (com.yandex.go.scooters.data.a) scootersBookOfferInteractor$tryBook$1.L$3;
                    str2 = (String) scootersBookOfferInteractor$tryBook$1.L$2;
                    kotlin.b.b(obj);
                }
                scootersBookOfferInteractor$tryBook$1.L$0 = null;
                scootersBookOfferInteractor$tryBook$1.L$1 = null;
                scootersBookOfferInteractor$tryBook$1.L$2 = null;
                scootersBookOfferInteractor$tryBook$1.L$3 = null;
                scootersBookOfferInteractor$tryBook$1.label = 2;
                if (aVar.a(str2, (String) obj, scootersBookOfferInteractor$tryBook$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        scootersBookOfferInteractor$tryBook$1 = new ScootersBookOfferInteractor$tryBook$1(dVar, continuationImpl);
        obj = scootersBookOfferInteractor$tryBook$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$tryBook$1.label;
        if (i != 0) {
        }
        scootersBookOfferInteractor$tryBook$1.L$0 = null;
        scootersBookOfferInteractor$tryBook$1.L$1 = null;
        scootersBookOfferInteractor$tryBook$1.L$2 = null;
        scootersBookOfferInteractor$tryBook$1.L$3 = null;
        scootersBookOfferInteractor$tryBook$1.label = 2;
        if (aVar.a(str2, (String) obj, scootersBookOfferInteractor$tryBook$1) == coroutineSingletons) {
        }
        return zy11.a;
    }

    public final Object b(vbn0 vbn0Var, Continuation continuation) {
        Object obj;
        Iterator it = vbn0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b4p0) obj).getClass() == eer.class) {
                break;
            }
        }
        b4p0 b4p0Var = (b4p0) obj;
        if (b4p0Var != null) {
            return d(vbn0Var, b4p0Var, (ContinuationImpl) continuation);
        }
        ScootersBookingFailedException scootersBookingFailedException = new ScootersBookingFailedException(null);
        zgz.a("No fix tariff in tariffs", scootersBookingFailedException);
        throw scootersBookingFailedException;
    }

    public final Object c(String str, ScootersComeFrom scootersComeFrom, m6a0 m6a0Var, ContinuationImpl continuationImpl) {
        return this.k.a(new ScootersBookOfferInteractor$bookOffer$2(this, str, m6a0Var, scootersComeFrom, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0192, code lost:
    
        if (r12 == r1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x03ee, code lost:
    
        if (r9.m.b(r2, r0) == r1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03bc, code lost:
    
        if (r9.l.b(r12, r0) == r1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x039a, code lost:
    
        if (r9.j.b(r12, r0) == r1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ce, code lost:
    
        if (r2.i(r0) == r1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034b A[LOOP:1: B:63:0x0345->B:65:0x034b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(vbn0 vbn0Var, b4p0 b4p0Var, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$bookOffersTariff$1 scootersBookOfferInteractor$bookOffersTariff$1;
        vbn0 vbn0Var2;
        String str;
        b4p0 b4p0Var2;
        cpm0 cpm0Var;
        d dVar;
        vbn0 vbn0Var3;
        sbn0 sbn0Var;
        b4p0 b4p0Var3;
        d dVar2;
        String str2;
        cpm0 cpm0Var2;
        vbn0 vbn0Var4;
        n2n0 n2n0Var;
        b4p0 b4p0Var4;
        j2n0 j2n0Var;
        List list;
        vbn0 vbn0Var5;
        b4p0 b4p0Var5;
        List<Integer> singletonList;
        Iterator it;
        int i;
        try {
            if (continuationImpl instanceof ScootersBookOfferInteractor$bookOffersTariff$1) {
                scootersBookOfferInteractor$bookOffersTariff$1 = (ScootersBookOfferInteractor$bookOffersTariff$1) continuationImpl;
                int i2 = scootersBookOfferInteractor$bookOffersTariff$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersBookOfferInteractor$bookOffersTariff$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersBookOfferInteractor$bookOffersTariff$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (scootersBookOfferInteractor$bookOffersTariff$1.label) {
                        case 0:
                            kotlin.b.b(obj);
                            m6a0 c = this.f.c();
                            if (c == null) {
                                throw new ScootersNoSelectedPaymentMethodException();
                            }
                            if (b4p0Var instanceof eer) {
                                scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.label = 1;
                                obj = g((eer) b4p0Var, c, vbn0Var, scootersBookOfferInteractor$bookOffersTariff$1);
                                break;
                            } else if (!(b4p0Var instanceof xzt0)) {
                                if (!(b4p0Var instanceof b590)) {
                                    w511.b();
                                    return null;
                                }
                                vj90 vj90Var = ((b590) b4p0Var).n;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$1 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.label = 6;
                                Object e = e(vj90Var, scootersBookOfferInteractor$bookOffersTariff$1);
                                if (e != coroutineSingletons) {
                                    return e;
                                }
                            } else if (vbn0Var instanceof rbn0) {
                                cpm0 cpm0Var3 = ((rbn0) vbn0Var).e;
                                ScootersComeFrom scootersComeFrom = vbn0Var.b;
                                String str3 = (String) kotlin.collections.b.g(qoi0.a(xzt0.class), cpm0Var3.e);
                                scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$4 = this;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$8 = cpm0Var3;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$11 = str3;
                                scootersBookOfferInteractor$bookOffersTariff$1.label = 2;
                                if (c(str3, scootersComeFrom, c, scootersBookOfferInteractor$bookOffersTariff$1) != coroutineSingletons) {
                                    vbn0Var2 = vbn0Var;
                                    str2 = str3;
                                    b4p0Var2 = b4p0Var;
                                    cpm0Var2 = cpm0Var3;
                                    dVar = this;
                                    j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var2.a, str2)));
                                    n2n0Var = j2n0Var;
                                    vbn0Var5 = vbn0Var2;
                                    try {
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var2;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var5;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$4 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$7 = n2n0Var;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                                        scootersBookOfferInteractor$bookOffersTariff$1.label = 5;
                                        break;
                                    } catch (Throwable unused) {
                                        break;
                                    }
                                }
                            } else if (vbn0Var instanceof sbn0) {
                                sbn0 sbn0Var2 = (sbn0) vbn0Var;
                                ScootersBookOfferInteractor$bookOffersTariff$$inlined$bookByTariff$1 scootersBookOfferInteractor$bookOffersTariff$$inlined$bookByTariff$1 = new ScootersBookOfferInteractor$bookOffersTariff$$inlined$bookByTariff$1(sbn0Var2, this, c, null);
                                scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$4 = this;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$8 = sbn0Var2;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.label = 3;
                                obj = bvf0.n(scootersBookOfferInteractor$bookOffersTariff$$inlined$bookByTariff$1, scootersBookOfferInteractor$bookOffersTariff$1);
                                if (obj != coroutineSingletons) {
                                    vbn0Var3 = vbn0Var;
                                    sbn0Var = sbn0Var2;
                                    b4p0Var3 = b4p0Var;
                                    dVar2 = this;
                                    list = (List) obj;
                                    if (!list.isEmpty()) {
                                        ScootersBookingFailedException scootersBookingFailedException = new ScootersBookingFailedException(null);
                                        zgz.a("Booking of all " + sbn0Var.e.size() + " scooters is failed", scootersBookingFailedException);
                                        throw scootersBookingFailedException;
                                    }
                                    n2n0Var = new j2n0(list);
                                    vbn0 vbn0Var6 = vbn0Var3;
                                    dVar = dVar2;
                                    vbn0Var5 = vbn0Var6;
                                    b4p0Var2 = b4p0Var3;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var2;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var5;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$4 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$7 = n2n0Var;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.label = 5;
                                }
                            } else {
                                if (!(vbn0Var instanceof ubn0)) {
                                    w511.b();
                                    return null;
                                }
                                cpm0 cpm0Var4 = ((ubn0) vbn0Var).e;
                                ScootersComeFrom scootersComeFrom2 = vbn0Var.b;
                                String str4 = (String) kotlin.collections.b.g(qoi0.a(xzt0.class), cpm0Var4.e);
                                scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$4 = this;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$8 = cpm0Var4;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                                scootersBookOfferInteractor$bookOffersTariff$1.L$11 = str4;
                                scootersBookOfferInteractor$bookOffersTariff$1.label = 4;
                                if (c(str4, scootersComeFrom2, c, scootersBookOfferInteractor$bookOffersTariff$1) != coroutineSingletons) {
                                    vbn0Var2 = vbn0Var;
                                    str = str4;
                                    b4p0Var2 = b4p0Var;
                                    cpm0Var = cpm0Var4;
                                    dVar = this;
                                    j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var.a, str)));
                                    n2n0Var = j2n0Var;
                                    vbn0Var5 = vbn0Var2;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var2;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var5;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$4 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$7 = n2n0Var;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                                    scootersBookOfferInteractor$bookOffersTariff$1.label = 5;
                                }
                            }
                        case 1:
                            vbn0Var = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            b4p0Var = (b4p0) scootersBookOfferInteractor$bookOffersTariff$1.L$0;
                            kotlin.b.b(obj);
                            b4p0 b4p0Var6 = b4p0Var;
                            vbn0Var4 = vbn0Var;
                            n2n0Var = (n2n0) obj;
                            b4p0Var4 = b4p0Var6;
                            if (vbn0Var4 instanceof rbn0) {
                                singletonList = Collections.singletonList(((rbn0) vbn0Var4).e.h);
                            } else if (vbn0Var4 instanceof sbn0) {
                                List list2 = ((sbn0) vbn0Var4).e;
                                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((cpm0) it2.next()).h);
                                }
                                singletonList = arrayList;
                            } else {
                                if (!(vbn0Var4 instanceof ubn0)) {
                                    w511.b();
                                    return null;
                                }
                                singletonList = Collections.singletonList(((ubn0) vbn0Var4).e.h);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Integer num : singletonList) {
                                if (num != null) {
                                    arrayList2.add(num);
                                }
                            }
                            it = arrayList2.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                i += ((Number) it.next()).intValue();
                            }
                            Integer valueOf = Integer.valueOf(i);
                            if (i == 0) {
                                valueOf = null;
                            }
                            this.d.a.l(valueOf != null ? new rdn0(valueOf.intValue(), b4p0Var4.m) : null);
                            jhs jhsVar = b4p0Var4.l.c;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var4;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 7;
                            break;
                        case 2:
                            str2 = (String) scootersBookOfferInteractor$bookOffersTariff$1.L$11;
                            cpm0Var2 = (cpm0) scootersBookOfferInteractor$bookOffersTariff$1.L$8;
                            dVar = (d) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var2 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            b4p0Var2 = (b4p0) scootersBookOfferInteractor$bookOffersTariff$1.L$0;
                            kotlin.b.b(obj);
                            j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var2.a, str2)));
                            n2n0Var = j2n0Var;
                            vbn0Var5 = vbn0Var2;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var2;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var5;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$7 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 5;
                            break;
                        case 3:
                            sbn0Var = (sbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$8;
                            dVar2 = (d) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var3 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            b4p0Var3 = (b4p0) scootersBookOfferInteractor$bookOffersTariff$1.L$0;
                            kotlin.b.b(obj);
                            list = (List) obj;
                            if (!list.isEmpty()) {
                            }
                            break;
                        case 4:
                            str = (String) scootersBookOfferInteractor$bookOffersTariff$1.L$11;
                            cpm0Var = (cpm0) scootersBookOfferInteractor$bookOffersTariff$1.L$8;
                            dVar = (d) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var2 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            b4p0Var2 = (b4p0) scootersBookOfferInteractor$bookOffersTariff$1.L$0;
                            kotlin.b.b(obj);
                            j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var.a, str)));
                            n2n0Var = j2n0Var;
                            vbn0Var5 = vbn0Var2;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = b4p0Var2;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var5;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$7 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 5;
                            break;
                        case 5:
                            n2n0Var = (n2n0) scootersBookOfferInteractor$bookOffersTariff$1.L$7;
                            vbn0Var5 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            b4p0Var5 = (b4p0) scootersBookOfferInteractor$bookOffersTariff$1.L$0;
                            try {
                                kotlin.b.b(obj);
                            } catch (Throwable unused2) {
                            }
                            b4p0Var4 = b4p0Var5;
                            vbn0Var4 = vbn0Var5;
                            if (vbn0Var4 instanceof rbn0) {
                            }
                            ArrayList arrayList22 = new ArrayList();
                            while (r2.hasNext()) {
                            }
                            it = arrayList22.iterator();
                            i = 0;
                            while (it.hasNext()) {
                            }
                            Integer valueOf2 = Integer.valueOf(i);
                            if (i == 0) {
                            }
                            this.d.a.l(valueOf2 != null ? new rdn0(valueOf2.intValue(), b4p0Var4.m) : null);
                            jhs jhsVar2 = b4p0Var4.l.c;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var4;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 7;
                            break;
                        case 6:
                            kotlin.b.b(obj);
                            return obj;
                        case 7:
                            n2n0Var = (n2n0) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var4 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            kotlin.b.b(obj);
                            sco0 sco0Var = vbn0Var4.a;
                            qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var4;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 8;
                            break;
                        case 8:
                            n2n0Var = (n2n0) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var4 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            kotlin.b.b(obj);
                            sco0 sco0Var2 = vbn0Var4.a;
                            qco0 qco0Var2 = sco0Var2 instanceof qco0 ? (qco0) sco0Var2 : null;
                            if (qco0Var2 == null || (r2 = qco0Var2.i) == null) {
                                rco0 rco0Var = sco0Var2 instanceof rco0 ? (rco0) sco0Var2 : null;
                            }
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var4;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 9;
                            break;
                        case 9:
                            n2n0Var = (n2n0) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            vbn0Var4 = (vbn0) scootersBookOfferInteractor$bookOffersTariff$1.L$1;
                            kotlin.b.b(obj);
                            two0 two0Var = vbn0Var4.d;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
                            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
                            scootersBookOfferInteractor$bookOffersTariff$1.label = 10;
                            return this.n.b(two0Var, scootersBookOfferInteractor$bookOffersTariff$1) == coroutineSingletons ? coroutineSingletons : n2n0Var;
                        case 10:
                            n2n0 n2n0Var2 = (n2n0) scootersBookOfferInteractor$bookOffersTariff$1.L$4;
                            kotlin.b.b(obj);
                            return n2n0Var2;
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (scootersBookOfferInteractor$bookOffersTariff$1.label) {
            }
            b4p0Var5 = b4p0Var2;
            b4p0Var4 = b4p0Var5;
            vbn0Var4 = vbn0Var5;
            if (vbn0Var4 instanceof rbn0) {
            }
            ArrayList arrayList222 = new ArrayList();
            while (r2.hasNext()) {
            }
            it = arrayList222.iterator();
            i = 0;
            while (it.hasNext()) {
            }
            Integer valueOf22 = Integer.valueOf(i);
            if (i == 0) {
            }
            this.d.a.l(valueOf22 != null ? new rdn0(valueOf22.intValue(), b4p0Var4.m) : null);
            jhs jhsVar22 = b4p0Var4.l.c;
            scootersBookOfferInteractor$bookOffersTariff$1.L$0 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$1 = vbn0Var4;
            scootersBookOfferInteractor$bookOffersTariff$1.L$2 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$3 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$4 = n2n0Var;
            scootersBookOfferInteractor$bookOffersTariff$1.L$5 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$6 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$7 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$8 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$9 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$10 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.L$11 = null;
            scootersBookOfferInteractor$bookOffersTariff$1.label = 7;
        } catch (CancellationException e2) {
            throw e2;
        }
        scootersBookOfferInteractor$bookOffersTariff$1 = new ScootersBookOfferInteractor$bookOffersTariff$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$bookOffersTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(vj90 vj90Var, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$buyPackage$1 scootersBookOfferInteractor$buyPackage$1;
        int i;
        int i2;
        if (continuationImpl instanceof ScootersBookOfferInteractor$buyPackage$1) {
            scootersBookOfferInteractor$buyPackage$1 = (ScootersBookOfferInteractor$buyPackage$1) continuationImpl;
            int i3 = scootersBookOfferInteractor$buyPackage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersBookOfferInteractor$buyPackage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersBookOfferInteractor$buyPackage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBookOfferInteractor$buyPackage$1.label;
                ScootersPassesType scootersPassesType = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.h.a = null;
                    ywm0 ywm0Var = this.k;
                    ScootersBookOfferInteractor$buyPackage$2 scootersBookOfferInteractor$buyPackage$2 = new ScootersBookOfferInteractor$buyPackage$2(this, vj90Var, null);
                    scootersBookOfferInteractor$buyPackage$1.L$0 = vj90Var;
                    scootersBookOfferInteractor$buyPackage$1.label = 1;
                    if (ywm0Var.a(scootersBookOfferInteractor$buyPackage$2, scootersBookOfferInteractor$buyPackage$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vj90Var = (vj90) scootersBookOfferInteractor$buyPackage$1.L$0;
                    kotlin.b.b(obj);
                }
                i2 = o2n0.b[vj90Var.b.ordinal()];
                if (i2 != 1) {
                    scootersPassesType = ScootersPassesType.PACKAGES;
                } else if (i2 == 2) {
                    scootersPassesType = ScootersPassesType.SUPER_PASSES;
                }
                return new k2n0(scootersPassesType);
            }
        }
        scootersBookOfferInteractor$buyPackage$1 = new ScootersBookOfferInteractor$buyPackage$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$buyPackage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$buyPackage$1.label;
        ScootersPassesType scootersPassesType2 = null;
        if (i != 0) {
        }
        i2 = o2n0.b[vj90Var.b.ordinal()];
        if (i2 != 1) {
        }
        return new k2n0(scootersPassesType2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0060, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(Throwable th, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$handleBookError$1 scootersBookOfferInteractor$handleBookError$1;
        int i;
        int i2;
        if (continuationImpl instanceof ScootersBookOfferInteractor$handleBookError$1) {
            scootersBookOfferInteractor$handleBookError$1 = (ScootersBookOfferInteractor$handleBookError$1) continuationImpl;
            int i3 = scootersBookOfferInteractor$handleBookError$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersBookOfferInteractor$handleBookError$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersBookOfferInteractor$handleBookError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBookOfferInteractor$handleBookError$1.label;
                ru.yandex.taxi.scooters.data.mapper.c cVar = this.a;
                int i4 = 2;
                int i5 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersBookOfferInteractor$handleBookError$1.L$0 = th;
                    scootersBookOfferInteractor$handleBookError$1.label = 1;
                    obj = cVar.b(th, scootersBookOfferInteractor$handleBookError$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            String str = (String) obj;
                            return new ScootersPhotoVerificationRequiredException(new sho0(str != null ? str : "", Collections.singleton(ScootersExamType.SELFIE)));
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        String str2 = (String) obj;
                        return new ScootersPhotoVerificationRequiredException(new sho0(str2 != null ? str2 : "", j73.f0(new ScootersExamType[]{ScootersExamType.SELFIE, ScootersExamType.PASSPORT})));
                    }
                    th = (Throwable) scootersBookOfferInteractor$handleBookError$1.L$0;
                    kotlin.b.b(obj);
                }
                ScootersErrorCode scootersErrorCode = (ScootersErrorCode) obj;
                i2 = scootersErrorCode != null ? -1 : o2n0.a[scootersErrorCode.ordinal()];
                if (i2 != 1) {
                    return new ScootersInvalidPaymentMethodException();
                }
                if (i2 == 2) {
                    return new ScootersPhotoVerificationRequiredException(rho0.a);
                }
                if (i2 == 3) {
                    v1n0 v1n0Var = new v1n0(i5);
                    scootersBookOfferInteractor$handleBookError$1.L$0 = null;
                    scootersBookOfferInteractor$handleBookError$1.L$1 = null;
                    scootersBookOfferInteractor$handleBookError$1.label = 2;
                    obj = cVar.d(th, v1n0Var, scootersBookOfferInteractor$handleBookError$1);
                } else {
                    if (i2 != 4) {
                        return new ScootersBookingFailedException(scootersErrorCode);
                    }
                    v1n0 v1n0Var2 = new v1n0(i4);
                    scootersBookOfferInteractor$handleBookError$1.L$0 = null;
                    scootersBookOfferInteractor$handleBookError$1.L$1 = null;
                    scootersBookOfferInteractor$handleBookError$1.label = 3;
                    obj = cVar.d(th, v1n0Var2, scootersBookOfferInteractor$handleBookError$1);
                }
                return coroutineSingletons;
            }
        }
        scootersBookOfferInteractor$handleBookError$1 = new ScootersBookOfferInteractor$handleBookError$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$handleBookError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$handleBookError$1.label;
        ru.yandex.taxi.scooters.data.mapper.c cVar2 = this.a;
        int i42 = 2;
        int i52 = 1;
        if (i != 0) {
        }
        ScootersErrorCode scootersErrorCode2 = (ScootersErrorCode) obj2;
        if (scootersErrorCode2 != null) {
        }
        if (i2 != 1) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(5:19|20|21|22|(0)(1:25)))(3:26|27|(3:29|22|(0))(2:30|31)))(5:32|33|21|22|(0)(0)))(3:34|(1:36)|(2:38|39)(2:40|(2:42|43)(2:44|(2:46|(5:48|33|21|22|(0)))(2:49|(2:51|(3:53|27|(0)(0)))(2:54|(2:56|(5:58|20|21|22|(0)(0)))(2:59|60))))))|24))|64|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0253, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0254, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0252 A[PHI: r9
      0x0252: PHI (r9v2 'this' com.yandex.go.scooters.domain.d) = (r9v0 'this' com.yandex.go.scooters.domain.d A[IMMUTABLE_TYPE, THIS]), (r9v16 'this' com.yandex.go.scooters.domain.d) binds: [B:63:0x0252, B:23:0x024f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v15, types: [j2n0] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22, types: [j2n0] */
    /* JADX WARN: Type inference failed for: r9v15, types: [j2n0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(eer eerVar, m6a0 m6a0Var, vbn0 vbn0Var, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$handleFixTariff$1 scootersBookOfferInteractor$handleFixTariff$1;
        int i;
        cpm0 cpm0Var;
        d dVar;
        String str;
        d dVar2;
        sbn0 sbn0Var;
        cpm0 cpm0Var2;
        String str2;
        ?? j2n0Var;
        List list;
        if (continuationImpl instanceof ScootersBookOfferInteractor$handleFixTariff$1) {
            scootersBookOfferInteractor$handleFixTariff$1 = (ScootersBookOfferInteractor$handleFixTariff$1) continuationImpl;
            int i2 = scootersBookOfferInteractor$handleFixTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBookOfferInteractor$handleFixTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBookOfferInteractor$handleFixTariff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBookOfferInteractor$handleFixTariff$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar = eerVar.p;
                    if (zzsVar == null) {
                        zzsVar = null;
                    }
                    if (zzsVar != null) {
                        return new m2n0(eerVar, zzsVar, vbn0Var);
                    }
                    if (eerVar.n) {
                        return new l2n0(eerVar, vbn0Var);
                    }
                    if (vbn0Var instanceof rbn0) {
                        cpm0Var2 = ((rbn0) vbn0Var).e;
                        ScootersComeFrom scootersComeFrom = vbn0Var.b;
                        String str3 = (String) kotlin.collections.b.g(qoi0.a(eer.class), cpm0Var2.e);
                        scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$6 = this;
                        scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$9 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$10 = cpm0Var2;
                        scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$13 = str3;
                        scootersBookOfferInteractor$handleFixTariff$1.label = 1;
                        if (c(str3, scootersComeFrom, m6a0Var, scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                            dVar = this;
                            str2 = str3;
                            j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var2.a, str2)));
                            this = j2n0Var;
                            scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$6 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$9 = this;
                            scootersBookOfferInteractor$handleFixTariff$1.L$10 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$13 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.label = 4;
                            if (dVar.i(scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                            }
                        }
                    } else if (vbn0Var instanceof sbn0) {
                        sbn0 sbn0Var2 = (sbn0) vbn0Var;
                        ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1 scootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1 = new ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1(sbn0Var2, this, m6a0Var, null);
                        scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$6 = this;
                        scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$9 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$10 = sbn0Var2;
                        scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.label = 2;
                        obj = bvf0.n(scootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1, scootersBookOfferInteractor$handleFixTariff$1);
                        if (obj != coroutineSingletons) {
                            dVar2 = this;
                            sbn0Var = sbn0Var2;
                            list = (List) obj;
                            if (!list.isEmpty()) {
                            }
                        }
                    } else {
                        if (!(vbn0Var instanceof ubn0)) {
                            w511.b();
                            return null;
                        }
                        cpm0Var = ((ubn0) vbn0Var).e;
                        ScootersComeFrom scootersComeFrom2 = vbn0Var.b;
                        String str4 = (String) kotlin.collections.b.g(qoi0.a(eer.class), cpm0Var.e);
                        scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$6 = this;
                        scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$9 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$10 = cpm0Var;
                        scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                        scootersBookOfferInteractor$handleFixTariff$1.L$13 = str4;
                        scootersBookOfferInteractor$handleFixTariff$1.label = 3;
                        if (c(str4, scootersComeFrom2, m6a0Var, scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                            dVar = this;
                            str = str4;
                            j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var.a, str)));
                            this = j2n0Var;
                            scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$6 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$9 = this;
                            scootersBookOfferInteractor$handleFixTariff$1.L$10 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.L$13 = null;
                            scootersBookOfferInteractor$handleFixTariff$1.label = 4;
                            if (dVar.i(scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                            }
                        }
                    }
                } else if (i == 1) {
                    str2 = (String) scootersBookOfferInteractor$handleFixTariff$1.L$13;
                    cpm0Var2 = (cpm0) scootersBookOfferInteractor$handleFixTariff$1.L$10;
                    dVar = (d) scootersBookOfferInteractor$handleFixTariff$1.L$6;
                    kotlin.b.b(obj);
                    j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var2.a, str2)));
                    this = j2n0Var;
                    scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$6 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$9 = this;
                    scootersBookOfferInteractor$handleFixTariff$1.L$10 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$13 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.label = 4;
                    if (dVar.i(scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                    }
                } else if (i == 2) {
                    sbn0Var = (sbn0) scootersBookOfferInteractor$handleFixTariff$1.L$10;
                    dVar2 = (d) scootersBookOfferInteractor$handleFixTariff$1.L$6;
                    kotlin.b.b(obj);
                    list = (List) obj;
                    if (!list.isEmpty()) {
                        ScootersBookingFailedException scootersBookingFailedException = new ScootersBookingFailedException(null);
                        zgz.a("Booking of all " + sbn0Var.e.size() + " scooters is failed", scootersBookingFailedException);
                        throw scootersBookingFailedException;
                    }
                    dVar = dVar2;
                    this = new j2n0(list);
                    scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$6 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$9 = this;
                    scootersBookOfferInteractor$handleFixTariff$1.L$10 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$13 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.label = 4;
                    if (dVar.i(scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n2n0 n2n0Var = (n2n0) scootersBookOfferInteractor$handleFixTariff$1.L$9;
                        kotlin.b.b(obj);
                        return n2n0Var;
                    }
                    str = (String) scootersBookOfferInteractor$handleFixTariff$1.L$13;
                    cpm0Var = (cpm0) scootersBookOfferInteractor$handleFixTariff$1.L$10;
                    dVar = (d) scootersBookOfferInteractor$handleFixTariff$1.L$6;
                    kotlin.b.b(obj);
                    j2n0Var = new j2n0(Collections.singletonList(new e3n0(cpm0Var.a, str)));
                    this = j2n0Var;
                    scootersBookOfferInteractor$handleFixTariff$1.L$0 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$1 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$2 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$3 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$4 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$5 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$6 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$7 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$8 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$9 = this;
                    scootersBookOfferInteractor$handleFixTariff$1.L$10 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$11 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$12 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.L$13 = null;
                    scootersBookOfferInteractor$handleFixTariff$1.label = 4;
                    if (dVar.i(scootersBookOfferInteractor$handleFixTariff$1) != coroutineSingletons) {
                        return this;
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersBookOfferInteractor$handleFixTariff$1 = new ScootersBookOfferInteractor$handleFixTariff$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$handleFixTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$handleFixTariff$1.label;
        if (i != 0) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0067, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons h(Throwable th, ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$throwBookError$1 scootersBookOfferInteractor$throwBookError$1;
        int i;
        qkn0 qkn0Var;
        Throwable scootersDriverLicenseVerificationRequiredException;
        Throwable th2;
        qkn0 qkn0Var2;
        if (continuationImpl instanceof ScootersBookOfferInteractor$throwBookError$1) {
            scootersBookOfferInteractor$throwBookError$1 = (ScootersBookOfferInteractor$throwBookError$1) continuationImpl;
            int i2 = scootersBookOfferInteractor$throwBookError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBookOfferInteractor$throwBookError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBookOfferInteractor$throwBookError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBookOfferInteractor$throwBookError$1.label;
                ru.yandex.taxi.scooters.data.mapper.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersBookOfferInteractor$throwBookError$1.L$0 = th;
                    scootersBookOfferInteractor$throwBookError$1.label = 1;
                    obj = cVar.e(th, scootersBookOfferInteractor$throwBookError$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qkn0Var2 = (qkn0) scootersBookOfferInteractor$throwBookError$1.L$3;
                            th2 = (Throwable) scootersBookOfferInteractor$throwBookError$1.L$2;
                            kotlin.b.b(obj);
                            throw new ScootersBookingException(th2, qkn0Var2, (pjn0) obj);
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        throw ((Throwable) obj);
                    }
                    th = (Throwable) scootersBookOfferInteractor$throwBookError$1.L$0;
                    kotlin.b.b(obj);
                }
                qkn0Var = (qkn0) obj;
                if (qkn0Var == null) {
                    if (qkn0Var instanceof mkn0) {
                        ScootersErrorCode scootersErrorCode = ((mkn0) qkn0Var).a;
                        int i3 = o2n0.a[scootersErrorCode.ordinal()];
                        scootersDriverLicenseVerificationRequiredException = i3 != 1 ? i3 != 2 ? new ScootersBookingFailedException(scootersErrorCode) : new ScootersPhotoVerificationRequiredException(rho0.a) : new ScootersInvalidPaymentMethodException();
                    } else if (qkn0Var instanceof okn0) {
                        scootersDriverLicenseVerificationRequiredException = new ScootersPhotoVerificationRequiredException(new sho0(((okn0) qkn0Var).a, Collections.singleton(ScootersExamType.SELFIE)));
                    } else if (qkn0Var instanceof pkn0) {
                        scootersDriverLicenseVerificationRequiredException = new ScootersPhotoVerificationRequiredException(new sho0(((pkn0) qkn0Var).a, j73.f0(new ScootersExamType[]{ScootersExamType.SELFIE, ScootersExamType.PASSPORT})));
                    } else {
                        if (!(qkn0Var instanceof nkn0)) {
                            w511.b();
                            return null;
                        }
                        nkn0 nkn0Var = (nkn0) qkn0Var;
                        scootersDriverLicenseVerificationRequiredException = new ScootersDriverLicenseVerificationRequiredException(nkn0Var.a, nkn0Var.b);
                    }
                    scootersBookOfferInteractor$throwBookError$1.L$0 = null;
                    scootersBookOfferInteractor$throwBookError$1.L$1 = null;
                    scootersBookOfferInteractor$throwBookError$1.L$2 = scootersDriverLicenseVerificationRequiredException;
                    scootersBookOfferInteractor$throwBookError$1.L$3 = qkn0Var;
                    scootersBookOfferInteractor$throwBookError$1.label = 2;
                    Object a = cVar.a(th, scootersBookOfferInteractor$throwBookError$1);
                    if (a != coroutineSingletons) {
                        th2 = scootersDriverLicenseVerificationRequiredException;
                        qkn0Var2 = qkn0Var;
                        obj = a;
                        throw new ScootersBookingException(th2, qkn0Var2, (pjn0) obj);
                    }
                } else {
                    scootersBookOfferInteractor$throwBookError$1.L$0 = null;
                    scootersBookOfferInteractor$throwBookError$1.L$1 = null;
                    scootersBookOfferInteractor$throwBookError$1.label = 3;
                    obj = f(th, scootersBookOfferInteractor$throwBookError$1);
                }
                return coroutineSingletons;
            }
        }
        scootersBookOfferInteractor$throwBookError$1 = new ScootersBookOfferInteractor$throwBookError$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$throwBookError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$throwBookError$1.label;
        ru.yandex.taxi.scooters.data.mapper.c cVar2 = this.a;
        if (i != 0) {
        }
        qkn0Var = (qkn0) obj2;
        if (qkn0Var == null) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ScootersBookOfferInteractor$tryRequestSessionState$1 scootersBookOfferInteractor$tryRequestSessionState$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersBookOfferInteractor$tryRequestSessionState$1) {
                scootersBookOfferInteractor$tryRequestSessionState$1 = (ScootersBookOfferInteractor$tryRequestSessionState$1) continuationImpl;
                int i2 = scootersBookOfferInteractor$tryRequestSessionState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersBookOfferInteractor$tryRequestSessionState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersBookOfferInteractor$tryRequestSessionState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersBookOfferInteractor$tryRequestSessionState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.scooters.domain.e eVar = this.i;
                        scootersBookOfferInteractor$tryRequestSessionState$1.label = 1;
                        obj = eVar.a.a(scootersBookOfferInteractor$tryRequestSessionState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        scootersBookOfferInteractor$tryRequestSessionState$1 = new ScootersBookOfferInteractor$tryRequestSessionState$1(this, continuationImpl);
        Object obj2 = scootersBookOfferInteractor$tryRequestSessionState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBookOfferInteractor$tryRequestSessionState$1.label;
    }
}
