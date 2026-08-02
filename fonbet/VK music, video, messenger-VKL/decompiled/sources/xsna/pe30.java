package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes.dex */
public interface pe30 extends smk {

    /* compiled from: MoviePosterView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements pe30 {
        public final BlockId a;
        public final int b;

        public a(BlockId blockId, int i) {
            this.a = blockId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenMovie(blockId=");
            sb.append(this.a);
            sb.append(", movieId=");
            return vu5.b(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
