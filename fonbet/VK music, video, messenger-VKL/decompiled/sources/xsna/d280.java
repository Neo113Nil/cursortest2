package xsna;

import com.vk.dto.common.VideoFileOld;

/* compiled from: OnBoardingScreenData.kt */
/* loaded from: classes5.dex */
public abstract class d280 {

    /* compiled from: OnBoardingScreenData.kt */
    public static final class a extends d280 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ImageContent(imageUrl="), this.a, ')');
        }
    }

    /* compiled from: OnBoardingScreenData.kt */
    public static final class b extends d280 {
        public final VideoFileOld a;

        public b(VideoFileOld videoFileOld) {
            this.a = videoFileOld;
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
            return "VideoContent(videoFile=" + this.a + ')';
        }
    }
}
