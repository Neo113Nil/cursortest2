package ru.vk.oneevent;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventStartMethod.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventStartMethod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventStartMethod[] $VALUES;
    public static final AppStartsEventStartMethod COMPANION;
    public static final AppStartsEventStartMethod DEEPLINK;
    public static final AppStartsEventStartMethod PUSH;
    public static final AppStartsEventStartMethod SHARING;
    public static final AppStartsEventStartMethod SPRINGBOARD;
    private final String wireValue;

    static {
        AppStartsEventStartMethod appStartsEventStartMethod = new AppStartsEventStartMethod("SPRINGBOARD", 0, "springboard");
        SPRINGBOARD = appStartsEventStartMethod;
        AppStartsEventStartMethod appStartsEventStartMethod2 = new AppStartsEventStartMethod("PUSH", 1, "push");
        PUSH = appStartsEventStartMethod2;
        AppStartsEventStartMethod appStartsEventStartMethod3 = new AppStartsEventStartMethod("COMPANION", 2, "companion");
        COMPANION = appStartsEventStartMethod3;
        AppStartsEventStartMethod appStartsEventStartMethod4 = new AppStartsEventStartMethod("DEEPLINK", 3, "deeplink");
        DEEPLINK = appStartsEventStartMethod4;
        AppStartsEventStartMethod appStartsEventStartMethod5 = new AppStartsEventStartMethod("SHARING", 4, "sharing");
        SHARING = appStartsEventStartMethod5;
        AppStartsEventStartMethod[] appStartsEventStartMethodArr = {appStartsEventStartMethod, appStartsEventStartMethod2, appStartsEventStartMethod3, appStartsEventStartMethod4, appStartsEventStartMethod5};
        $VALUES = appStartsEventStartMethodArr;
        $ENTRIES = new asp(appStartsEventStartMethodArr);
    }

    public AppStartsEventStartMethod(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventStartMethod valueOf(String str) {
        return (AppStartsEventStartMethod) Enum.valueOf(AppStartsEventStartMethod.class, str);
    }

    public static AppStartsEventStartMethod[] values() {
        return (AppStartsEventStartMethod[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
