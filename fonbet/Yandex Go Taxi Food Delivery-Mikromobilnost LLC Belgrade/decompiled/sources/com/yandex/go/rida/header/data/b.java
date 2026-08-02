package com.yandex.go.rida.header.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.k;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ k a;
    public final /* synthetic */ c b;

    public b(k kVar, c cVar) {
        this.a = kVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DefaultRidaHeaderStateInteractor$special$$inlined$map$1$1 defaultRidaHeaderStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof DefaultRidaHeaderStateInteractor$special$$inlined$map$1$1) {
            defaultRidaHeaderStateInteractor$special$$inlined$map$1$1 = (DefaultRidaHeaderStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, defaultRidaHeaderStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        defaultRidaHeaderStateInteractor$special$$inlined$map$1$1 = new DefaultRidaHeaderStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultRidaHeaderStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
