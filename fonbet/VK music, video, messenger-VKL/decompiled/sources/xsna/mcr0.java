package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Trace;
import androidx.annotation.Nullable;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.ironsource.X3;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: VKImageLoader.java */
/* loaded from: classes.dex */
public final class mcr0 {
    public static Field a = null;
    public static volatile boolean b = false;
    public static final a c = new a(27000000);
    public static final m900<ww8, b> d = new m900<>(50);
    public static final c e = new c();
    public static final ReentrantLock f;
    public static final Condition g;
    public static final m240 h;
    public static boolean i;

    @Nullable
    public static dmw j;

    /* compiled from: VKImageLoader.java */
    public class a extends m900<String, nb7> {
        @Override // xsna.m900
        public final int sizeOf(String str, nb7 nb7Var) {
            return nb7Var.b();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKImageLoader.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b EVICTION;
        public static final b HIT;
        public static final b MISS;
        public static final b READ_EXCEPTION;
        public static final b WRITE_ATTEMPT;
        public static final b WRITE_EXCEPTION;
        public static final b WRITE_SUCCESS;

        static {
            b bVar = new b("HIT", 0);
            HIT = bVar;
            b bVar2 = new b("MISS", 1);
            MISS = bVar2;
            b bVar3 = new b("WRITE_ATTEMPT", 2);
            WRITE_ATTEMPT = bVar3;
            b bVar4 = new b("WRITE_SUCCESS", 3);
            WRITE_SUCCESS = bVar4;
            b bVar5 = new b("READ_EXCEPTION", 4);
            READ_EXCEPTION = bVar5;
            b bVar6 = new b("WRITE_EXCEPTION", 5);
            WRITE_EXCEPTION = bVar6;
            b bVar7 = new b("EVICTION", 6);
            EVICTION = bVar7;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: VKImageLoader.java */
    public static class c implements rw8 {
        @Override // xsna.rw8
        public final void a(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.HIT);
                    mcr0.g.signalAll();
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void c(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.READ_EXCEPTION);
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void d(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.EVICTION);
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void e(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.WRITE_SUCCESS);
                    mcr0.g.signalAll();
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void f(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.WRITE_EXCEPTION);
                    mcr0.g.signalAll();
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void g(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.WRITE_ATTEMPT);
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }

        @Override // xsna.rw8
        public final void h(jzi0 jzi0Var) {
            if (jzi0Var.c() != null) {
                ReentrantLock reentrantLock = mcr0.f;
                reentrantLock.lock();
                try {
                    mcr0.d.put(jzi0Var.c(), b.MISS);
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    mcr0.f.unlock();
                    throw th;
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f = reentrantLock;
        g = reentrantLock.newCondition();
        h = new m240(1);
        i = false;
    }

    public static void a() {
        b();
        skw b2 = rhs.b();
        rkw rkwVar = new rkw();
        b2.f.f(rkwVar);
        b2.g.f(rkwVar);
        fbn fbnVar = b2.c.get();
        fbnVar.b().a();
        fbnVar.d().a();
        Iterator<Map.Entry<String, ym8>> it = fbnVar.e().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    public static void b() {
        skw b2 = rhs.b();
        rkw rkwVar = new rkw();
        b2.f.f(rkwVar);
        b2.g.f(rkwVar);
        c.evictAll();
    }

    public static synchronized ym8 c() {
        ym8 b2;
        synchronized (mcr0.class) {
            try {
                try {
                    if (a == null) {
                        Field declaredField = skw.class.getDeclaredField("c");
                        a = declaredField;
                        declaredField.setAccessible(true);
                    }
                    b2 = ((fbn) ((yhn0) a.get(rhs.b())).get()).b();
                } catch (Exception unused) {
                    throw new RuntimeException("Can not find mMainBufferedDiskCache field");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    public static io.reactivex.rxjava3.core.q d(final int i2, final int i3, final int i4, final Uri uri, @Nullable final liw liwVar, @Nullable final ktc0 ktc0Var, @Nullable final s0v0 s0v0Var, final boolean z, final boolean z2) {
        return uri == null ? io.reactivex.rxjava3.core.q.H(new NullPointerException("uri is null")) : new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0() { // from class: xsna.ecr0
            @Override // io.reactivex.rxjava3.core.a0
            public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                ae a2;
                nb7 nb7Var;
                boolean z3 = z;
                Uri uri2 = uri;
                int i5 = i4;
                int i6 = i2;
                int i7 = i3;
                ktc0 ktc0Var2 = ktc0Var;
                boolean z4 = z2;
                liw liwVar2 = liwVar;
                s0v0 s0v0Var2 = s0v0Var;
                if (!z3 && (nb7Var = mcr0.c.get(uri2.toString())) != null) {
                    Bitmap bitmap = nb7Var.a;
                    if (!bitmap.isRecycled()) {
                        if (yVar.h()) {
                            return;
                        }
                        yVar.onSuccess(bitmap);
                        return;
                    }
                }
                if ("vkchatphoto".equals(uri2.getScheme())) {
                    a2 = dr5.l(uri2);
                } else {
                    ImageRequestBuilder h2 = ImageRequestBuilder.h(uri2);
                    if (i5 == 94848) {
                        h2.e = eng0.c;
                    } else {
                        h2.e = new eng0(i5, false);
                    }
                    if (i6 > 0 && i7 > 0) {
                        h2.d = new x9g0(i6, i7);
                    }
                    if (ktc0Var2 != null) {
                        h2.k = ktc0Var2;
                    }
                    if (z4) {
                        h2.g = ImageRequest.CacheChoice.SMALL;
                    }
                    if (liwVar2 != null) {
                        h2.f = liwVar2;
                    }
                    a2 = rhs.b().a(h2.a(), null, null, null, null);
                }
                if (a2 == null) {
                    if (yVar.h()) {
                        return;
                    }
                    yVar.onError(new NullPointerException("dataSource is null"));
                    return;
                }
                if (s0v0Var2 != null) {
                    synchronized (s0v0Var2) {
                        if (s0v0Var2.c) {
                            a2.close();
                        } else {
                            s0v0Var2.b = a2;
                        }
                    }
                    yVar.a(s0v0Var2);
                }
                a2.d(new ocr0(yVar, z3, uri2), ac9.b);
            }
        }).w();
    }

    public static io.reactivex.rxjava3.core.q e(long j2, Uri uri) {
        return j2 < 0 ? h(uri) : i(uri, 0, 0, 0, bis.a(), null).y0(j2, TimeUnit.MILLISECONDS);
    }

    public static io.reactivex.rxjava3.core.q f(long j2, String str) {
        return str == null ? io.reactivex.rxjava3.core.q.H(new NullPointerException("url is null")) : e(j2, Uri.parse(str));
    }

    public static io.reactivex.rxjava3.core.q g(Resources resources, int i2) {
        return h(er.a("android.resource").authority(resources.getResourcePackageName(i2)).appendPath(resources.getResourceTypeName(i2)).appendPath(resources.getResourceEntryName(i2)).build());
    }

    public static io.reactivex.rxjava3.core.q<Bitmap> h(Uri uri) {
        return i(uri, 0, 0, 0, null, null);
    }

    public static io.reactivex.rxjava3.core.q i(Uri uri, int i2, int i3, int i4, @Nullable s0v0 s0v0Var, @Nullable ktc0 ktc0Var) {
        return d(i2, i3, i4, uri, null, ktc0Var, s0v0Var, false, false);
    }

    public static io.reactivex.rxjava3.core.q<Bitmap> j(Uri uri, ImageScreenSize imageScreenSize) {
        return i(uri, imageScreenSize.h(), imageScreenSize.h(), 94848, null, null);
    }

    public static Bitmap k(String str) {
        if (str == null) {
            return null;
        }
        nb7 nb7Var = c.get(str);
        if (nb7Var != null && !nb7Var.a().isRecycled()) {
            return nb7Var.a();
        }
        Uri b2 = qar0.g().b(Uri.parse(str));
        if (rhs.b().c(b2)) {
            return (Bitmap) itg0.e(h(b2));
        }
        return null;
    }

    public static io.reactivex.rxjava3.core.q l(long j2, String str) {
        return str == null ? io.reactivex.rxjava3.core.q.H(new IllegalAccessException("url can't be null")) : e(j2, Uri.parse(str)).U(new uul0(2));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.j1 m(final int i2, long j2, String str) {
        return f(j2, str).U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.icr0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return fkw.c(i2, (Bitmap) obj);
            }
        });
    }

    public static boolean n(String str) {
        if (str == null) {
            return false;
        }
        if (p(str)) {
            return true;
        }
        bpn0 bpn0Var = i0q0.a;
        return rhs.b().d(qar0.g().b(Uri.parse(str)));
    }

    public static boolean o(String str) {
        if (str == null) {
            return false;
        }
        return c.get(str) != null || rhs.b().f(qar0.g().b(Uri.parse(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (xsna.rhs.b().c(r1) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(String str) {
        try {
            Trace.beginSection("VKImageLoader.isInMemoryCache");
            boolean z = false;
            if (str == null) {
                return false;
            }
            Uri b2 = qar0.g().b(Uri.parse(str));
            if (c.get(str) == null) {
            }
            z = true;
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Nullable
    public static File q(Uri uri) {
        ReentrantLock reentrantLock = f;
        if (X3.i.b.equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        io.reactivex.rxjava3.internal.operators.completable.v vVar = new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new mh40(new u0n(uri, 4), 18)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.g);
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
        vVar.subscribe(dVar);
        dVar.b();
        ww8 d2 = qar0.g().d(ImageRequest.a(uri), null);
        m900<ww8, b> m900Var = d;
        b bVar = m900Var.get(d2);
        reentrantLock.lock();
        if (bVar != null) {
            try {
                if (m900Var.get(d2) != b.WRITE_SUCCESS && m900Var.get(d2) != b.WRITE_EXCEPTION && m900Var.get(d2) != b.HIT) {
                    g.await(5L, TimeUnit.SECONDS);
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
        x7r x7rVar = (x7r) wkw.f().d.get().c().e(d2);
        if (x7rVar == null) {
            x7rVar = (x7r) wkw.f().d.get().a().e(d2);
        }
        if (x7rVar != null) {
            return x7rVar.a();
        }
        return null;
    }

    public static io.reactivex.rxjava3.core.a r(Uri uri, ImageScreenSize imageScreenSize, ktc0 ktc0Var) {
        if (uri == null) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        int h2 = imageScreenSize != null ? imageScreenSize.h() : 0;
        ImageRequestBuilder h3 = ImageRequestBuilder.h(uri);
        if (ktc0Var != null) {
            h3.k(ktc0Var);
        }
        int i2 = VKImageView.l;
        h3.n(eng0.c);
        if (h2 != 0) {
            h3.m(new x9g0(h2, h2));
        }
        return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new mh40(new slf(h3, 3), 18)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.g);
    }

    public static io.reactivex.rxjava3.core.a s(String str) {
        return str != null ? r(Uri.parse(str), null, null) : io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    public static void t(Uri uri) {
        try {
            wkw.f().d.get().c().d(qar0.g().d(ImageRequest.a(uri), null));
        } catch (Exception e2) {
            L.l("error: remove from cache " + e2);
        }
    }

    public static boolean u(Uri uri) {
        if (uri == null || "data".equals(uri.getScheme())) {
            return false;
        }
        if ("1".equals(uri.getQueryParameter("ava"))) {
            return true;
        }
        String path = uri.getPath();
        return path != null && path.startsWith("/sticker/");
    }
}
