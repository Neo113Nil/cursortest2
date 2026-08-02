package com.yandex.go.overdraft.domain;

import defpackage.h3y;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.xs90;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class r extends xs90 {
    public final com.yandex.go.lifecycle.a b;
    public final h3y c;

    public r(com.yandex.go.lifecycle.a aVar, h3y h3yVar) {
        this.b = aVar;
        this.c = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PayDebtDeeplinkHandler$handleDeeplink$1 payDebtDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof PayDebtDeeplinkHandler$handleDeeplink$1) {
            payDebtDeeplinkHandler$handleDeeplink$1 = (PayDebtDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = payDebtDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payDebtDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = payDebtDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payDebtDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    payDebtDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    payDebtDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    payDebtDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    payDebtDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    payDebtDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.b.a(payDebtDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ((com.yandex.go.overdraft.ui.g) this.c.get()).j();
                return zy11.a;
            }
        }
        payDebtDeeplinkHandler$handleDeeplink$1 = new PayDebtDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = payDebtDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payDebtDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((com.yandex.go.overdraft.ui.g) this.c.get()).j();
        return zy11.a;
    }
}
