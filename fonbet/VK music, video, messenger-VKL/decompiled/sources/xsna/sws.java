package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: FullVideoFileState.kt */
/* loaded from: classes17.dex */
public interface sws {

    /* compiled from: FullVideoFileState.kt */
    public static final class a implements sws {
        public final SdkVideoFile a;

        public a(SdkVideoFile sdkVideoFile) {
            this.a = sdkVideoFile;
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
            return "Loaded(video=" + this.a + ')';
        }
    }

    /* compiled from: FullVideoFileState.kt */
    public static final class b implements sws {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2049415631;
        }

        public final String toString() {
            return "NotLoaded";
        }
    }
}
