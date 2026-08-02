package com.yandex.messaging.ui.calllist.info;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CallHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1 callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof CallHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1) {
            callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1 = (CallHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1) continuation;
            int i2 = callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(null, (String) obj);
                    callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(pair, callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1) == coroutineSingletons) {
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
        callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1 = new CallHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1(this, continuation);
        Object obj22 = callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callHistoryInfoViewModel$contactStateFlow$lambda$7$lambda$6$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
