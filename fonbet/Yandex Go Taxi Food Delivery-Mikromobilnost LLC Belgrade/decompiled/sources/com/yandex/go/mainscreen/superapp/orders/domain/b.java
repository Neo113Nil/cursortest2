package com.yandex.go.mainscreen.superapp.orders.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.k;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ k a;
    public final /* synthetic */ String b;

    public b(k kVar, String str) {
        this.a = kVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1 superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1) {
            superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1 = (SuperAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1) continuation;
            int i2 = superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.L$0 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.L$1 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.L$2 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1) == coroutineSingletons) {
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
        superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1 = new SuperAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersUiStateInteractor$observeBundleUiState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
