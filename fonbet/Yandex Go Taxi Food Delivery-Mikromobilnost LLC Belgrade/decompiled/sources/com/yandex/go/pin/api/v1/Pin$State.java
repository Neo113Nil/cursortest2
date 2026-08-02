package com.yandex.go.pin.api.v1;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/pin/api/v1/Pin$State", "", "Lcom/yandex/go/pin/api/v1/Pin$State;", "IDLE", "MOVE", "IN_PROGRESS", BaseDatabaseHelper.TYPE_TEXT, "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Pin$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Pin$State[] $VALUES;
    public static final Pin$State ERROR;
    public static final Pin$State IDLE;
    public static final Pin$State IN_PROGRESS;
    public static final Pin$State MOVE;
    public static final Pin$State TEXT;

    static {
        Pin$State pin$State = new Pin$State("IDLE", 0);
        IDLE = pin$State;
        Pin$State pin$State2 = new Pin$State("MOVE", 1);
        MOVE = pin$State2;
        Pin$State pin$State3 = new Pin$State("IN_PROGRESS", 2);
        IN_PROGRESS = pin$State3;
        Pin$State pin$State4 = new Pin$State(BaseDatabaseHelper.TYPE_TEXT, 3);
        TEXT = pin$State4;
        Pin$State pin$State5 = new Pin$State("ERROR", 4);
        ERROR = pin$State5;
        Pin$State[] pin$StateArr = {pin$State, pin$State2, pin$State3, pin$State4, pin$State5};
        $VALUES = pin$StateArr;
        $ENTRIES = kotlin.enums.a.a(pin$StateArr);
    }

    public static Pin$State valueOf(String str) {
        return (Pin$State) Enum.valueOf(Pin$State.class, str);
    }

    public static Pin$State[] values() {
        return (Pin$State[]) $VALUES.clone();
    }
}
