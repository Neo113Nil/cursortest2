package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: PlaylistHeaderView.kt */
/* loaded from: classes6.dex */
public final class bab0 implements q1a {
    public final String b;

    public bab0(String str) {
        this.b = str;
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }
}
