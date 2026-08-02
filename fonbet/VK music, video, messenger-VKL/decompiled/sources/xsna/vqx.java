package xsna;

import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityOnboardingView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.hzp0;

/* compiled from: InviteFriendsAnalyticsImpl.kt */
/* loaded from: classes14.dex */
public final class vqx implements InviteFriendsAnalytics {

    /* compiled from: InviteFriendsAnalyticsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InviteFriendsAnalytics.InviteFriendsSource.values().length];
            try {
                iArr[InviteFriendsAnalytics.InviteFriendsSource.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InviteFriendsAnalytics.InviteFriendsSource.CHECKLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InviteFriendsAnalytics.InviteFriendsSource.WIZARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics
    public final void a(long j, InviteFriendsAnalytics.InviteFriendsSource inviteFriendsSource) {
        CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem.Source source;
        int i = a.$EnumSwitchMapping$0[inviteFriendsSource.ordinal()];
        if (i == 1) {
            source = CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem.Source.MAIN;
        } else if (i == 2) {
            source = CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem.Source.CHECKLIST;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            source = CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem.Source.WIZARD;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem = null;
        new hzp0.v(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), new CommonCommunitiesStat$TypeCommunityOnboardingView(CommonCommunitiesStat$TypeCommunityOnboardingView.Type.TYPE_COMMUNITY_ONBOARDING_INVITATION_FRIENDS_VIEW, j, commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem, new CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem(source), 4, null)).a();
    }
}
