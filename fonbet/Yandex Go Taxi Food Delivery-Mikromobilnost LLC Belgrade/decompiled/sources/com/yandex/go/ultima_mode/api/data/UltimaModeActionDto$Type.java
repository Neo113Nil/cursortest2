package com.yandex.go.ultima_mode.api.data;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/ultima_mode/api/data/UltimaModeActionDto$Type", "", "Lcom/yandex/go/ultima_mode/api/data/UltimaModeActionDto$Type;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", JCP.RAW_PREFIX, "TOGGLE_ULTIMA_MODE", "DEEPLINK", "CLOSE_AND_DEEPLINK", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UltimaModeActionDto$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UltimaModeActionDto$Type[] $VALUES;
    public static final UltimaModeActionDto$Type CLOSE_AND_DEEPLINK;
    public static final UltimaModeActionDto$Type DEEPLINK;
    public static final UltimaModeActionDto$Type NONE;
    public static final UltimaModeActionDto$Type TOGGLE_ULTIMA_MODE;
    private final String analyticsName;

    static {
        UltimaModeActionDto$Type ultimaModeActionDto$Type = new UltimaModeActionDto$Type(JCP.RAW_PREFIX, 0, "none");
        NONE = ultimaModeActionDto$Type;
        UltimaModeActionDto$Type ultimaModeActionDto$Type2 = new UltimaModeActionDto$Type("TOGGLE_ULTIMA_MODE", 1, "toggle_ultima_mode");
        TOGGLE_ULTIMA_MODE = ultimaModeActionDto$Type2;
        UltimaModeActionDto$Type ultimaModeActionDto$Type3 = new UltimaModeActionDto$Type("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = ultimaModeActionDto$Type3;
        UltimaModeActionDto$Type ultimaModeActionDto$Type4 = new UltimaModeActionDto$Type("CLOSE_AND_DEEPLINK", 3, "close_and_deeplink");
        CLOSE_AND_DEEPLINK = ultimaModeActionDto$Type4;
        UltimaModeActionDto$Type[] ultimaModeActionDto$TypeArr = {ultimaModeActionDto$Type, ultimaModeActionDto$Type2, ultimaModeActionDto$Type3, ultimaModeActionDto$Type4};
        $VALUES = ultimaModeActionDto$TypeArr;
        $ENTRIES = kotlin.enums.a.a(ultimaModeActionDto$TypeArr);
    }

    public UltimaModeActionDto$Type(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static UltimaModeActionDto$Type valueOf(String str) {
        return (UltimaModeActionDto$Type) Enum.valueOf(UltimaModeActionDto$Type.class, str);
    }

    public static UltimaModeActionDto$Type[] values() {
        return (UltimaModeActionDto$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
