package com.yandex.plus.home.common.utils.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ColdFlow$special$$inlined$map$1$2$1 coldFlow$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ColdFlow$special$$inlined$map$1$2$1) {
            coldFlow$special$$inlined$map$1$2$1 = (ColdFlow$special$$inlined$map$1$2$1) continuation;
            int i2 = coldFlow$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coldFlow$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = coldFlow$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coldFlow$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object f = ((Pair) obj).f();
                    coldFlow$special$$inlined$map$1$2$1.L$0 = null;
                    coldFlow$special$$inlined$map$1$2$1.L$1 = null;
                    coldFlow$special$$inlined$map$1$2$1.L$2 = null;
                    coldFlow$special$$inlined$map$1$2$1.L$3 = null;
                    coldFlow$special$$inlined$map$1$2$1.I$0 = 0;
                    coldFlow$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, coldFlow$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        coldFlow$special$$inlined$map$1$2$1 = new ColdFlow$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = coldFlow$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coldFlow$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
