package com.ybsdk.core.common.data.cache;

import defpackage.ny61;
import defpackage.u8j0;
import defpackage.vpr;
import defpackage.vvj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;
    public final /* synthetic */ vvj0 c;

    public a(vpr vprVar, b bVar, vvj0 vvj0Var) {
        this.a = vprVar;
        this.b = bVar;
        this.c = vvj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ResponseCache$observe$$inlined$map$1$2$1 responseCache$observe$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ResponseCache$observe$$inlined$map$1$2$1) {
            responseCache$observe$$inlined$map$1$2$1 = (ResponseCache$observe$$inlined$map$1$2$1) continuation;
            int i2 = responseCache$observe$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$observe$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = responseCache$observe$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$observe$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    u8j0 l = this.b.l((u8j0) obj, this.c);
                    responseCache$observe$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, responseCache$observe$$inlined$map$1$2$1) == coroutineSingletons) {
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
        responseCache$observe$$inlined$map$1$2$1 = new ResponseCache$observe$$inlined$map$1$2$1(this, continuation);
        Object obj22 = responseCache$observe$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$observe$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
