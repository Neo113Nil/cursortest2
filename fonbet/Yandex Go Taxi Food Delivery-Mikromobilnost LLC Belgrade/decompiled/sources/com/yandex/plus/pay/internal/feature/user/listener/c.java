package com.yandex.plus.pay.internal.feature.user.listener;

import defpackage.g050;
import defpackage.gci0;
import defpackage.gj;
import defpackage.gtq0;
import defpackage.hbd0;
import defpackage.hj;
import defpackage.ij;
import defpackage.jj;
import defpackage.lj;
import defpackage.ny61;
import defpackage.ol;
import defpackage.tse;
import defpackage.vcd0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class c implements ol {
    public static final kotlinx.coroutines.sync.a b = gtq0.a();
    public final hbd0 a;

    public c(hbd0 hbd0Var) {
        this.a = hbd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.zls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(tse tseVar, lj ljVar, Continuation continuation) {
        RestoreInAppPurchasesAccountListener$invoke$1 restoreInAppPurchasesAccountListener$invoke$1;
        int i;
        if (continuation instanceof RestoreInAppPurchasesAccountListener$invoke$1) {
            restoreInAppPurchasesAccountListener$invoke$1 = (RestoreInAppPurchasesAccountListener$invoke$1) continuation;
            int i2 = restoreInAppPurchasesAccountListener$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restoreInAppPurchasesAccountListener$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = restoreInAppPurchasesAccountListener$invoke$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restoreInAppPurchasesAccountListener$invoke$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if ((ljVar instanceof gj) || (ljVar instanceof ij) || (ljVar instanceof jj)) {
                    return zy11Var;
                }
                if (!(ljVar instanceof hj)) {
                    w511.b();
                    return null;
                }
                restoreInAppPurchasesAccountListener$invoke$1.L$0 = null;
                restoreInAppPurchasesAccountListener$invoke$1.L$1 = null;
                restoreInAppPurchasesAccountListener$invoke$1.label = 1;
                return d(restoreInAppPurchasesAccountListener$invoke$1) == obj2 ? obj2 : zy11Var;
            }
        }
        restoreInAppPurchasesAccountListener$invoke$1 = new RestoreInAppPurchasesAccountListener$invoke$1(this, continuation);
        Object obj3 = restoreInAppPurchasesAccountListener$invoke$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restoreInAppPurchasesAccountListener$invoke$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1 restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        Throwable th;
        g050 g050Var;
        Object x;
        try {
            if (continuationImpl instanceof RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1) {
                restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1 = (RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1) continuationImpl;
                int i3 = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = b;
                        restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.L$0 = aVar;
                        restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$0 = 0;
                        restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label = 1;
                        if (aVar.a(restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    i2 = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$0;
                    ?? r5 = (g050) restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r5;
                    gci0 b2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.a) ((vcd0) this.a.invoke())).b();
                    RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 = new RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1();
                    restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.L$0 = aVar;
                    restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$0 = i2;
                    restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$1 = 0;
                    restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label = 2;
                    x = e.x(b2, restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1, restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1);
                    if (x != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = x;
                        g050Var = aVar2;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            gci0 b22 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.a) ((vcd0) this.a.invoke())).b();
            RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$12 = new RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1();
            restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.L$0 = aVar;
            restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$0 = i2;
            restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.I$1 = 0;
            restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label = 2;
            x = e.x(b22, restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$12, restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1);
            if (x != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1 = new RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1(this, continuationImpl);
        Object obj2 = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$1.label;
        if (i != 0) {
        }
    }
}
