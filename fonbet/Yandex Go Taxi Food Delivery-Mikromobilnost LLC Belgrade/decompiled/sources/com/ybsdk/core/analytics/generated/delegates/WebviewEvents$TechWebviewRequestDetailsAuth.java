package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/WebviewEvents$TechWebviewRequestDetailsAuth", "", "Lcom/ybsdk/core/analytics/generated/delegates/WebviewEvents$TechWebviewRequestDetailsAuth;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", JCP.RAW_PREFIX, "YANDEX", "MEMBER", "YB_NO_VERIFY", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebviewEvents$TechWebviewRequestDetailsAuth {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebviewEvents$TechWebviewRequestDetailsAuth[] $VALUES;
    private final String originalValue;
    public static final WebviewEvents$TechWebviewRequestDetailsAuth NONE = new WebviewEvents$TechWebviewRequestDetailsAuth(JCP.RAW_PREFIX, 0, "none");
    public static final WebviewEvents$TechWebviewRequestDetailsAuth YANDEX = new WebviewEvents$TechWebviewRequestDetailsAuth("YANDEX", 1, "yandex");
    public static final WebviewEvents$TechWebviewRequestDetailsAuth MEMBER = new WebviewEvents$TechWebviewRequestDetailsAuth("MEMBER", 2, y5e.o(y5e.z));
    public static final WebviewEvents$TechWebviewRequestDetailsAuth YB_NO_VERIFY = new WebviewEvents$TechWebviewRequestDetailsAuth("YB_NO_VERIFY", 3, y5e.o(y5e.P));

    private static final /* synthetic */ WebviewEvents$TechWebviewRequestDetailsAuth[] $values() {
        return new WebviewEvents$TechWebviewRequestDetailsAuth[]{NONE, YANDEX, MEMBER, YB_NO_VERIFY};
    }

    static {
        WebviewEvents$TechWebviewRequestDetailsAuth[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private WebviewEvents$TechWebviewRequestDetailsAuth(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WebviewEvents$TechWebviewRequestDetailsAuth valueOf(String str) {
        return (WebviewEvents$TechWebviewRequestDetailsAuth) Enum.valueOf(WebviewEvents$TechWebviewRequestDetailsAuth.class, str);
    }

    public static WebviewEvents$TechWebviewRequestDetailsAuth[] values() {
        return (WebviewEvents$TechWebviewRequestDetailsAuth[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
