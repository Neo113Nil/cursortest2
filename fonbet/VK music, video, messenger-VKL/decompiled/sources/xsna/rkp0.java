package xsna;

import com.vk.media.pipeline.model.stat.TranscodeType;

/* compiled from: TransformType.kt */
/* loaded from: classes3.dex */
public interface rkp0 {

    /* compiled from: TransformType.kt */
    public static final class a implements rkp0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1741206797;
        }

        public final String toString() {
            return "Copy";
        }
    }

    /* compiled from: TransformType.kt */
    public static final class b implements rkp0 {
        public final TranscodeType a;

        public b(TranscodeType transcodeType) {
            this.a = transcodeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Transcode(transcodeType=" + this.a + ')';
        }
    }
}
