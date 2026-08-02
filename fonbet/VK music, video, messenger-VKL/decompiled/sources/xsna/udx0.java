package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem;
import com.vk.stat.scheme.MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem;
import com.vk.stat.scheme.MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.stat.scheme.SchemeStat$TypeVkRunItem;
import com.vk.stat.scheme.SchemeStat$VkRunPermissionItem;
import com.vk.superapp.bridges.dto.analytics.ActionGamesNotificationsPopup;
import com.vk.superapp.bridges.dto.analytics.ActionMenuClick;
import com.vk.superapp.bridges.dto.analytics.ActionMenuCloseCause;
import com.vk.superapp.bridges.dto.analytics.DialogActionClick;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.bridges.dto.analytics.RefreshType;
import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkRunPermissionItem;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$HealthConnectInfo$Installer;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$Permission;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$PermissionState;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$SyncReason;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.gzp0;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: WebAppAnalytics.kt */
/* loaded from: classes11.dex */
public final class udx0 {

    /* compiled from: WebAppAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$12;
        public static final /* synthetic */ int[] $EnumSwitchMapping$13;
        public static final /* synthetic */ int[] $EnumSwitchMapping$14;
        public static final /* synthetic */ int[] $EnumSwitchMapping$15;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[VkRunPermissionItem.VkRunPermission.values().length];
            try {
                iArr[VkRunPermissionItem.VkRunPermission.ACTIVITY_RECOGNITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkRunPermissionItem.VkRunPermission.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkRunPermissionItem.VkRunPermission.GOOGLE_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkRunPermissionItem.VkRunPermission.PERMISSION_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkHealthProductType.values().length];
            try {
                iArr2[VkHealthProductType.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkHealthProductType.WORKOUTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkSystemWidgetType.values().length];
            try {
                iArr3[VkSystemWidgetType.SMALL_OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VkSystemWidgetType.LARGE_OVERVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RefreshType.values().length];
            try {
                iArr4[RefreshType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[RefreshType.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[MiniAppPolicyScreenEventType.values().length];
            try {
                iArr5[MiniAppPolicyScreenEventType.START_SCREEN_APP_CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_PERMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_POLICY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_TERMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_SERVICE_POLICY.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_SERVICE_TERMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.VK_CONNECT_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[MiniAppPolicyScreenEventType.VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[MiniAppSettingsBoxAction.values().length];
            try {
                iArr6[MiniAppSettingsBoxAction.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[MiniAppSettingsBoxAction.ALLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[MiniAppSettingsBoxAction.DENY.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[MiniAppSettingsBoxType.values().length];
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_JOIN_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_GET_GEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_GET_EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_GET_PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GROUP_MESSAGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[VkStepsResultPermissionItem$PermissionState.values().length];
            try {
                iArr8[VkStepsResultPermissionItem$PermissionState.PERMISSIONS_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[VkStepsResultPermissionItem$PermissionState.SOME_PERMISSIONS_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr8[VkStepsResultPermissionItem$PermissionState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[VkStepsResultPermissionItem$SyncReason.values().length];
            try {
                iArr9[VkStepsResultPermissionItem$SyncReason.CHECK_STEPS_PERMISSIONS_COMMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr9[VkStepsResultPermissionItem$SyncReason.GET_STEPS_COMMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[VkStepsResultPermissionItem$Permission.values().length];
            try {
                iArr10[VkStepsResultPermissionItem$Permission.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr10[VkStepsResultPermissionItem$Permission.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[VkStepsResultPermissionItem$Permission.ACTIVITY_RECOGNITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr10[VkStepsResultPermissionItem$Permission.WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr10[VkStepsResultPermissionItem$Permission.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.values().length];
            try {
                iArr11[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr11[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr11[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.NEED_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr11[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.NEED_INSTALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr11[VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[VkStepsResultPermissionItem$HealthConnectInfo$Installer.values().length];
            try {
                iArr12[VkStepsResultPermissionItem$HealthConnectInfo$Installer.SYSTEM_PREINSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr12[VkStepsResultPermissionItem$HealthConnectInfo$Installer.PLAY_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr12[VkStepsResultPermissionItem$HealthConnectInfo$Installer.UNKNOWN_SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr12[VkStepsResultPermissionItem$HealthConnectInfo$Installer.NOT_INSTALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$11 = iArr12;
            int[] iArr13 = new int[DialogActionClick.values().length];
            try {
                iArr13[DialogActionClick.RECOMMENDATION_MODAL_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr13[DialogActionClick.RECOMMENDATION_MODAL_RECOMMEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$12 = iArr13;
            int[] iArr14 = new int[ActionMenuClick.values().length];
            try {
                iArr14[ActionMenuClick.ADD_TO_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr14[ActionMenuClick.REMOVE_FROM_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr14[ActionMenuClick.ENABLE_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr14[ActionMenuClick.DISABLE_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr14[ActionMenuClick.ENABLE_BADGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr14[ActionMenuClick.DISABLE_BADGES.ordinal()] = 6;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr14[ActionMenuClick.SHOW_DEBUG_MENU.ordinal()] = 7;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr14[ActionMenuClick.HIDE_DEBUG_MENU.ordinal()] = 8;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr14[ActionMenuClick.ADD_TO_RECOMMENDATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr14[ActionMenuClick.REMOVE_FROM_RECOMMENDATIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr14[ActionMenuClick.SHARE.ordinal()] = 11;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr14[ActionMenuClick.COPY.ordinal()] = 12;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr14[ActionMenuClick.ADD_TO_HOME_SCREEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr14[ActionMenuClick.PIP.ordinal()] = 14;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr14[ActionMenuClick.REPORT.ordinal()] = 15;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr14[ActionMenuClick.CLEAR_CACHE.ordinal()] = 16;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr14[ActionMenuClick.DELETE.ordinal()] = 17;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr14[ActionMenuClick.FAVE_ADD.ordinal()] = 18;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr14[ActionMenuClick.FAVE_REMOVE.ordinal()] = 19;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr14[ActionMenuClick.ABOUT_APP.ordinal()] = 20;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr14[ActionMenuClick.HELP.ordinal()] = 21;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr14[ActionMenuClick.ALL_APPS.ordinal()] = 22;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr14[ActionMenuClick.ALL_GAMES.ordinal()] = 23;
            } catch (NoSuchFieldError unused72) {
            }
            $EnumSwitchMapping$13 = iArr14;
            int[] iArr15 = new int[ActionMenuCloseCause.values().length];
            try {
                iArr15[ActionMenuCloseCause.SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr15[ActionMenuCloseCause.ADD_TO_HOME_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr15[ActionMenuCloseCause.ABOUT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr15[ActionMenuCloseCause.REPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr15[ActionMenuCloseCause.CLEAR_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr15[ActionMenuCloseCause.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr15[ActionMenuCloseCause.REMOVE_FROM_FAVORITES.ordinal()] = 7;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr15[ActionMenuCloseCause.COPY.ordinal()] = 8;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr15[ActionMenuCloseCause.ADD_TO_RECOMMENDATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr15[ActionMenuCloseCause.REMOVE_FROM_RECOMMENDATIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr15[ActionMenuCloseCause.FAVE_ADD.ordinal()] = 11;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr15[ActionMenuCloseCause.FAVE_REMOVE.ordinal()] = 12;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr15[ActionMenuCloseCause.PIP_MODE.ordinal()] = 13;
            } catch (NoSuchFieldError unused85) {
            }
            $EnumSwitchMapping$14 = iArr15;
            int[] iArr16 = new int[ActionGamesNotificationsPopup.values().length];
            try {
                iArr16[ActionGamesNotificationsPopup.SHOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr16[ActionGamesNotificationsPopup.CLOSED_BY_SWIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr16[ActionGamesNotificationsPopup.CLOSED_BY_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr16[ActionGamesNotificationsPopup.SETTINGS_OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused89) {
            }
            $EnumSwitchMapping$15 = iArr16;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static MobileOfficialAppsCoreNavStat$EventScreen a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2140279515:
                    if (str.equals("discover_full")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_FULL;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH;
                    }
                    break;
                case 3045982:
                    if (str.equals(NotificationCompat.CATEGORY_CALL)) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL;
                    }
                    break;
                case 3138974:
                    if (str.equals("feed")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.FEED;
                    }
                    break;
                case 3321850:
                    if (str.equals("link")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.LINK;
                    }
                    break;
                case 3347807:
                    if (str.equals("menu")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.MENU;
                    }
                    break;
                case 555704345:
                    if (str.equals("catalog")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.CATALOG;
                    }
                    break;
                case 921452364:
                    if (str.equals("apps_catalog")) {
                        return MobileOfficialAppsCoreNavStat$EventScreen.APPS_CATALOG;
                    }
                    break;
            }
        }
        return MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
    }

    public final void b(long j, DialogActionClick dialogActionClick) {
        SchemeStat$TypeMiniAppItem.Type type;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(j), null, null, null, null, 60, null);
        int i = a.$EnumSwitchMapping$12[dialogActionClick.ordinal()];
        if (i == 1) {
            type = SchemeStat$TypeMiniAppItem.Type.RECOMMENDATION_MODAL_CANCEL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = SchemeStat$TypeMiniAppItem.Type.RECOMMENDATION_MODAL_RECOMMEND;
        }
        gzp0.a.a(MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2));
    }

    public final void c(String str, Map<String, String> map) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.d(map);
        bVar.k(aVar.e());
    }

    public final void d(boolean z, long j, ActionGamesNotificationsPopup actionGamesNotificationsPopup) {
        SchemeStat$TypeMiniAppItem.Type type;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(z ? SchemeStat$EventItem.Type.GAME : SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(j), null, null, null, null, 60, null);
        int i = a.$EnumSwitchMapping$15[actionGamesNotificationsPopup.ordinal()];
        if (i == 1) {
            type = SchemeStat$TypeMiniAppItem.Type.NOTIFICATIONS_REQUEST_SENT;
        } else if (i == 2) {
            type = SchemeStat$TypeMiniAppItem.Type.NOTIFICATIONS_REQUEST_SWIPE;
        } else if (i == 3) {
            type = SchemeStat$TypeMiniAppItem.Type.NOTIFICATIONS_REQUEST_TIMEOUT;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            type = SchemeStat$TypeMiniAppItem.Type.NOTIFICATIONS_REQUEST_SETTINGS_OPEN;
        }
        gzp0.a.b(SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2));
    }

    public final void e(List<VkRunPermissionItem> list) {
        final SchemeStat$VkRunPermissionItem.Permission permission;
        ArrayList arrayList = new ArrayList();
        for (VkRunPermissionItem vkRunPermissionItem : list) {
            int i = a.$EnumSwitchMapping$0[vkRunPermissionItem.a().ordinal()];
            if (i == 1) {
                permission = SchemeStat$VkRunPermissionItem.Permission.ACTIVITY_RECOGNITION;
            } else if (i == 2) {
                permission = SchemeStat$VkRunPermissionItem.Permission.LOCATION;
            } else if (i == 3) {
                permission = SchemeStat$VkRunPermissionItem.Permission.GOOGLE_FIT;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                permission = SchemeStat$VkRunPermissionItem.Permission.PERMISSION_NOTIFICATION;
            }
            final boolean b = vkRunPermissionItem.b();
            arrayList.add(new Object(permission, b) { // from class: com.vk.stat.scheme.SchemeStat$VkRunPermissionItem

                @pmi0("is_granted")
                private final boolean isGranted;

                @pmi0("permission")
                private final Permission permission;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: SchemeStat.kt */
                public static final class Permission {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Permission[] $VALUES;

                    @pmi0("activity_recognition")
                    public static final Permission ACTIVITY_RECOGNITION;

                    @pmi0("apple_health")
                    public static final Permission APPLE_HEALTH;

                    @pmi0("google_fit")
                    public static final Permission GOOGLE_FIT;

                    @pmi0("location")
                    public static final Permission LOCATION;

                    @pmi0("permission_notification")
                    public static final Permission PERMISSION_NOTIFICATION;

                    static {
                        Permission permission = new Permission("LOCATION", 0);
                        LOCATION = permission;
                        Permission permission2 = new Permission("GOOGLE_FIT", 1);
                        GOOGLE_FIT = permission2;
                        Permission permission3 = new Permission("ACTIVITY_RECOGNITION", 2);
                        ACTIVITY_RECOGNITION = permission3;
                        Permission permission4 = new Permission("PERMISSION_NOTIFICATION", 3);
                        PERMISSION_NOTIFICATION = permission4;
                        Permission permission5 = new Permission("APPLE_HEALTH", 4);
                        APPLE_HEALTH = permission5;
                        Permission[] permissionArr = {permission, permission2, permission3, permission4, permission5};
                        $VALUES = permissionArr;
                        $ENTRIES = new asp(permissionArr);
                    }

                    private Permission(String str, int i) {
                    }

                    public static Permission valueOf(String str) {
                        return (Permission) Enum.valueOf(Permission.class, str);
                    }

                    public static Permission[] values() {
                        return (Permission[]) $VALUES.clone();
                    }
                }

                {
                    this.permission = permission;
                    this.isGranted = b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SchemeStat$VkRunPermissionItem)) {
                        return false;
                    }
                    SchemeStat$VkRunPermissionItem schemeStat$VkRunPermissionItem = (SchemeStat$VkRunPermissionItem) obj;
                    return this.permission == schemeStat$VkRunPermissionItem.permission && this.isGranted == schemeStat$VkRunPermissionItem.isGranted;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.isGranted) + (this.permission.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("VkRunPermissionItem(permission=");
                    sb.append(this.permission);
                    sb.append(", isGranted=");
                    return defpackage.q0.a(sb, this.isGranted, ')');
                }
            });
        }
        new dhv0(new SchemeStat$TypeVkRunItem(arrayList, null, vhk0.f(), 2, null)).q();
    }

    public final void f(bpv0 bpv0Var) {
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.ProductType productType;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.WidgetType widgetType;
        String k = qvo0.k(qvo0.a, System.currentTimeMillis());
        if (k == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$1[bpv0Var.a().ordinal()];
        if (i == 1) {
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.ProductType.STEPS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.ProductType.WORKOUTS;
        }
        int i2 = a.$EnumSwitchMapping$2[bpv0Var.b().ordinal()];
        if (i2 == 1) {
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.WidgetType.SMALL_OVERVIEW;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem.WidgetType.LARGE_OVERVIEW;
        }
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetAddEventItem(productType, widgetType, k), 3)).q();
    }

    public final void g(cpv0 cpv0Var) {
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.ProductType productType;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.WidgetType widgetType;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.RefreshType refreshType;
        String k = qvo0.k(qvo0.a, System.currentTimeMillis());
        if (k == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$1[cpv0Var.b().ordinal()];
        if (i == 1) {
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.ProductType.STEPS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.ProductType.WORKOUTS;
        }
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.ProductType productType2 = productType;
        int i2 = a.$EnumSwitchMapping$2[cpv0Var.d().ordinal()];
        if (i2 == 1) {
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.WidgetType.SMALL_OVERVIEW;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.WidgetType.LARGE_OVERVIEW;
        }
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.WidgetType widgetType2 = widgetType;
        int i3 = a.$EnumSwitchMapping$3[cpv0Var.c().ordinal()];
        if (i3 == 1) {
            refreshType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.RefreshType.PREVIEW;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            refreshType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.RefreshType.REFRESH;
        }
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem(productType2, widgetType2, k, refreshType, null, cpv0Var.a()), 3)).q();
    }

    public final void h(dpv0 dpv0Var) {
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.ProductType productType;
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.WidgetType widgetType;
        String k = qvo0.k(qvo0.a, System.currentTimeMillis());
        if (k == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$1[dpv0Var.a().ordinal()];
        if (i == 1) {
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.ProductType.STEPS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            productType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.ProductType.WORKOUTS;
        }
        int i2 = a.$EnumSwitchMapping$2[dpv0Var.b().ordinal()];
        if (i2 == 1) {
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.WidgetType.SMALL_OVERVIEW;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            widgetType = MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem.WidgetType.LARGE_OVERVIEW;
        }
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRemoveEventItem(productType, widgetType, k), 3)).q();
    }
}
