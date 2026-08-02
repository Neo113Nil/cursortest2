package com.yandex.go.flex.main_screen.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/flex/main_screen/presentation/MainScreenFlexSdkViewFabDelegate$State", "", "Lcom/yandex/go/flex/main_screen/presentation/MainScreenFlexSdkViewFabDelegate$State;", "Shown", "WaitingForButtons", "Hidden", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final class MainScreenFlexSdkViewFabDelegate$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenFlexSdkViewFabDelegate$State[] $VALUES;
    public static final MainScreenFlexSdkViewFabDelegate$State Hidden;
    public static final MainScreenFlexSdkViewFabDelegate$State Shown;
    public static final MainScreenFlexSdkViewFabDelegate$State WaitingForButtons;

    static {
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State = new MainScreenFlexSdkViewFabDelegate$State("Shown", 0);
        Shown = mainScreenFlexSdkViewFabDelegate$State;
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State2 = new MainScreenFlexSdkViewFabDelegate$State("WaitingForButtons", 1);
        WaitingForButtons = mainScreenFlexSdkViewFabDelegate$State2;
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State3 = new MainScreenFlexSdkViewFabDelegate$State("Hidden", 2);
        Hidden = mainScreenFlexSdkViewFabDelegate$State3;
        MainScreenFlexSdkViewFabDelegate$State[] mainScreenFlexSdkViewFabDelegate$StateArr = {mainScreenFlexSdkViewFabDelegate$State, mainScreenFlexSdkViewFabDelegate$State2, mainScreenFlexSdkViewFabDelegate$State3};
        $VALUES = mainScreenFlexSdkViewFabDelegate$StateArr;
        $ENTRIES = kotlin.enums.a.a(mainScreenFlexSdkViewFabDelegate$StateArr);
    }

    public static MainScreenFlexSdkViewFabDelegate$State valueOf(String str) {
        return (MainScreenFlexSdkViewFabDelegate$State) Enum.valueOf(MainScreenFlexSdkViewFabDelegate$State.class, str);
    }

    public static MainScreenFlexSdkViewFabDelegate$State[] values() {
        return (MainScreenFlexSdkViewFabDelegate$State[]) $VALUES.clone();
    }
}
