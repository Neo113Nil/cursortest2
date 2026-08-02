package com.yandex.plus.pay.inapp.google.internal.operation.decorator;

import com.yandex.plus.log.api.LogPriority;
import defpackage.cma1;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.gcd0;
import defpackage.ns5;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.sls;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a implements fcd0 {
    public final sls a;
    public final pgz b;
    public final fcd0 c;

    public a(sls slsVar, pgz pgzVar, fcd0 fcd0Var) {
        this.a = slsVar;
        this.b = pgzVar;
        this.c = fcd0Var;
    }

    @Override // defpackage.fcd0
    public final /* bridge */ /* synthetic */ Object a(Object obj, ContinuationImpl continuationImpl) {
        return b(continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WithConnectionEstablishmentOperationDecorator$execute$1 withConnectionEstablishmentOperationDecorator$execute$1;
        int i;
        es5 es5Var;
        Object y;
        ns5 ns5Var;
        Throwable th;
        es5 es5Var2;
        LogPriority logPriority;
        LogPriority logPriority2;
        if (continuationImpl instanceof WithConnectionEstablishmentOperationDecorator$execute$1) {
            withConnectionEstablishmentOperationDecorator$execute$1 = (WithConnectionEstablishmentOperationDecorator$execute$1) continuationImpl;
            int i2 = withConnectionEstablishmentOperationDecorator$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                withConnectionEstablishmentOperationDecorator$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = withConnectionEstablishmentOperationDecorator$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = withConnectionEstablishmentOperationDecorator$execute$1.label;
                pgz pgzVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    es5Var = (es5) this.a.invoke();
                    kotlinx.coroutines.flow.b g = e.g(new WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1(this, es5Var, null));
                    withConnectionEstablishmentOperationDecorator$execute$1.L$0 = null;
                    withConnectionEstablishmentOperationDecorator$execute$1.L$1 = es5Var;
                    withConnectionEstablishmentOperationDecorator$execute$1.label = 1;
                    y = e.y(g, withConnectionEstablishmentOperationDecorator$execute$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        es5Var2 = (es5) withConnectionEstablishmentOperationDecorator$execute$1.L$1;
                        try {
                            b.b(obj);
                            gcd0 gcd0Var = (gcd0) obj;
                            es5Var2.c();
                            logPriority2 = LogPriority.DEBUG;
                            if (pgzVar.e(logPriority2)) {
                                pgzVar.a(logPriority2, "WithConnectionEstablishmentOperationDecorator", "endConnection()");
                            }
                            return gcd0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            es5Var2.c();
                            logPriority = LogPriority.DEBUG;
                            if (pgzVar.e(logPriority)) {
                            }
                            throw th;
                        }
                    }
                    es5 es5Var3 = (es5) withConnectionEstablishmentOperationDecorator$execute$1.L$1;
                    b.b(obj);
                    y = obj;
                    es5Var = es5Var3;
                }
                ns5Var = (ns5) y;
                if (ns5Var.a == 0) {
                    return new gcd0(null, cma1.C0(ns5Var));
                }
                try {
                    fcd0 fcd0Var = this.c;
                    withConnectionEstablishmentOperationDecorator$execute$1.L$0 = null;
                    withConnectionEstablishmentOperationDecorator$execute$1.L$1 = es5Var;
                    withConnectionEstablishmentOperationDecorator$execute$1.L$2 = null;
                    withConnectionEstablishmentOperationDecorator$execute$1.label = 2;
                    Object a = fcd0Var.a(es5Var, withConnectionEstablishmentOperationDecorator$execute$1);
                    if (a != coroutineSingletons) {
                        es5 es5Var4 = es5Var;
                        obj = a;
                        es5Var2 = es5Var4;
                        gcd0 gcd0Var2 = (gcd0) obj;
                        es5Var2.c();
                        logPriority2 = LogPriority.DEBUG;
                        if (pgzVar.e(logPriority2)) {
                        }
                        return gcd0Var2;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    es5 es5Var5 = es5Var;
                    th = th3;
                    es5Var2 = es5Var5;
                    es5Var2.c();
                    logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "WithConnectionEstablishmentOperationDecorator", "endConnection()");
                    }
                    throw th;
                }
            }
        }
        withConnectionEstablishmentOperationDecorator$execute$1 = new WithConnectionEstablishmentOperationDecorator$execute$1(this, continuationImpl);
        Object obj2 = withConnectionEstablishmentOperationDecorator$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = withConnectionEstablishmentOperationDecorator$execute$1.label;
        pgz pgzVar2 = this.b;
        if (i != 0) {
        }
        ns5Var = (ns5) y;
        if (ns5Var.a == 0) {
        }
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.c.getName();
    }
}
