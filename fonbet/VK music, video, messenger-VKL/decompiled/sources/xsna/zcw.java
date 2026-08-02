package xsna;

import com.vk.im.reporters.api.analytics.click.ImShareItemClickAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImShareItemClickAnalytics.kt */
/* loaded from: classes5.dex */
public final class zcw extends bxv<ImShareItemClickAnalyticsItem> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImShareItemClickAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ImShareItemClickAnalyticsItem;
        }
    }

    /* compiled from: ImShareItemClickAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImShareItemClickAnalyticsItem.ChatLinkFromProfile.Source.values().length];
            try {
                iArr[ImShareItemClickAnalyticsItem.ChatLinkFromProfile.Source.BUTTON_SHARE_IN_MORE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImShareItemClickAnalyticsItem.ChatLinkFromProfile.Source.BUTTON_SHARE_IN_USER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ImShareItemClickAnalyticsItem)) {
            return false;
        }
        a((ImShareItemClickAnalyticsItem) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ImShareItemClickAnalyticsItem imShareItemClickAnalyticsItem) {
        MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.Source source;
        if (!(imShareItemClickAnalyticsItem instanceof ImShareItemClickAnalyticsItem.ChatLinkFromProfile)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = b.$EnumSwitchMapping$0[((ImShareItemClickAnalyticsItem.ChatLinkFromProfile) imShareItemClickAnalyticsItem).a.ordinal()];
        if (i == 1) {
            source = MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.Source.BUTTON_SHARE_IN_MORE_LIST;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.Source.BUTTON_SHARE_IN_USER_ID;
        }
        bxv.c(this, null, new MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem(MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.EventType.SHARE_FROM_CHAT_PROFILE, source), 3);
    }
}
