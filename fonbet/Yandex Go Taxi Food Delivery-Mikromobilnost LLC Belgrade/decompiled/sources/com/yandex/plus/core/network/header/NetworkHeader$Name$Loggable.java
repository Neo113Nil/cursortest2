package com.yandex.plus.core.network.header;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/core/network/header/NetworkHeader$Name$Loggable", "", "Lcom/yandex/plus/core/network/header/NetworkHeader$Name$Loggable;", "UNKNOWN", "LOGGABLE", "NOT_LOGGABLE", "homeless-core-network-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkHeader$Name$Loggable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkHeader$Name$Loggable[] $VALUES;
    public static final NetworkHeader$Name$Loggable LOGGABLE;
    public static final NetworkHeader$Name$Loggable NOT_LOGGABLE;
    public static final NetworkHeader$Name$Loggable UNKNOWN;

    static {
        NetworkHeader$Name$Loggable networkHeader$Name$Loggable = new NetworkHeader$Name$Loggable("UNKNOWN", 0);
        UNKNOWN = networkHeader$Name$Loggable;
        NetworkHeader$Name$Loggable networkHeader$Name$Loggable2 = new NetworkHeader$Name$Loggable("LOGGABLE", 1);
        LOGGABLE = networkHeader$Name$Loggable2;
        NetworkHeader$Name$Loggable networkHeader$Name$Loggable3 = new NetworkHeader$Name$Loggable("NOT_LOGGABLE", 2);
        NOT_LOGGABLE = networkHeader$Name$Loggable3;
        NetworkHeader$Name$Loggable[] networkHeader$Name$LoggableArr = {networkHeader$Name$Loggable, networkHeader$Name$Loggable2, networkHeader$Name$Loggable3};
        $VALUES = networkHeader$Name$LoggableArr;
        $ENTRIES = a.a(networkHeader$Name$LoggableArr);
    }

    public static NetworkHeader$Name$Loggable valueOf(String str) {
        return (NetworkHeader$Name$Loggable) Enum.valueOf(NetworkHeader$Name$Loggable.class, str);
    }

    public static NetworkHeader$Name$Loggable[] values() {
        return (NetworkHeader$Name$Loggable[]) $VALUES.clone();
    }
}
