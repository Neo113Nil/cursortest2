package xsna;

import com.vk.dto.video.VideoNotificationsStatus;

/* compiled from: VideoProfileBottomSheetViewState.kt */
/* loaded from: classes6.dex */
public abstract class w6t0 {

    /* compiled from: VideoProfileBottomSheetViewState.kt */
    public static final class a extends w6t0 {
        public final long a;
        public final String b;
        public final long c;
        public final long d;
        public final Integer e;
        public final Long f;
        public final String g;

        public a(long j, String str, long j2, long j3, Integer num, Long l, String str2) {
            this.a = j;
            this.b = str;
            this.c = j2;
            this.d = j3;
            this.e = num;
            this.f = l;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            int a = bh10.a(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
            Integer num = this.e;
            int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.f;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.g;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AboutChannel(channelId=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", countFollowers=");
            sb.append(this.c);
            sb.append(", countVideos=");
            sb.append(this.d);
            sb.append(", dateOfCreationSec=");
            sb.append(this.e);
            sb.append(", countOfViews=");
            sb.append(this.f);
            sb.append(", aPlusLink=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: VideoProfileBottomSheetViewState.kt */
    public static final class b extends w6t0 {
        public static final b a = new b();
    }

    /* compiled from: VideoProfileBottomSheetViewState.kt */
    public static final class c extends w6t0 {
        public static final c a = new c();
    }

    /* compiled from: VideoProfileBottomSheetViewState.kt */
    public static final class d extends w6t0 {
        public final VideoNotificationsStatus a;

        public d(VideoNotificationsStatus videoNotificationsStatus) {
            this.a = videoNotificationsStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SubscribeNotification(typeNotification=" + this.a + ')';
        }
    }
}
