package com.yandex.go.places.impl.ui.search.data.repositories;

import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vtp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
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
        SearchDebounceRepositories$start$$inlined$map$1$2$1 searchDebounceRepositories$start$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SearchDebounceRepositories$start$$inlined$map$1$2$1) {
            searchDebounceRepositories$start$$inlined$map$1$2$1 = (SearchDebounceRepositories$start$$inlined$map$1$2$1) continuation;
            int i2 = searchDebounceRepositories$start$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchDebounceRepositories$start$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchDebounceRepositories$start$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchDebounceRepositories$start$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vtp0 vtp0Var = new vtp0(evu0.k0((String) obj).toString());
                    searchDebounceRepositories$start$$inlined$map$1$2$1.L$0 = null;
                    searchDebounceRepositories$start$$inlined$map$1$2$1.L$1 = null;
                    searchDebounceRepositories$start$$inlined$map$1$2$1.L$2 = null;
                    searchDebounceRepositories$start$$inlined$map$1$2$1.L$3 = null;
                    searchDebounceRepositories$start$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(vtp0Var, searchDebounceRepositories$start$$inlined$map$1$2$1) == coroutineSingletons) {
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
        searchDebounceRepositories$start$$inlined$map$1$2$1 = new SearchDebounceRepositories$start$$inlined$map$1$2$1(this, continuation);
        Object obj22 = searchDebounceRepositories$start$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchDebounceRepositories$start$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
