package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.c6z;
import defpackage.f9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wrn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwrn0;", "<anonymous>", "(Ltse;)Lwrn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1", f = "ScootersIgnitionPanelUiStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.ControlPanel.StartEntryPoint $it;
    final /* synthetic */ c6z $localizedExperiment;
    final /* synthetic */ boolean $startEnabled;
    final /* synthetic */ String $startPromotionId;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1(e eVar, ScootersIgnitionExperiment.Ui.ControlPanel.StartEntryPoint startEntryPoint, c6z c6zVar, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$it = startEntryPoint;
        this.$localizedExperiment = c6zVar;
        this.$startEnabled = z;
        this.$startPromotionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1(this.this$0, this.$it, this.$localizedExperiment, this.$startEnabled, this.$startPromotionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1 scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1;
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.c;
            FormattedText e = f9s.e(this.$it.a, this.$localizedExperiment);
            this.label = 1;
            obj = ru.yandex.taxi.widget.c.e(cVar, e, null, false, this, 30);
            scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence2 = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1 = this;
                charSequence = charSequence2;
                return new wrn0(charSequence, (CharSequence) obj, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$it.c, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$startPromotionId, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$startEnabled);
            }
            kotlin.b.b(obj);
            scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1 = this;
        }
        CharSequence charSequence3 = (CharSequence) obj;
        ru.yandex.taxi.widget.c cVar2 = scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.this$0.c;
        FormattedText e2 = f9s.e(scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$it.b, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$localizedExperiment);
        scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.L$0 = charSequence3;
        scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar2, e2, null, false, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1, 30);
        if (obj != coroutineSingletons) {
            charSequence = charSequence3;
            return new wrn0(charSequence, (CharSequence) obj, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$it.c, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$startPromotionId, scootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1.$startEnabled);
        }
        return coroutineSingletons;
    }
}
