package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;

/* compiled from: VideoCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class s9s0 implements b3k0 {
    public final long a;
    public final prq0 b;

    public s9s0(long j, VideoCatalogRootVh videoCatalogRootVh) {
        this.a = j;
        this.b = new prq0(videoCatalogRootVh, this);
    }

    @Override // xsna.b3k0
    public final long a() {
        return this.a;
    }

    @Override // xsna.b3k0
    public final gzs<s3q0> b() {
        return this.b;
    }
}
