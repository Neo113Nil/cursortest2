package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.dw20;
import defpackage.fw20;
import defpackage.kw20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ fw20 a;

    public e(fw20 fw20Var) {
        this.a = fw20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1 mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1;
        int i;
        kw20 kw20Var;
        if (continuation instanceof MobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1) {
            mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1 = (MobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.label;
                zy11 zy11Var = zy11.a;
                fw20 fw20Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kw20Var = (kw20) obj;
                    dw20 dw20Var = (dw20) fw20Var.Dg();
                    mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.L$2 = kw20Var;
                    mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.label = 1;
                    dw20Var.z8(kw20Var);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kw20Var = (kw20) mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                if (kw20Var.getRoutes().isEmpty()) {
                    fw20Var.A.d();
                } else {
                    fw20Var.A.e();
                }
                return zy11Var;
            }
        }
        mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1 = new MobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        fw20 fw20Var2 = this.a;
        if (i != 0) {
        }
        if (kw20Var.getRoutes().isEmpty()) {
        }
        return zy11Var2;
    }
}
