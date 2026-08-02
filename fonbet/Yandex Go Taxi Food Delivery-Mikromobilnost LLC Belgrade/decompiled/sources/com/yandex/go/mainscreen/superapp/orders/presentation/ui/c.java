package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ List b;

    public c(vpr vprVar, List list) {
        this.a = vprVar;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1 superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1) {
            superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1 = (SuperAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (List) obj);
                    superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1 = new SuperAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersPresenter$observeUiState$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
