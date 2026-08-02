package com.yandex.plus.core.benchmark;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/core/benchmark/Benchmark$State", "", "Lcom/yandex/plus/core/benchmark/Benchmark$State;", "NOT_STARTED", "STARTED", "STOPPED", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Benchmark$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Benchmark$State[] $VALUES;
    public static final Benchmark$State NOT_STARTED;
    public static final Benchmark$State STARTED;
    public static final Benchmark$State STOPPED;

    static {
        Benchmark$State benchmark$State = new Benchmark$State("NOT_STARTED", 0);
        NOT_STARTED = benchmark$State;
        Benchmark$State benchmark$State2 = new Benchmark$State("STARTED", 1);
        STARTED = benchmark$State2;
        Benchmark$State benchmark$State3 = new Benchmark$State("STOPPED", 2);
        STOPPED = benchmark$State3;
        Benchmark$State[] benchmark$StateArr = {benchmark$State, benchmark$State2, benchmark$State3};
        $VALUES = benchmark$StateArr;
        $ENTRIES = kotlin.enums.a.a(benchmark$StateArr);
    }

    public static Benchmark$State valueOf(String str) {
        return (Benchmark$State) Enum.valueOf(Benchmark$State.class, str);
    }

    public static Benchmark$State[] values() {
        return (Benchmark$State[]) $VALUES.clone();
    }
}
