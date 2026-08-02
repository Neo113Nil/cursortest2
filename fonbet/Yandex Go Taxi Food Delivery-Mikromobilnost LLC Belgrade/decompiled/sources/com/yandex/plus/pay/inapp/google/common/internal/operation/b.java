package com.yandex.plus.pay.inapp.google.common.internal.operation;

import com.yandex.plus.log.api.LogPriority;
import defpackage.fcd0;
import defpackage.gcd0;
import defpackage.ny61;
import defpackage.pgz;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements fcd0 {
    public final pgz a;
    public final com.yandex.plus.pay.inapp.google.internal.operation.decorator.a b;

    public b(pgz pgzVar, com.yandex.plus.pay.inapp.google.internal.operation.decorator.a aVar) {
        this.a = pgzVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.fcd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        PlusPayWithLogsOperationDecorator$execute$1 plusPayWithLogsOperationDecorator$execute$1;
        int i;
        pgz pgzVar;
        LogPriority logPriority;
        com.yandex.plus.pay.inapp.google.internal.operation.decorator.a aVar = this.b;
        fcd0 fcd0Var = aVar.c;
        if (continuationImpl instanceof PlusPayWithLogsOperationDecorator$execute$1) {
            plusPayWithLogsOperationDecorator$execute$1 = (PlusPayWithLogsOperationDecorator$execute$1) continuationImpl;
            int i2 = plusPayWithLogsOperationDecorator$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayWithLogsOperationDecorator$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusPayWithLogsOperationDecorator$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayWithLogsOperationDecorator$execute$1.label;
                pgzVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "WithLogsOperationDecorator", fcd0Var.getName());
                    }
                    plusPayWithLogsOperationDecorator$execute$1.L$0 = null;
                    plusPayWithLogsOperationDecorator$execute$1.label = 1;
                    obj2 = aVar.b(plusPayWithLogsOperationDecorator$execute$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                gcd0 gcd0Var = (gcd0) obj2;
                logPriority = LogPriority.DEBUG;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "WithLogsOperationDecorator", fcd0Var.getName() + " = " + gcd0Var);
                }
                return gcd0Var;
            }
        }
        plusPayWithLogsOperationDecorator$execute$1 = new PlusPayWithLogsOperationDecorator$execute$1(this, continuationImpl);
        Object obj22 = plusPayWithLogsOperationDecorator$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayWithLogsOperationDecorator$execute$1.label;
        pgzVar = this.a;
        if (i != 0) {
        }
        gcd0 gcd0Var2 = (gcd0) obj22;
        logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
        }
        return gcd0Var2;
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.b.c.getName();
    }
}
