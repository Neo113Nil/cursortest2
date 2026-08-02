package com.yandex.plus.home.feature.webviews.internal.treasury;

import defpackage.g050;
import defpackage.jqd0;
import defpackage.ny61;
import defpackage.qnv;
import defpackage.td11;
import defpackage.vpr;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public b(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0115, code lost:
    
        if (r2.emit(r13, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TreasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1 treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        g050 g050Var;
        int i2;
        int i3;
        int i4;
        g050 g050Var2;
        try {
            if (continuation instanceof TreasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1) {
                treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1 = (TreasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1) continuation;
                int i5 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = i5 - Integer.MIN_VALUE;
                    obj2 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label;
                    c cVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        kotlinx.coroutines.sync.a aVar = cVar.g;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$0 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$1 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$2 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$3 = null;
                        vpr vprVar2 = this.a;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$5 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$6 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7 = aVar;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$8 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0 = 0;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$1 = 0;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$2 = 0;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = 1;
                        if (aVar.a(treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1) != coroutineSingletons) {
                            vprVar = vprVar2;
                            g050Var = aVar;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        int i6 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$2;
                        int i7 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$1;
                        int i8 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0;
                        g050Var = (g050) treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7;
                        vpr vprVar3 = (vpr) treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4;
                        kotlin.b.b(obj2);
                        i4 = i7;
                        i3 = i6;
                        i2 = i8;
                        vprVar = vprVar3;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        i2 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0;
                        g050Var2 = (g050) treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7;
                        vprVar = (vpr) treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4;
                        try {
                            kotlin.b.b(obj2);
                            jqd0 jqd0Var = (jqd0) obj2;
                            cVar.e = jqd0Var;
                            td11 td11Var = cVar.c;
                            String uuid = UUID.randomUUID().toString();
                            td11Var.getClass();
                            qnv a = td11.a(jqd0Var, uuid);
                            g050Var2.d(null);
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$0 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$1 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$2 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$3 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$5 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$6 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$8 = null;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0 = i2;
                            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = 3;
                        } catch (Throwable th) {
                            th = th;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$0 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$1 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$2 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$3 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$5 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$6 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7 = g050Var;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$8 = null;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0 = i2;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$1 = i4;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$2 = i3;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$3 = 0;
                    treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = 2;
                    obj2 = c.a(cVar, treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        g050Var2 = g050Var;
                        jqd0 jqd0Var2 = (jqd0) obj2;
                        cVar.e = jqd0Var2;
                        td11 td11Var2 = cVar.c;
                        String uuid2 = UUID.randomUUID().toString();
                        td11Var2.getClass();
                        qnv a2 = td11.a(jqd0Var2, uuid2);
                        g050Var2.d(null);
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$0 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$1 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$2 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$3 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$5 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$6 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$8 = null;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0 = i2;
                        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = 3;
                    }
                    return coroutineSingletons;
                }
            }
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$0 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$1 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$2 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$3 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$4 = vprVar;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$5 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$6 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$7 = g050Var;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.L$8 = null;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$0 = i2;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$1 = i4;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$2 = i3;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.I$3 = 0;
            treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label = 2;
            obj2 = c.a(cVar, treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1);
            if (obj2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1 = new TreasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1(this, continuation);
        obj2 = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = treasuryMessagesBridge$getTreasuryInMessageFlow$$inlined$map$1$2$1.label;
        c cVar2 = this.b;
        if (i != 0) {
        }
    }
}
