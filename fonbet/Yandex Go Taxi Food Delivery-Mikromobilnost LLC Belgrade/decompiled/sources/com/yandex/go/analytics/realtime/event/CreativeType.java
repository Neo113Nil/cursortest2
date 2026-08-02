package com.yandex.go.analytics.realtime.event;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/analytics/realtime/event/CreativeType;", "", "", "creativeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PromoOverMap", "PromoOnSummary", "Card", "Fullscreen", "Story", "Notification", "MainScreenOnboarding", "Splash", "Ticket", "BrandingCar", "MissedSeen", "AiWidget", "Unsupported", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreativeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreativeType[] $VALUES;
    public static final CreativeType AiWidget;
    public static final CreativeType BrandingCar;
    public static final CreativeType Card;
    public static final CreativeType Fullscreen;
    public static final CreativeType MainScreenOnboarding;
    public static final CreativeType MissedSeen;
    public static final CreativeType Notification;
    public static final CreativeType PromoOnSummary;
    public static final CreativeType PromoOverMap;
    public static final CreativeType Splash;
    public static final CreativeType Story;
    public static final CreativeType Ticket;
    public static final CreativeType Unsupported;
    private final String creativeName;

    static {
        CreativeType creativeType = new CreativeType("PromoOverMap", 0, "object_over_map");
        PromoOverMap = creativeType;
        CreativeType creativeType2 = new CreativeType("PromoOnSummary", 1, "promo_on_summary");
        PromoOnSummary = creativeType2;
        CreativeType creativeType3 = new CreativeType("Card", 2, "card");
        Card = creativeType3;
        CreativeType creativeType4 = new CreativeType("Fullscreen", 3, "fullscreen");
        Fullscreen = creativeType4;
        CreativeType creativeType5 = new CreativeType("Story", 4, "story");
        Story = creativeType5;
        CreativeType creativeType6 = new CreativeType("Notification", 5, "notification");
        Notification = creativeType6;
        CreativeType creativeType7 = new CreativeType("MainScreenOnboarding", 6, "onboarding");
        MainScreenOnboarding = creativeType7;
        CreativeType creativeType8 = new CreativeType("Splash", 7, "splash");
        Splash = creativeType8;
        CreativeType creativeType9 = new CreativeType("Ticket", 8, "ticket");
        Ticket = creativeType9;
        CreativeType creativeType10 = new CreativeType("BrandingCar", 9, "branding_car");
        BrandingCar = creativeType10;
        CreativeType creativeType11 = new CreativeType("MissedSeen", 10, "missed_seen");
        MissedSeen = creativeType11;
        CreativeType creativeType12 = new CreativeType("AiWidget", 11, "ai_widget");
        AiWidget = creativeType12;
        CreativeType creativeType13 = new CreativeType("Unsupported", 12, "unsupported");
        Unsupported = creativeType13;
        CreativeType[] creativeTypeArr = {creativeType, creativeType2, creativeType3, creativeType4, creativeType5, creativeType6, creativeType7, creativeType8, creativeType9, creativeType10, creativeType11, creativeType12, creativeType13};
        $VALUES = creativeTypeArr;
        $ENTRIES = a.a(creativeTypeArr);
    }

    public CreativeType(String str, int i, String str2) {
        this.creativeName = str2;
    }

    public static CreativeType valueOf(String str) {
        return (CreativeType) Enum.valueOf(CreativeType.class, str);
    }

    public static CreativeType[] values() {
        return (CreativeType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCreativeName() {
        return this.creativeName;
    }
}
