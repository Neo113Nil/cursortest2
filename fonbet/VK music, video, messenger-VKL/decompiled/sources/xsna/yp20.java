package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import xsna.gx8;
import xsna.z4y;

/* compiled from: MiniAppLocalStorageCache.kt */
/* loaded from: classes.dex */
public final class yp20 implements gx8.a, pp20 {
    public static final yp20 b = new yp20();
    public static final ConcurrentHashMap<Long, l9r> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, ui50> d = new ConcurrentHashMap<>();
    public static final Charset e = emb.b;

    public static final ui50 g(yp20 yp20Var, long j) {
        ui50 putIfAbsent;
        yp20Var.getClass();
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap<Long, ui50> concurrentHashMap = d;
        ui50 ui50Var = concurrentHashMap.get(valueOf);
        if (ui50Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (ui50Var = bay.a()))) != null) {
            ui50Var = putIfAbsent;
        }
        return ui50Var;
    }

    public static final l9r h(yp20 yp20Var, long j) {
        yp20Var.getClass();
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap<Long, l9r> concurrentHashMap = c;
        l9r l9rVar = concurrentHashMap.get(valueOf);
        if (l9rVar == null) {
            b.getClass();
            l9rVar = new l9r(j(j), ServiceProvider.HTTP_CACHE_DISK_SIZE);
            l9r putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, l9rVar);
            if (putIfAbsent != null) {
                l9rVar = putIfAbsent;
            }
        }
        return l9rVar;
    }

    public static final void i(yp20 yp20Var, File file, String str) {
        yp20Var.getClass();
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        nbr.w(file2, str, e);
        if (file2.renameTo(file)) {
            return;
        }
        file.delete();
        if (file2.renameTo(file)) {
            return;
        }
        file2.delete();
        throw new IllegalStateException("Atomic rename failed for " + file.getAbsolutePath());
    }

    public static File j(long j) {
        File file = new File(k(), defpackage.k0.a(j, "app_"));
        file.mkdirs();
        return file;
    }

    public static File k() {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.MINI_APP_LOCAL_STORAGE.h(), true);
        return b2.a;
    }

    public static Object l(File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            return (nw8) j8y.d.a(nw8.Companion.serializer(), nbr.r(file, e));
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    @Override // xsna.pp20
    public final Object b(long j, List list, z4y.b bVar) {
        return myc0.k(hqu0.b(), new wp20(j, list, null), bVar);
    }

    @Override // xsna.pp20
    public final Object c(long j, List list, z4y.a aVar) {
        return myc0.k(hqu0.b(), new rp20(j, list, null), aVar);
    }

    @Override // xsna.pp20
    public final Object d(long j, String str, String str2, z4y.e eVar) {
        return myc0.k(hqu0.b(), new xp20(j, str2, str, null), eVar);
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        c.clear();
        d.clear();
        File[] listFiles = k().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                nbr.l(file);
            }
        }
        k().mkdirs();
    }

    @Override // xsna.pp20
    public final Object e(long j, z4y.c cVar) {
        return myc0.k(hqu0.b(), new up20(j, null), cVar);
    }

    @Override // xsna.pp20
    public final Object f(long j, String str, z4y.d dVar) {
        return myc0.k(hqu0.b(), new sp20(j, str, null), dVar);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return yp20.class.getSimpleName();
    }

    @Override // xsna.gx8.a
    public final long u() {
        return z4g.g(k());
    }
}
