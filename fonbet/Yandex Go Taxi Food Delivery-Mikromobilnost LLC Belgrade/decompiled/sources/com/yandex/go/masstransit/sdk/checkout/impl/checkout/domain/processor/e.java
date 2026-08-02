package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor;

import defpackage.blc;
import defpackage.bvf0;
import defpackage.gbp0;
import defpackage.gf5;
import defpackage.jl40;
import defpackage.l7b;
import defpackage.ny61;
import defpackage.oob1;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.tje;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class e {
    public final gbp0 a;
    public final l7b b;
    public final zls c;
    public final r0 d = bvf0.c(EmptyList.a);
    public pzt0 e;

    public e(gbp0 gbp0Var, l7b l7bVar, zls zlsVar) {
        this.a = gbp0Var;
        this.b = l7bVar;
        this.c = zlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[LOOP:0: B:12:0x0073->B:38:0x00ed, LOOP_START, PHI: r6
      0x0073: PHI (r6v5 java.lang.Object) = (r6v2 java.lang.Object), (r6v7 java.lang.Object) binds: [B:11:0x0071, B:38:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0064 -> B:10:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, String str, Continuation continuation) {
        CheckoutCommandProcessor$sendPendingCommands$1 checkoutCommandProcessor$sendPendingCommands$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        String str2;
        Object obj;
        Object obj2;
        r0 r0Var = eVar.d;
        if (continuation instanceof CheckoutCommandProcessor$sendPendingCommands$1) {
            checkoutCommandProcessor$sendPendingCommands$1 = (CheckoutCommandProcessor$sendPendingCommands$1) continuation;
            int i2 = checkoutCommandProcessor$sendPendingCommands$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutCommandProcessor$sendPendingCommands$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = checkoutCommandProcessor$sendPendingCommands$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutCommandProcessor$sendPendingCommands$1.label;
                Object obj4 = null;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj3);
                    z.element = r0Var.getValue();
                    ref$ObjectRef = z;
                    str2 = str;
                    if (!((Collection) ref$ObjectRef.element).isEmpty()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) checkoutCommandProcessor$sendPendingCommands$1.L$1;
                    String str3 = (String) checkoutCommandProcessor$sendPendingCommands$1.L$0;
                    kotlin.b.b(obj3);
                    gf5 gf5Var = (gf5) obj3;
                    if (jl40.l(gf5Var, gf5.b)) {
                        obj = obj4;
                        if (!jl40.l(gf5Var, gf5.a)) {
                            w511.b();
                            return obj;
                        }
                        eVar.b();
                        ref$ObjectRef.element = EmptyList.a;
                    } else {
                        while (true) {
                            Object value = r0Var.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : (List) value) {
                                blc blcVar = (blc) obj5;
                                Iterable<blc> iterable = (Iterable) ref$ObjectRef.element;
                                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    for (blc blcVar2 : iterable) {
                                        obj2 = obj4;
                                        if (!jl40.l(blcVar2.a(), blcVar.a()) || !jl40.l(oob1.b(blcVar2), oob1.b(blcVar))) {
                                            obj4 = obj2;
                                        }
                                    }
                                }
                                obj2 = obj4;
                                arrayList.add(obj5);
                                obj4 = obj2;
                            }
                            obj = obj4;
                            if (r0Var.k(value, arrayList)) {
                                break;
                            }
                            obj4 = obj;
                        }
                        ref$ObjectRef.element = r0Var.getValue();
                    }
                    obj4 = obj;
                    str2 = str3;
                    if (!((Collection) ref$ObjectRef.element).isEmpty()) {
                        zls zlsVar = eVar.c;
                        Object obj6 = ref$ObjectRef.element;
                        checkoutCommandProcessor$sendPendingCommands$1.L$0 = str2;
                        checkoutCommandProcessor$sendPendingCommands$1.L$1 = ref$ObjectRef;
                        checkoutCommandProcessor$sendPendingCommands$1.label = 1;
                        Object invoke = zlsVar.invoke(str2, obj6, checkoutCommandProcessor$sendPendingCommands$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str2;
                        obj3 = invoke;
                        gf5 gf5Var2 = (gf5) obj3;
                        if (jl40.l(gf5Var2, gf5.b)) {
                        }
                        obj4 = obj;
                        str2 = str3;
                        if (!((Collection) ref$ObjectRef.element).isEmpty()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        checkoutCommandProcessor$sendPendingCommands$1 = new CheckoutCommandProcessor$sendPendingCommands$1(eVar, continuation);
        Object obj32 = checkoutCommandProcessor$sendPendingCommands$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutCommandProcessor$sendPendingCommands$1.label;
        Object obj42 = null;
        if (i != 0) {
        }
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
        } while (!r0Var.k(value, EmptyList.a));
    }

    public final void c() {
        this.e = tje.N(this.a, null, null, new CheckoutCommandProcessor$start$1(this, null), 3);
    }
}
