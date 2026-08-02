package com.yandex.go.flex.common.data.bdui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/flex/common/data/bdui/RawResponseBody$State", "", "Lcom/yandex/go/flex/common/data/bdui/RawResponseBody$State;", "INITIAL", "PARSED_TO_STRING", "TERMINAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RawResponseBody$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RawResponseBody$State[] $VALUES;
    public static final RawResponseBody$State INITIAL;
    public static final RawResponseBody$State PARSED_TO_STRING;
    public static final RawResponseBody$State TERMINAL;

    static {
        RawResponseBody$State rawResponseBody$State = new RawResponseBody$State("INITIAL", 0);
        INITIAL = rawResponseBody$State;
        RawResponseBody$State rawResponseBody$State2 = new RawResponseBody$State("PARSED_TO_STRING", 1);
        PARSED_TO_STRING = rawResponseBody$State2;
        RawResponseBody$State rawResponseBody$State3 = new RawResponseBody$State("TERMINAL", 2);
        TERMINAL = rawResponseBody$State3;
        RawResponseBody$State[] rawResponseBody$StateArr = {rawResponseBody$State, rawResponseBody$State2, rawResponseBody$State3};
        $VALUES = rawResponseBody$StateArr;
        $ENTRIES = kotlin.enums.a.a(rawResponseBody$StateArr);
    }

    public static RawResponseBody$State valueOf(String str) {
        return (RawResponseBody$State) Enum.valueOf(RawResponseBody$State.class, str);
    }

    public static RawResponseBody$State[] values() {
        return (RawResponseBody$State[]) $VALUES.clone();
    }
}
