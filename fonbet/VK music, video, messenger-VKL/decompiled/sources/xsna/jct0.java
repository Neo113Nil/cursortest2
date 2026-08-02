package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;

/* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
/* loaded from: classes7.dex */
public interface jct0 {

    /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
    public static final class a implements jct0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tq.f(new StringBuilder("CopyLink(link="), this.a, ')');
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
    public static final class b implements jct0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1588495776;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
    public static final class c implements jct0 {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("GoToProfile(id="), this.a, ')');
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
    public static abstract class d implements jct0 {
        public final VideoAlbum a;

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class a extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class b extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class c extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        /* renamed from: xsna.jct0$d$d, reason: collision with other inner class name */
        public static final class C3116d extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class e extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class f extends d {
        }

        /* compiled from: VideoRelatedVideosMoreActionsSideEffects.kt */
        public static final class g extends d {
        }

        public d(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
        }
    }
}
