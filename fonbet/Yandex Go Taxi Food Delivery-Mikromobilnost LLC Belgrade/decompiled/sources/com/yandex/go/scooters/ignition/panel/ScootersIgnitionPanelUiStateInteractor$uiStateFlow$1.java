package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.domain.k;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.c6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yrn0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzy11;", "<unused var>", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;", "experiment", "", "ignitionEnabled", "Lxrn0;", "<anonymous>", "(VLcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;Z)Lcom/yandex/go/scooters/ignition/panel/ScootersIgnitionPanelUiState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1", f = "ScootersIgnitionPanelUiStateInteractor.kt", l = {42, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ yrn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1(yrn0 yrn0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = yrn0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1 scootersIgnitionPanelUiStateInteractor$uiStateFlow$1 = new ScootersIgnitionPanelUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        scootersIgnitionPanelUiStateInteractor$uiStateFlow$1.L$0 = (ScootersIgnitionExperiment) obj2;
        scootersIgnitionPanelUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        return scootersIgnitionPanelUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        ScootersIgnitionExperiment.Ui.ControlPanel controlPanel;
        c6z c6zVar;
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScootersIgnitionExperiment.Ui.ControlPanel controlPanel2 = scootersIgnitionExperiment.r.g;
            if (controlPanel2 == null) {
                zgz.a(null, new IllegalStateException("controlPanel must be not null here"));
            }
            eVar = this.this$0.d;
            if (controlPanel2 == null) {
                ScootersIgnitionExperiment.Ui.ControlPanel.Companion.getClass();
                controlPanel2 = ScootersIgnitionExperiment.Ui.ControlPanel.f;
            }
            k kVar = this.this$0.c;
            this.L$0 = scootersIgnitionExperiment;
            this.L$1 = null;
            this.L$2 = eVar;
            this.L$3 = controlPanel2;
            this.L$4 = scootersIgnitionExperiment;
            this.Z$0 = z;
            this.label = 1;
            Object a = kVar.a(this);
            if (a != coroutineSingletons) {
                controlPanel = controlPanel2;
                obj = a;
                c6zVar = scootersIgnitionExperiment;
            }
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        c6zVar = (c6z) this.L$4;
        controlPanel = (ScootersIgnitionExperiment.Ui.ControlPanel) this.L$3;
        eVar = (e) this.L$2;
        kotlin.b.b(obj);
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = scootersIgnitionExperiment.o;
        if (str == null) {
            str = "";
        }
        Set b = this.this$0.b.b();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.Z$0 = z;
        this.label = 2;
        eVar.getClass();
        Object n = bvf0.n(new ScootersIgnitionPanelUiStateMapper$mapToUiState$2(controlPanel, eVar, c6zVar, booleanValue, b, z, str, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
