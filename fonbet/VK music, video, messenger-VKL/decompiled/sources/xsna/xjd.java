package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ClipsBlockItem.kt */
/* loaded from: classes4.dex */
public interface xjd {

    /* compiled from: ClipsBlockItem.kt */
    public static final class a implements xjd {
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
            return lq.a(new StringBuilder("Autoplay(videoFile="), this.a, ')');
        }
    }

    /* compiled from: ClipsBlockItem.kt */
    public static final class b implements xjd {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowMore(blockTrackCode="), this.a, ')');
        }
    }
}
