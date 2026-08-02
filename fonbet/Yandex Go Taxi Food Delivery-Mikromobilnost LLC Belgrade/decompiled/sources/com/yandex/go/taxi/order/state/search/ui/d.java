package com.yandex.go.taxi.order.state.search.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ com.yandex.go.taxi.order.repositories.b a;

    public d(com.yandex.go.taxi.order.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SearchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1 searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1;
        int i;
        if (continuation instanceof SearchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1) {
            searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1 = (SearchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1) continuation;
            int i2 = searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.L$0 = null;
                    searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.L$1 = null;
                    searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.L$2 = null;
                    searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1) == coroutineSingletons) {
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
        searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1 = new SearchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1(this, continuation);
        Object obj2 = searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchStateViewPresenter$observeHeaderUiState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
