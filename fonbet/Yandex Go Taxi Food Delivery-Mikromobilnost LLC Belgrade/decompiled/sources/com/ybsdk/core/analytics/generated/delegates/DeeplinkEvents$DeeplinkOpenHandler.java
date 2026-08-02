package com.ybsdk.core.analytics.generated.delegates;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/DeeplinkEvents$DeeplinkOpenHandler", "", "Lcom/ybsdk/core/analytics/generated/delegates/DeeplinkEvents$DeeplinkOpenHandler;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "APP", "HOST", "LOCAL", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeeplinkEvents$DeeplinkOpenHandler {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkEvents$DeeplinkOpenHandler[] $VALUES;
    public static final DeeplinkEvents$DeeplinkOpenHandler APP = new DeeplinkEvents$DeeplinkOpenHandler("APP", 0, "app");
    public static final DeeplinkEvents$DeeplinkOpenHandler HOST = new DeeplinkEvents$DeeplinkOpenHandler("HOST", 1, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
    public static final DeeplinkEvents$DeeplinkOpenHandler LOCAL = new DeeplinkEvents$DeeplinkOpenHandler("LOCAL", 2, "local");
    private final String originalValue;

    private static final /* synthetic */ DeeplinkEvents$DeeplinkOpenHandler[] $values() {
        return new DeeplinkEvents$DeeplinkOpenHandler[]{APP, HOST, LOCAL};
    }

    static {
        DeeplinkEvents$DeeplinkOpenHandler[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DeeplinkEvents$DeeplinkOpenHandler(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DeeplinkEvents$DeeplinkOpenHandler valueOf(String str) {
        return (DeeplinkEvents$DeeplinkOpenHandler) Enum.valueOf(DeeplinkEvents$DeeplinkOpenHandler.class, str);
    }

    public static DeeplinkEvents$DeeplinkOpenHandler[] values() {
        return (DeeplinkEvents$DeeplinkOpenHandler[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
