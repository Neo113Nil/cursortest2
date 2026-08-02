package com.yandex.go.taxi.order.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/taxi/order/analytics/DetailsOpenReason;", "", "", "alias", "Ljava/lang/String;", IDialogId.INTENT_EXTRA_IN_HEADER, "DETAILS_BUTTON", "POINT_A", "POINT_B", "POINT_MID", "MAP_OBJECT_CAR", "PREVIEW_CARD", "RATING", "AUTO", "PUSH", "PAYMENT_METHODS", "SINGLE_ORDER", "LINKED_ORDER", "FINISHED_LINKED_ORDER", "INITIAL_STATE", "DEEPLINK", "ON_START", "go-client-android.features.taxi_order:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailsOpenReason[] $VALUES;
    public static final DetailsOpenReason AUTO;
    public static final DetailsOpenReason DEEPLINK;
    public static final DetailsOpenReason DETAILS_BUTTON;
    public static final DetailsOpenReason FINISHED_LINKED_ORDER;
    public static final DetailsOpenReason HEADER;
    public static final DetailsOpenReason INITIAL_STATE;
    public static final DetailsOpenReason LINKED_ORDER;
    public static final DetailsOpenReason MAP_OBJECT_CAR;
    public static final DetailsOpenReason ON_START;
    public static final DetailsOpenReason PAYMENT_METHODS;
    public static final DetailsOpenReason POINT_A;
    public static final DetailsOpenReason POINT_B;
    public static final DetailsOpenReason POINT_MID;
    public static final DetailsOpenReason PREVIEW_CARD;
    public static final DetailsOpenReason PUSH;
    public static final DetailsOpenReason RATING;
    public static final DetailsOpenReason SINGLE_ORDER;
    public final String alias;

    static {
        DetailsOpenReason detailsOpenReason = new DetailsOpenReason(IDialogId.INTENT_EXTRA_IN_HEADER, 0, "header");
        HEADER = detailsOpenReason;
        DetailsOpenReason detailsOpenReason2 = new DetailsOpenReason("DETAILS_BUTTON", 1, "details_button");
        DETAILS_BUTTON = detailsOpenReason2;
        DetailsOpenReason detailsOpenReason3 = new DetailsOpenReason("POINT_A", 2, "map_starting_point");
        POINT_A = detailsOpenReason3;
        DetailsOpenReason detailsOpenReason4 = new DetailsOpenReason("POINT_B", 3, "map_destination_point");
        POINT_B = detailsOpenReason4;
        DetailsOpenReason detailsOpenReason5 = new DetailsOpenReason("POINT_MID", 4, "map_additional_point");
        POINT_MID = detailsOpenReason5;
        DetailsOpenReason detailsOpenReason6 = new DetailsOpenReason("MAP_OBJECT_CAR", 5, "map_car_picture");
        MAP_OBJECT_CAR = detailsOpenReason6;
        DetailsOpenReason detailsOpenReason7 = new DetailsOpenReason("PREVIEW_CARD", 6, "preview_card");
        PREVIEW_CARD = detailsOpenReason7;
        DetailsOpenReason detailsOpenReason8 = new DetailsOpenReason("RATING", 7, "rating");
        RATING = detailsOpenReason8;
        DetailsOpenReason detailsOpenReason9 = new DetailsOpenReason("AUTO", 8, "auto");
        AUTO = detailsOpenReason9;
        DetailsOpenReason detailsOpenReason10 = new DetailsOpenReason("PUSH", 9, Constants.PUSH);
        PUSH = detailsOpenReason10;
        DetailsOpenReason detailsOpenReason11 = new DetailsOpenReason("PAYMENT_METHODS", 10, "payment_methods");
        PAYMENT_METHODS = detailsOpenReason11;
        DetailsOpenReason detailsOpenReason12 = new DetailsOpenReason("SINGLE_ORDER", 11, "single_order");
        SINGLE_ORDER = detailsOpenReason12;
        DetailsOpenReason detailsOpenReason13 = new DetailsOpenReason("LINKED_ORDER", 12, "linked_order");
        LINKED_ORDER = detailsOpenReason13;
        DetailsOpenReason detailsOpenReason14 = new DetailsOpenReason("FINISHED_LINKED_ORDER", 13, "finished_linked_order");
        FINISHED_LINKED_ORDER = detailsOpenReason14;
        DetailsOpenReason detailsOpenReason15 = new DetailsOpenReason("INITIAL_STATE", 14, "initial_state");
        INITIAL_STATE = detailsOpenReason15;
        DetailsOpenReason detailsOpenReason16 = new DetailsOpenReason("DEEPLINK", 15, Constants.DEEPLINK);
        DEEPLINK = detailsOpenReason16;
        DetailsOpenReason detailsOpenReason17 = new DetailsOpenReason("ON_START", 16, "on_start");
        ON_START = detailsOpenReason17;
        DetailsOpenReason[] detailsOpenReasonArr = {detailsOpenReason, detailsOpenReason2, detailsOpenReason3, detailsOpenReason4, detailsOpenReason5, detailsOpenReason6, detailsOpenReason7, detailsOpenReason8, detailsOpenReason9, detailsOpenReason10, detailsOpenReason11, detailsOpenReason12, detailsOpenReason13, detailsOpenReason14, detailsOpenReason15, detailsOpenReason16, detailsOpenReason17};
        $VALUES = detailsOpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(detailsOpenReasonArr);
    }

    public DetailsOpenReason(String str, int i, String str2) {
        this.alias = str2;
    }

    public static DetailsOpenReason valueOf(String str) {
        return (DetailsOpenReason) Enum.valueOf(DetailsOpenReason.class, str);
    }

    public static DetailsOpenReason[] values() {
        return (DetailsOpenReason[]) $VALUES.clone();
    }
}
