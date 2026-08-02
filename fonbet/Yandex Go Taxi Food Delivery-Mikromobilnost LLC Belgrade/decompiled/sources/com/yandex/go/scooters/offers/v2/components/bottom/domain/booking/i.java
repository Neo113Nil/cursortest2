package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.subscription.upsale_on_book.data.model.ScootersSubscriptionUpsaleOnBookExperiment;
import defpackage.a0p0;
import defpackage.a4o0;
import defpackage.a60;
import defpackage.ayo0;
import defpackage.azo0;
import defpackage.byo0;
import defpackage.bzo0;
import defpackage.cyo0;
import defpackage.d7n0;
import defpackage.dvw;
import defpackage.dzo0;
import defpackage.e7n0;
import defpackage.eyo0;
import defpackage.ezo0;
import defpackage.fyo0;
import defpackage.gyo0;
import defpackage.h7n0;
import defpackage.hyo0;
import defpackage.j18;
import defpackage.jl40;
import defpackage.jyo0;
import defpackage.kxo0;
import defpackage.lyo0;
import defpackage.m950;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.nyo0;
import defpackage.oyo0;
import defpackage.pyo0;
import defpackage.qv10;
import defpackage.qyo0;
import defpackage.r95;
import defpackage.si3;
import defpackage.two0;
import defpackage.uem;
import defpackage.v770;
import defpackage.vyo0;
import defpackage.w511;
import defpackage.y5n0;
import defpackage.z2o0;
import defpackage.zgz;
import defpackage.znn0;
import defpackage.zy11;
import defpackage.zyo0;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class i extends r95 {
    public final n6n0 b;
    public final znn0 c;
    public final z2o0 d;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a e;
    public final a4o0 f;
    public final com.yandex.go.scooters.subscription.domain.a g;
    public final vyo0 h;
    public final com.yandex.go.scooters.subscription.upsale_on_book.data.a i;
    public final com.yandex.go.scooters.subscription.domain.d j;
    public final dzo0 k;

    public i(n6n0 n6n0Var, znn0 znn0Var, z2o0 z2o0Var, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, a4o0 a4o0Var, com.yandex.go.scooters.subscription.domain.a aVar2, vyo0 vyo0Var, com.yandex.go.scooters.subscription.upsale_on_book.data.a aVar3, com.yandex.go.scooters.subscription.domain.d dVar, dzo0 dzo0Var) {
        this.b = n6n0Var;
        this.c = znn0Var;
        this.d = z2o0Var;
        this.e = aVar;
        this.f = a4o0Var;
        this.g = aVar2;
        this.h = vyo0Var;
        this.i = aVar3;
        this.j = dVar;
        this.k = dzo0Var;
    }

    public static final zyo0 c(i iVar, cyo0 cyo0Var) {
        if (!(cyo0Var instanceof byo0)) {
            if (jl40.l(cyo0Var, ayo0.a)) {
                return zyo0.a;
            }
            w511.b();
            return null;
        }
        n6n0 n6n0Var = iVar.b;
        String str = ((byo0) cyo0Var).a;
        ((a60) ((h7n0) n6n0Var).b.G).c(str, v770.x);
        return zyo0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0140, code lost:
    
        if (r13 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        if (r13 != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        if (r13 == r2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$handle$1 scootersSubscriptionUpsaleBookHandler$handle$1;
        a0p0 a0p0Var;
        two0 two0Var;
        com.yandex.go.scooters.subscription.upsale_on_book.data.a aVar;
        a0p0 a0p0Var2;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$handle$1) {
            scootersSubscriptionUpsaleBookHandler$handle$1 = (ScootersSubscriptionUpsaleBookHandler$handle$1) continuationImpl;
            int i = scootersSubscriptionUpsaleBookHandler$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$handle$1.label = i - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleBookHandler$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersSubscriptionUpsaleBookHandler$handle$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        y5n0 a = this.d.a();
                        a0p0 a2 = (a == null || (two0Var = a.j.d) == null) ? null : two0Var.a();
                        if (a2 != null) {
                            scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = a2;
                            scootersSubscriptionUpsaleBookHandler$handle$1.label = 1;
                            Object f = f(scootersSubscriptionUpsaleBookHandler$handle$1);
                            if (f != obj2) {
                                a0p0Var = a2;
                                obj = f;
                                if (((Boolean) obj).booleanValue()) {
                                    this.c.a = false;
                                    aVar = this.i;
                                    dzo0 dzo0Var = this.k;
                                    scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = a0p0Var;
                                    scootersSubscriptionUpsaleBookHandler$handle$1.L$1 = aVar;
                                    scootersSubscriptionUpsaleBookHandler$handle$1.label = 2;
                                    obj = dzo0Var.a.b(scootersSubscriptionUpsaleBookHandler$handle$1);
                                    break;
                                }
                            }
                        }
                        scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = null;
                        scootersSubscriptionUpsaleBookHandler$handle$1.label = 8;
                        Object a3 = super.a(scootersSubscriptionUpsaleBookHandler$handle$1);
                        return a3 != obj2 ? obj2 : a3;
                    case 1:
                        a0p0 a0p0Var3 = (a0p0) scootersSubscriptionUpsaleBookHandler$handle$1.L$0;
                        kotlin.b.b(obj);
                        a0p0Var = a0p0Var3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = null;
                        scootersSubscriptionUpsaleBookHandler$handle$1.label = 8;
                        Object a32 = super.a(scootersSubscriptionUpsaleBookHandler$handle$1);
                        if (a32 != obj2) {
                        }
                        break;
                    case 2:
                        aVar = (com.yandex.go.scooters.subscription.upsale_on_book.data.a) scootersSubscriptionUpsaleBookHandler$handle$1.L$1;
                        a0p0Var = (a0p0) scootersSubscriptionUpsaleBookHandler$handle$1.L$0;
                        kotlin.b.b(obj);
                        String str = ((ScootersSubscriptionUpsaleOnBookExperiment) obj).c;
                        scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = a0p0Var;
                        scootersSubscriptionUpsaleBookHandler$handle$1.L$1 = null;
                        scootersSubscriptionUpsaleBookHandler$handle$1.label = 3;
                        if (aVar.e(str, scootersSubscriptionUpsaleBookHandler$handle$1) != obj2) {
                            a0p0Var2 = a0p0Var;
                            scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = a0p0Var2;
                            scootersSubscriptionUpsaleBookHandler$handle$1.label = 4;
                            j18 j18Var = new j18(1, dvw.b(scootersSubscriptionUpsaleBookHandler$handle$1));
                            j18Var.u();
                            n6n0 n6n0Var = this.b;
                            uem uemVar = new uem(j18Var, 12);
                            uem uemVar2 = new uem(j18Var, 13);
                            uem uemVar3 = new uem(j18Var, 14);
                            com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) n6n0Var).b;
                            gVar.A((m950) gVar.n0.get(), new ezo0(a0p0Var2), new e7n0(uemVar, uemVar2, uemVar3));
                            obj = j18Var.s();
                            break;
                        }
                    case 3:
                        a0p0Var2 = (a0p0) scootersSubscriptionUpsaleBookHandler$handle$1.L$0;
                        kotlin.b.b(obj);
                        scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = a0p0Var2;
                        scootersSubscriptionUpsaleBookHandler$handle$1.label = 4;
                        j18 j18Var2 = new j18(1, dvw.b(scootersSubscriptionUpsaleBookHandler$handle$1));
                        j18Var2.u();
                        n6n0 n6n0Var2 = this.b;
                        uem uemVar4 = new uem(j18Var2, 12);
                        uem uemVar22 = new uem(j18Var2, 13);
                        uem uemVar32 = new uem(j18Var2, 14);
                        com.yandex.go.scooters.offers.v2.g gVar2 = ((h7n0) n6n0Var2).b;
                        gVar2.A((m950) gVar2.n0.get(), new ezo0(a0p0Var2), new e7n0(uemVar4, uemVar22, uemVar32));
                        obj = j18Var2.s();
                        break;
                    case 4:
                        a0p0Var2 = (a0p0) scootersSubscriptionUpsaleBookHandler$handle$1.L$0;
                        kotlin.b.b(obj);
                        azo0 azo0Var = (azo0) obj;
                        if (!jl40.l(azo0Var, azo0.a)) {
                            if (jl40.l(azo0Var, azo0.c)) {
                                scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = null;
                                scootersSubscriptionUpsaleBookHandler$handle$1.label = 5;
                                if (super.a(scootersSubscriptionUpsaleBookHandler$handle$1) == obj2) {
                                }
                            } else {
                                if (!jl40.l(azo0Var, azo0.b)) {
                                    w511.b();
                                    return null;
                                }
                                scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = null;
                                scootersSubscriptionUpsaleBookHandler$handle$1.label = 6;
                                obj = h(a0p0Var2, scootersSubscriptionUpsaleBookHandler$handle$1);
                                break;
                            }
                        }
                        return zy11Var;
                    case 5:
                    case 7:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 6:
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            scootersSubscriptionUpsaleBookHandler$handle$1.L$0 = null;
                            scootersSubscriptionUpsaleBookHandler$handle$1.label = 7;
                            if (super.a(scootersSubscriptionUpsaleBookHandler$handle$1) == obj2) {
                            }
                        }
                        return zy11Var;
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersSubscriptionUpsaleBookHandler$handle$1 = new ScootersSubscriptionUpsaleBookHandler$handle$1(this, continuationImpl);
        Object obj3 = scootersSubscriptionUpsaleBookHandler$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersSubscriptionUpsaleBookHandler$handle$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(eyo0 eyo0Var, ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$handlePurchaseError$1 scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1;
        int i;
        zyo0 zyo0Var;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$handlePurchaseError$1) {
            scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1 = (ScootersSubscriptionUpsaleBookHandler$handlePurchaseError$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = ((com.yandex.go.scooters.subscription.data.b) this.h).b;
                    r0Var.getClass();
                    r0Var.m(null, jyo0.a);
                    if (eyo0Var == null) {
                        return Boolean.TRUE;
                    }
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.L$0 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1));
                    j18Var.u();
                    uem uemVar = new uem(j18Var, 10);
                    bzo0 bzo0Var = new bzo0(j18Var, this, 0);
                    bzo0 bzo0Var2 = new bzo0(j18Var, this, 1);
                    com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) this.b).b;
                    gVar.A((m950) gVar.o0.get(), new kxo0(eyo0Var), new d7n0(uemVar, bzo0Var, bzo0Var2));
                    obj = j18Var.s();
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
                zyo0Var = (zyo0) obj;
                if (!jl40.l(zyo0Var, zyo0.a)) {
                    z = true;
                } else {
                    if (!jl40.l(zyo0Var, zyo0.b)) {
                        w511.b();
                        return null;
                    }
                    this.f.a(zy11.a);
                }
                return Boolean.valueOf(z);
            }
        }
        scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1 = new ScootersSubscriptionUpsaleBookHandler$handlePurchaseError$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleBookHandler$handlePurchaseError$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        zyo0Var = (zyo0) obj2;
        if (!jl40.l(zyo0Var, zyo0.a)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, kotlin.Result] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1 scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1;
        int i;
        y5n0 a;
        Ref$ObjectRef ref$ObjectRef;
        Object obj;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        boolean z;
        Result result;
        boolean z2;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1) {
            scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1 = (ScootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label;
                if (i != 0) {
                    Ref$ObjectRef z3 = qv10.z(obj2);
                    com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar2 = this.e;
                    a = aVar2.a.a();
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0 = z3;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$1 = aVar2;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$2 = a;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label = 1;
                    Object a2 = this.j.a(scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1);
                    if (a2 != obj3) {
                        ref$ObjectRef = z3;
                        obj = a2;
                        aVar = aVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            z2 = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.Z$0;
                            kotlin.b.b(obj2);
                            return Boolean.valueOf(z2);
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0;
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    result = (Result) ref$ObjectRef.element;
                    if (result == null) {
                        zgz.a(null, new IllegalStateException("Purchase result is missing"));
                        return Boolean.FALSE;
                    }
                    Throwable a3 = Result.a(result.getValue());
                    if (a3 != null) {
                        throw a3;
                    }
                    Object value = result.getValue();
                    if (value instanceof Result.Failure) {
                        value = null;
                    }
                    qyo0 qyo0Var = (qyo0) value;
                    if (qyo0Var == null) {
                        return Boolean.FALSE;
                    }
                    if (qyo0Var instanceof pyo0) {
                        eyo0 eyo0Var = ((pyo0) qyo0Var).a;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0 = null;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$1 = null;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$2 = null;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$3 = null;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.Z$0 = booleanValue;
                        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label = 3;
                        if ((eyo0Var == null ? zy11.a : g(eyo0Var, scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1)) != obj3) {
                            z2 = booleanValue;
                            return Boolean.valueOf(z2);
                        }
                    }
                    if (!(qyo0Var instanceof nyo0)) {
                        if (!(qyo0Var instanceof oyo0)) {
                            w511.b();
                            return null;
                        }
                        zgz.a(null, new IllegalStateException("Purchase result is not success or error here"));
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                    eyo0 eyo0Var2 = ((nyo0) qyo0Var).a;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$1 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$2 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$3 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.Z$0 = booleanValue;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label = 4;
                    Object d = d(eyo0Var2, scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1);
                    return d == obj3 ? obj3 : d;
                }
                y5n0 y5n0Var = (y5n0) scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$2;
                aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$1;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                a = y5n0Var;
                ref$ObjectRef = ref$ObjectRef2;
                ref$ObjectRef.element = new Result(obj);
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                z = obj instanceof pyo0;
                if (z) {
                    obj2 = Boolean.FALSE;
                } else {
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$0 = ref$ObjectRef;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$1 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.L$2 = null;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.Z$0 = z;
                    scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label = 2;
                    obj2 = com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(aVar, a, scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1);
                }
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                result = (Result) ref$ObjectRef.element;
                if (result == null) {
                }
            }
        }
        scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1 = new ScootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1(this, continuationImpl);
        Object obj22 = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleBookHandler$handlePurchaseStatusResult$1.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = new Result(obj);
        if (obj instanceof Result.Failure) {
        }
        z = obj instanceof pyo0;
        if (z) {
        }
        boolean booleanValue22 = ((Boolean) obj22).booleanValue();
        result = (Result) ref$ObjectRef.element;
        if (result == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$needToShow$1 scootersSubscriptionUpsaleBookHandler$needToShow$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$needToShow$1) {
            scootersSubscriptionUpsaleBookHandler$needToShow$1 = (ScootersSubscriptionUpsaleBookHandler$needToShow$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleBookHandler$needToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$needToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleBookHandler$needToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleBookHandler$needToShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dzo0 dzo0Var = this.k;
                    scootersSubscriptionUpsaleBookHandler$needToShow$1.label = 1;
                    obj = dzo0Var.a.b(scootersSubscriptionUpsaleBookHandler$needToShow$1);
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
                ScootersSubscriptionUpsaleOnBookExperiment scootersSubscriptionUpsaleOnBookExperiment = (ScootersSubscriptionUpsaleOnBookExperiment) obj;
                if (this.c.a || !scootersSubscriptionUpsaleOnBookExperiment.b) {
                    return Boolean.FALSE;
                }
                com.yandex.go.scooters.subscription.upsale_on_book.data.a aVar = this.i;
                String str = scootersSubscriptionUpsaleOnBookExperiment.c;
                List list = scootersSubscriptionUpsaleOnBookExperiment.d;
                scootersSubscriptionUpsaleBookHandler$needToShow$1.L$0 = null;
                scootersSubscriptionUpsaleBookHandler$needToShow$1.label = 2;
                Object c = aVar.c(str, list, scootersSubscriptionUpsaleBookHandler$needToShow$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        scootersSubscriptionUpsaleBookHandler$needToShow$1 = new ScootersSubscriptionUpsaleBookHandler$needToShow$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleBookHandler$needToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleBookHandler$needToShow$1.label;
        if (i != 0) {
        }
        ScootersSubscriptionUpsaleOnBookExperiment scootersSubscriptionUpsaleOnBookExperiment2 = (ScootersSubscriptionUpsaleOnBookExperiment) obj2;
        if (this.c.a) {
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(eyo0 eyo0Var, ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1 scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1) {
            scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1 = (ScootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.L$0 = eyo0Var;
                    scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1));
                    j18Var.u();
                    uem uemVar = new uem(j18Var, 11);
                    si3 si3Var = new si3(j18Var, 15);
                    si3 si3Var2 = new si3(j18Var, 16);
                    com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) this.b).b;
                    gVar.A((m950) gVar.o0.get(), new kxo0(eyo0Var), new d7n0(uemVar, si3Var, si3Var2));
                    if (j18Var.s() == coroutineSingletons) {
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
        scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1 = new ScootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleBookHandler$openPurchaseSuccessWindow$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(a0p0 a0p0Var, ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1 scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1;
        int i;
        hyo0 hyo0Var;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1) {
            scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1 = (ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.serialization.json.c cVar = a0p0Var.i;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.L$0 = null;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label = 1;
                    obj = this.g.a(cVar, scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                hyo0Var = (hyo0) obj;
                if (!(hyo0Var instanceof gyo0)) {
                    String str = ((gyo0) hyo0Var).a;
                    com.yandex.go.scooters.subscription.domain.d dVar = this.j;
                    ((com.yandex.go.scooters.subscription.data.b) dVar.b).a(new lyo0(str));
                    dVar.a.d("subscription", str);
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.L$0 = null;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.L$1 = null;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label = 2;
                    Object e = e(scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1);
                    if (e != obj2) {
                        return e;
                    }
                } else {
                    if (!(hyo0Var instanceof fyo0)) {
                        w511.b();
                        return null;
                    }
                    eyo0 eyo0Var = ((fyo0) hyo0Var).a;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.L$0 = null;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.L$1 = null;
                    scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label = 3;
                    Object d = d(eyo0Var, scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1);
                    if (d != obj2) {
                        return d;
                    }
                }
                return obj2;
            }
        }
        scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1 = new ScootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1(this, continuationImpl);
        Object obj3 = scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleBookHandler$startNativePurchaseFlow$1.label;
        if (i != 0) {
        }
        hyo0Var = (hyo0) obj3;
        if (!(hyo0Var instanceof gyo0)) {
        }
        return obj22;
    }
}
