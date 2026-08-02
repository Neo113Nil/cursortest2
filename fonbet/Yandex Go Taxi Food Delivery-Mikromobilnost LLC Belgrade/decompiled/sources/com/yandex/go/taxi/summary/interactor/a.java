package com.yandex.go.taxi.summary.interactor;

import defpackage.ay00;
import defpackage.ny61;
import defpackage.pgv0;
import defpackage.rgv0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ rgv0 b;

    public a(vpr vprVar, rgv0 rgv0Var) {
        this.a = vprVar;
        this.b = rgv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1 summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1) {
            summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1 = (SummaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    if (!(((ay00) obj) instanceof ay00)) {
                        w511.b();
                        return null;
                    }
                    summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pgv0.a, summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1 = new SummaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryHeaderUIStateInteractor$marketplaceTrailUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
