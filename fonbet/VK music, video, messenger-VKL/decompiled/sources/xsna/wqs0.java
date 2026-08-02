package xsna;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.a8a;
import xsna.rmw;

/* compiled from: VideoLargeListAction.kt */
/* loaded from: classes16.dex */
public interface wqs0 extends q1a {

    /* compiled from: VideoLargeListAction.kt */
    public static final class a implements wqs0 {
        public final BlockId.CompositeId b;

        public a(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class b implements wqs0 {
        public final BlockId.CompositeId b;

        public b(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class c implements wqs0 {
        public final BlockId.CompositeId b;

        public c(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class d implements wqs0 {
        public final BlockId.CompositeId b;

        public d(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DonutBadgeClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class e implements wqs0 {
        public final BlockId.CompositeId b;

        public e(BlockId.CompositeId compositeId) {
            this.b = compositeId;
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
            return "DonutChipClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public interface f extends wqs0 {

        /* compiled from: VideoLargeListAction.kt */
        public static final class a implements f {
            public final BlockId.CompositeId b;

            public a(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class b implements f {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class c implements f {
            public final BlockId.CompositeId b;

            public c(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class g implements wqs0 {
        public final BlockId.CompositeId b;
        public final rmw.e c;

        public g(BlockId.CompositeId compositeId, rmw.e eVar) {
            this.b = compositeId;
            this.c = eVar;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class h implements wqs0 {
        public final BlockId.CompositeId b;
        public final a8a.a c;
        public final Float d;
        public final boolean e;

        public h(BlockId.CompositeId compositeId, a8a.a aVar, Float f, boolean z) {
            this.b = compositeId;
            this.c = aVar;
            this.d = f;
            this.e = z;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class i implements wqs0 {
        public final BlockId.CompositeId b;
        public final Lifecycle.State c;

        public i(BlockId.CompositeId compositeId, Lifecycle.State state) {
            this.b = compositeId;
            this.c = state;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class j implements wqs0 {
        public final BlockId.CompositeId b;

        public j(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class k implements wqs0 {
        public final BlockId.CompositeId b;

        public k(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public interface l extends wqs0 {

        /* compiled from: VideoLargeListAction.kt */
        public static final class a implements l {
            public final BlockId.CompositeId b;
            public final ViewGroup c;
            public final yjk0 d;

            public a(BlockId.CompositeId compositeId, ViewGroup viewGroup, yjk0 yjk0Var) {
                this.b = compositeId;
                this.c = viewGroup;
                this.d = yjk0Var;
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
                return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "LiveInlineHolderViewCreated(blockId=" + this.b + ", holderView=" + this.c + ", spectatorsInlineView=" + this.d + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class b implements l {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
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
                return "LiveInlineHolderViewDisposed(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class c implements l {
            public final BlockId.CompositeId b;
            public final zhf0 c;

            public c(BlockId.CompositeId compositeId, zhf0 zhf0Var) {
                this.b = compositeId;
                this.c = zhf0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PlayerBoundsChanged(blockId=");
                sb.append(this.b);
                sb.append(", bounds=");
                return itj0.c(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class d implements l {
            public final BlockId.CompositeId b;
            public final VideoTextureView c;

            public d(BlockId.CompositeId compositeId, VideoTextureView videoTextureView) {
                this.b = compositeId;
                this.c = videoTextureView;
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

        /* compiled from: VideoLargeListAction.kt */
        public static final class e implements l {
            public final BlockId.CompositeId b;

            public e(BlockId.CompositeId compositeId) {
                this.b = compositeId;
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
                return "VideoViewDisposed(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class m implements wqs0 {
        public final BlockId.CompositeId b;

        public m(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RestrictionConfirmed(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class n implements wqs0 {
        public final BlockId.CompositeId b;

        public n(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public interface o extends wqs0 {

        /* compiled from: VideoLargeListAction.kt */
        public static final class a implements o {
            public final BlockId.CompositeId b;
            public final long c;

            public a(BlockId.CompositeId compositeId, long j) {
                this.b = compositeId;
                this.c = j;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class b implements o {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public interface p extends wqs0 {

        /* compiled from: VideoLargeListAction.kt */
        public static final class a implements p {
            public final BlockId.CompositeId b;

            public a(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListAction.kt */
        public static final class b implements p {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class q implements wqs0 {
        public final BlockId.CompositeId b;

        public q(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideoLargeListAction.kt */
    public static final class r implements wqs0 {
        public final BlockId.CompositeId b;
        public final long c;
        public final long d;

        public r(BlockId.CompositeId compositeId, long j, long j2) {
            this.b = compositeId;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && this.c == rVar.c && this.d == rVar.d;
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
}
