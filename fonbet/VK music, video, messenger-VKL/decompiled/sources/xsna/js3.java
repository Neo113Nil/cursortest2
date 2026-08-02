package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: ArtistMixActor.kt */
/* loaded from: classes16.dex */
public interface js3 extends q1a {

    /* compiled from: ArtistMixActor.kt */
    public static final class a implements js3 {
        public final BlockId b;

        public a(BlockId blockId) {
            this.b = blockId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
