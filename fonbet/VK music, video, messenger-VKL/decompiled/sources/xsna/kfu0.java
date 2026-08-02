package xsna;

import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkBridgeAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class kfu0 {

    /* compiled from: VkBridgeAnalyticsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[VkBridgeAnalytics.ExitGameAlertEvent.values().length];
            try {
                iArr[VkBridgeAnalytics.ExitGameAlertEvent.SHOW_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkBridgeAnalytics.ExitGameAlertEvent.STAY_IN_GAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkBridgeAnalytics.ExitGameAlertEvent.EXIT_FROM_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkBridgeAnalytics.ExitGameAlertEvent.SHOW_GAMES_RECOMMENDATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkBridgeAnalytics.ExitGameAlertEvent.RECOMMENDATION_APP_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkBridgeAnalytics.PersonalDiscountEvent.values().length];
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.OPEN_SNACK_BAR_PROMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.VIEW_PROMO_MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.HIDE_PROMO_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.OPEN_TAB_MODAL_PURCHASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.OPEN_TAB_MENU_PURCHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.OPEN_TAB_PROFILE_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VkBridgeAnalytics.PersonalDiscountEvent.CLICK_RULES_BUTTON.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkBridgeAnalytics.BannerAdEvent.values().length];
            try {
                iArr3[VkBridgeAnalytics.BannerAdEvent.HIDE_BY_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[VkBridgeAnalytics.BannerAdEvent.HIDE_BY_BRIDGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[VkBridgeAnalytics.BannerAdEvent.SHOW_AUTO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[VkBridgeAnalytics.BannerAdEvent.SHOW_BY_BRIDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[VkBridgeAnalytics.BannerAdEvent.TAPPED_BY_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AdRequestEvent.AdFormat.values().length];
            try {
                iArr4[AdRequestEvent.AdFormat.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[AdRequestEvent.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[AdRequestEvent.AdFormat.MULTI_INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[AdRequestEvent.AdFormat.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[AdRequestEvent.EventType.values().length];
            try {
                iArr5[AdRequestEvent.EventType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[AdRequestEvent.EventType.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[AdRequestEvent.EventType.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[AdRequestEvent.EventType.IMPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[AdRequestEvent.RequestType.values().length];
            try {
                iArr6[AdRequestEvent.RequestType.BRIDGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[AdRequestEvent.RequestType.SPLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[AdRequestEvent.RequestType.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[AdRequestEvent.RequestSubtype.values().length];
            try {
                iArr7[AdRequestEvent.RequestSubtype.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[AdRequestEvent.RequestSubtype.CHECK.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[AdRequestEvent.RequestSubtype.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[AdRequestEvent.RequestSubtype.LOAD_NEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[VkBridgeAnalytics.RegistrationEvent.values().length];
            try {
                iArr8[VkBridgeAnalytics.RegistrationEvent.EXTERNAL_LINK_MINIAPP_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[VkBridgeAnalytics.RegistrationEvent.EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event a(VkBridgeAnalytics.ExitGameAlertEvent exitGameAlertEvent) {
        int i = a.$EnumSwitchMapping$0[exitGameAlertEvent.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event.MODAL_SHOW;
        }
        if (i == 2) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event.CANCEL_BUTTON_CLICK;
        }
        if (i == 3) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event.CONFIRM_BUTTON_CLICK;
        }
        if (i == 4) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event.SHOW_RECOMMENDATION;
        }
        if (i == 5) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event.RECOMMENDATION_APP_VIEW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
