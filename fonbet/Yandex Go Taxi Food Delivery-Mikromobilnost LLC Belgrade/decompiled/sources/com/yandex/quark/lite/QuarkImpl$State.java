package com.yandex.quark.lite;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/quark/lite/QuarkImpl$State", "", "Lcom/yandex/quark/lite/QuarkImpl$State;", "INITIAL", "PREPARED", "STARTED", "quark-core-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class QuarkImpl$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QuarkImpl$State[] $VALUES;
    public static final QuarkImpl$State INITIAL;
    public static final QuarkImpl$State PREPARED;
    public static final QuarkImpl$State STARTED;

    static {
        QuarkImpl$State quarkImpl$State = new QuarkImpl$State("INITIAL", 0);
        INITIAL = quarkImpl$State;
        QuarkImpl$State quarkImpl$State2 = new QuarkImpl$State("PREPARED", 1);
        PREPARED = quarkImpl$State2;
        QuarkImpl$State quarkImpl$State3 = new QuarkImpl$State("STARTED", 2);
        STARTED = quarkImpl$State3;
        QuarkImpl$State[] quarkImpl$StateArr = {quarkImpl$State, quarkImpl$State2, quarkImpl$State3};
        $VALUES = quarkImpl$StateArr;
        $ENTRIES = kotlin.enums.a.a(quarkImpl$StateArr);
    }

    public static QuarkImpl$State valueOf(String str) {
        return (QuarkImpl$State) Enum.valueOf(QuarkImpl$State.class, str);
    }

    public static QuarkImpl$State[] values() {
        return (QuarkImpl$State[]) $VALUES.clone();
    }
}
