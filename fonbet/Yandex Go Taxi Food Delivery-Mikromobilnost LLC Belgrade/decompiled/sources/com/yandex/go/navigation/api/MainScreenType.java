package com.yandex.go.navigation.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigation/api/MainScreenType;", "", "SuperAppMain", "MainScreenWithShortcuts", "NotMainScreen", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MainScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenType[] $VALUES;
    public static final MainScreenType MainScreenWithShortcuts;
    public static final MainScreenType NotMainScreen;
    public static final MainScreenType SuperAppMain;

    static {
        MainScreenType mainScreenType = new MainScreenType("SuperAppMain", 0);
        SuperAppMain = mainScreenType;
        MainScreenType mainScreenType2 = new MainScreenType("MainScreenWithShortcuts", 1);
        MainScreenWithShortcuts = mainScreenType2;
        MainScreenType mainScreenType3 = new MainScreenType("NotMainScreen", 2);
        NotMainScreen = mainScreenType3;
        MainScreenType[] mainScreenTypeArr = {mainScreenType, mainScreenType2, mainScreenType3};
        $VALUES = mainScreenTypeArr;
        $ENTRIES = a.a(mainScreenTypeArr);
    }

    public static MainScreenType valueOf(String str) {
        return (MainScreenType) Enum.valueOf(MainScreenType.class, str);
    }

    public static MainScreenType[] values() {
        return (MainScreenType[]) $VALUES.clone();
    }
}
