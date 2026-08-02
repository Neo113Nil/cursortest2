package com.yandex.urbanads;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/urbanads/UrbanAdsError$ErrorType", "", "Lcom/yandex/urbanads/UrbanAdsError$ErrorType;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WEBVIEW", "MALFORMED_URL", "DIVKIT", "FLEX", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UrbanAdsError$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrbanAdsError$ErrorType[] $VALUES;
    public static final UrbanAdsError$ErrorType DIVKIT;
    public static final UrbanAdsError$ErrorType FLEX;
    public static final UrbanAdsError$ErrorType MALFORMED_URL;
    public static final UrbanAdsError$ErrorType WEBVIEW;
    private final String description;

    static {
        UrbanAdsError$ErrorType urbanAdsError$ErrorType = new UrbanAdsError$ErrorType("WEBVIEW", 0, "WKWebView error");
        WEBVIEW = urbanAdsError$ErrorType;
        UrbanAdsError$ErrorType urbanAdsError$ErrorType2 = new UrbanAdsError$ErrorType("MALFORMED_URL", 1, "Malformed URL");
        MALFORMED_URL = urbanAdsError$ErrorType2;
        UrbanAdsError$ErrorType urbanAdsError$ErrorType3 = new UrbanAdsError$ErrorType("DIVKIT", 2, "DivKit error");
        DIVKIT = urbanAdsError$ErrorType3;
        UrbanAdsError$ErrorType urbanAdsError$ErrorType4 = new UrbanAdsError$ErrorType("FLEX", 3, "Flex error");
        FLEX = urbanAdsError$ErrorType4;
        UrbanAdsError$ErrorType[] urbanAdsError$ErrorTypeArr = {urbanAdsError$ErrorType, urbanAdsError$ErrorType2, urbanAdsError$ErrorType3, urbanAdsError$ErrorType4};
        $VALUES = urbanAdsError$ErrorTypeArr;
        $ENTRIES = a.a(urbanAdsError$ErrorTypeArr);
    }

    public UrbanAdsError$ErrorType(String str, int i, String str2) {
        this.description = str2;
    }

    public static UrbanAdsError$ErrorType valueOf(String str) {
        return (UrbanAdsError$ErrorType) Enum.valueOf(UrbanAdsError$ErrorType.class, str);
    }

    public static UrbanAdsError$ErrorType[] values() {
        return (UrbanAdsError$ErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }
}
