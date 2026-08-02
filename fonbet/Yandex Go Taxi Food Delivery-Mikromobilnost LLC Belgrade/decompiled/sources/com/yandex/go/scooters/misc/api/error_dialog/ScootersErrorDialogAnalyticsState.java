package com.yandex.go.scooters.misc.api.error_dialog;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/yandex/go/scooters/misc/api/error_dialog/ScootersErrorDialogAnalyticsState;", "", "", ClidProvider.STATE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EMPTY_PARKING", "OFFER_EXPIRED", "SCOOTER_IS_BUSY", "DEBT", "CARD_NOT_ALLOWED", "DEBT_PAYOFF", "FORBIDDEN_PARKING", "DEPOSIT_FAILED", "BLE_ATTEMPT_FAILURE", "PHOTO_SHOOTING", "ANOTHER", "NOT_ENOUGH_CHARGE", "TOO_CLOSE_DESTINATION", "TOO_FAR_DESTINATION", "BOOK_FAILED", "AUTH_ERROR", "RIDE_COMMON_ERROR", "SCOOTER_NOT_FOUND", "FAILED_UPLOAD_PHOTO", "DAMAGE_PHOTOS_LIMIT_REACHED", "CANNOT_DROP_IN_DESTINATION", "PASS_ACTION_FAILED", "PASSES_NOT_FOUND", "PASSES_LIST_FAILURE", "PERMISSION_NOT_GRANTED", "BIKE_WHEEL_IS_NOT_LOCKED", "TELEMATICS_FAILED", "MOS_RU_FAILED", "FRAUDER", "NO_FUNDS", "LOCKED_RESOURCES_LIMIT_ENRICHED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogAnalyticsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorDialogAnalyticsState[] $VALUES;
    public static final ScootersErrorDialogAnalyticsState ANOTHER;
    public static final ScootersErrorDialogAnalyticsState AUTH_ERROR;
    public static final ScootersErrorDialogAnalyticsState BIKE_WHEEL_IS_NOT_LOCKED;
    public static final ScootersErrorDialogAnalyticsState BLE_ATTEMPT_FAILURE;
    public static final ScootersErrorDialogAnalyticsState BOOK_FAILED;
    public static final ScootersErrorDialogAnalyticsState CANNOT_DROP_IN_DESTINATION;
    public static final ScootersErrorDialogAnalyticsState CARD_NOT_ALLOWED;
    public static final ScootersErrorDialogAnalyticsState DAMAGE_PHOTOS_LIMIT_REACHED;
    public static final ScootersErrorDialogAnalyticsState DEBT;
    public static final ScootersErrorDialogAnalyticsState DEBT_PAYOFF;
    public static final ScootersErrorDialogAnalyticsState DEPOSIT_FAILED;
    public static final ScootersErrorDialogAnalyticsState EMPTY_PARKING;
    public static final ScootersErrorDialogAnalyticsState FAILED_UPLOAD_PHOTO;
    public static final ScootersErrorDialogAnalyticsState FORBIDDEN_PARKING;
    public static final ScootersErrorDialogAnalyticsState FRAUDER;
    public static final ScootersErrorDialogAnalyticsState LOCKED_RESOURCES_LIMIT_ENRICHED;
    public static final ScootersErrorDialogAnalyticsState MOS_RU_FAILED;
    public static final ScootersErrorDialogAnalyticsState NOT_ENOUGH_CHARGE;
    public static final ScootersErrorDialogAnalyticsState NO_FUNDS;
    public static final ScootersErrorDialogAnalyticsState OFFER_EXPIRED;
    public static final ScootersErrorDialogAnalyticsState PASSES_LIST_FAILURE;
    public static final ScootersErrorDialogAnalyticsState PASSES_NOT_FOUND;
    public static final ScootersErrorDialogAnalyticsState PASS_ACTION_FAILED;
    public static final ScootersErrorDialogAnalyticsState PERMISSION_NOT_GRANTED;
    public static final ScootersErrorDialogAnalyticsState PHOTO_SHOOTING;
    public static final ScootersErrorDialogAnalyticsState RIDE_COMMON_ERROR;
    public static final ScootersErrorDialogAnalyticsState SCOOTER_IS_BUSY;
    public static final ScootersErrorDialogAnalyticsState SCOOTER_NOT_FOUND;
    public static final ScootersErrorDialogAnalyticsState TELEMATICS_FAILED;
    public static final ScootersErrorDialogAnalyticsState TOO_CLOSE_DESTINATION;
    public static final ScootersErrorDialogAnalyticsState TOO_FAR_DESTINATION;
    private final String state;

    static {
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = new ScootersErrorDialogAnalyticsState("EMPTY_PARKING", 0, "empty_parking");
        EMPTY_PARKING = scootersErrorDialogAnalyticsState;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState2 = new ScootersErrorDialogAnalyticsState("OFFER_EXPIRED", 1, "offer_expired");
        OFFER_EXPIRED = scootersErrorDialogAnalyticsState2;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState3 = new ScootersErrorDialogAnalyticsState("SCOOTER_IS_BUSY", 2, "scooter_is_busy");
        SCOOTER_IS_BUSY = scootersErrorDialogAnalyticsState3;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState4 = new ScootersErrorDialogAnalyticsState("DEBT", 3, "debt");
        DEBT = scootersErrorDialogAnalyticsState4;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState5 = new ScootersErrorDialogAnalyticsState("CARD_NOT_ALLOWED", 4, "card_not_allowed_by_restriction");
        CARD_NOT_ALLOWED = scootersErrorDialogAnalyticsState5;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState6 = new ScootersErrorDialogAnalyticsState("DEBT_PAYOFF", 5, "debt_payoff");
        DEBT_PAYOFF = scootersErrorDialogAnalyticsState6;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState7 = new ScootersErrorDialogAnalyticsState("FORBIDDEN_PARKING", 6, "forbidden_parking");
        FORBIDDEN_PARKING = scootersErrorDialogAnalyticsState7;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState8 = new ScootersErrorDialogAnalyticsState("DEPOSIT_FAILED", 7, "deposit_failed");
        DEPOSIT_FAILED = scootersErrorDialogAnalyticsState8;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState9 = new ScootersErrorDialogAnalyticsState("BLE_ATTEMPT_FAILURE", 8, "other_error");
        BLE_ATTEMPT_FAILURE = scootersErrorDialogAnalyticsState9;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState10 = new ScootersErrorDialogAnalyticsState("PHOTO_SHOOTING", 9, "photo_shooting");
        PHOTO_SHOOTING = scootersErrorDialogAnalyticsState10;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState11 = new ScootersErrorDialogAnalyticsState("ANOTHER", 10, "another");
        ANOTHER = scootersErrorDialogAnalyticsState11;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState12 = new ScootersErrorDialogAnalyticsState("NOT_ENOUGH_CHARGE", 11, "not_enough_charge");
        NOT_ENOUGH_CHARGE = scootersErrorDialogAnalyticsState12;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState13 = new ScootersErrorDialogAnalyticsState("TOO_CLOSE_DESTINATION", 12, "too_close_destination");
        TOO_CLOSE_DESTINATION = scootersErrorDialogAnalyticsState13;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState14 = new ScootersErrorDialogAnalyticsState("TOO_FAR_DESTINATION", 13, "too_far_destination");
        TOO_FAR_DESTINATION = scootersErrorDialogAnalyticsState14;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState15 = new ScootersErrorDialogAnalyticsState("BOOK_FAILED", 14, "book_failed");
        BOOK_FAILED = scootersErrorDialogAnalyticsState15;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState16 = new ScootersErrorDialogAnalyticsState("AUTH_ERROR", 15, "auth_error");
        AUTH_ERROR = scootersErrorDialogAnalyticsState16;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState17 = new ScootersErrorDialogAnalyticsState("RIDE_COMMON_ERROR", 16, "ride_common_error");
        RIDE_COMMON_ERROR = scootersErrorDialogAnalyticsState17;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState18 = new ScootersErrorDialogAnalyticsState("SCOOTER_NOT_FOUND", 17, "scooter_not_found");
        SCOOTER_NOT_FOUND = scootersErrorDialogAnalyticsState18;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState19 = new ScootersErrorDialogAnalyticsState("FAILED_UPLOAD_PHOTO", 18, "failed_upload_photo");
        FAILED_UPLOAD_PHOTO = scootersErrorDialogAnalyticsState19;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState20 = new ScootersErrorDialogAnalyticsState("DAMAGE_PHOTOS_LIMIT_REACHED", 19, "damage_photos_limit_reached");
        DAMAGE_PHOTOS_LIMIT_REACHED = scootersErrorDialogAnalyticsState20;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState21 = new ScootersErrorDialogAnalyticsState("CANNOT_DROP_IN_DESTINATION", 20, "cannot_drop_in_destination");
        CANNOT_DROP_IN_DESTINATION = scootersErrorDialogAnalyticsState21;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState22 = new ScootersErrorDialogAnalyticsState("PASS_ACTION_FAILED", 21, "pass_action_failed");
        PASS_ACTION_FAILED = scootersErrorDialogAnalyticsState22;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState23 = new ScootersErrorDialogAnalyticsState("PASSES_NOT_FOUND", 22, "passes_not_found");
        PASSES_NOT_FOUND = scootersErrorDialogAnalyticsState23;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState24 = new ScootersErrorDialogAnalyticsState("PASSES_LIST_FAILURE", 23, "passes_list_failure");
        PASSES_LIST_FAILURE = scootersErrorDialogAnalyticsState24;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState25 = new ScootersErrorDialogAnalyticsState("PERMISSION_NOT_GRANTED", 24, "permission_not_granted");
        PERMISSION_NOT_GRANTED = scootersErrorDialogAnalyticsState25;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState26 = new ScootersErrorDialogAnalyticsState("BIKE_WHEEL_IS_NOT_LOCKED", 25, "bike_wheel_is_not_locked");
        BIKE_WHEEL_IS_NOT_LOCKED = scootersErrorDialogAnalyticsState26;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState27 = new ScootersErrorDialogAnalyticsState("TELEMATICS_FAILED", 26, "telematics_failed");
        TELEMATICS_FAILED = scootersErrorDialogAnalyticsState27;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState28 = new ScootersErrorDialogAnalyticsState("MOS_RU_FAILED", 27, "mos_ru_failed");
        MOS_RU_FAILED = scootersErrorDialogAnalyticsState28;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState29 = new ScootersErrorDialogAnalyticsState("FRAUDER", 28, "frauder");
        FRAUDER = scootersErrorDialogAnalyticsState29;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState30 = new ScootersErrorDialogAnalyticsState("NO_FUNDS", 29, "no_funds");
        NO_FUNDS = scootersErrorDialogAnalyticsState30;
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState31 = new ScootersErrorDialogAnalyticsState("LOCKED_RESOURCES_LIMIT_ENRICHED", 30, "locked_resources_limit_enriched");
        LOCKED_RESOURCES_LIMIT_ENRICHED = scootersErrorDialogAnalyticsState31;
        ScootersErrorDialogAnalyticsState[] scootersErrorDialogAnalyticsStateArr = {scootersErrorDialogAnalyticsState, scootersErrorDialogAnalyticsState2, scootersErrorDialogAnalyticsState3, scootersErrorDialogAnalyticsState4, scootersErrorDialogAnalyticsState5, scootersErrorDialogAnalyticsState6, scootersErrorDialogAnalyticsState7, scootersErrorDialogAnalyticsState8, scootersErrorDialogAnalyticsState9, scootersErrorDialogAnalyticsState10, scootersErrorDialogAnalyticsState11, scootersErrorDialogAnalyticsState12, scootersErrorDialogAnalyticsState13, scootersErrorDialogAnalyticsState14, scootersErrorDialogAnalyticsState15, scootersErrorDialogAnalyticsState16, scootersErrorDialogAnalyticsState17, scootersErrorDialogAnalyticsState18, scootersErrorDialogAnalyticsState19, scootersErrorDialogAnalyticsState20, scootersErrorDialogAnalyticsState21, scootersErrorDialogAnalyticsState22, scootersErrorDialogAnalyticsState23, scootersErrorDialogAnalyticsState24, scootersErrorDialogAnalyticsState25, scootersErrorDialogAnalyticsState26, scootersErrorDialogAnalyticsState27, scootersErrorDialogAnalyticsState28, scootersErrorDialogAnalyticsState29, scootersErrorDialogAnalyticsState30, scootersErrorDialogAnalyticsState31};
        $VALUES = scootersErrorDialogAnalyticsStateArr;
        $ENTRIES = a.a(scootersErrorDialogAnalyticsStateArr);
    }

    public ScootersErrorDialogAnalyticsState(String str, int i, String str2) {
        this.state = str2;
    }

    public static ScootersErrorDialogAnalyticsState valueOf(String str) {
        return (ScootersErrorDialogAnalyticsState) Enum.valueOf(ScootersErrorDialogAnalyticsState.class, str);
    }

    public static ScootersErrorDialogAnalyticsState[] values() {
        return (ScootersErrorDialogAnalyticsState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
