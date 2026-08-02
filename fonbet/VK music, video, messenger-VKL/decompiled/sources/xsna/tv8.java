package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import xsna.gx8;

/* compiled from: CacheContainerWithMultiAccountTag.kt */
/* loaded from: classes.dex */
public final class tv8 implements gx8.a {
    public final rv8 b;

    public tv8(rv8 rv8Var) {
        this.b = rv8Var;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return this.b.a();
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        this.b.b(false);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return this.b.getDescription();
    }

    @Override // xsna.gx8.a
    public final long u() {
        return this.b.e();
    }
}
