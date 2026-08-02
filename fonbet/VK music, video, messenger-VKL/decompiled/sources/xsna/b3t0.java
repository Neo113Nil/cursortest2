package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoPickerSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class b3t0 {

    /* compiled from: VideoPickerSideEffect.kt */
    public static final class a extends b3t0 {
    }

    /* compiled from: VideoPickerSideEffect.kt */
    public static abstract class b extends b3t0 {

        /* compiled from: VideoPickerSideEffect.kt */
        public static final class a extends b {
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
                return lq.a(new StringBuilder("OpenVkVideoViewer(video="), this.a, ')');
            }
        }
    }

    /* compiled from: VideoPickerSideEffect.kt */
    public static abstract class c extends b3t0 {

        /* compiled from: VideoPickerSideEffect.kt */
        public static final class a extends c {
            public final vf90 a;

            public a(xf90 xf90Var) {
                this.a = xf90Var;
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
                return "Init(pagingHelper=" + this.a + ')';
            }
        }
    }
}
