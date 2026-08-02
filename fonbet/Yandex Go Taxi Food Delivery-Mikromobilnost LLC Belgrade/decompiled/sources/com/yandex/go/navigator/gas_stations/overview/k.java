package com.yandex.go.navigator.gas_stations.overview;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.fvs;
import defpackage.ny61;
import defpackage.ovs;
import defpackage.pvs;
import defpackage.pz40;
import defpackage.qvs;
import defpackage.rvs;
import defpackage.svs;
import defpackage.w511;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class k implements fvs {
    public final /* synthetic */ GasStationsOverviewView a;

    public k(GasStationsOverviewView gasStationsOverviewView) {
        this.a = gasStationsOverviewView;
    }

    @Override // defpackage.fvs
    public final Object awaitFocusRectReady(Continuation continuation) {
        Object prepareStaticFocusRect;
        prepareStaticFocusRect = this.a.prepareStaticFocusRect(continuation);
        return prepareStaticFocusRect;
    }

    @Override // defpackage.fvs
    public final void e8(int i) {
        GasStationsOverviewView gasStationsOverviewView = this.a;
        gasStationsOverviewView.smoothScrollToPositionWithFixedTime(GasStationsOverviewView.access$getBinding(gasStationsOverviewView).e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.fvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ke(ContinuationImpl continuationImpl) {
        GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1 gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1;
        int i;
        pz40 pz40Var;
        if (continuationImpl instanceof GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1) {
            gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1 = (GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1) continuationImpl;
            int i2 = gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.label;
                GasStationsOverviewView gasStationsOverviewView = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40Var = gasStationsOverviewView.isStationCardsDisplayedStateFlow;
                    GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$2 gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$2 = new GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$2(2, null);
                    gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(pz40Var, gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$2, gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new Integer(((LinearLayoutManager) GasStationsOverviewView.access$getBinding(gasStationsOverviewView).e.getLayoutManager()).H1());
            }
        }
        gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1 = new GasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1(this, continuationImpl);
        Object obj2 = gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewView$InnerMvpView$awaitCurrVisibleCardIdx$1.label;
        GasStationsOverviewView gasStationsOverviewView2 = this.a;
        if (i != 0) {
        }
        return new Integer(((LinearLayoutManager) GasStationsOverviewView.access$getBinding(gasStationsOverviewView2).e.getLayoutManager()).H1());
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        svs svsVar = (svs) obj;
        boolean z = svsVar instanceof qvs;
        GasStationsOverviewView gasStationsOverviewView = this.a;
        if (z) {
            gasStationsOverviewView.renderFocusButton((qvs) svsVar);
            return;
        }
        if (svsVar instanceof GasStationsOverviewUiState$ExpansionState) {
            gasStationsOverviewView.renderExpansionState((GasStationsOverviewUiState$ExpansionState) svsVar);
            return;
        }
        if (svsVar instanceof rvs) {
            gasStationsOverviewView.renderTitle((rvs) svsVar);
            return;
        }
        if (svsVar instanceof ovs) {
            gasStationsOverviewView.renderCardList((ovs) svsVar);
        } else if (svsVar instanceof pvs) {
            gasStationsOverviewView.renderFail((pvs) svsVar);
        } else {
            w511.b();
        }
    }
}
