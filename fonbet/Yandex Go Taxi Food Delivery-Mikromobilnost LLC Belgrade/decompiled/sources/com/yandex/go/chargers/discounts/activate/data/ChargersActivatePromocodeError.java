package com.yandex.go.chargers.discounts.activate.data;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/chargers/discounts/activate/data/ChargersActivatePromocodeError;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PROMOCODE_NOT_FOUND", "PROMOCODE_EXPIRED", "PROMOCODE_LIMIT_REACHED", "DISCOUNT_NOT_FOUND", "DISCOUNT_EXPIRED", "DISCOUNT_LIMIT_REACHED", "STATION_NOT_APPLICABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActivatePromocodeError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersActivatePromocodeError[] $VALUES;
    public static final ChargersActivatePromocodeError DISCOUNT_EXPIRED;
    public static final ChargersActivatePromocodeError DISCOUNT_LIMIT_REACHED;
    public static final ChargersActivatePromocodeError DISCOUNT_NOT_FOUND;
    public static final ChargersActivatePromocodeError PROMOCODE_EXPIRED;
    public static final ChargersActivatePromocodeError PROMOCODE_LIMIT_REACHED;
    public static final ChargersActivatePromocodeError PROMOCODE_NOT_FOUND;
    public static final ChargersActivatePromocodeError STATION_NOT_APPLICABLE;
    private final String code;

    static {
        ChargersActivatePromocodeError chargersActivatePromocodeError = new ChargersActivatePromocodeError("PROMOCODE_NOT_FOUND", 0, "promocode_not_found");
        PROMOCODE_NOT_FOUND = chargersActivatePromocodeError;
        ChargersActivatePromocodeError chargersActivatePromocodeError2 = new ChargersActivatePromocodeError("PROMOCODE_EXPIRED", 1, "promocode_expired");
        PROMOCODE_EXPIRED = chargersActivatePromocodeError2;
        ChargersActivatePromocodeError chargersActivatePromocodeError3 = new ChargersActivatePromocodeError("PROMOCODE_LIMIT_REACHED", 2, "promocode_limit_reached");
        PROMOCODE_LIMIT_REACHED = chargersActivatePromocodeError3;
        ChargersActivatePromocodeError chargersActivatePromocodeError4 = new ChargersActivatePromocodeError("DISCOUNT_NOT_FOUND", 3, "discount_not_found");
        DISCOUNT_NOT_FOUND = chargersActivatePromocodeError4;
        ChargersActivatePromocodeError chargersActivatePromocodeError5 = new ChargersActivatePromocodeError("DISCOUNT_EXPIRED", 4, "discount_expired");
        DISCOUNT_EXPIRED = chargersActivatePromocodeError5;
        ChargersActivatePromocodeError chargersActivatePromocodeError6 = new ChargersActivatePromocodeError("DISCOUNT_LIMIT_REACHED", 5, "discount_limit_reached");
        DISCOUNT_LIMIT_REACHED = chargersActivatePromocodeError6;
        ChargersActivatePromocodeError chargersActivatePromocodeError7 = new ChargersActivatePromocodeError("STATION_NOT_APPLICABLE", 6, "station_not_applicable");
        STATION_NOT_APPLICABLE = chargersActivatePromocodeError7;
        ChargersActivatePromocodeError[] chargersActivatePromocodeErrorArr = {chargersActivatePromocodeError, chargersActivatePromocodeError2, chargersActivatePromocodeError3, chargersActivatePromocodeError4, chargersActivatePromocodeError5, chargersActivatePromocodeError6, chargersActivatePromocodeError7};
        $VALUES = chargersActivatePromocodeErrorArr;
        $ENTRIES = kotlin.enums.a.a(chargersActivatePromocodeErrorArr);
    }

    public ChargersActivatePromocodeError(String str, int i, String str2) {
        this.code = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static ChargersActivatePromocodeError valueOf(String str) {
        return (ChargersActivatePromocodeError) Enum.valueOf(ChargersActivatePromocodeError.class, str);
    }

    public static ChargersActivatePromocodeError[] values() {
        return (ChargersActivatePromocodeError[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
