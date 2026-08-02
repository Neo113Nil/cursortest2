package com.yandex.go.yb.qr.domain;

import defpackage.aj31;
import defpackage.gu51;
import defpackage.iu51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ aj31 b;

    public f(vpr vprVar, aj31 aj31Var) {
        this.a = vprVar;
        this.b = aj31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof YbQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (YbQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gu51 gu51Var = (gu51) obj;
                    this.b.getClass();
                    iu51 iu51Var = gu51Var == null ? iu51.c : new iu51(gu51Var.a, gu51Var.b);
                    ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(iu51Var, ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new YbQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybQrUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
