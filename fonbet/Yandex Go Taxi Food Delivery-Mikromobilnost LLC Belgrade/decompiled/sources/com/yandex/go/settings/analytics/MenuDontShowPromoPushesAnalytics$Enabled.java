package com.yandex.go.settings.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/settings/analytics/MenuDontShowPromoPushesAnalytics$Enabled", "", "Lcom/yandex/go/settings/analytics/MenuDontShowPromoPushesAnalytics$Enabled;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "On", "Off", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MenuDontShowPromoPushesAnalytics$Enabled {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MenuDontShowPromoPushesAnalytics$Enabled[] $VALUES;
    public static final MenuDontShowPromoPushesAnalytics$Enabled Off;
    public static final MenuDontShowPromoPushesAnalytics$Enabled On;
    private final String eventValue;

    static {
        MenuDontShowPromoPushesAnalytics$Enabled menuDontShowPromoPushesAnalytics$Enabled = new MenuDontShowPromoPushesAnalytics$Enabled("On", 0, "on");
        On = menuDontShowPromoPushesAnalytics$Enabled;
        MenuDontShowPromoPushesAnalytics$Enabled menuDontShowPromoPushesAnalytics$Enabled2 = new MenuDontShowPromoPushesAnalytics$Enabled("Off", 1, "off");
        Off = menuDontShowPromoPushesAnalytics$Enabled2;
        MenuDontShowPromoPushesAnalytics$Enabled[] menuDontShowPromoPushesAnalytics$EnabledArr = {menuDontShowPromoPushesAnalytics$Enabled, menuDontShowPromoPushesAnalytics$Enabled2};
        $VALUES = menuDontShowPromoPushesAnalytics$EnabledArr;
        $ENTRIES = a.a(menuDontShowPromoPushesAnalytics$EnabledArr);
    }

    public MenuDontShowPromoPushesAnalytics$Enabled(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MenuDontShowPromoPushesAnalytics$Enabled valueOf(String str) {
        return (MenuDontShowPromoPushesAnalytics$Enabled) Enum.valueOf(MenuDontShowPromoPushesAnalytics$Enabled.class, str);
    }

    public static MenuDontShowPromoPushesAnalytics$Enabled[] values() {
        return (MenuDontShowPromoPushesAnalytics$Enabled[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
