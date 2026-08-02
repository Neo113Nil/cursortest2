package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;

    public n(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SearchProgressInteractor$isProgressVisible$$inlined$map$3$2$1 searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1;
        int i;
        if (continuation instanceof SearchProgressInteractor$isProgressVisible$$inlined$map$3$2$1) {
            searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1 = (SearchProgressInteractor$isProgressVisible$$inlined$map$3$2$1) continuation;
            int i2 = searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((SearchState) obj).m);
                    searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.L$0 = null;
                    searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.L$1 = null;
                    searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.L$2 = null;
                    searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.L$3 = null;
                    searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(valueOf, searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1) == coroutineSingletons) {
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
        searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1 = new SearchProgressInteractor$isProgressVisible$$inlined$map$3$2$1(this, continuation);
        Object obj22 = searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchProgressInteractor$isProgressVisible$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
