package com.ybsdk.feature.deeplink.api;

import defpackage.k4o;
import defpackage.s3h;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "s3h", "UNSPECIFIED", "SHORTCUT", "PUSH", "WEB_VIEW", "PUBLIC_API", "TRANSFERS_DASHBOARD", "DIVKIT", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeeplinkSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkSource[] $VALUES;
    public static final s3h Companion;
    public static final DeeplinkSource UNSPECIFIED = new DeeplinkSource("UNSPECIFIED", 0);
    public static final DeeplinkSource SHORTCUT = new DeeplinkSource("SHORTCUT", 1);
    public static final DeeplinkSource PUSH = new DeeplinkSource("PUSH", 2);
    public static final DeeplinkSource WEB_VIEW = new DeeplinkSource("WEB_VIEW", 3);
    public static final DeeplinkSource PUBLIC_API = new DeeplinkSource("PUBLIC_API", 4);
    public static final DeeplinkSource TRANSFERS_DASHBOARD = new DeeplinkSource("TRANSFERS_DASHBOARD", 5);
    public static final DeeplinkSource DIVKIT = new DeeplinkSource("DIVKIT", 6);

    private static final /* synthetic */ DeeplinkSource[] $values() {
        return new DeeplinkSource[]{UNSPECIFIED, SHORTCUT, PUSH, WEB_VIEW, PUBLIC_API, TRANSFERS_DASHBOARD, DIVKIT};
    }

    static {
        DeeplinkSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new s3h();
    }

    private DeeplinkSource(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DeeplinkSource valueOf(String str) {
        return (DeeplinkSource) Enum.valueOf(DeeplinkSource.class, str);
    }

    public static DeeplinkSource[] values() {
        return (DeeplinkSource[]) $VALUES.clone();
    }
}
