package xsna;

import com.vk.log.L;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$MeasureColdStart;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveInteractiveTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveCreateTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveInteractiveTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveStartTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SendStats;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypePostingTimeline;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.efc0;
import xsna.fmc0;
import xsna.yoc0;

/* compiled from: DefaultTechMetricsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class lol {
    public final efc0.a a;

    public lol(efc0.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r8 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final PostingState postingState, PostingAction.TechStats techStats) {
        MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint creationEntryPoint;
        final Long l;
        final Long l2;
        String l3;
        String b;
        String b2;
        boolean z = techStats instanceof PostingAction$TechStats$Posting$SaveStartTime;
        efc0.a aVar = this.a;
        if (z) {
            aVar.e(fmc0.v.a.a);
            PostingAction$TechStats$Posting$SaveStartTime postingAction$TechStats$Posting$SaveStartTime = (PostingAction$TechStats$Posting$SaveStartTime) techStats;
            aVar.a(new com.vk.newsfeed.posting.impl.domain.model.p(postingAction$TechStats$Posting$SaveStartTime.b, postingAction$TechStats$Posting$SaveStartTime.c));
            return;
        }
        if (techStats instanceof PostingAction$TechStats$Posting$SaveInteractiveTime) {
            aVar.a(new com.vk.newsfeed.posting.impl.domain.model.o(((PostingAction$TechStats$Posting$SaveInteractiveTime) techStats).b));
            return;
        }
        if (!(techStats instanceof PostingAction$TechStats$Posting$SendStats)) {
            if (techStats instanceof PostingAction$TechStats$Posting$SaveCreateTime) {
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.n(((PostingAction$TechStats$Posting$SaveCreateTime) techStats).b));
                return;
            }
            if (techStats instanceof PostingAction$TechStats$Picker$SaveTechMetrics) {
                PostingAction$TechStats$Picker$SaveTechMetrics postingAction$TechStats$Picker$SaveTechMetrics = (PostingAction$TechStats$Picker$SaveTechMetrics) techStats;
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.m(postingAction$TechStats$Picker$SaveTechMetrics.b, postingAction$TechStats$Picker$SaveTechMetrics.c));
                return;
            }
            if (techStats instanceof PostingAction$TechStats$Picker$SavePickTime) {
                PostingAction$TechStats$Picker$SavePickTime postingAction$TechStats$Picker$SavePickTime = (PostingAction$TechStats$Picker$SavePickTime) techStats;
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.k(postingAction$TechStats$Picker$SavePickTime.b, postingAction$TechStats$Picker$SavePickTime.d, postingAction$TechStats$Picker$SavePickTime.c));
                return;
            }
            if (techStats instanceof PostingAction$TechStats$Picker$SaveInteractiveTime) {
                PostingAction$TechStats$Picker$SaveInteractiveTime postingAction$TechStats$Picker$SaveInteractiveTime = (PostingAction$TechStats$Picker$SaveInteractiveTime) techStats;
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.j(postingAction$TechStats$Picker$SaveInteractiveTime.b, postingAction$TechStats$Picker$SaveInteractiveTime.c));
                return;
            } else if (techStats instanceof PostingAction$TechStats$Picker$SaveStartTime) {
                PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = (PostingAction$TechStats$Picker$SaveStartTime) techStats;
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.l(postingAction$TechStats$Picker$SaveStartTime.b, postingAction$TechStats$Picker$SaveStartTime.c));
                return;
            } else {
                if (!(techStats instanceof PostingAction$TechStats$Picker$MeasureColdStart)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.e(new pmc0(((PostingAction$TechStats$Picker$MeasureColdStart) techStats).b));
                return;
            }
        }
        long j = ((PostingAction$TechStats$Posting$SendStats) techStats).b;
        PostingTechMetrics q1 = postingState.q1();
        Long l4 = q1.d;
        Long l5 = q1.e;
        Long l6 = q1.c;
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime = (l4 == null || (b2 = yoc0.b(Long.valueOf(l4.longValue()), q1)) == null) ? null : new MobileOfficialAppsFeedStat$FeedTime(b2);
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime2 = (l5 == null || (b = yoc0.b(Long.valueOf(l5.longValue()), q1)) == null) ? null : new MobileOfficialAppsFeedStat$FeedTime(b);
        String b3 = yoc0.b(Long.valueOf(j), q1);
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime3 = b3 != null ? new MobileOfficialAppsFeedStat$FeedTime(b3) : null;
        Long l7 = q1.b;
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime4 = (l7 == null || (l3 = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(l7.longValue())).toString()) == null) ? null : new MobileOfficialAppsFeedStat$FeedTime(l3);
        PostingMetricEntryPoint postingMetricEntryPoint = postingState.getContext().h;
        if (postingMetricEntryPoint != null) {
            switch (yoc0.a.$EnumSwitchMapping$0[postingMetricEntryPoint.ordinal()]) {
                case 1:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.FEED_PLUS_BUTTON;
                    break;
                case 2:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.GROUP_WALL_BUTTON;
                    break;
                case 3:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.PROFILE_PLUS_BUTTON;
                    break;
                case 4:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.PROFILE_WALL_BUTTON;
                    break;
                case 5:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.CHANNEL_WRITE_BAR_BUTTON;
                    break;
                case 6:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.POST_THREE_DOT_MENU_EDIT_ITEM;
                    break;
                default:
                    creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.OTHER;
                    break;
            }
        }
        creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.OTHER;
        final boolean z2 = postingState.J7() instanceof PostEditingReason.EditExistingPost;
        EditingPost editingPost = postingState.getContext().m;
        MobileOfficialAppsFeedStat$PostingContext.PostType postType = editingPost != null ? editingPost.j : MobileOfficialAppsFeedStat$PostingContext.PostType.REGULAR;
        EditingPost editingPost2 = postingState.getContext().m;
        MobileOfficialAppsFeedStat$PostingContext mobileOfficialAppsFeedStat$PostingContext = new MobileOfficialAppsFeedStat$PostingContext(postType, Boolean.valueOf(z2), creationEntryPoint, editingPost2 != null ? editingPost2.k : null);
        List<MobileOfficialAppsFeedStat$PostingTimelineEvent> list = q1.j;
        final MobileOfficialAppsFeedStat$PostingContext.PostType postType2 = postType;
        MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline = new MobileOfficialAppsFeedStat$TypePostingTimeline(mobileOfficialAppsFeedStat$PostingContext, list, mobileOfficialAppsFeedStat$FeedTime4, mobileOfficialAppsFeedStat$FeedTime, mobileOfficialAppsFeedStat$FeedTime2, mobileOfficialAppsFeedStat$FeedTime3);
        if (l6 != null) {
            l = l4 != null ? Long.valueOf(l4.longValue() - l6.longValue()) : null;
        } else {
            l = null;
        }
        if (l6 != null) {
            l2 = l5 != null ? Long.valueOf(l5.longValue() - l6.longValue()) : null;
        } else {
            l2 = null;
        }
        final Long valueOf = l6 != null ? Long.valueOf(j - l6.longValue()) : null;
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsFeedStat$TypePostingTimeline;
        kx6Var.q();
        final MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint creationEntryPoint2 = creationEntryPoint;
        final MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime5 = mobileOfficialAppsFeedStat$FeedTime2;
        final MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime6 = mobileOfficialAppsFeedStat$FeedTime3;
        final MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime7 = mobileOfficialAppsFeedStat$FeedTime4;
        final MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime8 = mobileOfficialAppsFeedStat$FeedTime;
        L.d(new gzs() { // from class: xsna.kol
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("Posting tech stats: send postType = ");
                sb.append(MobileOfficialAppsFeedStat$PostingContext.PostType.this);
                sb.append(", creationEntryPoint = ");
                sb.append(creationEntryPoint2);
                sb.append(", trackCode = ");
                EditingPost editingPost3 = postingState.getContext().m;
                sb.append(editingPost3 != null ? editingPost3.k : null);
                sb.append(", isEditing = ");
                sb.append(z2);
                sb.append(", screenStartTime = ");
                sb.append(mobileOfficialAppsFeedStat$FeedTime7);
                sb.append(", screenInitializedTime = ");
                sb.append(mobileOfficialAppsFeedStat$FeedTime8);
                sb.append(", screenInteractionTime = ");
                sb.append(mobileOfficialAppsFeedStat$FeedTime5);
                sb.append(", screenCloseTime = ");
                sb.append(mobileOfficialAppsFeedStat$FeedTime6);
                sb.append(", screenInitializedTime - screenStartTime = ");
                sb.append(l);
                sb.append(", screenInteractionTime - screenStartTime = ");
                sb.append(l2);
                sb.append(", closeTime - screenStartTime = ");
                sb.append(valueOf);
                return sb.toString();
            }
        });
    }
}
