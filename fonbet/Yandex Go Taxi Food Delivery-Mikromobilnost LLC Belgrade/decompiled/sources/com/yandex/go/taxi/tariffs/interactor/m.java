package com.yandex.go.taxi.tariffs.interactor;

import defpackage.b8r;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class m implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ b8r b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public m(r0 r0Var, b8r b8rVar, String str, String str2) {
        this.a = r0Var;
        this.b = b8rVar;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1 findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1) {
            findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1 = (FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b, this.c, this.w);
                    findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(lVar, findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1 = new FindTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = findTariffInteractorImpl$tariffFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
