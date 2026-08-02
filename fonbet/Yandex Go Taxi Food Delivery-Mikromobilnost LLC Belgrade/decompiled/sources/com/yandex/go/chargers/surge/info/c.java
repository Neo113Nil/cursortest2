package com.yandex.go.chargers.surge.info;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yfd;
import defpackage.zva;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zva b;
    public final /* synthetic */ yfd c;

    public c(tpr tprVar, zva zvaVar, yfd yfdVar) {
        this.a = tprVar;
        this.b = zvaVar;
        this.c = yfdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1 chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1) {
            chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1 = (ChargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1) continuation;
            int i2 = chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.L$0 = null;
                    chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.L$1 = null;
                    chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.L$2 = null;
                    chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1 = new ChargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSurgeInfoRouter$content$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
