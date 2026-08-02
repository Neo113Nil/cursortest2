package com.yandex.go.navigator.ui;

import defpackage.dd50;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dd50 b;

    public e(vpr vprVar, dd50 dd50Var) {
        this.a = vprVar;
        this.b = dd50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1 navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1) {
            navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1 = (NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1) continuation;
            int i2 = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Boolean) this.b.J.h()).booleanValue()) {
                        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.L$0 = null;
                        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.L$1 = null;
                        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.L$2 = null;
                        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.L$3 = null;
                        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1 = new NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
