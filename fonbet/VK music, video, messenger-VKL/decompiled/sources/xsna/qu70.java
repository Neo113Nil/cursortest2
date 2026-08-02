package xsna;

import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import xsna.ju70;
import xsna.tbn;
import xsna.x7r;

/* compiled from: OfflineMusicImagesDiskStorage.kt */
/* loaded from: classes.dex */
public final class qu70 implements tbn {
    public final s0f a;
    public final bpn0 b = new bpn0(new cd3(8));

    public qu70(s0f s0fVar) {
        this.a = s0fVar;
    }

    @Override // xsna.tbn
    public final Collection<tbn.a> c() {
        return new ArrayList();
    }

    @Override // xsna.tbn
    public final t27 d(Object obj, String str) {
        File file;
        Cache cache = (Cache) this.a.invoke();
        String h = ju70.a.h(str);
        cij contentMetadata = cache.getContentMetadata(h);
        if (contentMetadata.equals(adl.c)) {
            return null;
        }
        qx8 g = cache.g(0L, cij.b(contentMetadata), h);
        if ((g != null && !g.e) || g == null || (file = g.f) == null) {
            return null;
        }
        return x7r.a.a(file);
    }

    @Override // xsna.tbn
    public final long e(tbn.a aVar) {
        return -1L;
    }

    @Override // xsna.tbn
    public final boolean g(Object obj, String str) {
        Cache cache = (Cache) this.a.invoke();
        String h = ju70.a.h(str);
        cij contentMetadata = cache.getContentMetadata(h);
        if (contentMetadata.equals(adl.c)) {
            return false;
        }
        return cache.isCached(h, 0L, cij.b(contentMetadata));
    }

    @Override // xsna.tbn
    public final tbn.b h(Object obj, String str) {
        return (a) this.b.getValue();
    }

    @Override // xsna.tbn
    public final boolean isExternal() {
        return true;
    }

    @Override // xsna.tbn
    public final long remove(String str) {
        return -1L;
    }

    @Override // xsna.tbn
    public final void b() {
    }

    @Override // xsna.tbn
    public final void f() {
    }

    /* compiled from: OfflineMusicImagesDiskStorage.kt */
    /* loaded from: classes3.dex */
    public static final class a implements tbn.b {
        public final nt8 a;

        public a(nt8 nt8Var) {
            this.a = nt8Var;
        }

        @Override // xsna.tbn.b
        public final boolean G() {
            return true;
        }

        @Override // xsna.tbn.b
        public final t27 commit() {
            return this.a;
        }

        @Override // xsna.tbn.b
        public final void H(xm8 xm8Var) {
        }
    }
}
