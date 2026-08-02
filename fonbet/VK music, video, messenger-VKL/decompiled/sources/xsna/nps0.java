package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoHolderAction.kt */
/* loaded from: classes7.dex */
public interface nps0 extends lj50 {

    /* compiled from: VideoHolderAction.kt */
    public static final class a implements nps0 {
        public final VideoFile b;

        public a(VideoFile videoFile) {
            this.b = videoFile;
        }
    }

    /* compiled from: VideoHolderAction.kt */
    public static final class b implements nps0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 426611365;
        }

        public final String toString() {
            return "CheckLoginAndPermission";
        }
    }

    /* compiled from: VideoHolderAction.kt */
    public static final class c implements nps0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }
    }
}
