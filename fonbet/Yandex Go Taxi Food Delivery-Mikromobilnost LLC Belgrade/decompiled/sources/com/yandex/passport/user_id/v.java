package com.yandex.passport.user_id;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class v implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ com.arkivanov.mvikotlin.extensions.coroutines.a b;

    public v(vpr vprVar, com.arkivanov.mvikotlin.extensions.coroutines.a aVar) {
        this.a = vprVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserIdViewModel$special$$inlined$mapStateful$2$2$1 userIdViewModel$special$$inlined$mapStateful$2$2$1;
        int i;
        if (continuation instanceof UserIdViewModel$special$$inlined$mapStateful$2$2$1) {
            userIdViewModel$special$$inlined$mapStateful$2$2$1 = (UserIdViewModel$special$$inlined$mapStateful$2$2$1) continuation;
            int i2 = userIdViewModel$special$$inlined$mapStateful$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userIdViewModel$special$$inlined$mapStateful$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userIdViewModel$special$$inlined$mapStateful$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userIdViewModel$special$$inlined$mapStateful$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.user_id.models.h hVar = ((com.yandex.passport.user_id.models.e) this.b.getValue()).a;
                    userIdViewModel$special$$inlined$mapStateful$2$2$1.label = 1;
                    if (this.a.emit(hVar, userIdViewModel$special$$inlined$mapStateful$2$2$1) == coroutineSingletons) {
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
        userIdViewModel$special$$inlined$mapStateful$2$2$1 = new UserIdViewModel$special$$inlined$mapStateful$2$2$1(this, continuation);
        Object obj22 = userIdViewModel$special$$inlined$mapStateful$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userIdViewModel$special$$inlined$mapStateful$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
