package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.SafetyCenterConfig;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public h(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SafetyCenterProvider$launch$$inlined$map$2$2$1 safetyCenterProvider$launch$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof SafetyCenterProvider$launch$$inlined$map$2$2$1) {
            safetyCenterProvider$launch$$inlined$map$2$2$1 = (SafetyCenterProvider$launch$$inlined$map$2$2$1) continuation;
            int i2 = safetyCenterProvider$launch$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$launch$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterProvider$launch$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$launch$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j jVar = this.b;
                    cmt<SafetyCenterConfig> c = jVar.a.c(jVar.d.b);
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$0 = null;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$1 = null;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$2 = null;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$3 = null;
                    vprVar = this.a;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$4 = vprVar;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$5 = null;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.L$6 = null;
                    safetyCenterProvider$launch$$inlined$map$2$2$1.label = 1;
                    obj2 = ru.yandex.taxi.network.api.a.a(c, null, safetyCenterProvider$launch$$inlined$map$2$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) safetyCenterProvider$launch$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$0 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$1 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$2 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$3 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$4 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$5 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.L$6 = null;
                safetyCenterProvider$launch$$inlined$map$2$2$1.label = 2;
            }
        }
        safetyCenterProvider$launch$$inlined$map$2$2$1 = new SafetyCenterProvider$launch$$inlined$map$2$2$1(this, continuation);
        Object obj22 = safetyCenterProvider$launch$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$launch$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$0 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$1 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$2 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$3 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$4 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$5 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.L$6 = null;
        safetyCenterProvider$launch$$inlined$map$2$2$1.label = 2;
    }
}
