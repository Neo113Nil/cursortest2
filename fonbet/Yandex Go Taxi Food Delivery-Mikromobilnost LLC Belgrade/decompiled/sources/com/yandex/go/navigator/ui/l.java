package com.yandex.go.navigator.ui;

import defpackage.ny61;
import defpackage.pe50;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class l implements vpr {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorPinsController$attach$$inlined$safeCollectIn$1$2$1 navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1;
        int i;
        if (continuation instanceof NavigatorPinsController$attach$$inlined$safeCollectIn$1$2$1) {
            navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1 = (NavigatorPinsController$attach$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.label;
                m mVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.label = 1;
                    if (m.c(mVar, (pe50) obj, navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                m.d(mVar, ((Boolean) mVar.e.h()).booleanValue(), (Integer) mVar.f.h());
                return zy11.a;
            }
        }
        navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1 = new NavigatorPinsController$attach$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinsController$attach$$inlined$safeCollectIn$1$2$1.label;
        m mVar2 = this.a;
        if (i != 0) {
        }
        m.d(mVar2, ((Boolean) mVar2.e.h()).booleanValue(), (Integer) mVar2.f.h());
        return zy11.a;
    }
}
