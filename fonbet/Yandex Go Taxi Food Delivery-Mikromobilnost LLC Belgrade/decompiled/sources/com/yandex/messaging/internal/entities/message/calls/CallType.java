package com.yandex.messaging.internal.entities.message.calls;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/internal/entities/message/calls/CallType;", "", "VIDEO", "AUDIO", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CallType[] $VALUES;
    public static final CallType AUDIO;
    public static final CallType VIDEO;

    static {
        CallType callType = new CallType("VIDEO", 0);
        VIDEO = callType;
        CallType callType2 = new CallType("AUDIO", 1);
        AUDIO = callType2;
        CallType[] callTypeArr = {callType, callType2};
        $VALUES = callTypeArr;
        $ENTRIES = a.a(callTypeArr);
    }

    public static CallType valueOf(String str) {
        return (CallType) Enum.valueOf(CallType.class, str);
    }

    public static CallType[] values() {
        return (CallType[]) $VALUES.clone();
    }
}
