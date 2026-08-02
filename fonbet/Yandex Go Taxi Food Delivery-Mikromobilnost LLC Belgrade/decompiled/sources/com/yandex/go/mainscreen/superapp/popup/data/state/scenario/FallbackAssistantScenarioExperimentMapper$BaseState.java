package com.yandex.go.mainscreen.superapp.popup.data.state.scenario;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/mainscreen/superapp/popup/data/state/scenario/FallbackAssistantScenarioExperimentMapper$BaseState", "", "Lcom/yandex/go/mainscreen/superapp/popup/data/state/scenario/FallbackAssistantScenarioExperimentMapper$BaseState;", "LOADING", "FAILURE", "RETRY", "NO_NETWORK_CONNECTION", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FallbackAssistantScenarioExperimentMapper$BaseState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FallbackAssistantScenarioExperimentMapper$BaseState[] $VALUES;
    public static final FallbackAssistantScenarioExperimentMapper$BaseState FAILURE;
    public static final FallbackAssistantScenarioExperimentMapper$BaseState LOADING;
    public static final FallbackAssistantScenarioExperimentMapper$BaseState NO_NETWORK_CONNECTION;
    public static final FallbackAssistantScenarioExperimentMapper$BaseState RETRY;

    static {
        FallbackAssistantScenarioExperimentMapper$BaseState fallbackAssistantScenarioExperimentMapper$BaseState = new FallbackAssistantScenarioExperimentMapper$BaseState("LOADING", 0);
        LOADING = fallbackAssistantScenarioExperimentMapper$BaseState;
        FallbackAssistantScenarioExperimentMapper$BaseState fallbackAssistantScenarioExperimentMapper$BaseState2 = new FallbackAssistantScenarioExperimentMapper$BaseState("FAILURE", 1);
        FAILURE = fallbackAssistantScenarioExperimentMapper$BaseState2;
        FallbackAssistantScenarioExperimentMapper$BaseState fallbackAssistantScenarioExperimentMapper$BaseState3 = new FallbackAssistantScenarioExperimentMapper$BaseState("RETRY", 2);
        RETRY = fallbackAssistantScenarioExperimentMapper$BaseState3;
        FallbackAssistantScenarioExperimentMapper$BaseState fallbackAssistantScenarioExperimentMapper$BaseState4 = new FallbackAssistantScenarioExperimentMapper$BaseState("NO_NETWORK_CONNECTION", 3);
        NO_NETWORK_CONNECTION = fallbackAssistantScenarioExperimentMapper$BaseState4;
        FallbackAssistantScenarioExperimentMapper$BaseState[] fallbackAssistantScenarioExperimentMapper$BaseStateArr = {fallbackAssistantScenarioExperimentMapper$BaseState, fallbackAssistantScenarioExperimentMapper$BaseState2, fallbackAssistantScenarioExperimentMapper$BaseState3, fallbackAssistantScenarioExperimentMapper$BaseState4};
        $VALUES = fallbackAssistantScenarioExperimentMapper$BaseStateArr;
        $ENTRIES = kotlin.enums.a.a(fallbackAssistantScenarioExperimentMapper$BaseStateArr);
    }

    public static FallbackAssistantScenarioExperimentMapper$BaseState valueOf(String str) {
        return (FallbackAssistantScenarioExperimentMapper$BaseState) Enum.valueOf(FallbackAssistantScenarioExperimentMapper$BaseState.class, str);
    }

    public static FallbackAssistantScenarioExperimentMapper$BaseState[] values() {
        return (FallbackAssistantScenarioExperimentMapper$BaseState[]) $VALUES.clone();
    }

    public final SuperAppFallbackBehaviourExperiment.State a(boolean z) {
        int i = a.a[ordinal()];
        if (i == 1) {
            return z ? SuperAppFallbackBehaviourExperiment.State.LOADING_WITH_TAXI : SuperAppFallbackBehaviourExperiment.State.LOADING_NO_TAXI;
        }
        if (i == 2) {
            return z ? SuperAppFallbackBehaviourExperiment.State.FAILURE_WITH_TAXI : SuperAppFallbackBehaviourExperiment.State.FAILURE_NO_TAXI;
        }
        if (i == 3) {
            return z ? SuperAppFallbackBehaviourExperiment.State.RETRY_WITH_TAXI : SuperAppFallbackBehaviourExperiment.State.RETRY_NO_TAXI;
        }
        if (i == 4) {
            return z ? SuperAppFallbackBehaviourExperiment.State.NO_NETWORK_CONNECTION_WITH_TAXI : SuperAppFallbackBehaviourExperiment.State.NO_NETWORK_CONNECTION_NO_TAXI;
        }
        w511.b();
        return null;
    }
}
