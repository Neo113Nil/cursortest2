package com.yandex.passport.internal.flags.experiments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/flags/experiments/ExperimentsUpdater$LoadingStrategy", "", "Lcom/yandex/passport/internal/flags/experiments/ExperimentsUpdater$LoadingStrategy;", "INITIALIZATION", "DAILY", "FORCED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExperimentsUpdater$LoadingStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentsUpdater$LoadingStrategy[] $VALUES;
    public static final ExperimentsUpdater$LoadingStrategy DAILY;
    public static final ExperimentsUpdater$LoadingStrategy FORCED;
    public static final ExperimentsUpdater$LoadingStrategy INITIALIZATION;

    static {
        ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy = new ExperimentsUpdater$LoadingStrategy("INITIALIZATION", 0);
        INITIALIZATION = experimentsUpdater$LoadingStrategy;
        ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy2 = new ExperimentsUpdater$LoadingStrategy("DAILY", 1);
        DAILY = experimentsUpdater$LoadingStrategy2;
        ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy3 = new ExperimentsUpdater$LoadingStrategy("FORCED", 2);
        FORCED = experimentsUpdater$LoadingStrategy3;
        ExperimentsUpdater$LoadingStrategy[] experimentsUpdater$LoadingStrategyArr = {experimentsUpdater$LoadingStrategy, experimentsUpdater$LoadingStrategy2, experimentsUpdater$LoadingStrategy3};
        $VALUES = experimentsUpdater$LoadingStrategyArr;
        $ENTRIES = kotlin.enums.a.a(experimentsUpdater$LoadingStrategyArr);
    }

    public static ExperimentsUpdater$LoadingStrategy valueOf(String str) {
        return (ExperimentsUpdater$LoadingStrategy) Enum.valueOf(ExperimentsUpdater$LoadingStrategy.class, str);
    }

    public static ExperimentsUpdater$LoadingStrategy[] values() {
        return (ExperimentsUpdater$LoadingStrategy[]) $VALUES.clone();
    }
}
