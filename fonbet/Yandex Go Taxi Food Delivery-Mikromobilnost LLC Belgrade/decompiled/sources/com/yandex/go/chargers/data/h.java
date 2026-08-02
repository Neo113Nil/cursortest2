package com.yandex.go.chargers.data;

import defpackage.h2a;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public h(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1 chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1) {
            chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1 = (ChargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h2a h2aVar = (h2a) ((Map) obj).get(this.b);
                    Long l = h2aVar != null ? h2aVar.b : null;
                    chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1 = new ChargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFreeCheckTimerStateRepository$remainingMsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
