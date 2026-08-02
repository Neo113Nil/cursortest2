package com.yandex.go.chargers.order.active;

import defpackage.e3n;
import defpackage.h2a;
import defpackage.hl9;
import defpackage.il9;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.z8y;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class a0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ il9 b;
    public final /* synthetic */ String c;

    public a0(vpr vprVar, il9 il9Var, String str) {
        this.a = vprVar;
        this.b = il9Var;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r1) != r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(hl9 hl9Var, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1 chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1;
        int i;
        z8y z8yVar;
        Long l;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) {
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1 = (ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label;
                zy11 zy11Var = zy11.a;
                String str = this.c;
                il9 il9Var = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                l = (Long) chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$3;
                                z8yVar = (z8y) chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1;
                                kotlin.b.b(obj);
                            } else {
                                if (i == 4) {
                                    kotlin.b.b(obj);
                                    il9Var.i.a(str);
                                    com.yandex.go.chargers.order.domain.a aVar = il9Var.e;
                                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
                                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = null;
                                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$2 = null;
                                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$3 = null;
                                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 5;
                                    return aVar.c(chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                                }
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                z8yVar = hl9Var.a;
                vpr vprVar = this.a;
                if (z8yVar != null) {
                    Integer num = z8yVar.o;
                    if (num == null || num.intValue() < 0) {
                        il9Var.i.b(str);
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$2 = null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 2;
                        if (vprVar.emit(null, chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) == coroutineSingletons) {
                        }
                    } else {
                        if (num.intValue() > 0) {
                            il9Var.i.d(num.intValue(), str);
                        } else {
                            il9Var.i.c(str);
                        }
                        h2a h2aVar = (h2a) ((Map) il9Var.i.b.getValue()).get(str);
                        Long l2 = h2aVar != null ? h2aVar.b : null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = z8yVar;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$2 = null;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$3 = l2;
                        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 3;
                        if (vprVar.emit(l2, chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) != coroutineSingletons) {
                            l = l2;
                        }
                    }
                }
                chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
                chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = null;
                chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 1;
                if (vprVar.emit(null, chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1) == coroutineSingletons) {
                }
                if (l != null && l.longValue() == 0) {
                    o430 o430Var = e3n.b;
                    Integer num2 = z8yVar.p;
                    int intValue = num2 == null ? num2.intValue() : 0;
                    long U = kp50.U((intValue >= 0 ? intValue : 0) + 1, DurationUnit.SECONDS);
                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = null;
                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$2 = null;
                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$3 = null;
                    chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 4;
                }
            }
        }
        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1 = new ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1(this, continuation);
        Object obj2 = chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        String str2 = this.c;
        il9 il9Var2 = this.b;
        if (i == 0) {
        }
        if (l != null) {
            o430 o430Var2 = e3n.b;
            Integer num22 = z8yVar.p;
            if (num22 == null) {
            }
            long U2 = kp50.U((intValue >= 0 ? intValue : 0) + 1, DurationUnit.SECONDS);
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$0 = null;
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$1 = null;
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$2 = null;
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.L$3 = null;
            chargersActiveOrderUiStateInteractor$timerForOrderFlow$1$2$emit$1.label = 4;
        }
    }
}
