package com.yandex.plus.adapter.auth.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/adapter/auth/api/PlusAuthAdapter$Theme", "", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$Theme;", "LIGHT", "DARK", "FOLLOW_SYSTEM", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusAuthAdapter$Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusAuthAdapter$Theme[] $VALUES;
    public static final PlusAuthAdapter$Theme DARK;
    public static final PlusAuthAdapter$Theme FOLLOW_SYSTEM;
    public static final PlusAuthAdapter$Theme LIGHT;

    static {
        PlusAuthAdapter$Theme plusAuthAdapter$Theme = new PlusAuthAdapter$Theme("LIGHT", 0);
        LIGHT = plusAuthAdapter$Theme;
        PlusAuthAdapter$Theme plusAuthAdapter$Theme2 = new PlusAuthAdapter$Theme("DARK", 1);
        DARK = plusAuthAdapter$Theme2;
        PlusAuthAdapter$Theme plusAuthAdapter$Theme3 = new PlusAuthAdapter$Theme("FOLLOW_SYSTEM", 2);
        FOLLOW_SYSTEM = plusAuthAdapter$Theme3;
        PlusAuthAdapter$Theme[] plusAuthAdapter$ThemeArr = {plusAuthAdapter$Theme, plusAuthAdapter$Theme2, plusAuthAdapter$Theme3};
        $VALUES = plusAuthAdapter$ThemeArr;
        $ENTRIES = a.a(plusAuthAdapter$ThemeArr);
    }

    public static PlusAuthAdapter$Theme valueOf(String str) {
        return (PlusAuthAdapter$Theme) Enum.valueOf(PlusAuthAdapter$Theme.class, str);
    }

    public static PlusAuthAdapter$Theme[] values() {
        return (PlusAuthAdapter$Theme[]) $VALUES.clone();
    }
}
