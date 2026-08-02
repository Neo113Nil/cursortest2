package com.yandex.go.platform.sdk.models;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/platform/sdk/models/WebAccountType;", "", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "YANDEX", "LITE", "PHONISH", "SOCIAL", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebAccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebAccountType[] $VALUES;
    public static final WebAccountType NONE = new WebAccountType(JCP.RAW_PREFIX, 0);
    public static final WebAccountType YANDEX = new WebAccountType("YANDEX", 1);
    public static final WebAccountType LITE = new WebAccountType("LITE", 2);
    public static final WebAccountType PHONISH = new WebAccountType("PHONISH", 3);
    public static final WebAccountType SOCIAL = new WebAccountType("SOCIAL", 4);

    private static final /* synthetic */ WebAccountType[] $values() {
        return new WebAccountType[]{NONE, YANDEX, LITE, PHONISH, SOCIAL};
    }

    static {
        WebAccountType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WebAccountType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WebAccountType valueOf(String str) {
        return (WebAccountType) Enum.valueOf(WebAccountType.class, str);
    }

    public static WebAccountType[] values() {
        return (WebAccountType[]) $VALUES.clone();
    }
}
