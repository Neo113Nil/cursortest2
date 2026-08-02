package xsna;

import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.util.List;

/* compiled from: ModelUpdateDiff.kt */
/* loaded from: classes3.dex */
public interface g330 {

    /* compiled from: ModelUpdateDiff.kt */
    public static final class a implements g330 {
        public final AudioFragment a;

        public a(AudioFragment audioFragment) {
            this.a = audioFragment;
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
            return "AudioModelChangedOnly(newAudioModel=" + this.a + ')';
        }
    }

    /* compiled from: ModelUpdateDiff.kt */
    public static final class b implements g330 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 548786238;
        }

        public final String toString() {
            return "NoDiff";
        }
    }

    /* compiled from: ModelUpdateDiff.kt */
    public static final class c implements g330 {
        public final Timeline a;

        public c(Timeline timeline) {
            this.a = timeline;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoAndAudioChanged(timeline=" + this.a + ')';
        }
    }

    /* compiled from: ModelUpdateDiff.kt */
    public static final class d implements g330 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1065033249;
        }

        public final String toString() {
            return "VideoEffectsChangedOnly";
        }
    }

    /* compiled from: ModelUpdateDiff.kt */
    public static final class e implements g330 {
        public final List<VideoFragment> a;

        public e(List<VideoFragment> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("VideoModelChangedOnly(newVideoModel="), this.a);
        }
    }
}
