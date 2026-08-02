package com.yandex.go.tips.navigation;

import android.content.Context;
import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import com.yandex.go.tips.ui.selector_v1.TipsSelectorModalView;
import com.yandex.go.tips.ui.selector_v2.TipsSettingsModalView;
import defpackage.dmw0;
import defpackage.e8b0;
import defpackage.ehu;
import defpackage.hhz0;
import defpackage.hne0;
import defpackage.jhz0;
import defpackage.m950;
import defpackage.n2v0;
import defpackage.nfz0;
import defpackage.ny61;
import defpackage.w030;
import defpackage.wpy0;
import defpackage.xvf0;
import defpackage.yvr0;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b extends com.yandex.go.navigation.modals.coroutines.a implements m950 {
    public final w030 F;
    public final hhz0 G;
    public final jhz0 H;
    public final yvr0 I;
    public final ehu J;

    public b(w030 w030Var, hhz0 hhz0Var, jhz0 jhz0Var, yvr0 yvr0Var, ehu ehuVar) {
        super("TipsSelectorRouter");
        this.F = w030Var;
        this.G = hhz0Var;
        this.H = jhz0Var;
        this.I = yvr0Var;
        this.J = ehuVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final /* bridge */ /* synthetic */ Object S(Object obj, Continuation continuation) {
        return T(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Continuation continuation) {
        TipsSelectorRouterImpl$provideModalView$1 tipsSelectorRouterImpl$provideModalView$1;
        int i;
        TipsSettingsModalExperiment tipsSettingsModalExperiment;
        if (continuation instanceof TipsSelectorRouterImpl$provideModalView$1) {
            tipsSelectorRouterImpl$provideModalView$1 = (TipsSelectorRouterImpl$provideModalView$1) continuation;
            int i2 = tipsSelectorRouterImpl$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tipsSelectorRouterImpl$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tipsSelectorRouterImpl$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tipsSelectorRouterImpl$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tipsSelectorRouterImpl$provideModalView$1.L$0 = null;
                    tipsSelectorRouterImpl$provideModalView$1.label = 1;
                    obj = this.J.b.b(tipsSelectorRouterImpl$provideModalView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                tipsSettingsModalExperiment = (TipsSettingsModalExperiment) obj;
                if (tipsSettingsModalExperiment.b) {
                    Object obj2 = this.I.get();
                    ((TipsSelectorModalView) obj2).setOnTipUpdateListener(new n2v0(21, this));
                    return obj2;
                }
                wpy0 wpy0Var = new wpy0(3, this);
                dmw0 dmw0Var = this.H.a;
                return new TipsSettingsModalView(new com.yandex.go.tips.ui.selector_v2.a(tipsSettingsModalExperiment, wpy0Var, (hne0) ((e8b0) dmw0Var.a).get(), (zuj0) ((xvf0) dmw0Var.b).get(), (nfz0) ((xvf0) dmw0Var.c).get()), (Context) this.G.a.a.get());
            }
        }
        tipsSelectorRouterImpl$provideModalView$1 = new TipsSelectorRouterImpl$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj3 = tipsSelectorRouterImpl$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tipsSelectorRouterImpl$provideModalView$1.label;
        if (i != 0) {
        }
        tipsSettingsModalExperiment = (TipsSettingsModalExperiment) obj3;
        if (tipsSettingsModalExperiment.b) {
        }
    }
}
