package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: AlbumActionDS.kt */
/* loaded from: classes16.dex */
public interface yc1 extends q1a {

    /* compiled from: AlbumActionDS.kt */
    public static final class a implements yc1 {
    }

    /* compiled from: AlbumActionDS.kt */
    public static final class b implements yc1 {
        public final BlockId b;
        public final long c;
        public final long d;

        public b(BlockId blockId, long j, long j2) {
            this.b = blockId;
            this.c = j;
            this.d = j2;
        }

        public final long a() {
            return this.d;
        }

        public final long b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumCardViewedAction(blockId=");
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

    /* compiled from: AlbumActionDS.kt */
    public static final class c implements yc1 {
        public final BlockId b;

        public c(BlockId blockId) {
            this.b = blockId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: AlbumActionDS.kt */
    public static final class d implements yc1 {
        public final BlockId b;

        public d(BlockId blockId) {
            this.b = blockId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
