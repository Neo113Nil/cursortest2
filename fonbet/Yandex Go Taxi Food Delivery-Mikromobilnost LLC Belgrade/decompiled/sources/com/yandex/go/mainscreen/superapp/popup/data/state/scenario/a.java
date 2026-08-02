package com.yandex.go.mainscreen.superapp.popup.data.state.scenario;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FallbackAssistantScenarioExperimentMapper$BaseState.values().length];
        try {
            iArr[FallbackAssistantScenarioExperimentMapper$BaseState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FallbackAssistantScenarioExperimentMapper$BaseState.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FallbackAssistantScenarioExperimentMapper$BaseState.RETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FallbackAssistantScenarioExperimentMapper$BaseState.NO_NETWORK_CONNECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
