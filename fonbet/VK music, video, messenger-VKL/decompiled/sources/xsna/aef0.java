package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: RecommendedPlaylistActor.kt */
/* loaded from: classes16.dex */
public interface aef0 extends q1a {

    /* compiled from: RecommendedPlaylistActor.kt */
    public static final class a implements aef0 {
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
            return "OnPlayToggleClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: RecommendedPlaylistActor.kt */
    public static final class b implements aef0 {
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
            return "OnPlaylistClick(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: RecommendedPlaylistActor.kt */
    public static final class c implements aef0 {
        public final BlockId b;
        public final String c;

        public c(BlockId blockId, String str) {
            this.b = blockId;
            this.c = str;
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
            StringBuilder sb = new StringBuilder("OnTrackLongClick(blockId=");
            sb.append(this.b);
            sb.append(", trackMid=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: RecommendedPlaylistActor.kt */
    public static final class d implements aef0 {
        public final BlockId b;
        public final String c;

        public d(BlockId blockId, String str) {
            this.b = blockId;
            this.c = str;
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
            StringBuilder sb = new StringBuilder("OnTrackPlayToggleClick(blockId=");
            sb.append(this.b);
            sb.append(", trackMid=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
