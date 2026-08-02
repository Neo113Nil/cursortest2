package com.yandex.go.safety.center;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class i implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ j b;

    public i(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SafetyCenterProvider$launch$$inlined$map$2$1 safetyCenterProvider$launch$$inlined$map$2$1;
        int i;
        if (continuation instanceof SafetyCenterProvider$launch$$inlined$map$2$1) {
            safetyCenterProvider$launch$$inlined$map$2$1 = (SafetyCenterProvider$launch$$inlined$map$2$1) continuation;
            int i2 = safetyCenterProvider$launch$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$launch$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$launch$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$launch$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    safetyCenterProvider$launch$$inlined$map$2$1.L$0 = null;
                    safetyCenterProvider$launch$$inlined$map$2$1.L$1 = null;
                    safetyCenterProvider$launch$$inlined$map$2$1.L$2 = null;
                    safetyCenterProvider$launch$$inlined$map$2$1.label = 1;
                    if (this.a.collect(hVar, safetyCenterProvider$launch$$inlined$map$2$1) == coroutineSingletons) {
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
        safetyCenterProvider$launch$$inlined$map$2$1 = new SafetyCenterProvider$launch$$inlined$map$2$1(this, continuation);
        Object obj2 = safetyCenterProvider$launch$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$launch$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
