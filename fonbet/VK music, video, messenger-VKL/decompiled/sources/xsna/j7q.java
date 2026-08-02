package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.g;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.collect.ImmutableList;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.d;
import xsna.b9o;
import xsna.grt0;
import xsna.ux70;

/* compiled from: ExoVideoCache.kt */
/* loaded from: classes.dex */
public final class j7q {
    public final Context a;
    public final File b;
    public final long c;
    public final boolean d;
    public final long e;
    public final swk f;
    public final wzs<DownloadRequest, a.b, androidx.media3.exoplayer.offline.d> g;
    public final yw8 h;
    public final long i;
    public final HashSet<String> j;
    public final b k;
    public androidx.media3.exoplayer.offline.a l;
    public volatile androidx.media3.datasource.cache.c m;
    public volatile b9o n;
    public boolean o;
    public a.b p;
    public final Set<String> q;

    /* compiled from: ExoVideoCache.kt */
    /* loaded from: classes3.dex */
    public final class a implements b9o.c {
        public a() {
        }

        @Override // xsna.b9o.c
        public final void a(b9o b9oVar, n7o n7oVar) {
            int i;
            j7q j7qVar = j7q.this;
            long j = n7oVar.e;
            int i2 = n7oVar.b;
            DownloadRequest downloadRequest = n7oVar.a;
            Uri uri = downloadRequest.c;
            androidx.media3.exoplayer.offline.a aVar = null;
            String uri2 = uri != null ? uri.toString() : null;
            String str = downloadRequest.b;
            if (i2 == 0) {
                L.e("Download Manager queued with key=".concat(str));
            } else if (i2 == 2) {
                L.e("Download Manager downloading with key=".concat(str));
                List<l7s0> list = j7qVar.k.a.get(str);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((l7s0) it.next()).a(n7oVar.h.b);
                    }
                }
            } else if (i2 == 3) {
                L.e("Download Manager completed with key=".concat(str));
                HashMap<String, List<l7s0>> hashMap = j7qVar.k.a;
                List<l7s0> list2 = hashMap.get(str);
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((l7s0) it2.next()).b(uri2, uri2);
                    }
                }
                hashMap.remove(str);
            } else if (i2 == 4) {
                L.G("Download Manager failed with key=".concat(str));
                HashMap<String, List<l7s0>> hashMap2 = j7qVar.k.a;
                List<l7s0> list3 = hashMap2.get(str);
                if (list3 != null) {
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((l7s0) it3.next()).d();
                    }
                }
                hashMap2.remove(str);
            } else if (i2 != 5) {
                L.e(uqi.a("Download Manager state ", i2, ' '));
            } else {
                L.e("Download Manager removing with key=".concat(str));
            }
            if ((n7oVar.g == 0) != (i2 != 4)) {
                try {
                    androidx.media3.exoplayer.offline.a aVar2 = j7qVar.l;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    aVar.a(str);
                } catch (Throwable unused) {
                    L.G("cant remove download ".concat(str));
                }
            }
            if (j7qVar.d || (i = n7oVar.b) == 3 || i == 4 || j == j7qVar.i || j7qVar.c().getCacheSpace() + j <= j7qVar.c) {
                return;
            }
            j7qVar.o = false;
            asu0.a.getClass();
            asu0.n().execute(new wm8(b9oVar, this, n7oVar, 2));
        }

        @Override // xsna.b9o.c
        public final void b() {
            b9o b9oVar = j7q.this.n;
            if (b9oVar != null) {
                if (!b9oVar.f) {
                    b9oVar = null;
                }
                if (b9oVar != null) {
                    b9oVar.d();
                    e9o.a.getClass();
                    f18 f18Var = e9o.c;
                    qcy<Object> qcyVar = e9o.b[0];
                    f18Var.b(false);
                }
            }
            onReleased();
            e9o.a.getClass();
            f18 f18Var2 = e9o.c;
            qcy<Object> qcyVar2 = e9o.b[0];
            f18Var2.b(false);
        }

        public final void c(List<String> list) {
            Iterator it = ((ArrayList) j5g.V(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                j7q j7qVar = j7q.this;
                b9o e = j7qVar.e();
                if (e != null) {
                    e.e(str);
                }
                Iterator<T> it2 = j7qVar.c().getCachedSpans(str).iterator();
                while (it2.hasNext()) {
                    j7qVar.c().p((qx8) it2.next());
                }
            }
        }

        @Override // xsna.b9o.c
        public final void onInitialized() {
            L.e("Download Manager initialized");
        }

        @Override // xsna.b9o.c
        public final void onReleased() {
            asu0.a.getClass();
            asu0.n().execute(new oo6(j7q.this, 3));
        }
    }

    /* compiled from: ExoVideoCache.kt */
    public static final class b {
        public final HashMap<String, List<l7s0>> a = new HashMap<>();
    }

    public j7q() {
        throw null;
    }

    public j7q(Context context, File file, long j, boolean z, long j2, swk swkVar, nnf nnfVar, yw8 yw8Var, int i) {
        j2 = (i & 16) != 0 ? 0L : j2;
        swkVar = (i & 32) != 0 ? new fsu0(context.getApplicationContext(), "exoplayer_internal.db", null, 1) : swkVar;
        nnfVar = (i & 64) != 0 ? null : nnfVar;
        yw8Var = (i & 128) != 0 ? new t7s0() : yw8Var;
        this.a = context;
        this.b = file;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = swkVar;
        this.g = nnfVar;
        this.h = yw8Var;
        this.i = -1L;
        this.j = izi0.d("uid", "exi");
        this.k = new b();
        this.o = true;
        this.q = tj0.c();
    }

    public final void a(String str, l7s0 l7s0Var) {
        if (l7s0Var != null) {
            HashMap<String, List<l7s0>> hashMap = this.k.a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            List<l7s0> list = hashMap.get(str);
            if (list != null) {
                list.add(l7s0Var);
            }
        }
    }

    public final void b() {
        this.q.clear();
        synchronized (this) {
            b9o b9oVar = this.n;
            if (b9oVar != null) {
                b9oVar.d();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final androidx.media3.datasource.cache.c c() {
        if (this.m == null) {
            synchronized (this) {
                try {
                    if (this.m == null) {
                        this.m = new androidx.media3.datasource.cache.c(this.b, this.d ? new dzy(this.c) : new g370(), this.f, false);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.m;
    }

    public final a.InterfaceC0045a d() {
        if (this.p == null) {
            c.a aVar = new c.a(this.a, new ux70.a(new d.a() { // from class: xsna.h7q
                @Override // okhttp3.d.a
                public final okhttp3.d a(okhttp3.p pVar) {
                    o260 o260Var = d260.a;
                    if (o260Var == null) {
                        o260Var = null;
                    }
                    return o260Var.b(NetworkClient.ClientType.CLIENT_PLAYER).a(pVar);
                }
            }));
            CacheDataSink.a aVar2 = new CacheDataSink.a();
            aVar2.a(c());
            a.b bVar = new a.b();
            bVar.a = c();
            bVar.e = aVar;
            bVar.d(aVar2);
            bVar.c = this.h;
            this.p = bVar;
        }
        return this.p;
    }

    public final b9o e() {
        if (this.n == null && e9o.a.a()) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        this.n = g();
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.n;
    }

    public final void f(final String str, final grt0.b bVar, final String str2) {
        if (this.o || !this.q.isEmpty() || h(this.b)) {
            asu0.a.getClass();
            asu0.q().execute(new Runnable() { // from class: xsna.g7q
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v4 */
                @Override // java.lang.Runnable
                public final void run() {
                    ?? r1;
                    DownloadRequest downloadRequest;
                    String str3;
                    File file;
                    j7q j7qVar = j7q.this;
                    String str4 = str;
                    l7s0 l7s0Var = bVar;
                    String str5 = str2;
                    String b2 = j7qVar.h.b(Uri.parse(str4));
                    if (j7qVar.i(str4)) {
                        L.e(go9.b("download is in cache key=", b2));
                        if (j7qVar.j(Uri.parse(str4))) {
                            L.e(go9.b("download is in fully cache key=", b2));
                            if (b2 == null || b2.length() == 0) {
                                str3 = str4;
                            } else {
                                qx8 qx8Var = (qx8) j5g.Z(j7qVar.c().getCachedSpans(b2));
                                str3 = (qx8Var == null || (file = qx8Var.f) == null) ? null : file.getAbsolutePath();
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (l7s0Var != null) {
                                l7s0Var.b(str4, str3);
                                return;
                            }
                            return;
                        }
                    }
                    b9o e = j7qVar.e();
                    if (e == 0) {
                        return;
                    }
                    List<n7o> list = e.k;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((n7o) it.next()).a.b);
                    }
                    if (j5g.P(arrayList, b2)) {
                        L.e(go9.b("download is already started key=", b2));
                        if (l7s0Var != null) {
                            l7s0Var.c();
                        }
                        j7qVar.a(b2, l7s0Var);
                        return;
                    }
                    List<n7o> list2 = e.k;
                    if (!list2.isEmpty()) {
                        L.e(" " + list2.size() + " downloads in progress...");
                        for (n7o n7oVar : e.k) {
                            L.e("  download in progress key=" + n7oVar.a.b + ", progress=" + n7oVar.h.b);
                        }
                        if (j7qVar.d && list2.size() > 25) {
                            List H0 = j5g.H0(j5g.D0(new k7q(0), j5g.O0(list2)), list2.size() - 10);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : H0) {
                                if (((n7o) obj).f != 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                e.e(((n7o) it2.next()).a.c.toString());
                            }
                        }
                    }
                    j7qVar.a(b2, l7s0Var);
                    Uri parse = Uri.parse(str4);
                    int J = y2r0.J(parse, str5);
                    L.e(go9.b("download add key=", b2));
                    if (J == 0 || J == 1 || J == 2) {
                        r1 = 0;
                        String q = io20.q(str5);
                        ImmutableList.b bVar2 = ImmutableList.c;
                        downloadRequest = new DownloadRequest(b2, parse, q, com.google.common.collect.g.f, null, null, null, null, null);
                    } else {
                        r1 = 0;
                        String q2 = io20.q(str5);
                        ImmutableList.b bVar3 = ImmutableList.c;
                        downloadRequest = new DownloadRequest(b2, parse, q2, com.google.common.collect.g.f, null, b2, null, null, null);
                    }
                    e.e++;
                    e.b.obtainMessage(6, r1, r1, downloadRequest).sendToTarget();
                    e.f(r1);
                }
            });
        } else if (bVar != null) {
            bVar.d();
        }
    }

    public final b9o g() {
        ux70.a aVar = new ux70.a(new d.a() { // from class: xsna.i7q
            @Override // okhttp3.d.a
            public final okhttp3.d a(okhttp3.p pVar) {
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                o260Var.getClass();
                return o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(pVar);
            }
        });
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        aVar.c = o260Var.l.a();
        aVar.d = null;
        g.a aVar2 = new g.a(aVar, new gtk());
        this.l = new androidx.media3.exoplayer.offline.a(this.f);
        a.b bVar = new a.b();
        bVar.a = c();
        bVar.e = aVar2;
        bVar.c = this.h;
        bVar.f = icd0.a();
        otl otlVar = new otl(bVar, this.g);
        a aVar3 = new a();
        try {
            Context context = this.a;
            swk swkVar = this.f;
            androidx.media3.exoplayer.offline.a aVar4 = this.l;
            if (aVar4 == null) {
                aVar4 = null;
            }
            b9o b9oVar = new b9o(context, swkVar, aVar4, otlVar);
            b9oVar.a(aVar3);
            b9oVar.g();
            return b9oVar;
        } catch (Throwable unused) {
            aVar3.b();
            return null;
        }
    }

    public final boolean h(File file) {
        if (!file.isDirectory()) {
            long currentTimeMillis = System.currentTimeMillis() - file.lastModified();
            L.e("check expired: " + (currentTimeMillis / 1000) + " sec on file " + file.getName());
            if (currentTimeMillis > this.e || currentTimeMillis < 0) {
                if (!this.j.contains(nbr.m(file))) {
                    return true;
                }
            }
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int i = 0;
            while (true) {
                if (!(i < listFiles.length)) {
                    break;
                }
                int i2 = i + 1;
                try {
                    if (h(listFiles[i])) {
                        return true;
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        }
        return false;
    }

    public final boolean i(String str) {
        if (str != null) {
            return c().isCached(this.h.b(Uri.parse(str)), 0L, 0L);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Uri uri) {
        long j;
        androidx.media3.datasource.cache.c c = c();
        String b2 = this.h.b(uri);
        evk evkVar = new evk(uri);
        long j2 = evkVar.h;
        if (j2 == -1) {
            long b3 = cij.b(c.getContentMetadata(b2));
            if (b3 == -1) {
                j = -1;
                if (j >= 0) {
                    return false;
                }
                return c.isCached(b2, 0L, j);
            }
            j2 = b3 - evkVar.f;
        }
        j = j2;
        if (j >= 0) {
        }
    }
}
