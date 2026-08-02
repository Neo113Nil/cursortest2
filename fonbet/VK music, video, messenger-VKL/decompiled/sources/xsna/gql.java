package xsna;

import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingFileStats;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileUploading;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileUploadingError;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: DefaultUploadTechStatDelegate.kt */
/* loaded from: classes4.dex */
public final class gql {
    public final Pair a(PostingState.Editing editing, UploadDto.UploadState uploadState, e.h hVar, MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType) {
        Map map;
        List<MobileOfficialAppsFeedStat$PostingTimelineEvent> list;
        int i = uploadState.d;
        if (hVar instanceof e.h.C1430e) {
            PostingTechMetrics postingTechMetrics = editing.t;
            list = postingTechMetrics.j;
            map = new LinkedHashMap(postingTechMetrics.i);
            e.h.C1430e c1430e = (e.h.C1430e) hVar;
            map.put(Integer.valueOf(c1430e.c), new PostingFileStats(mobileOfficialAppsFeedStat$PostingFileType, SystemClock.elapsedRealtime(), c1430e.d));
        } else if (hVar instanceof e.h.b) {
            PostingTechMetrics postingTechMetrics2 = editing.t;
            PostingTechMetrics postingTechMetrics3 = editing.t;
            map = new LinkedHashMap(postingTechMetrics2.i);
            PostingFileStats postingFileStats = (PostingFileStats) map.remove(Integer.valueOf(i));
            if (postingFileStats != null) {
                ArrayList arrayList = new ArrayList(postingTechMetrics3.j);
                MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType2 = postingFileStats.b;
                final long j = postingFileStats.c;
                long j2 = postingFileStats.d;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final MobileOfficialAppsFeedStat$FeedTimeRange c = yoc0.c(Long.valueOf(j), Long.valueOf(elapsedRealtime), postingTechMetrics3);
                yoc0.a(arrayList, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingFileUploading(c, mobileOfficialAppsFeedStat$PostingFileType2, Long.valueOf(j2), x260.b(com.vk.core.utils.newtork.b.c()))));
                L.d(new gzs() { // from class: xsna.eql
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Posting uploading done: (");
                        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                        sb.append(" ns, ");
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                        sb.append(" ns), diff: ");
                        return efz.b(elapsedRealtime - j, " ms", sb);
                    }
                });
                list = arrayList;
            } else {
                list = postingTechMetrics3.j;
            }
        } else if (hVar instanceof e.h.c) {
            PostingTechMetrics postingTechMetrics4 = editing.t;
            PostingTechMetrics postingTechMetrics5 = editing.t;
            Map linkedHashMap = new LinkedHashMap(postingTechMetrics4.i);
            PostingFileStats postingFileStats2 = (PostingFileStats) linkedHashMap.remove(Integer.valueOf(i));
            if (postingFileStats2 != null) {
                ArrayList arrayList2 = new ArrayList(postingTechMetrics5.j);
                MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType3 = postingFileStats2.b;
                final long j3 = postingFileStats2.c;
                long j4 = postingFileStats2.d;
                Throwable th = ((e.h.c) hVar).c;
                String str = null;
                final String d = th != null ? yoc0.d(th) : null;
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final MobileOfficialAppsFeedStat$FeedTimeRange c2 = yoc0.c(Long.valueOf(j3), Long.valueOf(SystemClock.elapsedRealtime()), postingTechMetrics5);
                if (th != null) {
                    Throwable cause = th.getCause();
                    VKApiExecutionException vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
                    if (vKApiExecutionException != null) {
                        str = Integer.valueOf(vKApiExecutionException.s()).toString();
                    }
                }
                yoc0.a(arrayList2, MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingFileUploadingError(c2, mobileOfficialAppsFeedStat$PostingFileType3, d, str, Long.valueOf(j4), x260.b(com.vk.core.utils.newtork.b.c()))));
                L.d(new gzs() { // from class: xsna.fql
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Posting tech stats: uploading error: (");
                        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                        sb.append(" ns, ");
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                        sb.append(" ns), diff: ");
                        sb.append(elapsedRealtime2 - j3);
                        sb.append(" ms, message: ");
                        sb.append(d);
                        return sb.toString();
                    }
                });
                map = linkedHashMap;
                list = arrayList2;
            } else {
                list = postingTechMetrics5.j;
                map = linkedHashMap;
            }
        } else if (hVar instanceof e.h.a) {
            map = new LinkedHashMap(editing.t.i);
            map.remove(Integer.valueOf(i));
            list = editing.t.j;
        } else {
            PostingTechMetrics postingTechMetrics6 = editing.t;
            map = postingTechMetrics6.i;
            list = postingTechMetrics6.j;
        }
        return new Pair(map, list);
    }
}
