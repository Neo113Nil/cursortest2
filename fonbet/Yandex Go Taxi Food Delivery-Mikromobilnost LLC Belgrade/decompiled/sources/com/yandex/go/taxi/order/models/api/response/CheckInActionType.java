package com.yandex.go.taxi.order.models.api.response;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qfb;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CheckInActionType;", "", "Companion", "qfb", "QR_CODE", "BUTTON", "SLIDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckInActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckInActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CheckInActionType BUTTON;
    public static final qfb Companion;
    public static final CheckInActionType QR_CODE;
    public static final CheckInActionType SLIDER;

    static {
        CheckInActionType checkInActionType = new CheckInActionType("QR_CODE", 0);
        QR_CODE = checkInActionType;
        CheckInActionType checkInActionType2 = new CheckInActionType("BUTTON", 1);
        BUTTON = checkInActionType2;
        CheckInActionType checkInActionType3 = new CheckInActionType("SLIDER", 2);
        SLIDER = checkInActionType3;
        CheckInActionType[] checkInActionTypeArr = {checkInActionType, checkInActionType2, checkInActionType3};
        $VALUES = checkInActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(checkInActionTypeArr);
        Companion = new qfb();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(22));
    }

    public static CheckInActionType valueOf(String str) {
        return (CheckInActionType) Enum.valueOf(CheckInActionType.class, str);
    }

    public static CheckInActionType[] values() {
        return (CheckInActionType[]) $VALUES.clone();
    }
}
