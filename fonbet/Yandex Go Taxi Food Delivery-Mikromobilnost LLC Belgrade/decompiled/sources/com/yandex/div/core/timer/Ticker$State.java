package com.yandex.div.core.timer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/div/core/timer/Ticker$State", "", "Lcom/yandex/div/core/timer/Ticker$State;", "STOPPED", "WORKING", "PAUSED", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Ticker$State {
    private static final /* synthetic */ Ticker$State[] $VALUES;
    public static final Ticker$State PAUSED;
    public static final Ticker$State STOPPED;
    public static final Ticker$State WORKING;

    static {
        Ticker$State ticker$State = new Ticker$State("STOPPED", 0);
        STOPPED = ticker$State;
        Ticker$State ticker$State2 = new Ticker$State("WORKING", 1);
        WORKING = ticker$State2;
        Ticker$State ticker$State3 = new Ticker$State("PAUSED", 2);
        PAUSED = ticker$State3;
        $VALUES = new Ticker$State[]{ticker$State, ticker$State2, ticker$State3};
    }

    public static Ticker$State valueOf(String str) {
        return (Ticker$State) Enum.valueOf(Ticker$State.class, str);
    }

    public static Ticker$State[] values() {
        return (Ticker$State[]) $VALUES.clone();
    }
}
