package com.yandex.messaging.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/messaging/analytics/ExperimentsReporter$ResolveSource", "", "Lcom/yandex/messaging/analytics/ExperimentsReporter$ResolveSource;", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Local", "Network", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperimentsReporter$ResolveSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentsReporter$ResolveSource[] $VALUES;
    public static final ExperimentsReporter$ResolveSource Local;
    public static final ExperimentsReporter$ResolveSource Network;
    private final String source;

    static {
        ExperimentsReporter$ResolveSource experimentsReporter$ResolveSource = new ExperimentsReporter$ResolveSource("Local", 0, "local");
        Local = experimentsReporter$ResolveSource;
        ExperimentsReporter$ResolveSource experimentsReporter$ResolveSource2 = new ExperimentsReporter$ResolveSource("Network", 1, "network");
        Network = experimentsReporter$ResolveSource2;
        ExperimentsReporter$ResolveSource[] experimentsReporter$ResolveSourceArr = {experimentsReporter$ResolveSource, experimentsReporter$ResolveSource2};
        $VALUES = experimentsReporter$ResolveSourceArr;
        $ENTRIES = kotlin.enums.a.a(experimentsReporter$ResolveSourceArr);
    }

    public ExperimentsReporter$ResolveSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static ExperimentsReporter$ResolveSource valueOf(String str) {
        return (ExperimentsReporter$ResolveSource) Enum.valueOf(ExperimentsReporter$ResolveSource.class, str);
    }

    public static ExperimentsReporter$ResolveSource[] values() {
        return (ExperimentsReporter$ResolveSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
