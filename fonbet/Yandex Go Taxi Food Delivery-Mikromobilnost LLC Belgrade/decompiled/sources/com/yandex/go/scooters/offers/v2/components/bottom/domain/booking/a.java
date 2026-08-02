package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.domain.r;
import com.yandex.go.scooters.insurance.model.ScootersDisableInsuranceResult;
import defpackage.b4p0;
import defpackage.dvw;
import defpackage.h7n0;
import defpackage.j18;
import defpackage.m950;
import defpackage.msb1;
import defpackage.n3o0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.ptn0;
import defpackage.r95;
import defpackage.si3;
import defpackage.uhn0;
import defpackage.w511;
import defpackage.x1o0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.znn0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class a extends r95 {
    public final n6n0 b;
    public final y5p0 c;
    public final znn0 d;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a e;
    public final r f;

    public a(n6n0 n6n0Var, y5p0 y5p0Var, znn0 znn0Var, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, r rVar) {
        this.b = n6n0Var;
        this.c = y5p0Var;
        this.d = znn0Var;
        this.e = aVar;
        this.f = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r1 == r4) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.yandex.go.scooters.insurance.model.ScootersDisableInsuranceResult] */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersDisableInsuranceBookHandler$handle$1 scootersDisableInsuranceBookHandler$handle$1;
        n3o0 n3o0Var;
        Object obj;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 a;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        Ref$ObjectRef ref$ObjectRef2;
        boolean z;
        Ref$ObjectRef ref$ObjectRef3;
        Object obj2;
        int i;
        Object obj3;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersDisableInsuranceBookHandler$handle$1) {
            scootersDisableInsuranceBookHandler$handle$1 = (ScootersDisableInsuranceBookHandler$handle$1) continuationImpl;
            int i2 = scootersDisableInsuranceBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDisableInsuranceBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = scootersDisableInsuranceBookHandler$handle$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = 2;
                switch (scootersDisableInsuranceBookHandler$handle$1.label) {
                    case 0:
                        kotlin.b.b(obj4);
                        b4p0 a2 = this.c.a();
                        n3o0Var = a2 != null ? a2.l : null;
                        if (this.d.a) {
                            r rVar = this.f;
                            scootersDisableInsuranceBookHandler$handle$1.L$0 = n3o0Var;
                            scootersDisableInsuranceBookHandler$handle$1.label = 1;
                            Object b = rVar.b(n3o0Var, true, scootersDisableInsuranceBookHandler$handle$1);
                            obj = b;
                            break;
                        }
                        scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                        scootersDisableInsuranceBookHandler$handle$1.label = 2;
                        return super.a(scootersDisableInsuranceBookHandler$handle$1) != obj5 ? obj5 : zy11Var;
                    case 1:
                        n3o0Var = (n3o0) scootersDisableInsuranceBookHandler$handle$1.L$0;
                        kotlin.b.b(obj4);
                        obj = obj4;
                        if (obj != null) {
                            this.d.a = false;
                            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                            ref$ObjectRef4.element = ScootersDisableInsuranceResult.SKIPPED;
                            aVar = this.e;
                            a = aVar.a.a();
                            scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                            scootersDisableInsuranceBookHandler$handle$1.L$1 = ref$ObjectRef4;
                            scootersDisableInsuranceBookHandler$handle$1.L$2 = aVar;
                            scootersDisableInsuranceBookHandler$handle$1.L$3 = a;
                            scootersDisableInsuranceBookHandler$handle$1.L$4 = ref$ObjectRef4;
                            scootersDisableInsuranceBookHandler$handle$1.label = 3;
                            j18 j18Var = new j18(1, dvw.b(scootersDisableInsuranceBookHandler$handle$1));
                            j18Var.u();
                            n6n0 n6n0Var = this.b;
                            si3 si3Var = new si3(j18Var, 12);
                            com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) n6n0Var).b;
                            gVar.A((m950) gVar.W.get(), new ptn0(msb1.R, n3o0Var), new x1o0(i3, si3Var));
                            Object s = j18Var.s();
                            if (s != obj5) {
                                ref$ObjectRef = ref$ObjectRef4;
                                t = s;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef2.element = t;
                                z = ref$ObjectRef.element != ScootersDisableInsuranceResult.DISABLED;
                                if (z) {
                                    obj2 = Boolean.FALSE;
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    i = uhn0.a[((ScootersDisableInsuranceResult) ref$ObjectRef.element).ordinal()];
                                    if (i == 1) {
                                    }
                                } else {
                                    scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                                    scootersDisableInsuranceBookHandler$handle$1.L$1 = ref$ObjectRef;
                                    scootersDisableInsuranceBookHandler$handle$1.L$2 = null;
                                    scootersDisableInsuranceBookHandler$handle$1.L$3 = null;
                                    scootersDisableInsuranceBookHandler$handle$1.L$4 = null;
                                    scootersDisableInsuranceBookHandler$handle$1.Z$0 = z;
                                    scootersDisableInsuranceBookHandler$handle$1.label = 4;
                                    Object a3 = com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(aVar, a, scootersDisableInsuranceBookHandler$handle$1);
                                    if (a3 != obj5) {
                                        ref$ObjectRef3 = ref$ObjectRef;
                                        obj3 = a3;
                                        ref$ObjectRef = ref$ObjectRef3;
                                        obj2 = obj3;
                                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                        i = uhn0.a[((ScootersDisableInsuranceResult) ref$ObjectRef.element).ordinal()];
                                        if (i == 1) {
                                            if (booleanValue2) {
                                                scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                                                scootersDisableInsuranceBookHandler$handle$1.L$1 = null;
                                                scootersDisableInsuranceBookHandler$handle$1.L$2 = null;
                                                scootersDisableInsuranceBookHandler$handle$1.L$3 = null;
                                                scootersDisableInsuranceBookHandler$handle$1.L$4 = null;
                                                scootersDisableInsuranceBookHandler$handle$1.Z$0 = booleanValue2;
                                                scootersDisableInsuranceBookHandler$handle$1.label = 5;
                                                Object a4 = super.a(scootersDisableInsuranceBookHandler$handle$1);
                                                if (a4 != obj5) {
                                                    return a4;
                                                }
                                            }
                                        }
                                        if (i != 2) {
                                            if (i != 3) {
                                                w511.b();
                                                return null;
                                            }
                                        }
                                        scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                                        scootersDisableInsuranceBookHandler$handle$1.L$1 = null;
                                        scootersDisableInsuranceBookHandler$handle$1.L$2 = null;
                                        scootersDisableInsuranceBookHandler$handle$1.L$3 = null;
                                        scootersDisableInsuranceBookHandler$handle$1.L$4 = null;
                                        scootersDisableInsuranceBookHandler$handle$1.Z$0 = booleanValue2;
                                        scootersDisableInsuranceBookHandler$handle$1.label = 6;
                                        Object a5 = super.a(scootersDisableInsuranceBookHandler$handle$1);
                                        if (a5 != obj5) {
                                            return a5;
                                        }
                                    }
                                }
                            }
                        }
                        scootersDisableInsuranceBookHandler$handle$1.L$0 = null;
                        scootersDisableInsuranceBookHandler$handle$1.label = 2;
                        if (super.a(scootersDisableInsuranceBookHandler$handle$1) != obj5) {
                        }
                    case 2:
                        kotlin.b.b(obj4);
                        return zy11Var;
                    case 3:
                        ref$ObjectRef2 = (Ref$ObjectRef) scootersDisableInsuranceBookHandler$handle$1.L$4;
                        a = (y5n0) scootersDisableInsuranceBookHandler$handle$1.L$3;
                        aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersDisableInsuranceBookHandler$handle$1.L$2;
                        ref$ObjectRef = (Ref$ObjectRef) scootersDisableInsuranceBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        t = obj4;
                        ref$ObjectRef2.element = t;
                        if (ref$ObjectRef.element != ScootersDisableInsuranceResult.DISABLED) {
                        }
                        if (z) {
                        }
                        break;
                    case 4:
                        ref$ObjectRef3 = (Ref$ObjectRef) scootersDisableInsuranceBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        obj3 = obj4;
                        ref$ObjectRef = ref$ObjectRef3;
                        obj2 = obj3;
                        boolean booleanValue22 = ((Boolean) obj2).booleanValue();
                        i = uhn0.a[((ScootersDisableInsuranceResult) ref$ObjectRef.element).ordinal()];
                        if (i == 1) {
                        }
                        break;
                    case 5:
                    case 6:
                        kotlin.b.b(obj4);
                        return obj4;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersDisableInsuranceBookHandler$handle$1 = new ScootersDisableInsuranceBookHandler$handle$1(this, continuationImpl);
        Object obj42 = scootersDisableInsuranceBookHandler$handle$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i32 = 2;
        switch (scootersDisableInsuranceBookHandler$handle$1.label) {
        }
    }
}
