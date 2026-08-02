package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.community.impl.ui.CommunityAction;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CommunityNavBarClickTracker.kt */
/* loaded from: classes5.dex */
public final class zah {
    public final azh0 a;
    public final SearchStatsLoggingInfo b;

    /* compiled from: CommunityNavBarClickTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityAction.values().length];
            try {
                iArr[CommunityAction.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityAction.EDIT_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityAction.INVITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityAction.SUBSCRIBE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityAction.SUBSCRIBE_LIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityAction.SUBSCRIBE_PODCASTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityAction.FAVORITES_ADD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityAction.FAVORITES_REMOVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityAction.COPY_LINK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CommunityAction.OPEN_IN_BROWSER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CommunityAction.STATS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CommunityAction.EDIT_COMMUNITY_AVATAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CommunityAction.MESSAGES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CommunityAction.GROUPS_SUGGESTIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CommunityAction.ADD_TO_HOMESCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zah(azh0 azh0Var, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = azh0Var;
        this.b = searchStatsLoggingInfo;
    }

    public static void a(UserId userId, CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType, CommonCommunitiesStat$ClickEvent.Source source, String str, String str2) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new CommonCommunitiesStat$ClickEvent(clickEventType, source, str2), 30), 2)).q();
    }

    public static /* synthetic */ void b(zah zahVar, UserId userId, CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType, CommonCommunitiesStat$ClickEvent.Source source, String str, int i) {
        if ((i & 4) != 0) {
            source = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        zahVar.getClass();
        a(userId, clickEventType, source, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ExtendedCommunityProfile extendedCommunityProfile, CommunityAction communityAction) {
        String str;
        String str2;
        String str3;
        String str4;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        String str5;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action2;
        String str6;
        CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[communityAction.ordinal()]) {
            case 1:
                str = "leave";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar = new g2h(extendedCommunityProfile.a.c);
                g2hVar.b = "nav_bar";
                g2hVar.d = str6;
                g2hVar.f = str4;
                g2hVar.a();
                if (action2 != null && (searchStatsLoggingInfo = this.b) != null) {
                    this.a.a(action2, searchStatsLoggingInfo);
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                    b(this, bwd0.i(extendedCommunityProfile), clickEventType, CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR, null, 24);
                    return;
                }
                return;
            case 2:
                str = "manage";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar2 = new g2h(extendedCommunityProfile.a.c);
                g2hVar2.b = "nav_bar";
                g2hVar2.d = str6;
                g2hVar2.f = str4;
                g2hVar2.a();
                if (action2 != null) {
                    this.a.a(action2, searchStatsLoggingInfo);
                    break;
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 3:
                str = "invite_friends";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar22 = new g2h(extendedCommunityProfile.a.c);
                g2hVar22.b = "nav_bar";
                g2hVar22.d = str6;
                g2hVar22.f = str4;
                g2hVar22.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 4:
                str2 = extendedCommunityProfile.j1 ? "unsubscribe" : "subscribe";
                str3 = "subscribe_to_posts";
                str4 = str2;
                str6 = str3;
                action2 = null;
                g2h g2hVar222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar222.b = "nav_bar";
                g2hVar222.d = str6;
                g2hVar222.f = str4;
                g2hVar222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 5:
                str2 = extendedCommunityProfile.i1 ? "unsubscribe" : "subscribe";
                str3 = "subscribe_to_live";
                str4 = str2;
                str6 = str3;
                action2 = null;
                g2h g2hVar2222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar2222.b = "nav_bar";
                g2hVar2222.d = str6;
                g2hVar2222.f = str4;
                g2hVar2222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 6:
                str2 = extendedCommunityProfile.e1 ? "unsubscribe" : "subscribe";
                str3 = "subscribe_to_podcasts";
                str4 = str2;
                str6 = str3;
                action2 = null;
                g2h g2hVar22222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar22222.b = "nav_bar";
                g2hVar22222.d = str6;
                g2hVar22222.f = str4;
                g2hVar22222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 7:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                str5 = "add";
                action2 = action;
                str4 = str5;
                str6 = "fave";
                g2h g2hVar222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar222222.b = "nav_bar";
                g2hVar222222.d = str6;
                g2hVar222222.f = str4;
                g2hVar222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 8:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                str5 = SignalingProtocol.KEY_REMOVE;
                action2 = action;
                str4 = str5;
                str6 = "fave";
                g2h g2hVar2222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar2222222.b = "nav_bar";
                g2hVar2222222.d = str6;
                g2hVar2222222.f = str4;
                g2hVar2222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 9:
                str = "copy_link";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar22222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar22222222.b = "nav_bar";
                g2hVar22222222.d = str6;
                g2hVar22222222.f = str4;
                g2hVar22222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 10:
                str = "open_in_browser";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar222222222.b = "nav_bar";
                g2hVar222222222.d = str6;
                g2hVar222222222.f = str4;
                g2hVar222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 11:
                str = "stats";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar2222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar2222222222.b = "nav_bar";
                g2hVar2222222222.d = str6;
                g2hVar2222222222.f = str4;
                g2hVar2222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 12:
                str = "change_avatar";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar22222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar22222222222.b = "nav_bar";
                g2hVar22222222222.d = str6;
                g2hVar22222222222.f = str4;
                g2hVar22222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 13:
                str4 = extendedCommunityProfile.c2 ? "disallow" : "allow";
                str3 = "messages";
                str6 = str3;
                action2 = null;
                g2h g2hVar222222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar222222222222.b = "nav_bar";
                g2hVar222222222222.d = str6;
                g2hVar222222222222.f = str4;
                g2hVar222222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 14:
                str = "groups_suggestions";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar2222222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar2222222222222.b = "nav_bar";
                g2hVar2222222222222.d = str6;
                g2hVar2222222222222.f = str4;
                g2hVar2222222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            case 15:
                str = "shortcut_link";
                str6 = str;
                str4 = null;
                action2 = null;
                g2h g2hVar22222222222222 = new g2h(extendedCommunityProfile.a.c);
                g2hVar22222222222222.b = "nav_bar";
                g2hVar22222222222222.d = str6;
                g2hVar22222222222222.f = str4;
                g2hVar22222222222222.a();
                if (action2 != null) {
                }
                clickEventType = iArr[communityAction.ordinal()] == 13 ? extendedCommunityProfile.c2 ? CommonCommunitiesStat$ClickEvent.ClickEventType.DISABLE_COMMUNITY_MESSAGES : CommonCommunitiesStat$ClickEvent.ClickEventType.ENABLE_COMMUNITY_MESSAGES : null;
                if (clickEventType != null) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
