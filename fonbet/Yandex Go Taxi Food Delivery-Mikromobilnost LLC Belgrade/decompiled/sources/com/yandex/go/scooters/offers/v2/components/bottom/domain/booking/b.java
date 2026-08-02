package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.domain.r;
import defpackage.b4p0;
import defpackage.cun0;
import defpackage.dvw;
import defpackage.fef;
import defpackage.h7n0;
import defpackage.ihs;
import defpackage.j18;
import defpackage.jhs;
import defpackage.m950;
import defpackage.n3o0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.r95;
import defpackage.uem;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.z6n0;
import defpackage.znn0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b extends r95 {
    public final n6n0 b;
    public final y5p0 c;
    public final r d;
    public final znn0 e;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a f;
    public final com.yandex.go.scooters.insurance.data.c g;

    public b(n6n0 n6n0Var, y5p0 y5p0Var, r rVar, znn0 znn0Var, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, com.yandex.go.scooters.insurance.data.c cVar) {
        this.b = n6n0Var;
        this.c = y5p0Var;
        this.d = rVar;
        this.e = znn0Var;
        this.f = aVar;
        this.g = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0162, code lost:
    
        if (com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(r7, r4, r2) == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersInsuranceUpsaleBookHandler$handle$1 scootersInsuranceUpsaleBookHandler$handle$1;
        Object obj;
        Object obj2;
        int i;
        b4p0 b4p0Var;
        n3o0 n3o0Var;
        ihs ihsVar;
        n3o0 n3o0Var2;
        b4p0 b4p0Var2;
        Object s;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 y5n0Var;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersInsuranceUpsaleBookHandler$handle$1) {
            scootersInsuranceUpsaleBookHandler$handle$1 = (ScootersInsuranceUpsaleBookHandler$handle$1) continuationImpl;
            int i2 = scootersInsuranceUpsaleBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceUpsaleBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceUpsaleBookHandler$handle$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceUpsaleBookHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b4p0 a = this.c.a();
                    n3o0 n3o0Var3 = a != null ? a.l : null;
                    jhs jhsVar = n3o0Var3 != null ? n3o0Var3.c : null;
                    ihs ihsVar2 = jhsVar instanceof ihs ? (ihs) jhsVar : null;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$0 = a;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$1 = n3o0Var3;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$2 = ihsVar2;
                    scootersInsuranceUpsaleBookHandler$handle$1.label = 1;
                    Object d = d(ihsVar2, scootersInsuranceUpsaleBookHandler$handle$1);
                    if (d != obj2) {
                        b4p0Var = a;
                        obj = d;
                        ihs ihsVar3 = ihsVar2;
                        n3o0Var = n3o0Var3;
                        ihsVar = ihsVar3;
                    }
                }
                if (i == 1) {
                    ihsVar = (ihs) scootersInsuranceUpsaleBookHandler$handle$1.L$2;
                    n3o0Var = (n3o0) scootersInsuranceUpsaleBookHandler$handle$1.L$1;
                    b4p0Var = (b4p0) scootersInsuranceUpsaleBookHandler$handle$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        n3o0Var2 = (n3o0) scootersInsuranceUpsaleBookHandler$handle$1.L$1;
                        b4p0Var2 = (b4p0) scootersInsuranceUpsaleBookHandler$handle$1.L$0;
                        kotlin.b.b(obj);
                        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar2 = this.f;
                        y5n0 a2 = aVar2.a.a();
                        fef fefVar = b4p0Var2.m;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$3 = aVar2;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$4 = a2;
                        scootersInsuranceUpsaleBookHandler$handle$1.label = 3;
                        j18 j18Var = new j18(1, dvw.b(scootersInsuranceUpsaleBookHandler$handle$1));
                        j18Var.u();
                        n6n0 n6n0Var = this.b;
                        uem uemVar = new uem(j18Var, 2);
                        uem uemVar2 = new uem(j18Var, 3);
                        com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) n6n0Var).b;
                        gVar.A((m950) gVar.l0.get(), new cun0(n3o0Var2, fefVar), new z6n0(uemVar2, uemVar));
                        s = j18Var.s();
                        if (s != obj2) {
                            aVar = aVar2;
                            obj = s;
                            y5n0Var = a2;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                            scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                            scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                            scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                            scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
                            scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
                            scootersInsuranceUpsaleBookHandler$handle$1.label = 5;
                            Object a3 = super.a(scootersInsuranceUpsaleBookHandler$handle$1);
                            if (a3 == obj2) {
                            }
                        }
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.label = 5;
                        Object a32 = super.a(scootersInsuranceUpsaleBookHandler$handle$1);
                        return a32 == obj2 ? obj2 : a32;
                    }
                    y5n0Var = (y5n0) scootersInsuranceUpsaleBookHandler$handle$1.L$4;
                    aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersInsuranceUpsaleBookHandler$handle$1.L$3;
                    kotlin.b.b(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.Z$0 = booleanValue;
                        scootersInsuranceUpsaleBookHandler$handle$1.label = 4;
                    }
                    scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.label = 5;
                    Object a322 = super.a(scootersInsuranceUpsaleBookHandler$handle$1);
                    if (a322 == obj2) {
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    this.e.a = false;
                    com.yandex.go.scooters.insurance.data.c cVar = this.g;
                    String str = ihsVar.a;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$0 = b4p0Var;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$1 = n3o0Var;
                    scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                    scootersInsuranceUpsaleBookHandler$handle$1.label = 2;
                    if (cVar.f(str, scootersInsuranceUpsaleBookHandler$handle$1) != obj2) {
                        n3o0Var2 = n3o0Var;
                        b4p0Var2 = b4p0Var;
                        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar22 = this.f;
                        y5n0 a22 = aVar22.a.a();
                        fef fefVar2 = b4p0Var2.m;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$3 = aVar22;
                        scootersInsuranceUpsaleBookHandler$handle$1.L$4 = a22;
                        scootersInsuranceUpsaleBookHandler$handle$1.label = 3;
                        j18 j18Var2 = new j18(1, dvw.b(scootersInsuranceUpsaleBookHandler$handle$1));
                        j18Var2.u();
                        n6n0 n6n0Var2 = this.b;
                        uem uemVar3 = new uem(j18Var2, 2);
                        uem uemVar22 = new uem(j18Var2, 3);
                        com.yandex.go.scooters.offers.v2.g gVar2 = ((h7n0) n6n0Var2).b;
                        gVar2.A((m950) gVar2.l0.get(), new cun0(n3o0Var2, fefVar2), new z6n0(uemVar22, uemVar3));
                        s = j18Var2.s();
                        if (s != obj2) {
                        }
                    }
                }
                scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
                scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
                scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
                scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
                scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
                scootersInsuranceUpsaleBookHandler$handle$1.label = 5;
                Object a3222 = super.a(scootersInsuranceUpsaleBookHandler$handle$1);
                if (a3222 == obj2) {
                }
            }
        }
        scootersInsuranceUpsaleBookHandler$handle$1 = new ScootersInsuranceUpsaleBookHandler$handle$1(this, continuationImpl);
        obj = scootersInsuranceUpsaleBookHandler$handle$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceUpsaleBookHandler$handle$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        scootersInsuranceUpsaleBookHandler$handle$1.L$0 = null;
        scootersInsuranceUpsaleBookHandler$handle$1.L$1 = null;
        scootersInsuranceUpsaleBookHandler$handle$1.L$2 = null;
        scootersInsuranceUpsaleBookHandler$handle$1.L$3 = null;
        scootersInsuranceUpsaleBookHandler$handle$1.L$4 = null;
        scootersInsuranceUpsaleBookHandler$handle$1.label = 5;
        Object a32222 = super.a(scootersInsuranceUpsaleBookHandler$handle$1);
        if (a32222 == obj2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1 scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1) {
            scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1 = (ScootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1) continuationImpl;
            int i2 = scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label;
                r rVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label = 1;
                    obj = rVar.g(scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.TRUE;
                }
                scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label = 2;
                Object h = rVar.h(scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1);
                return h == coroutineSingletons ? coroutineSingletons : h;
            }
        }
        scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1 = new ScootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1(this, continuationImpl);
        obj = scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceUpsaleBookHandler$isProperInsuranceVersionEnabled$1.label;
        r rVar2 = this.d;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ihs ihsVar, ContinuationImpl continuationImpl) {
        ScootersInsuranceUpsaleBookHandler$needToShowUpsale$1 scootersInsuranceUpsaleBookHandler$needToShowUpsale$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersInsuranceUpsaleBookHandler$needToShowUpsale$1) {
            scootersInsuranceUpsaleBookHandler$needToShowUpsale$1 = (ScootersInsuranceUpsaleBookHandler$needToShowUpsale$1) continuationImpl;
            int i2 = scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.e.a && ihsVar != null) {
                        com.yandex.go.scooters.insurance.data.c cVar = this.g;
                        scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.L$0 = null;
                        scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label = 1;
                        obj = cVar.d(ihsVar, scootersInsuranceUpsaleBookHandler$needToShowUpsale$1);
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.L$0 = null;
                    scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label = 2;
                    Object c = c(scootersInsuranceUpsaleBookHandler$needToShowUpsale$1);
                    return c == obj2 ? obj2 : c;
                }
                return Boolean.FALSE;
            }
        }
        scootersInsuranceUpsaleBookHandler$needToShowUpsale$1 = new ScootersInsuranceUpsaleBookHandler$needToShowUpsale$1(this, continuationImpl);
        obj = scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceUpsaleBookHandler$needToShowUpsale$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.FALSE;
    }
}
