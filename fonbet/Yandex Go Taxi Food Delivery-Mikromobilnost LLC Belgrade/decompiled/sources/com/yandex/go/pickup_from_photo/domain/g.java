package com.yandex.go.pickup_from_photo.domain;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.uob0;
import defpackage.vpr;
import defpackage.yxb;
import defpackage.zuj0;
import defpackage.zxb;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zxb b;

    public g(vpr vprVar, zxb zxbVar) {
        this.a = vprVar;
        this.b = zxbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ClarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1 clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        zxb zxbVar = this.b;
        com.yandex.go.pickup_from_photo.experiment.p pVar = zxbVar.d;
        zuj0 zuj0Var = zxbVar.b;
        if (continuation instanceof ClarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1) {
            clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1 = (ClarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uob0 uob0Var = (uob0) obj;
                    yxb yxbVar = new yxb(((avj0) zuj0Var).h(kyh0.new_point_selection_screen_starting_point_title_statement), q5z.F(uob0Var.a.a), q5z.D(uob0Var.a.a), ((avj0) zuj0Var).h(kyh0.common_done), ((avj0) zuj0Var).h(kyh0.summary_porch_button_label), pVar.d(), pVar.e());
                    clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yxbVar, clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1 = new ClarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyAddressModalViewUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
