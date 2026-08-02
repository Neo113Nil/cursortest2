package xsna;

import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.community.subscription.api.tracker.SubscriptionEvent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunitySubscriptionTrackerImpl.kt */
/* loaded from: classes5.dex */
public final class e3i implements b3i {
    public final azh0 a;
    public final SearchStatsLoggingInfo b;

    /* compiled from: CommunitySubscriptionTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionEvent.values().length];
            try {
                iArr[SubscriptionEvent.JOIN_GROUP_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionEvent.LEAVE_GROUP_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e3i(azh0 azh0Var, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = azh0Var;
        this.b = searchStatsLoggingInfo;
    }

    @Override // xsna.b3i
    public final void a(SubscriptionEvent subscriptionEvent) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.b;
        if (searchStatsLoggingInfo == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[subscriptionEvent.ordinal()];
        if (i == 1) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.JOIN_GROUP_OUT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LEAVE_GROUP_OUT;
        }
        this.a.a(action, searchStatsLoggingInfo);
    }
}
