package com.google.firebase.sessions;

import defpackage.k4o;
import defpackage.yn60;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/EventType;", "Lyn60;", "", "", "number", CA20Status.STATUS_USER_I, "getNumber", "()I", "EVENT_TYPE_UNKNOWN", "SESSION_START", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventType implements yn60 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType EVENT_TYPE_UNKNOWN;
    public static final EventType SESSION_START;
    private final int number;

    static {
        EventType eventType = new EventType("EVENT_TYPE_UNKNOWN", 0, 0);
        EVENT_TYPE_UNKNOWN = eventType;
        EventType eventType2 = new EventType("SESSION_START", 1, 1);
        SESSION_START = eventType2;
        EventType[] eventTypeArr = {eventType, eventType2};
        $VALUES = eventTypeArr;
        $ENTRIES = kotlin.enums.a.a(eventTypeArr);
    }

    public EventType(String str, int i, int i2) {
        this.number = i2;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    @Override // defpackage.yn60
    public final int getNumber() {
        return this.number;
    }
}
