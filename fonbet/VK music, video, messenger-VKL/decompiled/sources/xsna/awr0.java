package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.api.ui.VideoTransitionSource;

/* compiled from: VideoAction.kt */
/* loaded from: classes16.dex */
public interface awr0 extends q1a {

    /* compiled from: VideoAction.kt */
    public static final class a implements awr0 {
        public final BlockId.CompositeId b;

        public a(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class b implements awr0 {
        public final BlockId.CompositeId b;

        public b(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class c implements awr0 {
        public final BlockId.CompositeId b;

        public c(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class d implements awr0 {
        public final BlockId.CompositeId b;
        public final VideoTransitionSource c;

        public d(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
            this.b = compositeId;
            this.c = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            VideoTransitionSource videoTransitionSource = this.c;
            return hashCode + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            return "OnDonutBadgeClick(blockId=" + this.b + ", videoTransitionSource=" + this.c + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class e implements awr0 {
        public final BlockId.CompositeId b;
        public final VideoTransitionSource c;

        public e(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
            this.b = compositeId;
            this.c = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            VideoTransitionSource videoTransitionSource = this.c;
            return hashCode + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            return "OnDonutChipClick(blockId=" + this.b + ", videoTransitionSource=" + this.c + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class f implements awr0 {
        public final BlockId.CompositeId b;

        public f(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class g implements awr0 {
        public final BlockId.CompositeId b;
        public final long c;
        public final long d;

        public g(BlockId.CompositeId compositeId, long j, long j2) {
            this.b = compositeId;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoCardViewedAction(blockId=");
            sb.append(this.b);
            sb.append(", startViewMs=");
            sb.append(this.c);
            sb.append(", endViewMs=");
            return vu5.a(')', this.d, sb);
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoAction.kt */
    public static final class h implements awr0 {
        public final BlockId.CompositeId b;
        public final VideoTransitionSource c;

        public h(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
            this.b = compositeId;
            this.c = videoTransitionSource;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
