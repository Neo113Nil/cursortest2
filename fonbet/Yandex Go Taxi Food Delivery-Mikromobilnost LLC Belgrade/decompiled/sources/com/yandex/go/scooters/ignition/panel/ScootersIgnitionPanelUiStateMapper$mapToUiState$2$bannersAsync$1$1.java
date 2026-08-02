package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.c6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvrn0;", "<anonymous>", "(Ltse;)Lvrn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1", f = "ScootersIgnitionPanelUiStateMapper.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.ControlPanel.Banner $it;
    final /* synthetic */ c6z $localizedExperiment;
    final /* synthetic */ Set<String> $shownBannersIds;
    final /* synthetic */ boolean $startAllowed;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1(e eVar, ScootersIgnitionExperiment.Ui.ControlPanel.Banner banner, c6z c6zVar, boolean z, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$it = banner;
        this.$localizedExperiment = c6zVar;
        this.$startAllowed = z;
        this.$shownBannersIds = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1(this.this$0, this.$it, this.$localizedExperiment, this.$startAllowed, this.$shownBannersIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        ScootersIgnitionExperiment.Ui.ControlPanel.Banner banner = this.$it;
        c6z c6zVar = this.$localizedExperiment;
        boolean z = this.$startAllowed;
        Set<String> set = this.$shownBannersIds;
        this.label = 1;
        Object a = e.a(eVar, banner, c6zVar, z, set, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
