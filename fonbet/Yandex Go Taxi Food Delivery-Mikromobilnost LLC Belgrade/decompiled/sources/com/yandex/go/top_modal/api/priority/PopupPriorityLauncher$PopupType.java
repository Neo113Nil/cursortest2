package com.yandex.go.top_modal.api.priority;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/top_modal/api/priority/PopupPriorityLauncher$PopupType", "", "Lcom/yandex/go/top_modal/api/priority/PopupPriorityLauncher$PopupType;", "", "priority", CA20Status.STATUS_USER_I, "a", "()I", "EULA", "GDPR", "LocationPermissionAgreement", "Onboarding", "Card", "Fullscreen", "Ticket", "Story", "go-client-android.features.top_modal:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PopupPriorityLauncher$PopupType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PopupPriorityLauncher$PopupType[] $VALUES;
    public static final PopupPriorityLauncher$PopupType Card;
    public static final PopupPriorityLauncher$PopupType EULA;
    public static final PopupPriorityLauncher$PopupType Fullscreen;
    public static final PopupPriorityLauncher$PopupType GDPR;
    public static final PopupPriorityLauncher$PopupType LocationPermissionAgreement;
    public static final PopupPriorityLauncher$PopupType Onboarding;
    public static final PopupPriorityLauncher$PopupType Story;
    public static final PopupPriorityLauncher$PopupType Ticket;
    private final int priority;

    static {
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType = new PopupPriorityLauncher$PopupType("EULA", 0, 1);
        EULA = popupPriorityLauncher$PopupType;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType2 = new PopupPriorityLauncher$PopupType("GDPR", 1, 1);
        GDPR = popupPriorityLauncher$PopupType2;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType3 = new PopupPriorityLauncher$PopupType("LocationPermissionAgreement", 2, 1);
        LocationPermissionAgreement = popupPriorityLauncher$PopupType3;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType4 = new PopupPriorityLauncher$PopupType("Onboarding", 3, 2);
        Onboarding = popupPriorityLauncher$PopupType4;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType5 = new PopupPriorityLauncher$PopupType("Card", 4, 3);
        Card = popupPriorityLauncher$PopupType5;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType6 = new PopupPriorityLauncher$PopupType("Fullscreen", 5, 3);
        Fullscreen = popupPriorityLauncher$PopupType6;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType7 = new PopupPriorityLauncher$PopupType("Ticket", 6, 3);
        Ticket = popupPriorityLauncher$PopupType7;
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType8 = new PopupPriorityLauncher$PopupType("Story", 7, 4);
        Story = popupPriorityLauncher$PopupType8;
        PopupPriorityLauncher$PopupType[] popupPriorityLauncher$PopupTypeArr = {popupPriorityLauncher$PopupType, popupPriorityLauncher$PopupType2, popupPriorityLauncher$PopupType3, popupPriorityLauncher$PopupType4, popupPriorityLauncher$PopupType5, popupPriorityLauncher$PopupType6, popupPriorityLauncher$PopupType7, popupPriorityLauncher$PopupType8};
        $VALUES = popupPriorityLauncher$PopupTypeArr;
        $ENTRIES = a.a(popupPriorityLauncher$PopupTypeArr);
    }

    public PopupPriorityLauncher$PopupType(String str, int i, int i2) {
        this.priority = i2;
    }

    public static PopupPriorityLauncher$PopupType valueOf(String str) {
        return (PopupPriorityLauncher$PopupType) Enum.valueOf(PopupPriorityLauncher$PopupType.class, str);
    }

    public static PopupPriorityLauncher$PopupType[] values() {
        return (PopupPriorityLauncher$PopupType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }
}
