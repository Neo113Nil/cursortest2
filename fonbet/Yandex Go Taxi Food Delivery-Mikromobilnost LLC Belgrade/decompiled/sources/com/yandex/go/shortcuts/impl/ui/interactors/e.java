package com.yandex.go.shortcuts.impl.ui.interactors;

import defpackage.d4s0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1 sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1) {
            sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1 = (SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d4s0 a = d4s0.a((d4s0) obj, null, null, 3967);
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1 = new SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
