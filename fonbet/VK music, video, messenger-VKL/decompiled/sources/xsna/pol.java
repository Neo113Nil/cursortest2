package xsna;

import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPickerOpening;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPostPublishingError;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DefaultTechStatsReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class pol {
    public static PostingState d(PostingState postingState, PostingTechMetrics postingTechMetrics) {
        if (postingState instanceof PostingState.Editing) {
            return PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, postingTechMetrics, null, 786431);
        }
        if (postingState instanceof PostingState.Loading) {
            return PostingState.Loading.a((PostingState.Loading) postingState, null, null, null, null, null, null, false, null, null, null, postingTechMetrics, null, 24575);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(ArrayList arrayList, final MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, final long j, final long j2, PostingTechMetrics postingTechMetrics) {
        yoc0.a(arrayList, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching(yoc0.c(Long.valueOf(j), Long.valueOf(j2), postingTechMetrics), mobileOfficialAppsFeedStat$PickerType)));
        L.d(new gzs() { // from class: xsna.mol
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("Posting tech stats: attaching [");
                sb.append(MobileOfficialAppsFeedStat$PickerType.this);
                sb.append("]: (");
                long j3 = j;
                sb.append(j3);
                sb.append(", ");
                long j4 = j2;
                sb.append(j4);
                sb.append("), diff: ");
                return efz.b(j4 - j3, " ms", sb);
            }
        });
    }

    public final void b(ArrayList arrayList, MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, long j, long j2, PostingTechMetrics postingTechMetrics) {
        yoc0.a(arrayList, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPickerOpening(yoc0.c(Long.valueOf(j), Long.valueOf(j2), postingTechMetrics), mobileOfficialAppsFeedStat$PickerType)));
        L.d(new nol(mobileOfficialAppsFeedStat$PickerType, j, 0, j2));
    }

    public final PostingState c(PostingState postingState, e.f fVar) {
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.p) {
            com.vk.newsfeed.posting.impl.domain.model.p pVar = (com.vk.newsfeed.posting.impl.domain.model.p) fVar;
            return d(postingState, PostingTechMetrics.a(postingState.q1(), pVar.b, pVar.c, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.o) {
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, Long.valueOf(((com.vk.newsfeed.posting.impl.domain.model.o) fVar).b), null, null, null, null, 503));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.n) {
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, Long.valueOf(((com.vk.newsfeed.posting.impl.domain.model.n) fVar).b), null, null, null, null, null, 507));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.r) {
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, Long.valueOf(((com.vk.newsfeed.posting.impl.domain.model.r) fVar).b), null, null, null, 495));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.q) {
            Throwable th = ((com.vk.newsfeed.posting.impl.domain.model.q) fVar).b;
            ArrayList arrayList = new ArrayList(postingState.q1().j);
            final String d = yoc0.d(th);
            final Long l = postingState.q1().f;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final MobileOfficialAppsFeedStat$FeedTimeRange c = yoc0.c(l, Long.valueOf(elapsedRealtime), postingState.q1());
            Throwable cause = th.getCause();
            VKApiExecutionException vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
            yoc0.a(arrayList, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPostPublishingError(c, d, vKApiExecutionException != null ? Integer.valueOf(vKApiExecutionException.s()).toString() : null)));
            L.d(new gzs() { // from class: xsna.ool
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("Posting tech stats: publishing error: (");
                    MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                    sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                    sb.append(" ns, ");
                    sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                    sb.append(" ns), diff: ");
                    Long l2 = l;
                    sb.append(elapsedRealtime - (l2 != null ? l2.longValue() : 0L));
                    sb.append(" ms, message: ");
                    sb.append(d);
                    return sb.toString();
                }
            });
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, null, null, arrayList, 255));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.s) {
            ArrayList arrayList2 = new ArrayList(postingState.q1().j);
            Long l2 = postingState.q1().f;
            long j = ((com.vk.newsfeed.posting.impl.domain.model.s) fVar).b;
            MobileOfficialAppsFeedStat$FeedTimeRange c2 = yoc0.c(l2, Long.valueOf(j), postingState.q1());
            if (c2 != null) {
                yoc0.a(arrayList2, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(c2));
            }
            PostingTechMetrics a = PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, null, null, arrayList2, 255);
            L.d(new or6(c2, l2, j));
            return d(postingState, a);
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.m) {
            com.vk.newsfeed.posting.impl.domain.model.m mVar = (com.vk.newsfeed.posting.impl.domain.model.m) fVar;
            PickerTechMetrics pickerTechMetrics = mVar.c;
            MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = mVar.b;
            ArrayList arrayList3 = new ArrayList(postingState.q1().j);
            LinkedHashMap linkedHashMap = new LinkedHashMap(postingState.q1().h);
            long j2 = pickerTechMetrics.b;
            Long l3 = pickerTechMetrics.c;
            if (l3 != null) {
                b(arrayList3, mobileOfficialAppsFeedStat$PickerType, j2, l3.longValue(), postingState.q1());
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Long l4 = pickerTechMetrics.d;
            if (l4 != null) {
                a(arrayList3, mobileOfficialAppsFeedStat$PickerType, l4.longValue(), elapsedRealtime2, postingState.q1());
            }
            linkedHashMap.remove(mobileOfficialAppsFeedStat$PickerType);
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, linkedHashMap, null, arrayList3, 191));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.k) {
            com.vk.newsfeed.posting.impl.domain.model.k kVar = (com.vk.newsfeed.posting.impl.domain.model.k) fVar;
            MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType2 = kVar.b;
            ArrayList arrayList4 = new ArrayList(postingState.q1().j);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(postingState.q1().h);
            Long l5 = postingState.q1().h.get(mobileOfficialAppsFeedStat$PickerType2);
            Long l6 = kVar.c;
            if (l5 != null && l6 != null) {
                b(arrayList4, kVar.b, l5.longValue(), l6.longValue(), postingState.q1());
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            Long l7 = kVar.d;
            if (l7 != null) {
                a(arrayList4, kVar.b, l7.longValue(), elapsedRealtime3, postingState.q1());
            }
            linkedHashMap2.remove(mobileOfficialAppsFeedStat$PickerType2);
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, linkedHashMap2, null, arrayList4, 191));
        }
        if (fVar instanceof com.vk.newsfeed.posting.impl.domain.model.l) {
            com.vk.newsfeed.posting.impl.domain.model.l lVar = (com.vk.newsfeed.posting.impl.domain.model.l) fVar;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(postingState.q1().h);
            linkedHashMap3.put(lVar.b, Long.valueOf(lVar.c));
            return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, linkedHashMap3, null, null, 447));
        }
        if (!(fVar instanceof com.vk.newsfeed.posting.impl.domain.model.j)) {
            throw new NoWhenBranchMatchedException();
        }
        com.vk.newsfeed.posting.impl.domain.model.j jVar = (com.vk.newsfeed.posting.impl.domain.model.j) fVar;
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType3 = jVar.b;
        Long l8 = (Long) new LinkedHashMap(postingState.q1().h).get(mobileOfficialAppsFeedStat$PickerType3);
        if (l8 == null) {
            return postingState;
        }
        ArrayList arrayList5 = new ArrayList(postingState.q1().j);
        long j3 = jVar.c;
        yoc0.a(arrayList5, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPickerOpening(yoc0.c(l8, Long.valueOf(j3), postingState.q1()), mobileOfficialAppsFeedStat$PickerType3)));
        L.d(new k8j(jVar, l8, j3));
        return d(postingState, PostingTechMetrics.a(postingState.q1(), null, null, null, null, null, null, null, arrayList5, 255));
    }
}
