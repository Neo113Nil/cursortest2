package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PostingTechMetricsDelegate.kt */
/* loaded from: classes4.dex */
public final class yoc0 {

    /* compiled from: PostingTechMetricsDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingMetricEntryPoint.values().length];
            try {
                iArr[PostingMetricEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingMetricEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingMetricEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingMetricEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(ArrayList arrayList, MobileOfficialAppsFeedStat$PostingTimelineEvent mobileOfficialAppsFeedStat$PostingTimelineEvent) {
        if (arrayList.size() >= 30) {
            return;
        }
        arrayList.add(mobileOfficialAppsFeedStat$PostingTimelineEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Long l, PostingTechMetrics postingTechMetrics) {
        Long l2;
        if (l != null && l.longValue() != 0) {
            Long l3 = postingTechMetrics.b;
            Long l4 = postingTechMetrics.c;
            if (l3 != null && l4 != null) {
                l2 = Long.valueOf(TimeUnit.MILLISECONDS.toMicros((l.longValue() - l4.longValue()) + l3.longValue()));
                if (l2 == null) {
                    return l2.toString();
                }
                return null;
            }
        }
        l2 = null;
        if (l2 == null) {
        }
    }

    public static MobileOfficialAppsFeedStat$FeedTimeRange c(Long l, Long l2, PostingTechMetrics postingTechMetrics) {
        String b = b(l, postingTechMetrics);
        String b2 = b(l2, postingTechMetrics);
        if (b == null || b2 == null) {
            return null;
        }
        return new MobileOfficialAppsFeedStat$FeedTimeRange(b, b2);
    }

    public static String d(Throwable th) {
        String message;
        Throwable cause = th.getCause();
        VKApiExecutionException vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
        if (vKApiExecutionException == null || (message = vKApiExecutionException.t()) == null) {
            message = th.getMessage();
        }
        if (message != null) {
            return message.length() <= 128 ? message : message.substring(0, 128);
        }
        return null;
    }
}
