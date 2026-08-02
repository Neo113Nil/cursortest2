package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: MovieInfoView.kt */
/* loaded from: classes16.dex */
public interface de30 extends q1a {

    /* compiled from: MovieInfoView.kt */
    public static final class a implements de30 {
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
            return "Toggled(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
