package com.yandex.go.yb.data;

import defpackage.ai51;
import defpackage.d0a1;
import defpackage.iw51;
import defpackage.jl40;
import defpackage.jw51;
import defpackage.kw51;
import defpackage.lw51;
import defpackage.mv51;
import defpackage.mw51;
import defpackage.ny61;
import defpackage.o370;
import defpackage.tcc;
import defpackage.tf51;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xh51;
import defpackage.yh51;
import defpackage.zh51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o370 b;

    public j(vpr vprVar, o370 o370Var) {
        this.a = vprVar;
        this.b = o370Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1 ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1;
        int i;
        Object jw51Var;
        if (continuation instanceof YbSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1) {
            ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1 = (YbSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1) continuation;
            int i2 = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ai51 ai51Var = (ai51) obj;
                    if (jl40.l(ai51Var, xh51.d)) {
                        jw51Var = mw51.a;
                    } else if (jl40.l(ai51Var, xh51.b)) {
                        jw51Var = kw51.a;
                    } else if (jl40.l(ai51Var, xh51.a)) {
                        jw51Var = iw51.a;
                    } else if (jl40.l(ai51Var, xh51.c)) {
                        jw51Var = lw51.a;
                    } else if (ai51Var instanceof zh51) {
                        jw51Var = kw51.b;
                    } else {
                        if (!(ai51Var instanceof yh51)) {
                            w511.b();
                            return null;
                        }
                        yh51 yh51Var = (yh51) ai51Var;
                        tf51 tf51Var = yh51Var.a;
                        mv51 h = tf51Var == null ? null : d0a1.h(tf51Var);
                        List list = yh51Var.b;
                        EmptyList emptyList = EmptyList.a;
                        if (list == null) {
                            list = emptyList;
                        }
                        jw51Var = new jw51(h, new ArrayList(tcc.n(emptyList, 10)), this.b.m(list));
                    }
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.L$0 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.L$1 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.L$2 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.L$3 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jw51Var, ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1 = new YbSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
