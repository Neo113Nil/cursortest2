package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: ArtistSliderActor.kt */
/* loaded from: classes16.dex */
public interface xs3 extends q1a {

    /* compiled from: ArtistSliderActor.kt */
    public static final class a implements xs3 {
        public final BlockId b;

        public a(BlockId blockId) {
            this.b = blockId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: ArtistSliderActor.kt */
    public static final class b implements xs3 {
        public final BlockId b;

        public b(BlockId blockId) {
            this.b = blockId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
