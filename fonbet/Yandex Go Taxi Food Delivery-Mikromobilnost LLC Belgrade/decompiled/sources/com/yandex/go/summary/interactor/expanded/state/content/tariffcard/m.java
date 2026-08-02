package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.kb5;
import defpackage.mdx0;
import defpackage.mmq0;
import defpackage.nmq0;
import defpackage.ny61;
import defpackage.omq0;
import defpackage.vnx0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kb5 b;

    public m(vpr vprVar, kb5 kb5Var) {
        this.a = vprVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1 tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1;
        int i;
        vnx0 vnx0Var;
        if (continuation instanceof TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1) {
            tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1 = (TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    omq0 omq0Var = (omq0) obj;
                    if (omq0Var instanceof mmq0) {
                        vnx0Var = ((mmq0) omq0Var).a;
                    } else {
                        if (!(omq0Var instanceof nmq0)) {
                            w511.b();
                            return null;
                        }
                        vnx0Var = (vnx0) ((nmq0) omq0Var).b.get(this.b.a);
                    }
                    mdx0 mdx0Var = vnx0Var != null ? new mdx0(vnx0Var) : null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mdx0Var, tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1 = new TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
