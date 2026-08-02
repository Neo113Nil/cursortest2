package com.ybsdk.common.repositiories.auth;

import defpackage.bif;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CurrentUidHolder$special$$inlined$map$1$2$1 currentUidHolder$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CurrentUidHolder$special$$inlined$map$1$2$1) {
            currentUidHolder$special$$inlined$map$1$2$1 = (CurrentUidHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = currentUidHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentUidHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = currentUidHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentUidHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Long l = ((bif) obj).a;
                    currentUidHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, currentUidHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        currentUidHolder$special$$inlined$map$1$2$1 = new CurrentUidHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = currentUidHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentUidHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
