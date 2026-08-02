package com.yandex.go.taxi.order.models.api;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.k4o;
import defpackage.lc9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/yandex/go/taxi/order/models/api/ChangeOrderState$Source", "", "Lcom/yandex/go/taxi/order/models/api/ChangeOrderState$Source;", "", "analyticName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "lc9", "SOURCE_POINT", "ROUTE_POINT", "DESTINATION_POINT", Card.CARD_TYPE_CREDIT_DEBIT, "DRIVER", "USER_READY", "SAVE_RIDE", "CANCEL", "TARIFF", "DUE", "ADDITIONAL_PAYMENT", "REQUIREMENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChangeOrderState$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeOrderState$Source[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ChangeOrderState$Source ADDITIONAL_PAYMENT;
    public static final ChangeOrderState$Source CANCEL;
    public static final lc9 Companion;
    public static final ChangeOrderState$Source DESTINATION_POINT;
    public static final ChangeOrderState$Source DRIVER;
    public static final ChangeOrderState$Source DUE;
    public static final ChangeOrderState$Source PAYMENT;
    public static final ChangeOrderState$Source REQUIREMENT;
    public static final ChangeOrderState$Source ROUTE_POINT;
    public static final ChangeOrderState$Source SAVE_RIDE;
    public static final ChangeOrderState$Source SOURCE_POINT;
    public static final ChangeOrderState$Source TARIFF;
    public static final ChangeOrderState$Source USER_READY;
    private final String analyticName;

    static {
        ChangeOrderState$Source changeOrderState$Source = new ChangeOrderState$Source("SOURCE_POINT", 0, "change_source");
        SOURCE_POINT = changeOrderState$Source;
        ChangeOrderState$Source changeOrderState$Source2 = new ChangeOrderState$Source("ROUTE_POINT", 1, "route_point");
        ROUTE_POINT = changeOrderState$Source2;
        ChangeOrderState$Source changeOrderState$Source3 = new ChangeOrderState$Source("DESTINATION_POINT", 2, "change_destination");
        DESTINATION_POINT = changeOrderState$Source3;
        ChangeOrderState$Source changeOrderState$Source4 = new ChangeOrderState$Source(Card.CARD_TYPE_CREDIT_DEBIT, 3, "payment");
        PAYMENT = changeOrderState$Source4;
        ChangeOrderState$Source changeOrderState$Source5 = new ChangeOrderState$Source("DRIVER", 4, "driver");
        DRIVER = changeOrderState$Source5;
        ChangeOrderState$Source changeOrderState$Source6 = new ChangeOrderState$Source("USER_READY", 5, "user_ready");
        USER_READY = changeOrderState$Source6;
        ChangeOrderState$Source changeOrderState$Source7 = new ChangeOrderState$Source("SAVE_RIDE", 6, "save_ride");
        SAVE_RIDE = changeOrderState$Source7;
        ChangeOrderState$Source changeOrderState$Source8 = new ChangeOrderState$Source("CANCEL", 7, "cancel");
        CANCEL = changeOrderState$Source8;
        ChangeOrderState$Source changeOrderState$Source9 = new ChangeOrderState$Source("TARIFF", 8, PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX);
        TARIFF = changeOrderState$Source9;
        ChangeOrderState$Source changeOrderState$Source10 = new ChangeOrderState$Source("DUE", 9, "due");
        DUE = changeOrderState$Source10;
        ChangeOrderState$Source changeOrderState$Source11 = new ChangeOrderState$Source("ADDITIONAL_PAYMENT", 10, "additional_payment");
        ADDITIONAL_PAYMENT = changeOrderState$Source11;
        ChangeOrderState$Source changeOrderState$Source12 = new ChangeOrderState$Source("REQUIREMENT", 11, "requirement");
        REQUIREMENT = changeOrderState$Source12;
        ChangeOrderState$Source[] changeOrderState$SourceArr = {changeOrderState$Source, changeOrderState$Source2, changeOrderState$Source3, changeOrderState$Source4, changeOrderState$Source5, changeOrderState$Source6, changeOrderState$Source7, changeOrderState$Source8, changeOrderState$Source9, changeOrderState$Source10, changeOrderState$Source11, changeOrderState$Source12};
        $VALUES = changeOrderState$SourceArr;
        $ENTRIES = kotlin.enums.a.a(changeOrderState$SourceArr);
        Companion = new lc9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(2));
    }

    public ChangeOrderState$Source(String str, int i, String str2) {
        this.analyticName = str2;
    }

    public static ChangeOrderState$Source valueOf(String str) {
        return (ChangeOrderState$Source) Enum.valueOf(ChangeOrderState$Source.class, str);
    }

    public static ChangeOrderState$Source[] values() {
        return (ChangeOrderState$Source[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticName() {
        return this.analyticName;
    }
}
