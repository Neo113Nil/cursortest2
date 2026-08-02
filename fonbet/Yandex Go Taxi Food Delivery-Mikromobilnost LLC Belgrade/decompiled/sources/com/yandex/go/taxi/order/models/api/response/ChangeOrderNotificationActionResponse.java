package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qb9;
import defpackage.we8;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/ChangeOrderNotificationActionResponse;", "", "Companion", "qb9", "COMMUNICATE_WITH_DRIVER", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChangeOrderNotificationActionResponse {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeOrderNotificationActionResponse[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ChangeOrderNotificationActionResponse COMMUNICATE_WITH_DRIVER;
    public static final qb9 Companion;
    public static final ChangeOrderNotificationActionResponse NONE;

    static {
        ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse = new ChangeOrderNotificationActionResponse("COMMUNICATE_WITH_DRIVER", 0);
        COMMUNICATE_WITH_DRIVER = changeOrderNotificationActionResponse;
        ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse2 = new ChangeOrderNotificationActionResponse(JCP.RAW_PREFIX, 1);
        NONE = changeOrderNotificationActionResponse2;
        ChangeOrderNotificationActionResponse[] changeOrderNotificationActionResponseArr = {changeOrderNotificationActionResponse, changeOrderNotificationActionResponse2};
        $VALUES = changeOrderNotificationActionResponseArr;
        $ENTRIES = kotlin.enums.a.a(changeOrderNotificationActionResponseArr);
        Companion = new qb9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new we8(27));
    }

    public static ChangeOrderNotificationActionResponse valueOf(String str) {
        return (ChangeOrderNotificationActionResponse) Enum.valueOf(ChangeOrderNotificationActionResponse.class, str);
    }

    public static ChangeOrderNotificationActionResponse[] values() {
        return (ChangeOrderNotificationActionResponse[]) $VALUES.clone();
    }
}
