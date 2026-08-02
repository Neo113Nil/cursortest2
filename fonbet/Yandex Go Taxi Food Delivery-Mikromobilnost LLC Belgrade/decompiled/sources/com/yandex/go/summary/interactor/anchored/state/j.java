package com.yandex.go.summary.interactor.anchored.state;

import defpackage.akv0;
import defpackage.dj70;
import defpackage.gvb1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wi70;
import defpackage.wjv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t b;

    public j(vpr vprVar, t tVar) {
        this.a = vprVar;
        this.b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FooterUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1 footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1;
        int i;
        akv0 akv0Var = this.b.e;
        if (continuation instanceof FooterUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1) {
            footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1 = (FooterUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dj70 c = gvb1.c((wi70) obj, akv0Var.a.a(new wjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT)), akv0Var.a.a(new wjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT)));
                    footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1 = new FooterUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = footerUiStateInteractor$orderButtonUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
