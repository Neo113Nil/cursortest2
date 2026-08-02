package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: AuthorsChannelSliderView.kt */
/* loaded from: classes16.dex */
public interface me5 extends q1a {

    /* compiled from: AuthorsChannelSliderView.kt */
    public static final class a implements me5 {
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
            return "AuthorsChannelClicked(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: AuthorsChannelSliderView.kt */
    public static final class b implements me5 {
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
            return "SubscribeClicked(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
