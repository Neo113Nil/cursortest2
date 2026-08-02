package com.yandex.messaging.internal.view.messagemenu;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/internal/view/messagemenu/MenuSection;", "", "First", "Second", "Third", "Fourth", "DangerZone", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuSection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MenuSection[] $VALUES;
    public static final MenuSection DangerZone;
    public static final MenuSection First;
    public static final MenuSection Fourth;
    public static final MenuSection Second;
    public static final MenuSection Third;

    static {
        MenuSection menuSection = new MenuSection("First", 0);
        First = menuSection;
        MenuSection menuSection2 = new MenuSection("Second", 1);
        Second = menuSection2;
        MenuSection menuSection3 = new MenuSection("Third", 2);
        Third = menuSection3;
        MenuSection menuSection4 = new MenuSection("Fourth", 3);
        Fourth = menuSection4;
        MenuSection menuSection5 = new MenuSection("DangerZone", 4);
        DangerZone = menuSection5;
        MenuSection[] menuSectionArr = {menuSection, menuSection2, menuSection3, menuSection4, menuSection5};
        $VALUES = menuSectionArr;
        $ENTRIES = kotlin.enums.a.a(menuSectionArr);
    }

    public static MenuSection valueOf(String str) {
        return (MenuSection) Enum.valueOf(MenuSection.class, str);
    }

    public static MenuSection[] values() {
        return (MenuSection[]) $VALUES.clone();
    }
}
