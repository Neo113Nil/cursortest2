package com.yandex.quark.utils.network.system;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/utils/network/system/NetworkState;", "", "NETWORK_UNAVAILABLE", "NETWORK_AVAILABLE", "NETWORK_VALIDATED", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NetworkState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkState[] $VALUES;
    public static final NetworkState NETWORK_AVAILABLE;
    public static final NetworkState NETWORK_UNAVAILABLE;
    public static final NetworkState NETWORK_VALIDATED;

    static {
        NetworkState networkState = new NetworkState("NETWORK_UNAVAILABLE", 0);
        NETWORK_UNAVAILABLE = networkState;
        NetworkState networkState2 = new NetworkState("NETWORK_AVAILABLE", 1);
        NETWORK_AVAILABLE = networkState2;
        NetworkState networkState3 = new NetworkState("NETWORK_VALIDATED", 2);
        NETWORK_VALIDATED = networkState3;
        NetworkState[] networkStateArr = {networkState, networkState2, networkState3};
        $VALUES = networkStateArr;
        $ENTRIES = kotlin.enums.a.a(networkStateArr);
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) $VALUES.clone();
    }
}
