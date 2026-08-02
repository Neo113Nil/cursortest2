package com.yandex.go.places.organization.card.impl.domain.entities.card;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/domain/entities/card/FocusPinMode;", "", "ALWAYS", "FIRST", "SMART", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FocusPinMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FocusPinMode[] $VALUES;
    public static final FocusPinMode ALWAYS;
    public static final FocusPinMode FIRST;
    public static final FocusPinMode NONE;
    public static final FocusPinMode SMART;

    static {
        FocusPinMode focusPinMode = new FocusPinMode("ALWAYS", 0);
        ALWAYS = focusPinMode;
        FocusPinMode focusPinMode2 = new FocusPinMode("FIRST", 1);
        FIRST = focusPinMode2;
        FocusPinMode focusPinMode3 = new FocusPinMode("SMART", 2);
        SMART = focusPinMode3;
        FocusPinMode focusPinMode4 = new FocusPinMode(JCP.RAW_PREFIX, 3);
        NONE = focusPinMode4;
        FocusPinMode[] focusPinModeArr = {focusPinMode, focusPinMode2, focusPinMode3, focusPinMode4};
        $VALUES = focusPinModeArr;
        $ENTRIES = a.a(focusPinModeArr);
    }

    public static FocusPinMode valueOf(String str) {
        return (FocusPinMode) Enum.valueOf(FocusPinMode.class, str);
    }

    public static FocusPinMode[] values() {
        return (FocusPinMode[]) $VALUES.clone();
    }
}
