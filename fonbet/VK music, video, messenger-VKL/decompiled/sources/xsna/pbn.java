package xsna;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import xsna.ebn;
import xsna.ibn;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes12.dex */
public final class pbn implements uan {
    public final File c;
    public ibn f;
    public final ebn e = new ebn();
    public final long d = 262144000;
    public final mzg0 b = new mzg0();

    @Deprecated
    public pbn(File file) {
        this.c = file;
    }

    @Override // xsna.uan
    public final void a(ady adyVar, com.vk.movika.sdk.base.model.l lVar) {
        ebn.a aVar;
        boolean z;
        String a = this.b.a(adyVar);
        ebn ebnVar = this.e;
        synchronized (ebnVar) {
            aVar = (ebn.a) ebnVar.a.get(a);
            if (aVar == null) {
                ebn.b bVar = ebnVar.b;
                synchronized (bVar.a) {
                    aVar = (ebn.a) bVar.a.poll();
                }
                if (aVar == null) {
                    aVar = new ebn.a();
                }
                ebnVar.a.put(a, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(adyVar);
            }
            try {
                ibn b = b();
                if (b.k(a) == null) {
                    ibn.c i = b.i(a);
                    if (i == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a));
                    }
                    try {
                        if (((yip) lVar.a).h(lVar.b, i.b(), (au80) lVar.c)) {
                            ibn.b(ibn.this, i, true);
                            i.c = true;
                        }
                        if (!z) {
                            i.a();
                        }
                    } finally {
                        if (!i.c) {
                            try {
                                i.a();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            this.e.a(a);
        }
    }

    public final synchronized ibn b() throws IOException {
        try {
            if (this.f == null) {
                this.f = ibn.n(this.c, this.d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    @Override // xsna.uan
    public final File c(ady adyVar) {
        String a = this.b.a(adyVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(adyVar);
        }
        try {
            ibn.e k = b().k(a);
            if (k != null) {
                return k.a[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
