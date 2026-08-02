package xsna;

import android.os.SystemClock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.stat.Metrics;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedImageLoading;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;

/* compiled from: FeedImageMetricsAnalytics.kt */
/* loaded from: classes4.dex */
public final class e0r {
    public static long a;

    /* compiled from: FeedImageMetricsAnalytics.kt */
    public static final class a {
        public final Metrics a;
        public final int b;

        public a(Metrics metrics, int i) {
            this.a = metrics;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Metrics metrics = this.a;
            return Integer.hashCode(this.b) + ((metrics == null ? 0 : metrics.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageMetrics(metric=");
            sb.append(this.a);
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public static void a(List list, List list2, NewsEntry newsEntry, MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode mode) {
        Metrics.Status status;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType a2;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo2;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType b;
        Metrics.Status status2;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo3;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType a3;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo4;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType b2;
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = a;
        if (j == 0 || elapsedRealtime - j > 100) {
            a = elapsedRealtime;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Metrics metrics = ((a) list.get(i)).a;
                a aVar = (a) j5g.b0(i, list2);
                Metrics metrics2 = aVar != null ? aVar.a : null;
                int i2 = ((a) list.get(i)).b;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_IMAGE_LOADING.h(), null, mode.toString(), Integer.valueOf(di60.n(newsEntry)), String.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(i2), newsEntry.Cb().b, metrics != null ? Integer.valueOf(metrics.a) : null, metrics != null ? metrics.f : null, metrics != null ? Integer.valueOf((int) metrics.b) : null, (metrics == null || (mobileOfficialAppsCoreDeviceStat$NetworkInfo4 = metrics.e) == null || (b2 = mobileOfficialAppsCoreDeviceStat$NetworkInfo4.b()) == null) ? null : b2.toString(), metrics != null ? Integer.valueOf((int) metrics.c) : null, (metrics == null || (mobileOfficialAppsCoreDeviceStat$NetworkInfo3 = metrics.e) == null || (a3 = mobileOfficialAppsCoreDeviceStat$NetworkInfo3.a()) == null) ? null : a3.toString(), metrics != null ? Integer.valueOf((int) metrics.d) : null, (metrics == null || (status2 = metrics.g) == null) ? null : status2.toString(), metrics2 != null ? Integer.valueOf(metrics2.a) : null, metrics2 != null ? metrics2.f : null, metrics2 != null ? Integer.valueOf((int) metrics2.b) : null, (metrics2 == null || (mobileOfficialAppsCoreDeviceStat$NetworkInfo2 = metrics2.e) == null || (b = mobileOfficialAppsCoreDeviceStat$NetworkInfo2.b()) == null) ? null : b.toString(), metrics2 != null ? Integer.valueOf((int) metrics2.c) : null, (metrics2 == null || (mobileOfficialAppsCoreDeviceStat$NetworkInfo = metrics2.e) == null || (a2 = mobileOfficialAppsCoreDeviceStat$NetworkInfo.a()) == null) ? null : a2.toString(), metrics2 != null ? Integer.valueOf((int) metrics2.d) : null, (metrics2 == null || (status = metrics2.g) == null) ? null : status.toString(), null, null, null, null, null, null, null, null, null, null, null, -8388606, 3, null);
                l5mVar.q();
            }
        }
    }
}
