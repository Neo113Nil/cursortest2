package xsna;

import com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationClickItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImChatManagementClickAnalytics.kt */
/* loaded from: classes5.dex */
public final class azv extends bxv<ImChatManagementClickAnalyticsItem> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImChatManagementClickAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ImChatManagementClickAnalyticsItem;
        }
    }

    /* compiled from: ImChatManagementClickAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImChatManagementClickAnalyticsItem.Source.values().length];
            try {
                iArr[ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ImChatManagementClickAnalyticsItem)) {
            return false;
        }
        a((ImChatManagementClickAnalyticsItem) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ImChatManagementClickAnalyticsItem imChatManagementClickAnalyticsItem) {
        MobileOfficialAppsImStat$TypeImConversationClickItem.Source source;
        MobileOfficialAppsImStat$TypeImConversationClickItem.EventType eventType;
        int i = b.$EnumSwitchMapping$0[imChatManagementClickAnalyticsItem.t().ordinal()];
        if (i == 1) {
            source = MobileOfficialAppsImStat$TypeImConversationClickItem.Source.CHAT_LIST_LONGTAP;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = MobileOfficialAppsImStat$TypeImConversationClickItem.Source.CHAT_PROFILE;
        }
        if (imChatManagementClickAnalyticsItem instanceof ImChatManagementClickAnalyticsItem.c) {
            eventType = ((ImChatManagementClickAnalyticsItem.c) imChatManagementClickAnalyticsItem).a ? MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.MARK_AS_READ_CLICK : MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.MARK_AS_UNREAD_CLICK;
        } else if (imChatManagementClickAnalyticsItem instanceof ImChatManagementClickAnalyticsItem.a) {
            eventType = ((ImChatManagementClickAnalyticsItem.a) imChatManagementClickAnalyticsItem).a ? MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.ADD_TO_ARCHIVE_CLICK : MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.REMOVE_FROM_ARCHIVE_CLICK;
        } else {
            if (!(imChatManagementClickAnalyticsItem instanceof ImChatManagementClickAnalyticsItem.b)) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = ((ImChatManagementClickAnalyticsItem.b) imChatManagementClickAnalyticsItem).a ? MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.PIN_CONVERSATION_CLICK : MobileOfficialAppsImStat$TypeImConversationClickItem.EventType.UNPIN_CONVERSATION_CLICK;
        }
        bxv.c(this, null, new MobileOfficialAppsImStat$TypeImConversationClickItem(eventType, source), 3);
    }
}
