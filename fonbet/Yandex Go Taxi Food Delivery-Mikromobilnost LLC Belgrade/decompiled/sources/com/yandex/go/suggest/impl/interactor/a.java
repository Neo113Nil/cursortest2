package com.yandex.go.suggest.impl.interactor;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestCartButtonExperiment;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.q4v0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1 superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1;
        int i;
        q4v0 q4v0Var;
        if (continuation instanceof SuperappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1) {
            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1 = (SuperappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1) continuation;
            int i2 = superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SuperappSuggestCartButtonExperiment superappSuggestCartButtonExperiment = (SuperappSuggestCartButtonExperiment) obj;
                    SuperappSuggestCartButtonExperiment.CartButton cartButton = superappSuggestCartButtonExperiment.c;
                    if ((cartButton != null ? cartButton.getA() : null) == null) {
                        if ((cartButton != null ? cartButton.getB() : null) == null) {
                            q4v0Var = null;
                            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$0 = null;
                            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$1 = null;
                            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$2 = null;
                            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$3 = null;
                            superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(q4v0Var, superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    String a = cartButton.getA();
                    q4v0Var = new q4v0(a != null ? d6z.Y(superappSuggestCartButtonExperiment, a) : null, cartButton.getB());
                    superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$0 = null;
                    superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$1 = null;
                    superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$2 = null;
                    superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.L$3 = null;
                    superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q4v0Var, superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1 = new SuperappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestCartButtonInteractor$buttonConfigurationFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
