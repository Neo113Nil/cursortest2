package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: PastBroadcastsViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class ro90 {

    /* compiled from: PastBroadcastsViewEvent.kt */
    public static final class a extends ro90 {
        public final VideoFile a;

        public a(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("MenuClick(item="), this.a, ')');
        }
    }

    /* compiled from: PastBroadcastsViewEvent.kt */
    public static final class b extends ro90 {
        public static final b a = new b();
    }

    /* compiled from: PastBroadcastsViewEvent.kt */
    public static final class c extends ro90 {
        public static final c a = new c();
    }

    /* compiled from: PastBroadcastsViewEvent.kt */
    public static final class d extends ro90 {
        public final VideoFile a;

        public d(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("RemoveVideoClick(item="), this.a, ')');
        }
    }

    /* compiled from: PastBroadcastsViewEvent.kt */
    public static final class e extends ro90 {
        public static final e a = new e();
    }
}
