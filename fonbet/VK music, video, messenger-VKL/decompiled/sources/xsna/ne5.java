package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: AuthorsChannelSliderView.kt */
/* loaded from: classes.dex */
public final class ne5 implements r2a {
    public final BlockId.CompositeId b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    public ne5(BlockId.CompositeId compositeId, String str, boolean z, String str2, String str3, boolean z2) {
        this.b = compositeId;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = z2;
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
