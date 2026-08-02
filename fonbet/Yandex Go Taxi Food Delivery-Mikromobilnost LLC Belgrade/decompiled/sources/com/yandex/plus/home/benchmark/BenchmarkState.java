package com.yandex.plus.home.benchmark;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/home/benchmark/BenchmarkState;", "", "NOT_STARTED", "STARTED", "COMPLETED", "ERROR", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BenchmarkState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BenchmarkState[] $VALUES;
    public static final BenchmarkState COMPLETED;
    public static final BenchmarkState ERROR;
    public static final BenchmarkState NOT_STARTED;
    public static final BenchmarkState STARTED;

    static {
        BenchmarkState benchmarkState = new BenchmarkState("NOT_STARTED", 0);
        NOT_STARTED = benchmarkState;
        BenchmarkState benchmarkState2 = new BenchmarkState("STARTED", 1);
        STARTED = benchmarkState2;
        BenchmarkState benchmarkState3 = new BenchmarkState("COMPLETED", 2);
        COMPLETED = benchmarkState3;
        BenchmarkState benchmarkState4 = new BenchmarkState("ERROR", 3);
        ERROR = benchmarkState4;
        BenchmarkState[] benchmarkStateArr = {benchmarkState, benchmarkState2, benchmarkState3, benchmarkState4};
        $VALUES = benchmarkStateArr;
        $ENTRIES = kotlin.enums.a.a(benchmarkStateArr);
    }

    public static BenchmarkState valueOf(String str) {
        return (BenchmarkState) Enum.valueOf(BenchmarkState.class, str);
    }

    public static BenchmarkState[] values() {
        return (BenchmarkState[]) $VALUES.clone();
    }
}
