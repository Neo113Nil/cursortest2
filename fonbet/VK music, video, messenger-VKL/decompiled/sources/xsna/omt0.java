package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.a8a;

/* compiled from: VideoTrailerView.kt */
/* loaded from: classes16.dex */
public interface omt0 extends q1a {

    /* compiled from: VideoTrailerView.kt */
    public static final class a implements omt0 {
        public final BlockId b;
        public final a8a.a c;
        public final Float d;

        public a(BlockId blockId, a8a.a aVar, Float f) {
            this.b = blockId;
            this.c = aVar;
            this.d = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            Float f = this.d;
            return hashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutInfoChanged(blockId=");
            sb.append(this.b);
            sb.append(", layoutInfo=");
            sb.append(this.c);
            sb.append(", lastFrameOffsetDeltaPercent=");
            return so.b(sb, this.d, ')');
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoTrailerView.kt */
    public static final class b implements omt0 {
        public final BlockId b;
        public final Lifecycle.State c;

        public b(BlockId blockId, Lifecycle.State state) {
            this.b = blockId;
            this.c = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "LifecycleChanged(blockId=" + this.b + ", targetState=" + this.c + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoTrailerView.kt */
    public interface c extends omt0 {

        /* compiled from: VideoTrailerView.kt */
        public static final class a implements c {
            public final BlockId b;
            public final VideoTextureView c;

            public a(BlockId blockId, VideoTextureView videoTextureView) {
                this.b = blockId;
                this.c = videoTextureView;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "VideoViewCreated(blockId=" + this.b + ", videoView=" + this.c + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoTrailerView.kt */
        public static final class b implements c {
            public final BlockId b;

            public b(BlockId blockId) {
                this.b = blockId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "VideoViewDisposed(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoTrailerView.kt */
    public interface d extends omt0 {

        /* compiled from: VideoTrailerView.kt */
        public static final class a implements d {
            public final BlockId b;
            public final long c;

            public a(BlockId blockId, long j) {
                this.b = blockId;
                this.c = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Changed(blockId=");
                sb.append(this.b);
                sb.append(", progress=");
                return vu5.a(')', this.c, sb);
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoTrailerView.kt */
        public static final class b implements d {
            public final BlockId b;

            public b(BlockId blockId) {
                this.b = blockId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "StartChanging(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoTrailerView.kt */
    public static final class e implements omt0 {
        public final BlockId b;

        public e(BlockId blockId) {
            this.b = blockId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TogglePlay(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoTrailerView.kt */
    public interface f extends omt0 {

        /* compiled from: VideoTrailerView.kt */
        public static final class a implements f {
            public final BlockId b;

            public a(BlockId blockId) {
                this.b = blockId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToggleMuteClick(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoTrailerView.kt */
        public static final class b implements f {
            public final BlockId b;

            public b(BlockId blockId) {
                this.b = blockId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToggleSubtitlesClick(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }
}
