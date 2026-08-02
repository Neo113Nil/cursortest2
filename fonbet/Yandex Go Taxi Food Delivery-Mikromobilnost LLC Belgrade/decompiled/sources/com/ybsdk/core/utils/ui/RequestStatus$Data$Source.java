package com.ybsdk.core.utils.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/core/utils/ui/RequestStatus$Data$Source", "", "Lcom/ybsdk/core/utils/ui/RequestStatus$Data$Source;", "<init>", "(Ljava/lang/String;I)V", "CACHE", "NETWORK", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestStatus$Data$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestStatus$Data$Source[] $VALUES;
    public static final RequestStatus$Data$Source CACHE = new RequestStatus$Data$Source("CACHE", 0);
    public static final RequestStatus$Data$Source NETWORK = new RequestStatus$Data$Source("NETWORK", 1);

    private static final /* synthetic */ RequestStatus$Data$Source[] $values() {
        return new RequestStatus$Data$Source[]{CACHE, NETWORK};
    }

    static {
        RequestStatus$Data$Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RequestStatus$Data$Source(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RequestStatus$Data$Source valueOf(String str) {
        return (RequestStatus$Data$Source) Enum.valueOf(RequestStatus$Data$Source.class, str);
    }

    public static RequestStatus$Data$Source[] values() {
        return (RequestStatus$Data$Source[]) $VALUES.clone();
    }
}
