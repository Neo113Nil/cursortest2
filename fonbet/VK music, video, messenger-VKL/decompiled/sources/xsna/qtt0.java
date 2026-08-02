package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: VideosStackedListView.kt */
/* loaded from: classes16.dex */
public interface qtt0 extends q1a {

    /* compiled from: VideosStackedListView.kt */
    public static final class a implements qtt0 {
        public final BlockId.CompositeId b;

        public a(BlockId.CompositeId compositeId) {
            this.b = compositeId;
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
            return "OnDonutBadgeClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosStackedListView.kt */
    public static final class b implements qtt0 {
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
            return "OnDonutChipClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosStackedListView.kt */
    public static final class c implements qtt0 {
        public final BlockId.CompositeId b;

        public c(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenMenu(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosStackedListView.kt */
    public static final class d implements qtt0 {
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
            return "OpenVideo(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosStackedListView.kt */
    public static final class e implements qtt0 {
        public final BlockId.CompositeId b;
        public final long c;
        public final long d;

        public e(BlockId.CompositeId compositeId, long j, long j2) {
            this.b = compositeId;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
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
