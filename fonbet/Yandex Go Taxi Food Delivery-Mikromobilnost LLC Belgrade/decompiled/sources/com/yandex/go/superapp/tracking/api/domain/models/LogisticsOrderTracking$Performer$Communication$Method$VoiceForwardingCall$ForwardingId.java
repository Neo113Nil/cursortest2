package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;", "Performer", "InApp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId[] $VALUES;
    public static final LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId InApp;
    public static final LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId Performer;

    static {
        LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId = new LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId("Performer", 0);
        Performer = logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;
        LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId2 = new LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId("InApp", 1);
        InApp = logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId2;
        LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId[] logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingIdArr = {logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId, logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId2};
        $VALUES = logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingIdArr;
        $ENTRIES = a.a(logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingIdArr);
    }

    public static LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId valueOf(String str) {
        return (LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId) Enum.valueOf(LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.class, str);
    }

    public static LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId[] values() {
        return (LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId[]) $VALUES.clone();
    }
}
