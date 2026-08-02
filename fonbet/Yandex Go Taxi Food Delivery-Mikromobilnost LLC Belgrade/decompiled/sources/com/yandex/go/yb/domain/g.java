package com.yandex.go.yb.domain;

import defpackage.fl3;
import defpackage.gl3;
import defpackage.hl3;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RealYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1 realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1;
        int i;
        Long l;
        if (continuation instanceof RealYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1) {
            realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1 = (RealYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1) continuation;
            int i2 = realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hl3 hl3Var = (hl3) obj;
                    if (hl3Var instanceof fl3) {
                        l = new Long(((fl3) hl3Var).a);
                    } else {
                        if (!(hl3Var instanceof gl3)) {
                            w511.b();
                            return null;
                        }
                        l = null;
                    }
                    realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.L$0 = null;
                    realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.L$1 = null;
                    realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.L$2 = null;
                    realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.L$3 = null;
                    realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1 = new RealYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realYbOAuthTokenLoader$getUidFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
