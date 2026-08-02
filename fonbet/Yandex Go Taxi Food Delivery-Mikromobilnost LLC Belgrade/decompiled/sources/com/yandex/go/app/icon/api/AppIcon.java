package com.yandex.go.app.icon.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/app/icon/api/AppIcon;", "", "DEFAULT", "CUSTOM", "go-client-android.features.app_icon:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppIcon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppIcon[] $VALUES;
    public static final AppIcon CUSTOM;
    public static final AppIcon DEFAULT;

    static {
        AppIcon appIcon = new AppIcon("DEFAULT", 0);
        DEFAULT = appIcon;
        AppIcon appIcon2 = new AppIcon("CUSTOM", 1);
        CUSTOM = appIcon2;
        AppIcon[] appIconArr = {appIcon, appIcon2};
        $VALUES = appIconArr;
        $ENTRIES = a.a(appIconArr);
    }

    public static AppIcon valueOf(String str) {
        return (AppIcon) Enum.valueOf(AppIcon.class, str);
    }

    public static AppIcon[] values() {
        return (AppIcon[]) $VALUES.clone();
    }
}
