package xsna;

import java.util.concurrent.ExecutorService;
import xsna.ubn;

/* compiled from: DiskStorageCacheFactory.java */
/* loaded from: classes12.dex */
public final class wbn implements z7r {
    public final pli a;

    public wbn(pli pliVar) {
        this.a = pliVar;
    }

    @Override // xsna.z7r
    public final y7r a(wan wanVar) {
        this.a.getClass();
        gpo gpoVar = new gpo(wanVar.a, wanVar.c, wanVar.b, wanVar.h);
        ExecutorService C = asu0.C();
        return new ubn(gpoVar, wanVar.g, new ubn.b(wanVar.f, wanVar.e, wanVar.d), wanVar.i, wanVar.h, C);
    }
}
