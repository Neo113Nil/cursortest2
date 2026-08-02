package defpackage;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.shortcuts.models.OfferType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class q22 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OfferType.values().length];
        try {
            iArr[OfferType.UNSUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OfferType.TAXI_EXPECTED_DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OfferType.TAXI_ROUTE_INPUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OfferType.HEADER_SUMMARY_REDIRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OfferType.DEEPLINK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OfferType.HEADER_DEEP_LINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OfferType.MEDIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[OfferType.EATS_BASED_SUPER_APP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[OfferType.PERSONAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[OfferType.PERSONAL_SLIDER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[OfferType.DRIVE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[OfferType.ACTION_DRIVEN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[OfferType.ACTION_DRIVEN_THUMB.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[OfferType.HEADER_ACTION_DRIVEN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[OfferType.DELIVERY_DASHBOARD.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[OfferType.TAXI_MAP.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[OfferType.LIST_ITEM.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[OfferType.MARKETPLACE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[OfferType.ROUND_BUTTON.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[OfferType.SQUARE_BUTTON.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr;
        int[] iArr2 = new int[ActionType.values().length];
        try {
            iArr2[ActionType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ActionType.TAXI_SUMMARY_REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ActionType.TAXI_MAIN_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[ActionType.SELECT_POINT_A.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[ActionType.ROUTE_INPUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[ActionType.TAXI_PROCEED.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[ActionType.EXPECTED_DESTINATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[ActionType.OPEN_TARIFF_CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[ActionType.NAVIGATOR.ordinal()] = 9;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[ActionType.DISCOVERY.ordinal()] = 10;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[ActionType.WEB_APP_ACTION.ordinal()] = 11;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[ActionType.SCOOTERS_QR_SCAN.ordinal()] = 12;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[ActionType.SCOOTERS_SUPPORT.ordinal()] = 13;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[ActionType.SCOOTERS_COUPONS.ordinal()] = 14;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[ActionType.SCOOTERS_PASSES.ordinal()] = 15;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[ActionType.SCOOTERS_SUPER_PASSES.ordinal()] = 16;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[ActionType.SCOOTERS_ACTIVE_SUPER_PASSES.ordinal()] = 17;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[ActionType.SCOOTERS_INSURANCE.ordinal()] = 18;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[ActionType.SCOOTERS_MOS_RU.ordinal()] = 19;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[ActionType.SERVICE_CATALOG.ordinal()] = 20;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[ActionType.CHARGERS_QR_SCAN.ordinal()] = 21;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[ActionType.CHARGERS_SUBSCRIPTION.ordinal()] = 22;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[ActionType.PLUS_HOME.ordinal()] = 23;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[ActionType.CHARGERS_DVIZH_SUBSCRIPTION.ordinal()] = 24;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[ActionType.CHARGERS_PARTNER_SUBSCRIPTION.ordinal()] = 25;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[ActionType.CHARGERS_DISCOUNTS.ordinal()] = 26;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[ActionType.CHARGERS_PASSES.ordinal()] = 27;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[ActionType.CHARITY.ordinal()] = 28;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[ActionType.CITY_MODE.ordinal()] = 29;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[ActionType.INTERCITY_MAIN.ordinal()] = 30;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[ActionType.MT_ROUTE_INPUT.ordinal()] = 31;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[ActionType.DELIVERY_DASHBOARD.ordinal()] = 32;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[ActionType.SDC_ROUTE_SELECTION.ordinal()] = 33;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[ActionType.SCROLL_UP.ordinal()] = 34;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[ActionType.SUPERAPP_SEARCH.ordinal()] = 35;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[ActionType.ORDERS_LIST.ordinal()] = 36;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[ActionType.MARKETPLACE.ordinal()] = 37;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[ActionType.CAR_TECH.ordinal()] = 38;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[ActionType.OPEN_ORGANIZATIONS_LIST.ordinal()] = 39;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[ActionType.ORGANIZATIONS_DISCOVERY.ordinal()] = 40;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[ActionType.UNSUPPORTED.ordinal()] = 41;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[ActionType.REFRESH.ordinal()] = 42;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[ActionType.CLOSE.ordinal()] = 43;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[ActionType.ZOOM_LAYERS.ordinal()] = 44;
        } catch (NoSuchFieldError unused64) {
        }
        b = iArr2;
    }
}
