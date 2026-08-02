package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;

/* compiled from: CameraReplyParams.kt */
/* loaded from: classes16.dex */
public abstract class el9 {

    /* compiled from: CameraReplyParams.kt */
    public static final class a extends el9 {
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
            return lq.a(new StringBuilder("Clip(videoFile="), this.a, ')');
        }
    }

    /* compiled from: CameraReplyParams.kt */
    public static final class b extends el9 {
        public final StoryEntry a;
        public final StoryOwner b;
        public final boolean c;

        public b(StoryEntry storyEntry, StoryOwner storyOwner, boolean z) {
            this.a = storyEntry;
            this.b = storyOwner;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Story(story=");
            sb.append(this.a);
            sb.append(", owner=");
            sb.append(this.b);
            sb.append(", isFromArchive=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
