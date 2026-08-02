package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkPlusStateModel$PlusSubscriptionStatus", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkPlusStateModel$PlusSubscriptionStatus;", "PLUS", "NO_PLUS", "FROZEN", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkPlusStateModel$PlusSubscriptionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkPlusStateModel$PlusSubscriptionStatus[] $VALUES;
    public static final NetworkPlusStateModel$PlusSubscriptionStatus FROZEN;
    public static final NetworkPlusStateModel$PlusSubscriptionStatus NO_PLUS;
    public static final NetworkPlusStateModel$PlusSubscriptionStatus PLUS;

    static {
        NetworkPlusStateModel$PlusSubscriptionStatus networkPlusStateModel$PlusSubscriptionStatus = new NetworkPlusStateModel$PlusSubscriptionStatus("PLUS", 0);
        PLUS = networkPlusStateModel$PlusSubscriptionStatus;
        NetworkPlusStateModel$PlusSubscriptionStatus networkPlusStateModel$PlusSubscriptionStatus2 = new NetworkPlusStateModel$PlusSubscriptionStatus("NO_PLUS", 1);
        NO_PLUS = networkPlusStateModel$PlusSubscriptionStatus2;
        NetworkPlusStateModel$PlusSubscriptionStatus networkPlusStateModel$PlusSubscriptionStatus3 = new NetworkPlusStateModel$PlusSubscriptionStatus("FROZEN", 2);
        FROZEN = networkPlusStateModel$PlusSubscriptionStatus3;
        NetworkPlusStateModel$PlusSubscriptionStatus[] networkPlusStateModel$PlusSubscriptionStatusArr = {networkPlusStateModel$PlusSubscriptionStatus, networkPlusStateModel$PlusSubscriptionStatus2, networkPlusStateModel$PlusSubscriptionStatus3};
        $VALUES = networkPlusStateModel$PlusSubscriptionStatusArr;
        $ENTRIES = a.a(networkPlusStateModel$PlusSubscriptionStatusArr);
    }

    public static NetworkPlusStateModel$PlusSubscriptionStatus valueOf(String str) {
        return (NetworkPlusStateModel$PlusSubscriptionStatus) Enum.valueOf(NetworkPlusStateModel$PlusSubscriptionStatus.class, str);
    }

    public static NetworkPlusStateModel$PlusSubscriptionStatus[] values() {
        return (NetworkPlusStateModel$PlusSubscriptionStatus[]) $VALUES.clone();
    }
}
