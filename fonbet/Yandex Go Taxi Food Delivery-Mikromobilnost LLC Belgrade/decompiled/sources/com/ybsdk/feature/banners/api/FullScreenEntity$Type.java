package com.ybsdk.feature.banners.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/feature/banners/api/FullScreenEntity$Type", "", "Lcom/ybsdk/feature/banners/api/FullScreenEntity$Type;", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "DASHBOARD", "PRODUCTS", "MERCHANT_OFFERS", "AUTOTOPUP_SETTINGS", "AUTOTOPUP_SETTINGS_V2", "COMMON_DIVKIT", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullScreenEntity$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FullScreenEntity$Type[] $VALUES;
    private final String tag;
    public static final FullScreenEntity$Type DASHBOARD = new FullScreenEntity$Type("DASHBOARD", 0, "DASHBOARD_SCREEN_FULLSCREEN");
    public static final FullScreenEntity$Type PRODUCTS = new FullScreenEntity$Type("PRODUCTS", 1, "PRODUCTS_SCREEN_FULLSCREEN");
    public static final FullScreenEntity$Type MERCHANT_OFFERS = new FullScreenEntity$Type("MERCHANT_OFFERS", 2, "MERCHANT_OFFERS_SCREEN_FULLSCREEN");
    public static final FullScreenEntity$Type AUTOTOPUP_SETTINGS = new FullScreenEntity$Type("AUTOTOPUP_SETTINGS", 3, "AUTOTOPUP_SETTINGS_SCREEN_FULLSCREEN");
    public static final FullScreenEntity$Type AUTOTOPUP_SETTINGS_V2 = new FullScreenEntity$Type("AUTOTOPUP_SETTINGS_V2", 4, "AUTOTOPUP_SETTINGS_SCREEN_FULLSCREEN_V2");
    public static final FullScreenEntity$Type COMMON_DIVKIT = new FullScreenEntity$Type("COMMON_DIVKIT", 5, "COMMON_DIVKIT_FULLSCREEN");

    private static final /* synthetic */ FullScreenEntity$Type[] $values() {
        return new FullScreenEntity$Type[]{DASHBOARD, PRODUCTS, MERCHANT_OFFERS, AUTOTOPUP_SETTINGS, AUTOTOPUP_SETTINGS_V2, COMMON_DIVKIT};
    }

    static {
        FullScreenEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FullScreenEntity$Type(String str, int i, String str2) {
        this.tag = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FullScreenEntity$Type valueOf(String str) {
        return (FullScreenEntity$Type) Enum.valueOf(FullScreenEntity$Type.class, str);
    }

    public static FullScreenEntity$Type[] values() {
        return (FullScreenEntity$Type[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }
}
