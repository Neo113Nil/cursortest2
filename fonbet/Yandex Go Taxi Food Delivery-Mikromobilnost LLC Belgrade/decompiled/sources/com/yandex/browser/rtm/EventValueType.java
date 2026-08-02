package com.yandex.browser.rtm;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/browser/rtm/EventValueType;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "STRING", "FLOAT", BaseDatabaseHelper.TYPE_INTEGER, "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventValueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EventValueType[] $VALUES;
    public static final EventValueType FLOAT;
    public static final EventValueType INTEGER;
    public static final EventValueType STRING;
    private final String tag;

    static {
        EventValueType eventValueType = new EventValueType("STRING", 0, "string");
        STRING = eventValueType;
        EventValueType eventValueType2 = new EventValueType("FLOAT", 1, "float");
        FLOAT = eventValueType2;
        EventValueType eventValueType3 = new EventValueType(BaseDatabaseHelper.TYPE_INTEGER, 2, "integer");
        INTEGER = eventValueType3;
        EventValueType[] eventValueTypeArr = {eventValueType, eventValueType2, eventValueType3};
        $VALUES = eventValueTypeArr;
        $ENTRIES = a.a(eventValueTypeArr);
    }

    public EventValueType(String str, int i, String str2) {
        this.tag = str2;
    }

    public static EventValueType valueOf(String str) {
        return (EventValueType) Enum.valueOf(EventValueType.class, str);
    }

    public static EventValueType[] values() {
        return (EventValueType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
