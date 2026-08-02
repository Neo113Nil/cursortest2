package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import com.vk.toggle.features.MusicFeatures;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.dy8;
import xsna.fu70;
import xsna.kr10;
import xsna.uer;

/* compiled from: CustomSegmentDownloader.java */
/* loaded from: classes3.dex */
public abstract class ynk<M extends uer<M>> implements androidx.media3.exoplayer.offline.d {
    public evk a;
    public final HlsPlaylistParser b;
    public final ArrayList<StreamKey> c;
    public final a.b d;
    public final Cache e;
    public final xw8 f;

    @Nullable
    public final PriorityTaskManager g;
    public final Executor h;
    public final ArrayList<bsg0<?, ?>> i;
    public volatile boolean j;

    /* compiled from: CustomSegmentDownloader.java */
    public static final class a implements dy8.a {
        public final fu70.a b;
        public final long c;
        public final int d;
        public final AtomicLong e;
        public final AtomicInteger f;

        public a(fu70.a aVar, long j, int i, long j2, int i2) {
            this.b = aVar;
            this.c = j;
            this.d = i;
            this.e = new AtomicLong(j2);
            this.f = new AtomicInteger(i2);
        }

        @Override // xsna.dy8.a
        public final void a(long j, long j2, long j3) {
            AtomicLong atomicLong = this.e;
            atomicLong.addAndGet(j3);
            this.b.b(this.c, atomicLong.get(), b());
        }

        public final float b() {
            long j = this.c;
            if (j != -1 && j != 0) {
                return (this.e.get() * 100.0f) / j;
            }
            int i = this.d;
            if (i != 0) {
                return (this.f.get() * 100.0f) / i;
            }
            return -1.0f;
        }
    }

    /* compiled from: CustomSegmentDownloader.java */
    public static class b implements Comparable<b> {
        public final long b;
        public final evk c;

        public b(long j, evk evkVar) {
            this.b = j;
            this.c = evkVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            long j = bVar.b;
            String str = y2r0.a;
            return Long.compare(this.b, j);
        }
    }

    /* compiled from: CustomSegmentDownloader.java */
    public static final class c extends bsg0<Void, IOException> {
        public final b i;
        public final androidx.media3.datasource.cache.a j;

        @Nullable
        public final a k;
        public final byte[] l;
        public final dy8 m;
        public long n = 0;

        /* compiled from: CustomSegmentDownloader.java */
        public class a implements dy8.a {
            public final /* synthetic */ a b;

            public a(a aVar) {
                this.b = aVar;
            }

            @Override // xsna.dy8.a
            public final void a(long j, long j2, long j3) {
                c.this.n += j3;
                this.b.a(j, j2, j3);
            }
        }

        public c(b bVar, androidx.media3.datasource.cache.a aVar, @Nullable a aVar2, byte[] bArr) {
            this.i = bVar;
            this.j = aVar;
            this.k = aVar2;
            this.l = bArr;
            this.m = new dy8(aVar, bVar.c, bArr, aVar2 == null ? null : new a(aVar2));
        }

        @Override // xsna.bsg0
        public final void b() {
            this.m.j = true;
        }

        @Override // xsna.bsg0
        public final Void c() throws Exception {
            a aVar = this.k;
            try {
                this.m.a();
                if (aVar == null) {
                    return null;
                }
                aVar.f.incrementAndGet();
                aVar.b.b(aVar.c, aVar.e.get(), aVar.b());
                return null;
            } catch (IOException e) {
                if (aVar != null) {
                    long j = this.n;
                    AtomicLong atomicLong = aVar.e;
                    if (com.vk.toggle.b.A.a(MusicFeatures.NO_MEMORY_DOWNLOAD_FIX)) {
                        atomicLong.addAndGet(-j);
                        aVar.b.b(aVar.c, atomicLong.get(), aVar.b());
                    }
                }
                throw e;
            }
        }
    }

    public ynk(kr10 kr10Var, HlsPlaylistParser hlsPlaylistParser, a.b bVar, Executor executor) {
        kr10.f fVar = kr10Var.c;
        fVar.getClass();
        this.a = c(fVar.a);
        this.b = hlsPlaylistParser;
        this.c = new ArrayList<>(fVar.c);
        this.d = bVar;
        this.h = executor;
        Cache cache = bVar.a;
        cache.getClass();
        this.e = cache;
        this.f = bVar.c;
        this.g = bVar.f;
        this.i = new ArrayList<>();
    }

    public static evk c(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        fxc0.t(uri, "The uri must be set.");
        return new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    public static void f(ArrayList arrayList, xw8 xw8Var) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            b bVar = (b) arrayList.get(i2);
            evk evkVar = bVar.c;
            String k = xw8Var.k(evkVar);
            Integer num = (Integer) hashMap.get(k);
            b bVar2 = num == null ? null : (b) arrayList.get(num.intValue());
            if (bVar2 != null) {
                long j = bVar2.b;
                evk evkVar2 = bVar2.c;
                if (bVar.b <= 20000000 + j) {
                    Uri uri = evkVar2.a;
                    long j2 = evkVar2.h;
                    if (uri.equals(evkVar.a)) {
                        if (j2 != -1 && evkVar2.g + j2 == evkVar.g) {
                            String str = evkVar2.i;
                            String str2 = evkVar.i;
                            String str3 = y2r0.a;
                            if (Objects.equals(str, str2) && evkVar2.j == evkVar.j && evkVar2.c == evkVar.c && evkVar2.e.equals(evkVar.e)) {
                                long j3 = evkVar.h;
                                evk e = evkVar2.e(0L, j3 != -1 ? j2 + j3 : -1L);
                                num.getClass();
                                arrayList.set(num.intValue(), new b(j, e));
                            }
                        }
                    }
                }
            }
            hashMap.put(k, Integer.valueOf(i));
            arrayList.set(i, bVar);
            i++;
        }
        y2r0.a0(arrayList, i, arrayList.size());
    }

    public final <T> void b(bsg0<T, ?> bsg0Var) throws InterruptedException {
        synchronized (this.i) {
            try {
                if (this.j) {
                    throw new InterruptedException();
                }
                this.i.add(bsg0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void cancel() {
        synchronized (this.i) {
            try {
                this.j = true;
                for (int i = 0; i < this.i.size(); i++) {
                    this.i.get(i).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:28|29|30|(1:32)(3:33|34|(2:36|37)(2:38|39))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        r3 = r2.getCause();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if ((r3 instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        if ((r3 instanceof java.io.IOException) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        throw ((java.io.IOException) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r3 = xsna.y2r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0041, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        r0.a();
        h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uer d(androidx.media3.datasource.cache.a aVar, evk evkVar, boolean z) throws InterruptedException, IOException {
        uer<Object> uerVar;
        xnk xnkVar = new xnk(this, aVar, evkVar);
        if (!z) {
            while (!this.j) {
                PriorityTaskManager priorityTaskManager = this.g;
                if (priorityTaskManager != null) {
                    priorityTaskManager.b();
                }
                b(xnkVar);
                this.h.execute(xnkVar);
                uerVar = xnkVar.get();
            }
            throw new InterruptedException();
        }
        xnkVar.run();
        try {
            uerVar = xnkVar.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            String str = y2r0.a;
            throw e;
        }
        return uerVar;
    }

    public abstract List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException;

    public final void g(int i) {
        synchronized (this.i) {
            this.i.remove(i);
        }
    }

    public final void h(xnk xnkVar) {
        synchronized (this.i) {
            this.i.remove(xnkVar);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void remove() {
        xw8 xw8Var = this.f;
        Cache cache = this.e;
        a.b bVar = this.d;
        androidx.media3.datasource.cache.a c2 = bVar.c(null, bVar.h | 1, -4000);
        try {
            try {
                List e = e(c2, d(c2, this.a, true), true);
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) e;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    cache.c(xw8Var.k(((b) arrayList.get(i)).c));
                    i++;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            cache.c(xw8Var.k(this.a));
        }
    }
}
