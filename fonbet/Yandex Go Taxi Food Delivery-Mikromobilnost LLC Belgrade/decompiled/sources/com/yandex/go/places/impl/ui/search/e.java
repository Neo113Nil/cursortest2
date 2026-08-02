package com.yandex.go.places.impl.ui.search;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f b;

    public e(tpr tprVar, f fVar) {
        this.a = tprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SearchPresenter$attachView$$inlined$map$1$1 searchPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof SearchPresenter$attachView$$inlined$map$1$1) {
            searchPresenter$attachView$$inlined$map$1$1 = (SearchPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = searchPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    searchPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    searchPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    searchPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    searchPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, searchPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        searchPresenter$attachView$$inlined$map$1$1 = new SearchPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = searchPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
