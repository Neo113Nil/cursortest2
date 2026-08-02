package com.ybsdk.feature.banners.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/WidgetType;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN_SCREEN", "MAIN_SCREEN_PROMO", "DASHBOARD_SCREEN_FULLSCREEN", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidgetType[] $VALUES;
    public static final WidgetType MAIN_SCREEN = new WidgetType("MAIN_SCREEN", 0);
    public static final WidgetType MAIN_SCREEN_PROMO = new WidgetType("MAIN_SCREEN_PROMO", 1);
    public static final WidgetType DASHBOARD_SCREEN_FULLSCREEN = new WidgetType("DASHBOARD_SCREEN_FULLSCREEN", 2);

    private static final /* synthetic */ WidgetType[] $values() {
        return new WidgetType[]{MAIN_SCREEN, MAIN_SCREEN_PROMO, DASHBOARD_SCREEN_FULLSCREEN};
    }

    static {
        WidgetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private WidgetType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WidgetType valueOf(String str) {
        return (WidgetType) Enum.valueOf(WidgetType.class, str);
    }

    public static WidgetType[] values() {
        return (WidgetType[]) $VALUES.clone();
    }
}
