package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Pair;

/* compiled from: ReadWriteSyncFeatureStorage.kt */
/* loaded from: classes11.dex */
public final class s7f0 implements com.vk.toggle.c {
    public final String b;
    public final Lazy c;
    public long d = Long.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    public final ConcurrentHashMap<a, b.d> f = new ConcurrentHashMap<>();
    public final ReentrantReadWriteLock g = new ReentrantReadWriteLock();
    public volatile AtomicBoolean h = new AtomicBoolean(false);
    public final v0p0 i = new v0p0(this);

    /* compiled from: ReadWriteSyncFeatureStorage.kt */
    @vby
    public static final class a {
        public final String a;

        public /* synthetic */ a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "CacheToggleKey(namedKey=", this.a);
        }
    }

    public s7f0(String str, Lazy<? extends xuq> lazy) {
        this.b = str;
        this.c = lazy;
    }

    public static String n(String str, boolean z) {
        StringBuilder e = fw3.e(str);
        e.append(z ? "user" : "common");
        return e.toString();
    }

    @Override // com.vk.toggle.c
    public final long a() {
        ReentrantReadWriteLock.ReadLock readLock = this.g.readLock();
        readLock.lock();
        try {
            if (this.d == Long.MIN_VALUE) {
                String b = l().b("hash", this.b);
                this.d = b != null ? Long.parseLong(b) : 0L;
            }
            long j = this.d;
            readLock.unlock();
            return j;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.vk.toggle.c
    public final b.d b(String str, boolean z) {
        ReentrantReadWriteLock.ReadLock readLock = this.g.readLock();
        readLock.lock();
        try {
            if (!this.h.get() && i0q0.b()) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"Toggle's request before initial starting. Add " + str + " to important list, or don't use it on main thread."});
                }
            }
            b.d m = m(str, z);
            readLock.unlock();
            return m;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.vk.toggle.c
    public final void c(b.d dVar, boolean z) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            String obj = dVar.b.toString();
            String jSONObject = w0p0.c(dVar).toString();
            b.d o = o(jSONObject, obj);
            if (o != null) {
                this.f.put(new a(n(obj, z)), o);
            }
            l().c(obj, jSONObject, this.b, z);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.vk.toggle.c
    public final void d(String str) {
        ConcurrentHashMap<a, b.d> concurrentHashMap = this.f;
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            concurrentHashMap.remove(new a(n(str, false)));
            concurrentHashMap.remove(new a(n(str, true)));
            l().g(str, this.b);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.vk.toggle.c
    public final v0p0 e() {
        return this.i;
    }

    @Override // com.vk.toggle.c
    public final void f(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            l().h("hash", String.valueOf(j), this.b);
            this.d = j;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.vk.toggle.c
    public final void g(Collection collection) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((b.d) it.next(), false);
            }
            s3q0 s3q0Var = s3q0.a;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.vk.toggle.c
    public final int getVersion() {
        ReentrantReadWriteLock.ReadLock readLock = this.g.readLock();
        readLock.lock();
        try {
            if (this.e == Integer.MIN_VALUE) {
                String b = l().b("version", this.b);
                this.e = b != null ? Integer.parseInt(b) : 0;
            }
            int i = this.e;
            readLock.unlock();
            return i;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.vk.toggle.c
    public final void h(izs izsVar, boolean z) {
        ReentrantReadWriteLock.ReadLock readLock = this.g.readLock();
        readLock.lock();
        try {
            a();
            getVersion();
            for (Pair pair : l().f(this.b, z)) {
                String str = (String) pair.d();
                b.d o = o((String) pair.g(), str);
                if (o != null) {
                    this.f.put(new a(n(str, z)), o);
                    izsVar.invoke(o);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            readLock.unlock();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.vk.toggle.c
    public final String i() {
        return this.b;
    }

    @Override // com.vk.toggle.c
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // com.vk.toggle.c
    public final boolean j(String str, boolean z) {
        ReentrantReadWriteLock.ReadLock readLock = this.g.readLock();
        readLock.lock();
        try {
            return m(str, z) != null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // com.vk.toggle.c
    public final void k(String str, boolean z) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f.remove(new a(n(str, z)));
            l().e(str, this.b, z);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final xuq l() {
        return (xuq) this.c.getValue();
    }

    public final b.d m(String str, boolean z) {
        a aVar = new a(n(str, z));
        ConcurrentHashMap<a, b.d> concurrentHashMap = this.f;
        b.d dVar = concurrentHashMap.get(aVar);
        if (dVar != null) {
            return dVar;
        }
        String a2 = l().a(str, this.b, z);
        b.d o = a2 != null ? o(a2, str) : null;
        if (o != null) {
            concurrentHashMap.put(new a(n(str, z)), o);
        }
        return o;
    }

    public final b.d o(String str, String str2) {
        b.d dVar;
        if (drm0.N(str)) {
            return null;
        }
        boolean z = false;
        if (w0p0.b(str)) {
            dVar = w0p0.a(str2, str);
        } else {
            k(str2, false);
            dVar = null;
        }
        if (dVar != null && dVar.a) {
            z = true;
        }
        String obj = dVar != null ? dVar.c.toString() : null;
        if (obj == null) {
            obj = "";
        }
        return new b.d(str2, obj, z);
    }

    @Override // com.vk.toggle.c
    public final void removeAll() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.d = Long.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
            this.f.clear();
            l().d(this.b);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.vk.toggle.c
    public final void setVersion(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.g;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            l().h("version", String.valueOf(i), this.b);
            this.e = i;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
