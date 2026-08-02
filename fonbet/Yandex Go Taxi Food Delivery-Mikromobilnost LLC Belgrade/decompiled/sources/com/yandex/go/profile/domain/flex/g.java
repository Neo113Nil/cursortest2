package com.yandex.go.profile.domain.flex;

import defpackage.ny61;
import defpackage.rsn;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tls b;

    public g(vpr vprVar, tls tlsVar) {
        this.a = vprVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProfileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1 profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ProfileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1) {
            profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1 = (ProfileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    Object obj3 = rsnVar.a;
                    Object obj4 = rsnVar.b;
                    Object invoke = (obj3 == null || obj3.equals(obj4)) ? null : this.b.invoke(obj4);
                    if (invoke != null) {
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.L$0 = null;
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.L$1 = null;
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.L$2 = null;
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.L$3 = null;
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.L$4 = null;
                        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(invoke, profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1 = new ProfileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileStateRepository$onChangedEmit$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
