package com.yandex.quark.yango;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/quark/yango/ActiveMode;", "", "GO", "EATS", "DELIVERY", "GROCERY", "MARKET", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActiveMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActiveMode[] $VALUES;
    public static final ActiveMode DELIVERY;
    public static final ActiveMode EATS;
    public static final ActiveMode GO;
    public static final ActiveMode GROCERY;
    public static final ActiveMode MARKET;

    static {
        ActiveMode activeMode = new ActiveMode("GO", 0);
        GO = activeMode;
        ActiveMode activeMode2 = new ActiveMode("EATS", 1);
        EATS = activeMode2;
        ActiveMode activeMode3 = new ActiveMode("DELIVERY", 2);
        DELIVERY = activeMode3;
        ActiveMode activeMode4 = new ActiveMode("GROCERY", 3);
        GROCERY = activeMode4;
        ActiveMode activeMode5 = new ActiveMode("MARKET", 4);
        MARKET = activeMode5;
        ActiveMode[] activeModeArr = {activeMode, activeMode2, activeMode3, activeMode4, activeMode5};
        $VALUES = activeModeArr;
        $ENTRIES = a.a(activeModeArr);
    }

    public static ActiveMode valueOf(String str) {
        return (ActiveMode) Enum.valueOf(ActiveMode.class, str);
    }

    public static ActiveMode[] values() {
        return (ActiveMode[]) $VALUES.clone();
    }
}
