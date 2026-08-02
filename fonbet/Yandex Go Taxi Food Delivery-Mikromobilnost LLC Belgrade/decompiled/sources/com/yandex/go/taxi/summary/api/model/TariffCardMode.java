package com.yandex.go.taxi.summary.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/api/model/TariffCardMode;", "", "DEFAULT", "LATE_INIT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffCardMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffCardMode[] $VALUES;
    public static final TariffCardMode DEFAULT;
    public static final TariffCardMode LATE_INIT;

    static {
        TariffCardMode tariffCardMode = new TariffCardMode("DEFAULT", 0);
        DEFAULT = tariffCardMode;
        TariffCardMode tariffCardMode2 = new TariffCardMode("LATE_INIT", 1);
        LATE_INIT = tariffCardMode2;
        TariffCardMode[] tariffCardModeArr = {tariffCardMode, tariffCardMode2};
        $VALUES = tariffCardModeArr;
        $ENTRIES = a.a(tariffCardModeArr);
    }

    public static TariffCardMode valueOf(String str) {
        return (TariffCardMode) Enum.valueOf(TariffCardMode.class, str);
    }

    public static TariffCardMode[] values() {
        return (TariffCardMode[]) $VALUES.clone();
    }
}
