package com.yandex.go.taxi.order.models.api.response;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Type", "", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Type;", "UNKNOWN", "STATUS", "DRIVER_INFO", "DRIVER_INFO_SIMPLE", "COMBO_COMPANION", "COMPANION_BUFFER_SEARCH", "ACTION_BUTTONS", "GENERIC_BASED", "SOURCE", "DESTINATION", "ROUTE_POINT", "PLAIN_COMMENT", Card.CARD_TYPE_CREDIT_DEBIT, "EXTRA_DOTS_COST_BREAKDOWN", "SHARE_LOCATION", "DONE_FOOTER", "FEEDBACK_QUESTION", "RATING_SELECTOR", "COHERENT_RATING_SELECTOR", "TIPS_SELECTOR", "TIPS_WISH_SELECTOR", "TAG_RATING_REASONS", "ACHIEVEMENT_RATING_REASONS", "TEXT_RATING_REASONS", "COST_CENTER", "PROMO_BLOCK", "ACCORDION", "PROGRESS_BAR_ITEM", "COLLAPSING_CONTAINER", "TIMELINE", "PHOTO", "SLIDER", "AI_BUBBLE", "PICKUP_CODE", "BUTTON", "STATUS_PROGRESS", "REQUIREMENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardItemDto$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardItemDto$Type[] $VALUES;
    public static final RideCardItemDto$Type ACCORDION;
    public static final RideCardItemDto$Type ACHIEVEMENT_RATING_REASONS;
    public static final RideCardItemDto$Type ACTION_BUTTONS;
    public static final RideCardItemDto$Type AI_BUBBLE;
    public static final RideCardItemDto$Type BUTTON;
    public static final RideCardItemDto$Type COHERENT_RATING_SELECTOR;
    public static final RideCardItemDto$Type COLLAPSING_CONTAINER;
    public static final RideCardItemDto$Type COMBO_COMPANION;
    public static final RideCardItemDto$Type COMPANION_BUFFER_SEARCH;
    public static final RideCardItemDto$Type COST_CENTER;
    public static final RideCardItemDto$Type DESTINATION;
    public static final RideCardItemDto$Type DONE_FOOTER;
    public static final RideCardItemDto$Type DRIVER_INFO;
    public static final RideCardItemDto$Type DRIVER_INFO_SIMPLE;
    public static final RideCardItemDto$Type EXTRA_DOTS_COST_BREAKDOWN;
    public static final RideCardItemDto$Type FEEDBACK_QUESTION;
    public static final RideCardItemDto$Type GENERIC_BASED;
    public static final RideCardItemDto$Type PAYMENT;
    public static final RideCardItemDto$Type PHOTO;
    public static final RideCardItemDto$Type PICKUP_CODE;
    public static final RideCardItemDto$Type PLAIN_COMMENT;
    public static final RideCardItemDto$Type PROGRESS_BAR_ITEM;
    public static final RideCardItemDto$Type PROMO_BLOCK;
    public static final RideCardItemDto$Type RATING_SELECTOR;
    public static final RideCardItemDto$Type REQUIREMENT;
    public static final RideCardItemDto$Type ROUTE_POINT;
    public static final RideCardItemDto$Type SHARE_LOCATION;
    public static final RideCardItemDto$Type SLIDER;
    public static final RideCardItemDto$Type SOURCE;
    public static final RideCardItemDto$Type STATUS;
    public static final RideCardItemDto$Type STATUS_PROGRESS;
    public static final RideCardItemDto$Type TAG_RATING_REASONS;
    public static final RideCardItemDto$Type TEXT_RATING_REASONS;
    public static final RideCardItemDto$Type TIMELINE;
    public static final RideCardItemDto$Type TIPS_SELECTOR;
    public static final RideCardItemDto$Type TIPS_WISH_SELECTOR;
    public static final RideCardItemDto$Type UNKNOWN;

    static {
        RideCardItemDto$Type rideCardItemDto$Type = new RideCardItemDto$Type("UNKNOWN", 0);
        UNKNOWN = rideCardItemDto$Type;
        RideCardItemDto$Type rideCardItemDto$Type2 = new RideCardItemDto$Type("STATUS", 1);
        STATUS = rideCardItemDto$Type2;
        RideCardItemDto$Type rideCardItemDto$Type3 = new RideCardItemDto$Type("DRIVER_INFO", 2);
        DRIVER_INFO = rideCardItemDto$Type3;
        RideCardItemDto$Type rideCardItemDto$Type4 = new RideCardItemDto$Type("DRIVER_INFO_SIMPLE", 3);
        DRIVER_INFO_SIMPLE = rideCardItemDto$Type4;
        RideCardItemDto$Type rideCardItemDto$Type5 = new RideCardItemDto$Type("COMBO_COMPANION", 4);
        COMBO_COMPANION = rideCardItemDto$Type5;
        RideCardItemDto$Type rideCardItemDto$Type6 = new RideCardItemDto$Type("COMPANION_BUFFER_SEARCH", 5);
        COMPANION_BUFFER_SEARCH = rideCardItemDto$Type6;
        RideCardItemDto$Type rideCardItemDto$Type7 = new RideCardItemDto$Type("ACTION_BUTTONS", 6);
        ACTION_BUTTONS = rideCardItemDto$Type7;
        RideCardItemDto$Type rideCardItemDto$Type8 = new RideCardItemDto$Type("GENERIC_BASED", 7);
        GENERIC_BASED = rideCardItemDto$Type8;
        RideCardItemDto$Type rideCardItemDto$Type9 = new RideCardItemDto$Type("SOURCE", 8);
        SOURCE = rideCardItemDto$Type9;
        RideCardItemDto$Type rideCardItemDto$Type10 = new RideCardItemDto$Type("DESTINATION", 9);
        DESTINATION = rideCardItemDto$Type10;
        RideCardItemDto$Type rideCardItemDto$Type11 = new RideCardItemDto$Type("ROUTE_POINT", 10);
        ROUTE_POINT = rideCardItemDto$Type11;
        RideCardItemDto$Type rideCardItemDto$Type12 = new RideCardItemDto$Type("PLAIN_COMMENT", 11);
        PLAIN_COMMENT = rideCardItemDto$Type12;
        RideCardItemDto$Type rideCardItemDto$Type13 = new RideCardItemDto$Type(Card.CARD_TYPE_CREDIT_DEBIT, 12);
        PAYMENT = rideCardItemDto$Type13;
        RideCardItemDto$Type rideCardItemDto$Type14 = new RideCardItemDto$Type("EXTRA_DOTS_COST_BREAKDOWN", 13);
        EXTRA_DOTS_COST_BREAKDOWN = rideCardItemDto$Type14;
        RideCardItemDto$Type rideCardItemDto$Type15 = new RideCardItemDto$Type("SHARE_LOCATION", 14);
        SHARE_LOCATION = rideCardItemDto$Type15;
        RideCardItemDto$Type rideCardItemDto$Type16 = new RideCardItemDto$Type("DONE_FOOTER", 15);
        DONE_FOOTER = rideCardItemDto$Type16;
        RideCardItemDto$Type rideCardItemDto$Type17 = new RideCardItemDto$Type("FEEDBACK_QUESTION", 16);
        FEEDBACK_QUESTION = rideCardItemDto$Type17;
        RideCardItemDto$Type rideCardItemDto$Type18 = new RideCardItemDto$Type("RATING_SELECTOR", 17);
        RATING_SELECTOR = rideCardItemDto$Type18;
        RideCardItemDto$Type rideCardItemDto$Type19 = new RideCardItemDto$Type("COHERENT_RATING_SELECTOR", 18);
        COHERENT_RATING_SELECTOR = rideCardItemDto$Type19;
        RideCardItemDto$Type rideCardItemDto$Type20 = new RideCardItemDto$Type("TIPS_SELECTOR", 19);
        TIPS_SELECTOR = rideCardItemDto$Type20;
        RideCardItemDto$Type rideCardItemDto$Type21 = new RideCardItemDto$Type("TIPS_WISH_SELECTOR", 20);
        TIPS_WISH_SELECTOR = rideCardItemDto$Type21;
        RideCardItemDto$Type rideCardItemDto$Type22 = new RideCardItemDto$Type("TAG_RATING_REASONS", 21);
        TAG_RATING_REASONS = rideCardItemDto$Type22;
        RideCardItemDto$Type rideCardItemDto$Type23 = new RideCardItemDto$Type("ACHIEVEMENT_RATING_REASONS", 22);
        ACHIEVEMENT_RATING_REASONS = rideCardItemDto$Type23;
        RideCardItemDto$Type rideCardItemDto$Type24 = new RideCardItemDto$Type("TEXT_RATING_REASONS", 23);
        TEXT_RATING_REASONS = rideCardItemDto$Type24;
        RideCardItemDto$Type rideCardItemDto$Type25 = new RideCardItemDto$Type("COST_CENTER", 24);
        COST_CENTER = rideCardItemDto$Type25;
        RideCardItemDto$Type rideCardItemDto$Type26 = new RideCardItemDto$Type("PROMO_BLOCK", 25);
        PROMO_BLOCK = rideCardItemDto$Type26;
        RideCardItemDto$Type rideCardItemDto$Type27 = new RideCardItemDto$Type("ACCORDION", 26);
        ACCORDION = rideCardItemDto$Type27;
        RideCardItemDto$Type rideCardItemDto$Type28 = new RideCardItemDto$Type("PROGRESS_BAR_ITEM", 27);
        PROGRESS_BAR_ITEM = rideCardItemDto$Type28;
        RideCardItemDto$Type rideCardItemDto$Type29 = new RideCardItemDto$Type("COLLAPSING_CONTAINER", 28);
        COLLAPSING_CONTAINER = rideCardItemDto$Type29;
        RideCardItemDto$Type rideCardItemDto$Type30 = new RideCardItemDto$Type("TIMELINE", 29);
        TIMELINE = rideCardItemDto$Type30;
        RideCardItemDto$Type rideCardItemDto$Type31 = new RideCardItemDto$Type("PHOTO", 30);
        PHOTO = rideCardItemDto$Type31;
        RideCardItemDto$Type rideCardItemDto$Type32 = new RideCardItemDto$Type("SLIDER", 31);
        SLIDER = rideCardItemDto$Type32;
        RideCardItemDto$Type rideCardItemDto$Type33 = new RideCardItemDto$Type("AI_BUBBLE", 32);
        AI_BUBBLE = rideCardItemDto$Type33;
        RideCardItemDto$Type rideCardItemDto$Type34 = new RideCardItemDto$Type("PICKUP_CODE", 33);
        PICKUP_CODE = rideCardItemDto$Type34;
        RideCardItemDto$Type rideCardItemDto$Type35 = new RideCardItemDto$Type("BUTTON", 34);
        BUTTON = rideCardItemDto$Type35;
        RideCardItemDto$Type rideCardItemDto$Type36 = new RideCardItemDto$Type("STATUS_PROGRESS", 35);
        STATUS_PROGRESS = rideCardItemDto$Type36;
        RideCardItemDto$Type rideCardItemDto$Type37 = new RideCardItemDto$Type("REQUIREMENT", 36);
        REQUIREMENT = rideCardItemDto$Type37;
        RideCardItemDto$Type[] rideCardItemDto$TypeArr = {rideCardItemDto$Type, rideCardItemDto$Type2, rideCardItemDto$Type3, rideCardItemDto$Type4, rideCardItemDto$Type5, rideCardItemDto$Type6, rideCardItemDto$Type7, rideCardItemDto$Type8, rideCardItemDto$Type9, rideCardItemDto$Type10, rideCardItemDto$Type11, rideCardItemDto$Type12, rideCardItemDto$Type13, rideCardItemDto$Type14, rideCardItemDto$Type15, rideCardItemDto$Type16, rideCardItemDto$Type17, rideCardItemDto$Type18, rideCardItemDto$Type19, rideCardItemDto$Type20, rideCardItemDto$Type21, rideCardItemDto$Type22, rideCardItemDto$Type23, rideCardItemDto$Type24, rideCardItemDto$Type25, rideCardItemDto$Type26, rideCardItemDto$Type27, rideCardItemDto$Type28, rideCardItemDto$Type29, rideCardItemDto$Type30, rideCardItemDto$Type31, rideCardItemDto$Type32, rideCardItemDto$Type33, rideCardItemDto$Type34, rideCardItemDto$Type35, rideCardItemDto$Type36, rideCardItemDto$Type37};
        $VALUES = rideCardItemDto$TypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardItemDto$TypeArr);
    }

    public static RideCardItemDto$Type valueOf(String str) {
        return (RideCardItemDto$Type) Enum.valueOf(RideCardItemDto$Type.class, str);
    }

    public static RideCardItemDto$Type[] values() {
        return (RideCardItemDto$Type[]) $VALUES.clone();
    }
}
