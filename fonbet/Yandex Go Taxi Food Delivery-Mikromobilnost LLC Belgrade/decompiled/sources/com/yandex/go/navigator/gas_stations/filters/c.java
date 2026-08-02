package com.yandex.go.navigator.gas_stations.filters;

import android.graphics.drawable.Drawable;
import defpackage.ny61;
import defpackage.pus;
import defpackage.rus;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ rus a;
    public final /* synthetic */ pus b;

    public c(rus rusVar, pus pusVar) {
        this.a = rusVar;
        this.b = pusVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1 gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1;
        int i;
        if (continuation instanceof GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1) {
            gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1 = (GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = this.a.y;
                    gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = bVar.g(24, gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                this.b.d((Drawable) obj2);
                return zy11.a;
            }
        }
        gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1 = new GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
        if (i != 0) {
        }
        this.b.d((Drawable) obj22);
        return zy11.a;
    }
}
