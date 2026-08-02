package com.ybsdk.core.utils.ext;

import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tls b;

    public b(vpr vprVar, tls tlsVar) {
        this.a = vprVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CoroutineExtKt$mapState$$inlined$map$1$2$1 coroutineExtKt$mapState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CoroutineExtKt$mapState$$inlined$map$1$2$1) {
            coroutineExtKt$mapState$$inlined$map$1$2$1 = (CoroutineExtKt$mapState$$inlined$map$1$2$1) continuation;
            int i2 = coroutineExtKt$mapState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineExtKt$mapState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = coroutineExtKt$mapState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutineExtKt$mapState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object invoke = this.b.invoke(obj);
                    coroutineExtKt$mapState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(invoke, coroutineExtKt$mapState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        coroutineExtKt$mapState$$inlined$map$1$2$1 = new CoroutineExtKt$mapState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = coroutineExtKt$mapState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineExtKt$mapState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
