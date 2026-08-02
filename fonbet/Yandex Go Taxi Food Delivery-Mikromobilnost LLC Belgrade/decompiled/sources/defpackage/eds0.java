package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class eds0 implements ra7 {
    public static final HashSet l = new HashSet();
    public final File a;
    public final ib7 b;
    public final yuf0 c;
    public final lb7 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public Cache$CacheException k;

    public eds0(File file, ib7 ib7Var, lqg lqgVar, boolean z) {
        boolean add;
        yuf0 yuf0Var = new yuf0(lqgVar, file, z);
        lb7 lb7Var = (lqgVar == null || z) ? null : new lb7(lqgVar);
        synchronized (eds0.class) {
            add = l.add(file.getAbsoluteFile());
        }
        if (!add) {
            ny61.r(g8e.n(file, "Another SimpleCache instance uses the folder: "));
            throw null;
        }
        this.a = file;
        this.b = ib7Var;
        this.c = yuf0Var;
        this.d = lb7Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = ib7Var.requiresCacheSpanTouches();
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new dds0(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(eds0 eds0Var) {
        long j;
        lb7 lb7Var = eds0Var.d;
        yuf0 yuf0Var = eds0Var.c;
        File file = eds0Var.a;
        if (!file.exists()) {
            try {
                d(file);
            } catch (Cache$CacheException e) {
                eds0Var.k = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            lk91.e("SimpleCache", str);
            eds0Var.k = new Cache$CacheException(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    lk91.e("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        eds0Var.h = j;
        if (j == -1) {
            try {
                long nextLong = new SecureRandom().nextLong();
                long j2 = 0;
                long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
                File file3 = new File(file, b64.j(Long.toString(abs, 16), ".uid"));
                if (file3.createNewFile()) {
                    j2 = abs;
                } else {
                    ny61.v(g8e.n(file3, "Failed to create UID file: "));
                }
                eds0Var.h = j2;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                lk91.f("SimpleCache", str2, e2);
                eds0Var.k = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            yuf0Var.E(eds0Var.h);
            if (lb7Var != null) {
                lb7Var.t(eds0Var.h);
                HashMap q = lb7Var.q();
                eds0Var.e(file, true, listFiles, q);
                lb7Var.x(q.keySet());
            } else {
                eds0Var.e(file, true, listFiles, null);
            }
            h221 it = ImmutableSet.m(((HashMap) yuf0Var.a).keySet()).iterator();
            while (it.hasNext()) {
                yuf0Var.G((String) it.next());
            }
            try {
                yuf0Var.P();
            } catch (IOException e3) {
                lk91.f("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            lk91.f("SimpleCache", str3, e4);
            eds0Var.k = new Cache$CacheException(str3, e4);
        }
    }

    public static void d(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        lk91.e("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static synchronized void i(File file) {
        synchronized (eds0.class) {
            l.remove(file.getAbsoluteFile());
        }
    }

    @Override // defpackage.ra7
    public final synchronized NavigableSet addListener(String str, oa7 oa7Var) {
        try {
            d6z.x(!this.j);
            str.getClass();
            oa7Var.getClass();
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.e.put(str, arrayList);
            }
            arrayList.add(oa7Var);
        } catch (Throwable th) {
            throw th;
        }
        return getCachedSpans(str);
    }

    @Override // defpackage.ra7
    public final synchronized void applyContentMetadataMutations(String str, che cheVar) {
        d6z.x(!this.j);
        c();
        yuf0 yuf0Var = this.c;
        dd7 y = yuf0Var.y(str);
        if (y.b(cheVar)) {
            ((ed7) yuf0Var.e).i(y);
        }
        try {
            this.c.P();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final void b(fds0 fds0Var) {
        String str = fds0Var.a;
        this.c.y(str).a(fds0Var);
        this.i += fds0Var.c;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((oa7) arrayList.get(size)).onSpanAdded(this, fds0Var);
            }
        }
        this.b.onSpanAdded(this, fds0Var);
    }

    public final synchronized void c() {
        Cache$CacheException cache$CacheException = this.k;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    @Override // defpackage.ra7
    public final synchronized void commitFile(File file, long j) {
        boolean z = true;
        d6z.x(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            fds0 c = fds0.c(file, j, this.c);
            c.getClass();
            dd7 v = this.c.v(c.a);
            v.getClass();
            d6z.x(v.h(c.b, c.c));
            long a = bhe.a(v.d());
            if (a != -1) {
                if (c.b + c.c > a) {
                    z = false;
                }
                d6z.x(z);
            }
            if (this.d != null) {
                try {
                    this.d.A(c.c, c.y, file.getName());
                } catch (IOException e) {
                    throw new Cache$CacheException(e);
                }
            }
            b(c);
            try {
                this.c.P();
                notifyAll();
            } catch (IOException e2) {
                throw new Cache$CacheException(e2);
            }
        }
    }

    public final void e(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                e(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                kb7 kb7Var = map != null ? (kb7) map.remove(name) : null;
                if (kb7Var != null) {
                    j = kb7Var.a;
                    j2 = kb7Var.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                fds0 b = fds0.b(file2, j, j2, this.c);
                if (b != null) {
                    b(b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void f(lc7 lc7Var) {
        String str = lc7Var.a;
        yuf0 yuf0Var = this.c;
        dd7 v = yuf0Var.v(str);
        if (v == null || !v.k(lc7Var)) {
            return;
        }
        this.i -= lc7Var.c;
        lb7 lb7Var = this.d;
        if (lb7Var != null) {
            File file = lc7Var.x;
            file.getClass();
            String name = file.getName();
            try {
                ((String) lb7Var.c).getClass();
                try {
                    ((lqg) lb7Var.b).getWritableDatabase().delete((String) lb7Var.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                lk91.j("Failed to remove file index entry for: " + name);
            }
        }
        yuf0Var.G(v.b);
        ArrayList arrayList = (ArrayList) this.e.get(lc7Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((oa7) arrayList.get(size)).onSpanRemoved(this, lc7Var);
            }
        }
        this.b.onSpanRemoved(this, lc7Var);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((dd7) it.next()).f().iterator();
            while (it2.hasNext()) {
                lc7 lc7Var = (lc7) it2.next();
                File file = lc7Var.x;
                file.getClass();
                if (file.length() != lc7Var.c) {
                    arrayList.add(lc7Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            f((lc7) arrayList.get(i));
        }
    }

    @Override // defpackage.ra7
    public final synchronized long getCacheSpace() {
        d6z.x(!this.j);
        return this.i;
    }

    @Override // defpackage.ra7
    public final synchronized long getCachedBytes(String str, long j, long j2) {
        long j3;
        long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        j3 = 0;
        while (j < j4) {
            long cachedLength = getCachedLength(str, j, j4 - j);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j += cachedLength;
        }
        return j3;
    }

    @Override // defpackage.ra7
    public final synchronized long getCachedLength(String str, long j, long j2) {
        dd7 v;
        d6z.x(!this.j);
        if (j2 == -1) {
            j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        v = this.c.v(str);
        return v != null ? v.c(j, j2) : -j2;
    }

    @Override // defpackage.ra7
    public final synchronized NavigableSet getCachedSpans(String str) {
        TreeSet treeSet;
        try {
            d6z.x(!this.j);
            dd7 v = this.c.v(str);
            if (v != null && !v.g()) {
                treeSet = new TreeSet((Collection) v.f());
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    @Override // defpackage.ra7
    public final synchronized bhe getContentMetadata(String str) {
        dd7 v;
        d6z.x(!this.j);
        v = this.c.v(str);
        return v != null ? v.d() : f9h.c;
    }

    @Override // defpackage.ra7
    public final synchronized Set getKeys() {
        d6z.x(!this.j);
        return new HashSet(((HashMap) this.c.a).keySet());
    }

    @Override // defpackage.ra7
    public final synchronized long getUid() {
        return this.h;
    }

    public final fds0 h(String str, fds0 fds0Var) {
        boolean z;
        if (!this.g) {
            return fds0Var;
        }
        File file = fds0Var.x;
        file.getClass();
        String name = file.getName();
        long j = fds0Var.c;
        long currentTimeMillis = System.currentTimeMillis();
        lb7 lb7Var = this.d;
        if (lb7Var != null) {
            try {
                lb7Var.A(j, currentTimeMillis, name);
            } catch (IOException unused) {
                lk91.j("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        dd7 v = this.c.v(str);
        v.getClass();
        fds0 l2 = v.l(fds0Var, currentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.e.get(fds0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((oa7) arrayList.get(size)).onSpanTouched(this, fds0Var, l2);
            }
        }
        this.b.onSpanTouched(this, fds0Var, l2);
        return l2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3.c(r4, r6) >= r6) goto L12;
     */
    @Override // defpackage.ra7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = true;
        d6z.x(!this.j);
        dd7 v = this.c.v(str);
        if (v != null) {
        }
        z = false;
        return z;
    }

    @Override // defpackage.ra7
    public final synchronized void release() {
        File file;
        if (this.j) {
            return;
        }
        this.e.clear();
        g();
        try {
            try {
                this.c.P();
                file = this.a;
            } catch (IOException e) {
                lk91.f("SimpleCache", "Storing index file failed", e);
                file = this.a;
            }
            i(file);
            this.j = true;
        } catch (Throwable th) {
            i(this.a);
            this.j = true;
            throw th;
        }
    }

    @Override // defpackage.ra7
    public final synchronized void releaseHoleSpan(lc7 lc7Var) {
        d6z.x(!this.j);
        dd7 v = this.c.v(lc7Var.a);
        v.getClass();
        v.m(lc7Var.b);
        this.c.G(v.b);
        notifyAll();
    }

    @Override // defpackage.ra7
    public final synchronized void removeListener(String str, oa7 oa7Var) {
        if (this.j) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            arrayList.remove(oa7Var);
            if (arrayList.isEmpty()) {
                this.e.remove(str);
            }
        }
    }

    @Override // defpackage.ra7
    public final synchronized void removeResource(String str) {
        d6z.x(!this.j);
        Iterator it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            f((lc7) it.next());
        }
    }

    @Override // defpackage.ra7
    public final synchronized void removeSpan(lc7 lc7Var) {
        d6z.x(!this.j);
        f(lc7Var);
    }

    @Override // defpackage.ra7
    public final synchronized File startFile(String str, long j, long j2) {
        Throwable th;
        eds0 eds0Var;
        dd7 v;
        File file;
        try {
            try {
                d6z.x(!this.j);
                c();
                v = this.c.v(str);
                v.getClass();
                d6z.x(v.h(j, j2));
                if (!this.a.exists()) {
                    try {
                        d(this.a);
                        g();
                    } catch (Throwable th2) {
                        th = th2;
                        eds0Var = this;
                        throw th;
                    }
                }
                this.b.onStartFile(this, str, j, j2);
                file = new File(this.a, Integer.toString(this.f.nextInt(10)));
                if (!file.exists()) {
                    d(file);
                }
            } catch (Throwable th3) {
                th = th3;
                eds0Var = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return fds0.e(file, v.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.ra7
    public final synchronized lc7 startReadWrite(String str, long j, long j2) {
        lc7 startReadWriteNonBlocking;
        d6z.x(!this.j);
        c();
        while (true) {
            startReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
            if (startReadWriteNonBlocking == null) {
                wait();
            }
        }
        return startReadWriteNonBlocking;
    }

    @Override // defpackage.ra7
    public final synchronized lc7 startReadWriteNonBlocking(String str, long j, long j2) {
        fds0 e;
        fds0 fds0Var;
        d6z.x(!this.j);
        c();
        dd7 v = this.c.v(str);
        if (v == null) {
            fds0Var = fds0.d(j, j2, str);
        } else {
            while (true) {
                e = v.e(j, j2);
                if (!e.w) {
                    break;
                }
                File file = e.x;
                file.getClass();
                if (file.length() == e.c) {
                    break;
                }
                g();
            }
            fds0Var = e;
        }
        if (fds0Var.w) {
            return h(str, fds0Var);
        }
        if (this.c.y(str).j(j, fds0Var.c)) {
            return fds0Var;
        }
        return null;
    }
}
