package com.yandex.go.places.impl.ui.search;

import defpackage.hnr0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(hnr0 hnr0Var) {
        this.a = hnr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) {
            searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 = (SearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) continuation;
            int i2 = searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$0 = null;
                    searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$1 = null;
                    searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$2 = null;
                    searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 = new SearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
