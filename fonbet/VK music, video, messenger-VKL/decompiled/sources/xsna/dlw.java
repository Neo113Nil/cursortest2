package xsna;

import com.vk.imageloader.cache.ImageProxyDiskStorageCache;
import java.util.List;
import java.util.concurrent.ExecutorService;
import xsna.vbn;

/* compiled from: ImageProxyDiskStorageCacheFactory.kt */
/* loaded from: classes2.dex */
public final class dlw implements z7r {
    public final vh8 a;

    public dlw(vh8 vh8Var) {
        this.a = vh8Var;
    }

    @Override // xsna.z7r
    public final y7r a(wan wanVar) {
        vbn.b bVar = new vbn.b(wanVar.f, wanVar.e, wanVar.d);
        vh8 vh8Var = this.a;
        vh8Var.getClass();
        vsi vsiVar = new vsi(new gpo(wanVar.a, wanVar.c, wanVar.b, wanVar.h), (List) vh8Var.b);
        asu0.a.getClass();
        ExecutorService n = asu0.n();
        u370 u370Var = wanVar.g;
        rw8 rw8Var = wanVar.i;
        if (rw8Var == null) {
            rw8Var = f370.v();
        }
        return new ImageProxyDiskStorageCache(vsiVar, u370Var, bVar, rw8Var, wanVar.h, wanVar.j, n, wanVar.c.get());
    }
}
