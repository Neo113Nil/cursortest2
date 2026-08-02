package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.i4u;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ i4u b;

    public p(tpr tprVar, i4u i4uVar) {
        this.a = tprVar;
        this.b = i4uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$1 headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$1) {
            headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1 = (HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$1) continuation;
            int i2 = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.L$0 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.L$1 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.L$2 = null;
                    headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(oVar, headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1 = new HeaderUiStateInteractor$headerUiStateFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiStateInteractor$headerUiStateFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
