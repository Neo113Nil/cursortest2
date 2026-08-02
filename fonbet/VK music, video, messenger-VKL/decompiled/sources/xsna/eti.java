package xsna;

import android.os.Trace;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.c;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.w220;

/* compiled from: CompositeFeatureStorage.kt */
/* loaded from: classes11.dex */
public final class eti implements com.vk.toggle.c {
    public final com.vk.toggle.c b;
    public final w220 c;
    public final v0p0 d;

    public eti(com.vk.toggle.c cVar, w220 w220Var) {
        this.b = cVar;
        this.c = w220Var;
        this.d = new v0p0(this);
    }

    @Override // com.vk.toggle.c
    public final long a() {
        return this.b.a();
    }

    @Override // com.vk.toggle.c
    public final b.d b(String str, boolean z) {
        ReentrantReadWriteLock.ReadLock readLock;
        com.vk.toggle.c cVar = this.b;
        if (z) {
            return cVar.b(str, true);
        }
        w220 w220Var = this.c;
        if (w220Var != null) {
            Trace.beginSection(ndp0.f("MemoryMappedFeatureSource.get"));
            b.d dVar = null;
            try {
                try {
                    readLock = w220Var.a.readLock();
                    readLock.lock();
                } catch (Exception e) {
                    w220Var.a();
                    L.i(e);
                }
                try {
                    x220<w220.a, b.d> x220Var = w220Var.b;
                    b.d dVar2 = x220Var != null ? x220Var.get(new w220.a(str)) : null;
                    w220Var.e.getAndIncrement();
                    readLock.unlock();
                    dVar = dVar2;
                    Trace.endSection();
                    if (dVar != null) {
                        return dVar;
                    }
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        return cVar.b(str, false);
    }

    @Override // com.vk.toggle.c
    public final void c(b.d dVar, boolean z) {
        this.b.c(dVar, z);
    }

    @Override // com.vk.toggle.c
    public final void d(String str) {
        this.b.d(str);
    }

    @Override // com.vk.toggle.c
    public final v0p0 e() {
        return this.d;
    }

    @Override // com.vk.toggle.c
    public final void f(long j) {
        this.b.f(j);
    }

    @Override // com.vk.toggle.c
    public final void g(Collection collection) {
        this.b.g(collection);
    }

    @Override // com.vk.toggle.c
    public final int getVersion() {
        return this.b.getVersion();
    }

    @Override // com.vk.toggle.c
    public final void h(izs izsVar, boolean z) {
        this.b.h(izsVar, z);
    }

    @Override // com.vk.toggle.c
    public final String i() {
        return this.b.i();
    }

    @Override // com.vk.toggle.c
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r2 != true) goto L21;
     */
    @Override // com.vk.toggle.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(String str, boolean z) {
        boolean z2;
        com.vk.toggle.c cVar = this.b;
        if (z) {
            cVar.j(str, true);
        }
        w220 w220Var = this.c;
        if (w220Var != null) {
            ReentrantReadWriteLock.ReadLock readLock = w220Var.a.readLock();
            readLock.lock();
            try {
                x220<w220.a, b.d> x220Var = w220Var.b;
                if (x220Var != null) {
                    if (x220Var.containsKey(new w220.a(str))) {
                        z2 = true;
                    }
                }
                z2 = false;
            } finally {
                readLock.unlock();
            }
        }
        return cVar.j(str, false);
    }

    @Override // com.vk.toggle.c
    public final void k(String str, boolean z) {
        this.b.k(str, true);
    }

    @Override // com.vk.toggle.c
    public final void removeAll() {
        this.b.removeAll();
    }

    @Override // com.vk.toggle.c
    public final void setVersion(int i) {
        this.b.setVersion(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eti() {
        this(c.a.b, null);
        com.vk.toggle.c.a.getClass();
    }
}
