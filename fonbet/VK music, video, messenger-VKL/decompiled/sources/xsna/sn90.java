package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: PastBroadcastsAction.kt */
/* loaded from: classes7.dex */
public abstract class sn90 implements kj50 {

    /* compiled from: PastBroadcastsAction.kt */
    public static final class a extends sn90 {
        public static final a b = new a();
    }

    /* compiled from: PastBroadcastsAction.kt */
    public static final class b extends sn90 {
        public static final b b = new b();
    }

    /* compiled from: PastBroadcastsAction.kt */
    public static final class c extends sn90 {
        public static final c b = new c();
    }

    /* compiled from: PastBroadcastsAction.kt */
    public static final class d extends sn90 {
        public static final d b = new d();
    }

    /* compiled from: PastBroadcastsAction.kt */
    public static final class e extends sn90 {
        public final VideoFile b;

        public e(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("RemoveSingleItem(item="), this.b, ')');
        }
    }

    /* compiled from: PastBroadcastsAction.kt */
    public static final class f extends sn90 {
        public final VideoFile b;

        public f(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("UpdateSingleItem(item="), this.b, ')');
        }
    }
}
