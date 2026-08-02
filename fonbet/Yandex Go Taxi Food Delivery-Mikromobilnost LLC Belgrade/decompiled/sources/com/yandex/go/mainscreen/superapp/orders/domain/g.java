package com.yandex.go.mainscreen.superapp.orders.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ w201 b;

    public g(kotlinx.coroutines.flow.internal.g gVar, w201 w201Var) {
        this.a = gVar;
        this.b = w201Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1 superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1) {
            superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1 = (SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1) continuation;
            int i2 = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.L$0 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.L$1 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.L$2 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1 = new SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
