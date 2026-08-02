package com.yandex.go.agreement.trackable.analitycs;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/agreement/trackable/analitycs/EULAAnalytics$AcceptanceCloseReason", "", "Lcom/yandex/go/agreement/trackable/analitycs/EULAAnalytics$AcceptanceCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AcceptButton", "RejectButton", "CloseButton", "Swipe", "TapOutside", "SystemBack", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EULAAnalytics$AcceptanceCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EULAAnalytics$AcceptanceCloseReason[] $VALUES;
    public static final EULAAnalytics$AcceptanceCloseReason AcceptButton;
    public static final EULAAnalytics$AcceptanceCloseReason CloseButton;
    public static final EULAAnalytics$AcceptanceCloseReason RejectButton;
    public static final EULAAnalytics$AcceptanceCloseReason Swipe;
    public static final EULAAnalytics$AcceptanceCloseReason SystemBack;
    public static final EULAAnalytics$AcceptanceCloseReason TapOutside;
    private final String eventValue;

    static {
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason = new EULAAnalytics$AcceptanceCloseReason("AcceptButton", 0, "accept_button");
        AcceptButton = eULAAnalytics$AcceptanceCloseReason;
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason2 = new EULAAnalytics$AcceptanceCloseReason("RejectButton", 1, "reject_button");
        RejectButton = eULAAnalytics$AcceptanceCloseReason2;
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason3 = new EULAAnalytics$AcceptanceCloseReason("CloseButton", 2, "close_button");
        CloseButton = eULAAnalytics$AcceptanceCloseReason3;
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason4 = new EULAAnalytics$AcceptanceCloseReason("Swipe", 3, "swipe");
        Swipe = eULAAnalytics$AcceptanceCloseReason4;
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason5 = new EULAAnalytics$AcceptanceCloseReason("TapOutside", 4, "tap_outside");
        TapOutside = eULAAnalytics$AcceptanceCloseReason5;
        EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason6 = new EULAAnalytics$AcceptanceCloseReason("SystemBack", 5, "system_back");
        SystemBack = eULAAnalytics$AcceptanceCloseReason6;
        EULAAnalytics$AcceptanceCloseReason[] eULAAnalytics$AcceptanceCloseReasonArr = {eULAAnalytics$AcceptanceCloseReason, eULAAnalytics$AcceptanceCloseReason2, eULAAnalytics$AcceptanceCloseReason3, eULAAnalytics$AcceptanceCloseReason4, eULAAnalytics$AcceptanceCloseReason5, eULAAnalytics$AcceptanceCloseReason6};
        $VALUES = eULAAnalytics$AcceptanceCloseReasonArr;
        $ENTRIES = a.a(eULAAnalytics$AcceptanceCloseReasonArr);
    }

    public EULAAnalytics$AcceptanceCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EULAAnalytics$AcceptanceCloseReason valueOf(String str) {
        return (EULAAnalytics$AcceptanceCloseReason) Enum.valueOf(EULAAnalytics$AcceptanceCloseReason.class, str);
    }

    public static EULAAnalytics$AcceptanceCloseReason[] values() {
        return (EULAAnalytics$AcceptanceCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
