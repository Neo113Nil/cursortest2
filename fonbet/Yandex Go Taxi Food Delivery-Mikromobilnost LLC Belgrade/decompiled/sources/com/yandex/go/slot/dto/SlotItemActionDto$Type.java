package com.yandex.go.slot.dto;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b2\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4¨\u00065"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$Type", "", "Lcom/yandex/go/slot/dto/SlotItemActionDto$Type;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNKNOWN", "CHANGE_SOURCE", "CHANGE_ENTRANCE", "CHANGE_DESTINATION", "OPEN_PAYMENT", "OPEN_ORDER_INFO", "CANCEL_ORDER", "ADD_ROUTE_POINT", "CHANGE_ROUTE_POINT", "CLOSE_AND_DEEPLINK", "SET_USER_COMING", "OPEN_CHAT", "OPEN_DEAF_DRIVER", "CALL_DRIVER", "OPEN_SAFETY_CENTER", "SHARE_ROUTE", "CREATE_ORDER", "OPEN_URL", "OPEN_COMMENT", "OPEN_COST_CENTER", "OPEN_CENTER_MODAL", "OPEN_DETAILED_PRICE_MODAL", "OPEN_BOTTOM_MODAL", "OPEN_SETTINGS_MODAL", "DELETE_FAVORITE_RIDE", "SHARE_FAVORITE_RIDE", "EDIT_FAVORITE_RIDE", "TOGGLE_SHARE_LOCATION", "CANCEL_ALT_OPTION", "CONFIRM_ALT_OPTION", "TOGGLE_ULTIMA_MODE", "OPEN_TIPS_MODAL", "OPEN_DETAILS", "OPEN_COMPACT_OR_DETAILS", "OPEN_SUPPORT", "ACCEPT_EULA", "REJECT_EULA", "CHANGE_RATING", "CHANGE_RATING_AND_OPEN_DETAILS", "DEEPLINK", "SET_CHECK_IN_CONFIRMED", "COPY_TO_CLIPBOARD", "ACTIVATION_WITH_ONBOARDING", "CHANGE_REQUIREMENTS", "START_ACCEPTANCE_PAYMENT", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemActionDto$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemActionDto$Type[] $VALUES;
    public static final SlotItemActionDto$Type ACCEPT_EULA;
    public static final SlotItemActionDto$Type ACTIVATION_WITH_ONBOARDING;
    public static final SlotItemActionDto$Type ADD_ROUTE_POINT;
    public static final SlotItemActionDto$Type CALL_DRIVER;
    public static final SlotItemActionDto$Type CANCEL_ALT_OPTION;
    public static final SlotItemActionDto$Type CANCEL_ORDER;
    public static final SlotItemActionDto$Type CHANGE_DESTINATION;
    public static final SlotItemActionDto$Type CHANGE_ENTRANCE;
    public static final SlotItemActionDto$Type CHANGE_RATING;
    public static final SlotItemActionDto$Type CHANGE_RATING_AND_OPEN_DETAILS;
    public static final SlotItemActionDto$Type CHANGE_REQUIREMENTS;
    public static final SlotItemActionDto$Type CHANGE_ROUTE_POINT;
    public static final SlotItemActionDto$Type CHANGE_SOURCE;
    public static final SlotItemActionDto$Type CLOSE_AND_DEEPLINK;
    public static final SlotItemActionDto$Type CONFIRM_ALT_OPTION;
    public static final SlotItemActionDto$Type COPY_TO_CLIPBOARD;
    public static final SlotItemActionDto$Type CREATE_ORDER;
    public static final SlotItemActionDto$Type DEEPLINK;
    public static final SlotItemActionDto$Type DELETE_FAVORITE_RIDE;
    public static final SlotItemActionDto$Type EDIT_FAVORITE_RIDE;
    public static final SlotItemActionDto$Type OPEN_BOTTOM_MODAL;
    public static final SlotItemActionDto$Type OPEN_CENTER_MODAL;
    public static final SlotItemActionDto$Type OPEN_CHAT;
    public static final SlotItemActionDto$Type OPEN_COMMENT;
    public static final SlotItemActionDto$Type OPEN_COMPACT_OR_DETAILS;
    public static final SlotItemActionDto$Type OPEN_COST_CENTER;
    public static final SlotItemActionDto$Type OPEN_DEAF_DRIVER;
    public static final SlotItemActionDto$Type OPEN_DETAILED_PRICE_MODAL;
    public static final SlotItemActionDto$Type OPEN_DETAILS;
    public static final SlotItemActionDto$Type OPEN_ORDER_INFO;
    public static final SlotItemActionDto$Type OPEN_PAYMENT;
    public static final SlotItemActionDto$Type OPEN_SAFETY_CENTER;
    public static final SlotItemActionDto$Type OPEN_SETTINGS_MODAL;
    public static final SlotItemActionDto$Type OPEN_SUPPORT;
    public static final SlotItemActionDto$Type OPEN_TIPS_MODAL;
    public static final SlotItemActionDto$Type OPEN_URL;
    public static final SlotItemActionDto$Type REJECT_EULA;
    public static final SlotItemActionDto$Type SET_CHECK_IN_CONFIRMED;
    public static final SlotItemActionDto$Type SET_USER_COMING;
    public static final SlotItemActionDto$Type SHARE_FAVORITE_RIDE;
    public static final SlotItemActionDto$Type SHARE_ROUTE;
    public static final SlotItemActionDto$Type START_ACCEPTANCE_PAYMENT;
    public static final SlotItemActionDto$Type TOGGLE_SHARE_LOCATION;
    public static final SlotItemActionDto$Type TOGGLE_ULTIMA_MODE;
    public static final SlotItemActionDto$Type UNKNOWN;
    private final String analyticsName;

    static {
        SlotItemActionDto$Type slotItemActionDto$Type = new SlotItemActionDto$Type("UNKNOWN", 0, "none");
        UNKNOWN = slotItemActionDto$Type;
        SlotItemActionDto$Type slotItemActionDto$Type2 = new SlotItemActionDto$Type("CHANGE_SOURCE", 1, "change_source");
        CHANGE_SOURCE = slotItemActionDto$Type2;
        SlotItemActionDto$Type slotItemActionDto$Type3 = new SlotItemActionDto$Type("CHANGE_ENTRANCE", 2, "change_entrance");
        CHANGE_ENTRANCE = slotItemActionDto$Type3;
        SlotItemActionDto$Type slotItemActionDto$Type4 = new SlotItemActionDto$Type("CHANGE_DESTINATION", 3, "change_destination");
        CHANGE_DESTINATION = slotItemActionDto$Type4;
        SlotItemActionDto$Type slotItemActionDto$Type5 = new SlotItemActionDto$Type("OPEN_PAYMENT", 4, "open_payment");
        OPEN_PAYMENT = slotItemActionDto$Type5;
        SlotItemActionDto$Type slotItemActionDto$Type6 = new SlotItemActionDto$Type("OPEN_ORDER_INFO", 5, "open_order_info");
        OPEN_ORDER_INFO = slotItemActionDto$Type6;
        SlotItemActionDto$Type slotItemActionDto$Type7 = new SlotItemActionDto$Type("CANCEL_ORDER", 6, "cancel");
        CANCEL_ORDER = slotItemActionDto$Type7;
        SlotItemActionDto$Type slotItemActionDto$Type8 = new SlotItemActionDto$Type("ADD_ROUTE_POINT", 7, "add_route_point");
        ADD_ROUTE_POINT = slotItemActionDto$Type8;
        SlotItemActionDto$Type slotItemActionDto$Type9 = new SlotItemActionDto$Type("CHANGE_ROUTE_POINT", 8, "change_route_point");
        CHANGE_ROUTE_POINT = slotItemActionDto$Type9;
        SlotItemActionDto$Type slotItemActionDto$Type10 = new SlotItemActionDto$Type("CLOSE_AND_DEEPLINK", 9, "close_and_deeplink");
        CLOSE_AND_DEEPLINK = slotItemActionDto$Type10;
        SlotItemActionDto$Type slotItemActionDto$Type11 = new SlotItemActionDto$Type("SET_USER_COMING", 10, "set_user_coming");
        SET_USER_COMING = slotItemActionDto$Type11;
        SlotItemActionDto$Type slotItemActionDto$Type12 = new SlotItemActionDto$Type("OPEN_CHAT", 11, "open_chat");
        OPEN_CHAT = slotItemActionDto$Type12;
        SlotItemActionDto$Type slotItemActionDto$Type13 = new SlotItemActionDto$Type("OPEN_DEAF_DRIVER", 12, "open_deaf_driver");
        OPEN_DEAF_DRIVER = slotItemActionDto$Type13;
        SlotItemActionDto$Type slotItemActionDto$Type14 = new SlotItemActionDto$Type("CALL_DRIVER", 13, "call_driver");
        CALL_DRIVER = slotItemActionDto$Type14;
        SlotItemActionDto$Type slotItemActionDto$Type15 = new SlotItemActionDto$Type("OPEN_SAFETY_CENTER", 14, "open_safety_center");
        OPEN_SAFETY_CENTER = slotItemActionDto$Type15;
        SlotItemActionDto$Type slotItemActionDto$Type16 = new SlotItemActionDto$Type("SHARE_ROUTE", 15, "share_route");
        SHARE_ROUTE = slotItemActionDto$Type16;
        SlotItemActionDto$Type slotItemActionDto$Type17 = new SlotItemActionDto$Type("CREATE_ORDER", 16, "create_order");
        CREATE_ORDER = slotItemActionDto$Type17;
        SlotItemActionDto$Type slotItemActionDto$Type18 = new SlotItemActionDto$Type("OPEN_URL", 17, "open_url");
        OPEN_URL = slotItemActionDto$Type18;
        SlotItemActionDto$Type slotItemActionDto$Type19 = new SlotItemActionDto$Type("OPEN_COMMENT", 18, "open_comment");
        OPEN_COMMENT = slotItemActionDto$Type19;
        SlotItemActionDto$Type slotItemActionDto$Type20 = new SlotItemActionDto$Type("OPEN_COST_CENTER", 19, "open_cost_center");
        OPEN_COST_CENTER = slotItemActionDto$Type20;
        SlotItemActionDto$Type slotItemActionDto$Type21 = new SlotItemActionDto$Type("OPEN_CENTER_MODAL", 20, "open_center_modal");
        OPEN_CENTER_MODAL = slotItemActionDto$Type21;
        SlotItemActionDto$Type slotItemActionDto$Type22 = new SlotItemActionDto$Type("OPEN_DETAILED_PRICE_MODAL", 21, "open_detailed_price_modal");
        OPEN_DETAILED_PRICE_MODAL = slotItemActionDto$Type22;
        SlotItemActionDto$Type slotItemActionDto$Type23 = new SlotItemActionDto$Type("OPEN_BOTTOM_MODAL", 22, "open_bottom_modal");
        OPEN_BOTTOM_MODAL = slotItemActionDto$Type23;
        SlotItemActionDto$Type slotItemActionDto$Type24 = new SlotItemActionDto$Type("OPEN_SETTINGS_MODAL", 23, "open_settings_modal");
        OPEN_SETTINGS_MODAL = slotItemActionDto$Type24;
        SlotItemActionDto$Type slotItemActionDto$Type25 = new SlotItemActionDto$Type("DELETE_FAVORITE_RIDE", 24, "delete_favorite_ride");
        DELETE_FAVORITE_RIDE = slotItemActionDto$Type25;
        SlotItemActionDto$Type slotItemActionDto$Type26 = new SlotItemActionDto$Type("SHARE_FAVORITE_RIDE", 25, "share_favorite_ride");
        SHARE_FAVORITE_RIDE = slotItemActionDto$Type26;
        SlotItemActionDto$Type slotItemActionDto$Type27 = new SlotItemActionDto$Type("EDIT_FAVORITE_RIDE", 26, "edit_favorite_ride");
        EDIT_FAVORITE_RIDE = slotItemActionDto$Type27;
        SlotItemActionDto$Type slotItemActionDto$Type28 = new SlotItemActionDto$Type("TOGGLE_SHARE_LOCATION", 27, "toggle_share_location");
        TOGGLE_SHARE_LOCATION = slotItemActionDto$Type28;
        SlotItemActionDto$Type slotItemActionDto$Type29 = new SlotItemActionDto$Type("CANCEL_ALT_OPTION", 28, "cancel_alt_option");
        CANCEL_ALT_OPTION = slotItemActionDto$Type29;
        SlotItemActionDto$Type slotItemActionDto$Type30 = new SlotItemActionDto$Type("CONFIRM_ALT_OPTION", 29, "confirm_alt_option");
        CONFIRM_ALT_OPTION = slotItemActionDto$Type30;
        SlotItemActionDto$Type slotItemActionDto$Type31 = new SlotItemActionDto$Type("TOGGLE_ULTIMA_MODE", 30, "toggle_ultima_mode");
        TOGGLE_ULTIMA_MODE = slotItemActionDto$Type31;
        SlotItemActionDto$Type slotItemActionDto$Type32 = new SlotItemActionDto$Type("OPEN_TIPS_MODAL", 31, "open_tips_modal");
        OPEN_TIPS_MODAL = slotItemActionDto$Type32;
        SlotItemActionDto$Type slotItemActionDto$Type33 = new SlotItemActionDto$Type("OPEN_DETAILS", 32, "open_details");
        OPEN_DETAILS = slotItemActionDto$Type33;
        SlotItemActionDto$Type slotItemActionDto$Type34 = new SlotItemActionDto$Type("OPEN_COMPACT_OR_DETAILS", 33, "open_compact_or_details");
        OPEN_COMPACT_OR_DETAILS = slotItemActionDto$Type34;
        SlotItemActionDto$Type slotItemActionDto$Type35 = new SlotItemActionDto$Type("OPEN_SUPPORT", 34, "open_support");
        OPEN_SUPPORT = slotItemActionDto$Type35;
        SlotItemActionDto$Type slotItemActionDto$Type36 = new SlotItemActionDto$Type("ACCEPT_EULA", 35, "accept_eula");
        ACCEPT_EULA = slotItemActionDto$Type36;
        SlotItemActionDto$Type slotItemActionDto$Type37 = new SlotItemActionDto$Type("REJECT_EULA", 36, "reject_eula");
        REJECT_EULA = slotItemActionDto$Type37;
        SlotItemActionDto$Type slotItemActionDto$Type38 = new SlotItemActionDto$Type("CHANGE_RATING", 37, "change_rating");
        CHANGE_RATING = slotItemActionDto$Type38;
        SlotItemActionDto$Type slotItemActionDto$Type39 = new SlotItemActionDto$Type("CHANGE_RATING_AND_OPEN_DETAILS", 38, "change_rating_and_open_details");
        CHANGE_RATING_AND_OPEN_DETAILS = slotItemActionDto$Type39;
        SlotItemActionDto$Type slotItemActionDto$Type40 = new SlotItemActionDto$Type("DEEPLINK", 39, Constants.DEEPLINK);
        DEEPLINK = slotItemActionDto$Type40;
        SlotItemActionDto$Type slotItemActionDto$Type41 = new SlotItemActionDto$Type("SET_CHECK_IN_CONFIRMED", 40, "set_check_in_confirmed");
        SET_CHECK_IN_CONFIRMED = slotItemActionDto$Type41;
        SlotItemActionDto$Type slotItemActionDto$Type42 = new SlotItemActionDto$Type("COPY_TO_CLIPBOARD", 41, "copy_to_clipboard");
        COPY_TO_CLIPBOARD = slotItemActionDto$Type42;
        SlotItemActionDto$Type slotItemActionDto$Type43 = new SlotItemActionDto$Type("ACTIVATION_WITH_ONBOARDING", 42, "activation_with_onboarding");
        ACTIVATION_WITH_ONBOARDING = slotItemActionDto$Type43;
        SlotItemActionDto$Type slotItemActionDto$Type44 = new SlotItemActionDto$Type("CHANGE_REQUIREMENTS", 43, "change_requirements");
        CHANGE_REQUIREMENTS = slotItemActionDto$Type44;
        SlotItemActionDto$Type slotItemActionDto$Type45 = new SlotItemActionDto$Type("START_ACCEPTANCE_PAYMENT", 44, "start_acceptance_payment");
        START_ACCEPTANCE_PAYMENT = slotItemActionDto$Type45;
        SlotItemActionDto$Type[] slotItemActionDto$TypeArr = {slotItemActionDto$Type, slotItemActionDto$Type2, slotItemActionDto$Type3, slotItemActionDto$Type4, slotItemActionDto$Type5, slotItemActionDto$Type6, slotItemActionDto$Type7, slotItemActionDto$Type8, slotItemActionDto$Type9, slotItemActionDto$Type10, slotItemActionDto$Type11, slotItemActionDto$Type12, slotItemActionDto$Type13, slotItemActionDto$Type14, slotItemActionDto$Type15, slotItemActionDto$Type16, slotItemActionDto$Type17, slotItemActionDto$Type18, slotItemActionDto$Type19, slotItemActionDto$Type20, slotItemActionDto$Type21, slotItemActionDto$Type22, slotItemActionDto$Type23, slotItemActionDto$Type24, slotItemActionDto$Type25, slotItemActionDto$Type26, slotItemActionDto$Type27, slotItemActionDto$Type28, slotItemActionDto$Type29, slotItemActionDto$Type30, slotItemActionDto$Type31, slotItemActionDto$Type32, slotItemActionDto$Type33, slotItemActionDto$Type34, slotItemActionDto$Type35, slotItemActionDto$Type36, slotItemActionDto$Type37, slotItemActionDto$Type38, slotItemActionDto$Type39, slotItemActionDto$Type40, slotItemActionDto$Type41, slotItemActionDto$Type42, slotItemActionDto$Type43, slotItemActionDto$Type44, slotItemActionDto$Type45};
        $VALUES = slotItemActionDto$TypeArr;
        $ENTRIES = kotlin.enums.a.a(slotItemActionDto$TypeArr);
    }

    public SlotItemActionDto$Type(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SlotItemActionDto$Type valueOf(String str) {
        return (SlotItemActionDto$Type) Enum.valueOf(SlotItemActionDto$Type.class, str);
    }

    public static SlotItemActionDto$Type[] values() {
        return (SlotItemActionDto$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
