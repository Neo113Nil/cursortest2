package com.yandex.go.taxi.order.multi.feed.ui;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ com.yandex.go.taxi.order.multi.feed.experiments.e b;

    public c(b2k b2kVar, com.yandex.go.taxi.order.multi.feed.experiments.e eVar) {
        this.a = b2kVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderFeedPresenter$attachView$$inlined$map$1$1 taxiOrderFeedPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderFeedPresenter$attachView$$inlined$map$1$1) {
            taxiOrderFeedPresenter$attachView$$inlined$map$1$1 = (TaxiOrderFeedPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = taxiOrderFeedPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFeedPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderFeedPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFeedPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    taxiOrderFeedPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    taxiOrderFeedPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    taxiOrderFeedPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    taxiOrderFeedPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, taxiOrderFeedPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOrderFeedPresenter$attachView$$inlined$map$1$1 = new TaxiOrderFeedPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderFeedPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFeedPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
