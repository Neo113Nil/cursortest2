package com.yandex.plus.pay.inapp.google.common.internal.operation;

import com.yandex.plus.log.api.LogPriority;
import defpackage.fcd0;
import defpackage.gcd0;
import defpackage.hcd0;
import defpackage.j73;
import defpackage.ny61;
import defpackage.pgz;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes8.dex */
public final class c implements fcd0 {
    public static final Set d = j73.f0(new PlusPayGoogleBillingResponse$Code[]{PlusPayGoogleBillingResponse$Code.ERROR, PlusPayGoogleBillingResponse$Code.NETWORK_ERROR});
    public final pgz a;
    public final Set b = d;
    public final b c;

    public c(pgz pgzVar, b bVar) {
        this.a = pgzVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010a -> B:17:0x010e). Please report as a decompilation issue!!! */
    @Override // defpackage.fcd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        PlusPayWithRetriesOperationDecorator$execute$1 plusPayWithRetriesOperationDecorator$execute$1;
        int i;
        PlusPayWithRetriesOperationDecorator$execute$1 plusPayWithRetriesOperationDecorator$execute$12;
        int i2;
        int i3;
        Ref$LongRef ref$LongRef;
        Object obj2;
        Object obj3;
        Ref$LongRef ref$LongRef2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code;
        c cVar = this;
        if (continuationImpl instanceof PlusPayWithRetriesOperationDecorator$execute$1) {
            plusPayWithRetriesOperationDecorator$execute$1 = (PlusPayWithRetriesOperationDecorator$execute$1) continuationImpl;
            int i9 = plusPayWithRetriesOperationDecorator$execute$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                plusPayWithRetriesOperationDecorator$execute$1.label = i9 - Integer.MIN_VALUE;
                Object obj4 = plusPayWithRetriesOperationDecorator$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayWithRetriesOperationDecorator$execute$1.label;
                int i10 = 0;
                b bVar = cVar.c;
                int i11 = 1;
                Object obj5 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = 500L;
                    plusPayWithRetriesOperationDecorator$execute$12 = plusPayWithRetriesOperationDecorator$execute$1;
                    i2 = 0;
                    i3 = 2;
                    ref$LongRef = ref$LongRef3;
                    obj2 = obj;
                    if (i2 < i3) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i12 = plusPayWithRetriesOperationDecorator$execute$1.I$3;
                    int i13 = plusPayWithRetriesOperationDecorator$execute$1.I$2;
                    int i14 = plusPayWithRetriesOperationDecorator$execute$1.I$1;
                    i4 = plusPayWithRetriesOperationDecorator$execute$1.I$0;
                    ref$LongRef2 = (Ref$LongRef) plusPayWithRetriesOperationDecorator$execute$1.L$1;
                    obj3 = plusPayWithRetriesOperationDecorator$execute$1.L$0;
                    kotlin.b.b(obj4);
                    i6 = i12;
                    i7 = i14;
                    i5 = i13;
                    gcd0 gcd0Var = (gcd0) obj4;
                    hcd0 hcd0Var = gcd0Var.b;
                    i8 = i11;
                    plusPayGoogleBillingResponse$Code = hcd0Var.a;
                    if (plusPayGoogleBillingResponse$Code != PlusPayGoogleBillingResponse$Code.OK) {
                    }
                    return gcd0Var;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                    return obj4;
                }
                i7 = plusPayWithRetriesOperationDecorator$execute$1.I$1;
                int i15 = plusPayWithRetriesOperationDecorator$execute$1.I$0;
                Ref$LongRef ref$LongRef4 = (Ref$LongRef) plusPayWithRetriesOperationDecorator$execute$1.L$1;
                Object obj6 = plusPayWithRetriesOperationDecorator$execute$1.L$0;
                kotlin.b.b(obj4);
                PlusPayWithRetriesOperationDecorator$execute$1 plusPayWithRetriesOperationDecorator$execute$13 = plusPayWithRetriesOperationDecorator$execute$1;
                char c = 2;
                i8 = 1;
                ref$LongRef = ref$LongRef4;
                obj2 = obj6;
                i3 = i15;
                long j = (long) (ref$LongRef.element * 2.0d);
                if (j > 2000) {
                    j = 2000;
                }
                ref$LongRef.element = j;
                i2 = i7 + 1;
                plusPayWithRetriesOperationDecorator$execute$12 = plusPayWithRetriesOperationDecorator$execute$13;
                i11 = i8;
                i10 = 0;
                obj5 = null;
                cVar = this;
                if (i2 < i3) {
                    plusPayWithRetriesOperationDecorator$execute$12.L$0 = obj2;
                    plusPayWithRetriesOperationDecorator$execute$12.L$1 = ref$LongRef;
                    plusPayWithRetriesOperationDecorator$execute$12.L$2 = obj5;
                    plusPayWithRetriesOperationDecorator$execute$12.L$3 = obj5;
                    plusPayWithRetriesOperationDecorator$execute$12.I$0 = i3;
                    plusPayWithRetriesOperationDecorator$execute$12.I$1 = i2;
                    plusPayWithRetriesOperationDecorator$execute$12.I$2 = i2;
                    plusPayWithRetriesOperationDecorator$execute$12.I$3 = i10;
                    plusPayWithRetriesOperationDecorator$execute$12.label = i11;
                    Object a = bVar.a(obj2, plusPayWithRetriesOperationDecorator$execute$12);
                    if (a != coroutineSingletons) {
                        obj3 = obj2;
                        ref$LongRef2 = ref$LongRef;
                        plusPayWithRetriesOperationDecorator$execute$1 = plusPayWithRetriesOperationDecorator$execute$12;
                        i7 = i2;
                        obj4 = a;
                        i6 = i10;
                        i4 = i3;
                        i5 = i7;
                        gcd0 gcd0Var2 = (gcd0) obj4;
                        hcd0 hcd0Var2 = gcd0Var2.b;
                        i8 = i11;
                        plusPayGoogleBillingResponse$Code = hcd0Var2.a;
                        if (plusPayGoogleBillingResponse$Code != PlusPayGoogleBillingResponse$Code.OK) {
                            boolean contains = cVar.b.contains(plusPayGoogleBillingResponse$Code);
                            pgz pgzVar = cVar.a;
                            if (contains) {
                                LogPriority logPriority = LogPriority.ERROR;
                                if (pgzVar.e(logPriority)) {
                                    pgzVar.a(logPriority, "WithRetriesOperationDecorator", bVar.getName() + " is unsuccessful with result: " + hcd0Var2 + ". Retrying");
                                }
                                long j2 = ref$LongRef2.element;
                                plusPayWithRetriesOperationDecorator$execute$1.L$0 = obj3;
                                plusPayWithRetriesOperationDecorator$execute$1.L$1 = ref$LongRef2;
                                plusPayWithRetriesOperationDecorator$execute$1.L$2 = null;
                                plusPayWithRetriesOperationDecorator$execute$1.L$3 = null;
                                plusPayWithRetriesOperationDecorator$execute$1.I$0 = i4;
                                plusPayWithRetriesOperationDecorator$execute$1.I$1 = i7;
                                plusPayWithRetriesOperationDecorator$execute$1.I$2 = i5;
                                plusPayWithRetriesOperationDecorator$execute$1.I$3 = i6;
                                c = 2;
                                plusPayWithRetriesOperationDecorator$execute$1.label = 2;
                                if (kotlinx.coroutines.a.i(j2, plusPayWithRetriesOperationDecorator$execute$1) != coroutineSingletons) {
                                    plusPayWithRetriesOperationDecorator$execute$13 = plusPayWithRetriesOperationDecorator$execute$1;
                                    i3 = i4;
                                    ref$LongRef = ref$LongRef2;
                                    obj2 = obj3;
                                    long j3 = (long) (ref$LongRef.element * 2.0d);
                                    if (j3 > 2000) {
                                    }
                                    ref$LongRef.element = j3;
                                    i2 = i7 + 1;
                                    plusPayWithRetriesOperationDecorator$execute$12 = plusPayWithRetriesOperationDecorator$execute$13;
                                    i11 = i8;
                                    i10 = 0;
                                    obj5 = null;
                                    cVar = this;
                                    if (i2 < i3) {
                                        Object obj7 = obj5;
                                        plusPayWithRetriesOperationDecorator$execute$12.L$0 = obj7;
                                        plusPayWithRetriesOperationDecorator$execute$12.L$1 = obj7;
                                        plusPayWithRetriesOperationDecorator$execute$12.L$2 = obj7;
                                        plusPayWithRetriesOperationDecorator$execute$12.L$3 = obj7;
                                        plusPayWithRetriesOperationDecorator$execute$12.label = 3;
                                        Object a2 = bVar.a(obj2, plusPayWithRetriesOperationDecorator$execute$12);
                                        if (a2 != coroutineSingletons) {
                                            return a2;
                                        }
                                    }
                                }
                            } else {
                                LogPriority logPriority2 = LogPriority.ERROR;
                                if (pgzVar.e(logPriority2)) {
                                    pgzVar.a(logPriority2, "WithRetriesOperationDecorator", bVar.getName() + " is unsuccessful with result: " + hcd0Var2 + ". Error is not retryable");
                                }
                            }
                        }
                        return gcd0Var2;
                    }
                }
                return coroutineSingletons;
            }
        }
        plusPayWithRetriesOperationDecorator$execute$1 = new PlusPayWithRetriesOperationDecorator$execute$1(cVar, continuationImpl);
        Object obj42 = plusPayWithRetriesOperationDecorator$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayWithRetriesOperationDecorator$execute$1.label;
        int i102 = 0;
        b bVar2 = cVar.c;
        int i112 = 1;
        Object obj52 = null;
        if (i != 0) {
        }
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.c.b.getName();
    }
}
