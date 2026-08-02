package com.yandex.go.chargers.error.api;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/error/api/ChargersErrorUiState$Icon", "", "Lcom/yandex/go/chargers/error/api/ChargersErrorUiState$Icon;", "ERROR", JCP.RAW_PREFIX, "go-client-android.features.chargers.error:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorUiState$Icon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersErrorUiState$Icon[] $VALUES;
    public static final ChargersErrorUiState$Icon ERROR;
    public static final ChargersErrorUiState$Icon NONE;

    static {
        ChargersErrorUiState$Icon chargersErrorUiState$Icon = new ChargersErrorUiState$Icon("ERROR", 0);
        ERROR = chargersErrorUiState$Icon;
        ChargersErrorUiState$Icon chargersErrorUiState$Icon2 = new ChargersErrorUiState$Icon(JCP.RAW_PREFIX, 1);
        NONE = chargersErrorUiState$Icon2;
        ChargersErrorUiState$Icon[] chargersErrorUiState$IconArr = {chargersErrorUiState$Icon, chargersErrorUiState$Icon2};
        $VALUES = chargersErrorUiState$IconArr;
        $ENTRIES = kotlin.enums.a.a(chargersErrorUiState$IconArr);
    }

    public static ChargersErrorUiState$Icon valueOf(String str) {
        return (ChargersErrorUiState$Icon) Enum.valueOf(ChargersErrorUiState$Icon.class, str);
    }

    public static ChargersErrorUiState$Icon[] values() {
        return (ChargersErrorUiState$Icon[]) $VALUES.clone();
    }
}
