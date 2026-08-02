package com.yandex.go.superapp.api.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/superapp/api/analytics/SuperappAnalytics$EatsKitControllerState", "", "Lcom/yandex/go/superapp/api/analytics/SuperappAnalytics$EatsKitControllerState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Loading", CA20Status.STATUS_USER_DESCRIPTION_A, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappAnalytics$EatsKitControllerState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappAnalytics$EatsKitControllerState[] $VALUES;
    public static final SuperappAnalytics$EatsKitControllerState Active;
    public static final SuperappAnalytics$EatsKitControllerState Loading;
    private final String eventValue;

    static {
        SuperappAnalytics$EatsKitControllerState superappAnalytics$EatsKitControllerState = new SuperappAnalytics$EatsKitControllerState("Loading", 0, ResultType.RESULT_TYPE_LOADING);
        Loading = superappAnalytics$EatsKitControllerState;
        SuperappAnalytics$EatsKitControllerState superappAnalytics$EatsKitControllerState2 = new SuperappAnalytics$EatsKitControllerState(CA20Status.STATUS_USER_DESCRIPTION_A, 1, ClidProvider.APP_ACTIVE);
        Active = superappAnalytics$EatsKitControllerState2;
        SuperappAnalytics$EatsKitControllerState[] superappAnalytics$EatsKitControllerStateArr = {superappAnalytics$EatsKitControllerState, superappAnalytics$EatsKitControllerState2};
        $VALUES = superappAnalytics$EatsKitControllerStateArr;
        $ENTRIES = a.a(superappAnalytics$EatsKitControllerStateArr);
    }

    public SuperappAnalytics$EatsKitControllerState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappAnalytics$EatsKitControllerState valueOf(String str) {
        return (SuperappAnalytics$EatsKitControllerState) Enum.valueOf(SuperappAnalytics$EatsKitControllerState.class, str);
    }

    public static SuperappAnalytics$EatsKitControllerState[] values() {
        return (SuperappAnalytics$EatsKitControllerState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
