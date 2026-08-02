package com.yandex.go.navigator.ui;

import defpackage.dd50;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ dd50 b;

    public f(tpr tprVar, dd50 dd50Var) {
        this.a = tprVar;
        this.b = dd50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1 navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1;
        int i;
        if (continuation instanceof NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1) {
            navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1 = (NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1) continuation;
            int i2 = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.L$0 = null;
                    navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.L$1 = null;
                    navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.L$2 = null;
                    navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1) == coroutineSingletons) {
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
        navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1 = new NavigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1(this, continuation);
        Object obj2 = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMapPresenter$dispatchSelectedRoute$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
