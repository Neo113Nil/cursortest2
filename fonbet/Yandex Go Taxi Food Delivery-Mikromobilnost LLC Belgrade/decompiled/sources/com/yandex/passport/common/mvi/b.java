package com.yandex.passport.common.mvi;

import com.yandex.passport.internal.ui.bouncer.model.a1;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.u;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b1 b;

    public b(vpr vprVar, b1 b1Var) {
        this.a = vprVar;
        this.b = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EventBasedStore$wireWith$$inlined$map$1$2$1 eventBasedStore$wireWith$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EventBasedStore$wireWith$$inlined$map$1$2$1) {
            eventBasedStore$wireWith$$inlined$map$1$2$1 = (EventBasedStore$wireWith$$inlined$map$1$2$1) continuation;
            int i2 = eventBasedStore$wireWith$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eventBasedStore$wireWith$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eventBasedStore$wireWith$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eventBasedStore$wireWith$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    u uVar = new u((a1) obj);
                    eventBasedStore$wireWith$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uVar, eventBasedStore$wireWith$$inlined$map$1$2$1) == coroutineSingletons) {
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
        eventBasedStore$wireWith$$inlined$map$1$2$1 = new EventBasedStore$wireWith$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eventBasedStore$wireWith$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eventBasedStore$wireWith$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
