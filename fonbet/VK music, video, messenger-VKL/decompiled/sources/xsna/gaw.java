package xsna;

import com.vk.im.reporters.api.analytics.click.ImPinClickAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImPinnedMessageClickItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImPinItemClickAnalytics.kt */
/* loaded from: classes5.dex */
public final class gaw extends bxv<ImPinClickAnalyticsItem> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImPinItemClickAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ImPinClickAnalyticsItem;
        }
    }

    /* compiled from: ImPinItemClickAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImPinClickAnalyticsItem.PinnedMessage.ClickType.values().length];
            try {
                iArr[ImPinClickAnalyticsItem.PinnedMessage.ClickType.PIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImPinClickAnalyticsItem.PinnedMessage.ClickType.UNPIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImPinClickAnalyticsItem.PinnedMessage.ClickType.PINNED_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ImPinClickAnalyticsItem)) {
            return false;
        }
        a((ImPinClickAnalyticsItem) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ImPinClickAnalyticsItem imPinClickAnalyticsItem) {
        MobileOfficialAppsImStat$TypeImPinnedMessageClickItem.EventType eventType;
        if (!(imPinClickAnalyticsItem instanceof ImPinClickAnalyticsItem.PinnedMessage)) {
            throw new NoWhenBranchMatchedException();
        }
        ImPinClickAnalyticsItem.PinnedMessage pinnedMessage = (ImPinClickAnalyticsItem.PinnedMessage) imPinClickAnalyticsItem;
        int i = b.$EnumSwitchMapping$0[pinnedMessage.a.ordinal()];
        if (i == 1) {
            eventType = MobileOfficialAppsImStat$TypeImPinnedMessageClickItem.EventType.PIN_CHANNEL_POST;
        } else if (i == 2) {
            eventType = MobileOfficialAppsImStat$TypeImPinnedMessageClickItem.EventType.UNPIN_CHANNEL_POST;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsImStat$TypeImPinnedMessageClickItem.EventType.CLICK_ON_PIN_MESSAGE;
        }
        bxv.c(this, null, new MobileOfficialAppsImStat$TypeImPinnedMessageClickItem(eventType, MobileOfficialAppsImStat$TypeImPinnedMessageClickItem.ConversationType.CHANNEL, Long.valueOf(pinnedMessage.c), Long.valueOf(pinnedMessage.d)), 3);
    }
}
