package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import xsna.gx8;

/* compiled from: PrivateSubdirCacheContainer.kt */
/* loaded from: classes.dex */
public final class fgd0 implements gx8.a {
    public final PrivateSubdir b;
    public final CacheTarget c;
    public final String d;

    public fgd0(PrivateSubdir privateSubdir, CacheTarget cacheTarget) {
        String str = "PrivateSubdir." + privateSubdir.name();
        this.b = privateSubdir;
        this.c = cacheTarget;
        this.d = str;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return this.c;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        e8r.a.a(this.b, null);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return this.d;
    }

    @Override // xsna.gx8.a
    public final long u() {
        PrivateFiles.a b;
        b = e8r.a.b(r1, this.b.h(), true);
        return com.vk.core.files.a.J(b.a);
    }
}
