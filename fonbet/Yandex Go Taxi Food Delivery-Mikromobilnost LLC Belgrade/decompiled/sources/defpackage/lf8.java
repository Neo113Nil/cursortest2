package defpackage;

import com.ybsdk.feature.card.api.CardScenarioEventsReceiver$ActivationResult;
import com.ybsdk.navigation.ScenarioResultReceiver$CardActivationResult;

/* loaded from: classes3.dex */
public final class lf8 {
    public final /* synthetic */ nvd a;

    public lf8(nvd nvdVar) {
        this.a = nvdVar;
    }

    public final void a(CardScenarioEventsReceiver$ActivationResult cardScenarioEventsReceiver$ActivationResult) {
        ScenarioResultReceiver$CardActivationResult scenarioResultReceiver$CardActivationResult;
        int i = kf8.a[cardScenarioEventsReceiver$ActivationResult.ordinal()];
        if (i == 1) {
            scenarioResultReceiver$CardActivationResult = ScenarioResultReceiver$CardActivationResult.FAIL;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            scenarioResultReceiver$CardActivationResult = ScenarioResultReceiver$CardActivationResult.SUCCESS;
        }
        this.a.g(scenarioResultReceiver$CardActivationResult);
    }
}
