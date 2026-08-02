package com.yandex.go.payments_widgets.saver;

import defpackage.iw51;
import defpackage.jw51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SaverWidgetsInteractor$saverState$$inlined$map$1$2$1 saverWidgetsInteractor$saverState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SaverWidgetsInteractor$saverState$$inlined$map$1$2$1) {
            saverWidgetsInteractor$saverState$$inlined$map$1$2$1 = (SaverWidgetsInteractor$saverState$$inlined$map$1$2$1) continuation;
            int i2 = saverWidgetsInteractor$saverState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saverWidgetsInteractor$saverState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saverWidgetsInteractor$saverState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saverWidgetsInteractor$saverState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nw51 nw51Var = (nw51) obj;
                    Boolean valueOf = Boolean.valueOf((nw51Var instanceof jw51) || (nw51Var instanceof iw51));
                    saverWidgetsInteractor$saverState$$inlined$map$1$2$1.L$0 = null;
                    saverWidgetsInteractor$saverState$$inlined$map$1$2$1.L$1 = null;
                    saverWidgetsInteractor$saverState$$inlined$map$1$2$1.L$2 = null;
                    saverWidgetsInteractor$saverState$$inlined$map$1$2$1.L$3 = null;
                    saverWidgetsInteractor$saverState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, saverWidgetsInteractor$saverState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        saverWidgetsInteractor$saverState$$inlined$map$1$2$1 = new SaverWidgetsInteractor$saverState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = saverWidgetsInteractor$saverState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saverWidgetsInteractor$saverState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
