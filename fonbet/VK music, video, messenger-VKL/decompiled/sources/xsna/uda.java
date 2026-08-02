package xsna;

import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.t0a;

/* compiled from: CatalogSearchStatProviderImpl.kt */
/* loaded from: classes16.dex */
public final class uda implements tda {
    public final CatalogSearchStatInfo a;
    public final boolean b;

    /* compiled from: CatalogSearchStatProviderImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogSearchStatInfo.Mode.values().length];
            try {
                iArr[CatalogSearchStatInfo.Mode.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogSearchStatInfo.Mode.EnabledOnlyForLocal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogSearchStatInfo.Mode.Disabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.values().length];
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.WRITE_MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FRIEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_SUBSCRIBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.MONEY.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_GIFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LISTEN_NEXT.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_STORY.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.NOT_INTERESTED.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BROADCAST.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ALBUM.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_CART.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_LINK.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_CART.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_USER_GEO.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_PRECISE_GEO.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_BROAD_GEO.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REJECT_GEO.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_PRECISE_USER_GEO.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_GEO_SETTINGS.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public uda(CatalogSearchStatInfo catalogSearchStatInfo, boolean z) {
        this.a = catalogSearchStatInfo;
        this.b = z;
    }

    @Override // xsna.tda
    public final SearchStatsLoggingInfo a(SchemeStat$EventItem.Type type, String str) {
        CatalogSearchStatInfo catalogSearchStatInfo = this.a;
        CatalogSearchStatInfo.Mode mode = catalogSearchStatInfo != null ? catalogSearchStatInfo.c : null;
        int i = mode == null ? -1 : a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        boolean z = catalogSearchStatInfo.b;
        return new SearchStatsLoggingInfo(null, 0, type, 0L, str, c, null, true, false, 75, null);
    }

    @Override // xsna.tda
    public final boolean b(t0a.a.d dVar, String str) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = dVar.a;
        CatalogSearchStatInfo catalogSearchStatInfo = this.a;
        if (catalogSearchStatInfo == null) {
            return false;
        }
        if (this.b) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = null;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        if (catalogSearchStatInfo.b) {
            switch (a.$EnumSwitchMapping$1[action.ordinal()]) {
                case 1:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.WRITE_MSG_OUT;
                    break;
                case 2:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FRIEND_OUT;
                    break;
                case 3:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_SUBSCRIBER_OUT;
                    break;
                case 4:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND_OUT;
                    break;
                case 5:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP_OUT;
                    break;
                case 6:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP_OUT;
                    break;
                case 7:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                    break;
                case 8:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                    break;
                case 9:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                    break;
                case 10:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.MONEY_OUT;
                    break;
                case 11:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL_OUT;
                    break;
                case 12:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_GIFT_OUT;
                    break;
                case 13:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES_OUT;
                    break;
                case 14:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT;
                    break;
                case 15:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT;
                    break;
                case 16:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PLAY_ALL_OUT;
                    break;
                case 17:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                    break;
                case 18:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                    break;
                case 19:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                    break;
                case 20:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE_OUT;
                    break;
                case 21:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE_OUT;
                    break;
                case 22:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                    break;
                case 23:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT;
                    break;
                case 24:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT;
                    break;
                case 25:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT_OUT;
                    break;
                case 26:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PAUSE_OUT;
                    break;
                case 27:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME_OUT;
                    break;
                case 28:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LISTEN_NEXT_OUT;
                    break;
                case 29:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST_OUT;
                    break;
                case 30:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_STORY_OUT;
                    break;
                case 31:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.NOT_INTERESTED_OUT;
                    break;
                case 32:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BROADCAST_OUT;
                    break;
                case 33:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ALBUM_OUT;
                    break;
                case 34:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL_OUT;
                    break;
                case 35:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL_OUT;
                    break;
                case 36:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY_OUT;
                    break;
                case 37:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_CART_OUT;
                    break;
                case 38:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_LINK_OUT;
                    break;
                case 39:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_CART_OUT;
                    break;
                case 40:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_USER_GEO_OUT;
                    break;
                case 41:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_PRECISE_GEO_OUT;
                    break;
                case 42:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_BROAD_GEO_OUT;
                    break;
                case 43:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REJECT_GEO_OUT;
                    break;
                case 44:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_PRECISE_USER_GEO_OUT;
                    break;
                case 45:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_GEO_SETTINGS_OUT;
                    break;
            }
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(dVar.b, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, mobileOfficialAppsCoreNavStat$EventScreen2, 14, null), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        return true;
    }

    @Override // xsna.tda
    public final CatalogSearchStatInfo c() {
        return this.a;
    }
}
