package com.yandex.go.taxi.tariffs.interactor;

import defpackage.b8r;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b8r b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public l(vpr vprVar, b8r b8rVar, String str, String str2) {
        this.a = vprVar;
        this.b = b8rVar;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1 findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1) {
            findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1 = (FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mi31 d = b8r.d(this.b, this.c, this.w, 4);
                    if (d != null) {
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(d, findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1 = new FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
