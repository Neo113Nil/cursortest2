package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: MediaEntry.kt */
/* loaded from: classes4.dex */
public interface wq10 {

    /* compiled from: MediaEntry.kt */
    public static final class a implements wq10 {
        public final MediaStoreEntry a;

        public a(MediaStoreEntry mediaStoreEntry) {
            this.a = mediaStoreEntry;
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
            return "LocalMedia(entry=" + this.a + ')';
        }
    }

    /* compiled from: MediaEntry.kt */
    public static final class b implements wq10 {
        public final Photo a;

        public b(Photo photo) {
            this.a = photo;
        }

        public final Photo a() {
            return this.a;
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
            return tq.c(new StringBuilder("PhotoVk(photo="), this.a, ')');
        }
    }

    /* compiled from: MediaEntry.kt */
    public static final class c implements wq10 {
        public final VideoFile a;

        public c(VideoFile videoFile) {
            this.a = videoFile;
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
            return lq.a(new StringBuilder("VideoVk(video="), this.a, ')');
        }
    }
}
