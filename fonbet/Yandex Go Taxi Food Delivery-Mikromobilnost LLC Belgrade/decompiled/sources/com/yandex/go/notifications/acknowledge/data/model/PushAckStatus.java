package com.yandex.go.notifications.acknowledge.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o0g0;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/notifications/acknowledge/data/model/PushAckStatus;", "", "", "wireName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Companion", "o0g0", "SHOWN", "TAPPED", "BUTTON_TAPPED", "DISMISSED", "BLOCKED", "HIDDEN", "DELIVERED", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushAckStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushAckStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PushAckStatus BLOCKED;
    public static final PushAckStatus BUTTON_TAPPED;
    public static final o0g0 Companion;
    public static final PushAckStatus DELIVERED;
    public static final PushAckStatus DISMISSED;
    public static final PushAckStatus ERROR;
    public static final PushAckStatus HIDDEN;
    public static final PushAckStatus SHOWN;
    public static final PushAckStatus TAPPED;
    private final String wireName;

    static {
        PushAckStatus pushAckStatus = new PushAckStatus("SHOWN", 0, "SHOWN");
        SHOWN = pushAckStatus;
        PushAckStatus pushAckStatus2 = new PushAckStatus("TAPPED", 1, "TAPPED");
        TAPPED = pushAckStatus2;
        PushAckStatus pushAckStatus3 = new PushAckStatus("BUTTON_TAPPED", 2, "BUTTON_TAPPED");
        BUTTON_TAPPED = pushAckStatus3;
        PushAckStatus pushAckStatus4 = new PushAckStatus("DISMISSED", 3, "DISMISSED");
        DISMISSED = pushAckStatus4;
        PushAckStatus pushAckStatus5 = new PushAckStatus("BLOCKED", 4, "BLOCKED");
        BLOCKED = pushAckStatus5;
        PushAckStatus pushAckStatus6 = new PushAckStatus("HIDDEN", 5, "HIDDEN");
        HIDDEN = pushAckStatus6;
        PushAckStatus pushAckStatus7 = new PushAckStatus("DELIVERED", 6, "DELIVERED");
        DELIVERED = pushAckStatus7;
        PushAckStatus pushAckStatus8 = new PushAckStatus("ERROR", 7, "ERROR");
        ERROR = pushAckStatus8;
        PushAckStatus[] pushAckStatusArr = {pushAckStatus, pushAckStatus2, pushAckStatus3, pushAckStatus4, pushAckStatus5, pushAckStatus6, pushAckStatus7, pushAckStatus8};
        $VALUES = pushAckStatusArr;
        $ENTRIES = kotlin.enums.a.a(pushAckStatusArr);
        Companion = new o0g0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(22));
    }

    public PushAckStatus(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static PushAckStatus valueOf(String str) {
        return (PushAckStatus) Enum.valueOf(PushAckStatus.class, str);
    }

    public static PushAckStatus[] values() {
        return (PushAckStatus[]) $VALUES.clone();
    }

    /* renamed from: c, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
