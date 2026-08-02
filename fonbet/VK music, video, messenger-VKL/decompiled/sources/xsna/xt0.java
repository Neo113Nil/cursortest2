package xsna;

import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;

/* compiled from: AdsAnalytics.kt */
/* loaded from: classes14.dex */
public interface xt0 {

    /* compiled from: AdsAnalytics.kt */
    public static final class a {
        public final AdsintEventTypeDto a;
        public final String b;
        public final String c;
        public final c d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ a(AdsintEventTypeDto adsintEventTypeDto, String str, String str2, c cVar) {
            this(adsintEventTypeDto, str, str2, cVar, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdsintData(eventType=");
            sb.append(this.a);
            sb.append(", adData=");
            sb.append(this.b);
            sb.append(", postId=");
            sb.append(this.c);
            sb.append(", postPosition=");
            sb.append(this.d);
            sb.append(", startView=");
            sb.append(this.e);
            sb.append(", endView=");
            sb.append(this.f);
            sb.append(", totalViewDuration=");
            return ho8.a(sb, this.g, ')');
        }

        public a(AdsintEventTypeDto adsintEventTypeDto, String str, String str2, c cVar, String str3, String str4, String str5) {
            this.a = adsintEventTypeDto;
            this.b = str;
            this.c = str2;
            this.d = cVar;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }
    }

    /* compiled from: AdsAnalytics.kt */
    public static final class b {
        public final long a;
        public final int b;
        public final long c;
        public final String d;
        public final long e;
        public final long f;
        public final int g;
        public final String h;

        public b(long j, int i, long j2, String str, long j3, long j4, int i2, String str2) {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            int a = shy.a(this.g, bh10.a(bh10.a(urd0.a(bh10.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
            String str = this.h;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MrcViewPostTime(duration=");
            sb.append(this.a);
            sb.append(", postId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", trackCode=");
            sb.append(this.d);
            sb.append(", startViewMcs=");
            sb.append(this.e);
            sb.append(", endViewMcs=");
            sb.append(this.f);
            sb.append(", postPosition=");
            sb.append(this.g);
            sb.append(", adData=");
            return ho8.a(sb, this.h, ')');
        }
    }

    /* compiled from: AdsAnalytics.kt */
    public interface c {

        /* compiled from: AdsAnalytics.kt */
        @vby
        public static final class a implements c {
            public final int a;

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return this.a == ((a) obj).a;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return uqi.a("ListPosition(value=", this.a, ')');
            }
        }

        /* compiled from: AdsAnalytics.kt */
        public static final class b implements c {
            public static final b a = new b();
        }
    }

    void a(b bVar);

    void b(DeprecatedStatisticInterface deprecatedStatisticInterface);

    void c(DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl);

    void clearData();

    void d(a aVar);
}
