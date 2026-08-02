package xsna;

import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;

/* compiled from: MrcTrackerEvent.kt */
/* loaded from: classes14.dex */
public interface pg30 {

    /* compiled from: MrcTrackerEvent.kt */
    public static final class a implements pg30 {
        public final NewsEntry a;
        public final AdsintEventTypeDto b;
        public final int c;

        public a(NewsEntry newsEntry, AdsintEventTypeDto adsintEventTypeDto, int i) {
            this.a = newsEntry;
            this.b = adsintEventTypeDto;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MrcAdsintTrackEvent(newsEntry=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", postPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MrcTrackerEvent.kt */
    public static final class b implements pg30 {
        public final DeprecatedStatisticPlayheadViewabilityMrcUrl a;

        public b(DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl) {
            this.a = deprecatedStatisticPlayheadViewabilityMrcUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MrcPixelAdPlayheadViewabilityEvent(pixel=" + this.a + ')';
        }
    }

    /* compiled from: MrcTrackerEvent.kt */
    public static final class c implements pg30 {
        public final DeprecatedStatisticInterface a;

        public c(DeprecatedStatisticInterface deprecatedStatisticInterface) {
            this.a = deprecatedStatisticInterface;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MrcPixelAdViewIn(ad=" + this.a + ')';
        }
    }

    /* compiled from: MrcTrackerEvent.kt */
    public static final class d implements pg30 {
        public final long a;
        public final int b;
        public final long c;
        public final String d;
        public final long e;
        public final long f;
        public final int g;
        public final String h;

        public d(long j, int i, long j2, String str, long j3, long j4, int i2, String str2) {
            this.a = j;
            this.b = i;
            this.c = j2;
            this.d = str;
            this.e = j3;
            this.f = j4;
            this.g = i2;
            this.h = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && epx.f(this.h, dVar.h);
        }

        public final int hashCode() {
            int a = shy.a(this.g, bh10.a(bh10.a(urd0.a(bh10.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
            String str = this.h;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MrcViewPostTimeEvent(duration=");
            sb.append(this.a);
            sb.append(", postId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", trackCode=");
            sb.append(this.d);
            sb.append(", startView=");
            sb.append(this.e);
            sb.append(", endView=");
            sb.append(this.f);
            sb.append(", postPosition=");
            sb.append(this.g);
            sb.append(", adData=");
            return ho8.a(sb, this.h, ')');
        }
    }

    /* compiled from: MrcTrackerEvent.kt */
    public static final class e implements pg30 {
        public static final e a = new e();
    }
}
