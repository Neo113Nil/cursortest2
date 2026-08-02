package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.d;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import xsna.evk;
import xsna.ynk;

/* compiled from: OfflineHlsDownloader.java */
/* loaded from: classes3.dex */
public final class fu70 extends ynk<o9v> {
    public final String k;
    public final String l;
    public final t9v m;

    /* compiled from: OfflineHlsDownloader.java */
    public static class a implements d.a {
        public final String b;
        public final t9v c;
        public final d.a d;
        public float e;

        public a(String str, t9v t9vVar, @Nullable d.a aVar) {
            this.b = str;
            this.c = t9vVar;
            this.d = aVar;
        }

        @Override // androidx.media3.exoplayer.offline.d.a
        public final void b(long j, long j2, float f) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.e < f) {
                        this.e = f;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.c.c(this.b, f, j2);
            }
            d.a aVar = this.d;
            if (aVar != null) {
                aVar.b(j, j2, f);
            }
        }
    }

    public fu70(DownloadRequest downloadRequest, a.b bVar, ExecutorService executorService, sg40 sg40Var) {
        super(downloadRequest.d(), new HlsPlaylistParser(), bVar, executorService);
        String str = new String(downloadRequest.h, StandardCharsets.UTF_8);
        this.k = str;
        this.l = downloadRequest.b;
        Map map = Collections.EMPTY_MAP;
        Uri uri = downloadRequest.c;
        fxc0.t(uri, "The uri must be set.");
        this.a = new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, str);
        this.m = sg40Var;
    }

    public static void i(androidx.media3.exoplayer.hls.playlist.b bVar, b.e eVar, HashSet hashSet, ArrayList arrayList) {
        String str = bVar.a;
        long j = bVar.h + eVar.f;
        String str2 = eVar.h;
        if (str2 != null) {
            Uri d = neq0.d(str, str2);
            if (hashSet.add(d)) {
                arrayList.add(new ynk.b(j, ynk.c(d)));
            }
        }
        arrayList.add(new ynk.b(j, new evk(neq0.d(str, eVar.b), eVar.j, eVar.k, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01bc A[LOOP:1: B:39:0x01b4->B:41:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d5 A[LOOP:2: B:44:0x01d3->B:45:0x01d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ea  */
    @Override // androidx.media3.exoplayer.offline.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@Nullable d.a aVar) throws IOException, InterruptedException {
        int i;
        int size;
        PriorityTaskManager priorityTaskManager;
        androidx.media3.datasource.cache.a b;
        byte[] bArr;
        a aVar2;
        a aVar3 = new a(this.l, this.m, aVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager2 = this.g;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.a(-4000);
        }
        boolean z = true;
        try {
            androidx.media3.datasource.cache.a b2 = this.d.b();
            uer d = d(b2, this.a, false);
            if (!this.c.isEmpty()) {
                d = (uer) d.copy(this.c);
            }
            List e = e(b2, d, false);
            Collections.sort(e);
            ynk.f((ArrayList) e, this.f);
            ArrayList arrayList = (ArrayList) e;
            int size2 = arrayList.size();
            int size3 = arrayList.size() - 1;
            long j = 0;
            long j2 = 0;
            int i2 = 0;
            while (size3 >= 0) {
                try {
                    evk evkVar = ((ynk.b) arrayList.get(size3)).c;
                    String k = this.f.k(evkVar);
                    boolean z2 = z;
                    long j3 = j2;
                    long j4 = evkVar.h;
                    if (j4 == -1) {
                        aVar2 = aVar3;
                        long j5 = this.e.getContentMetadata(k).get("exo_len");
                        if (j5 != -1) {
                            j4 = j5 - evkVar.g;
                        }
                    } else {
                        aVar2 = aVar3;
                    }
                    long j6 = j4;
                    long b3 = this.e.b(evkVar.g, j6, k);
                    long j7 = j3 + b3;
                    if (j6 != -1) {
                        if (j6 == b3) {
                            i2++;
                            arrayList.remove(size3);
                        }
                        if (j != -1) {
                            j += j6;
                        }
                    } else {
                        j = -1;
                    }
                    size3--;
                    j2 = j7;
                    z = z2;
                    aVar3 = aVar2;
                } catch (Throwable th) {
                    th = th;
                    for (i = 0; i < this.i.size(); i++) {
                        this.i.get(i).cancel(true);
                    }
                    for (size = this.i.size() - 1; size >= 0; size--) {
                        this.i.get(size).a();
                        g(size);
                    }
                    priorityTaskManager = this.g;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.d(-4000);
                    }
                    throw th;
                }
            }
            boolean z3 = z;
            ynk.a aVar4 = new ynk.a(aVar3, j, size2, j2, i2);
            arrayDeque.addAll(e);
            while (!this.j && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager3 = this.g;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.b();
                }
                if (arrayDeque2.isEmpty()) {
                    b = this.d.b();
                    bArr = new byte[131072];
                } else {
                    ynk.c cVar = (ynk.c) arrayDeque2.removeFirst();
                    b = cVar.j;
                    bArr = cVar.l;
                }
                ynk.c cVar2 = new ynk.c((ynk.b) arrayDeque.removeFirst(), b, aVar4, bArr);
                b(cVar2);
                this.h.execute(cVar2);
                for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                    ynk.c cVar3 = (ynk.c) this.i.get(size4);
                    if (arrayDeque.isEmpty() || cVar3.c.e()) {
                        try {
                            cVar3.get();
                            g(size4);
                            arrayDeque2.addLast(cVar3);
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(cVar3.i);
                            g(size4);
                            arrayDeque2.addLast(cVar3);
                        }
                    }
                }
                cVar2.b.b();
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                this.i.get(i3).cancel(z3);
            }
            for (int size5 = this.i.size() - (z3 ? 1 : 0); size5 >= 0; size5--) {
                this.i.get(size5).a();
                g(size5);
            }
            PriorityTaskManager priorityTaskManager4 = this.g;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.d(-4000);
            }
        } catch (Throwable th2) {
            th = th2;
            while (i < this.i.size()) {
            }
            while (size >= 0) {
            }
            priorityTaskManager = this.g;
            if (priorityTaskManager != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ynk
    public final List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        o9v o9vVar = (o9v) uerVar;
        ArrayList arrayList = new ArrayList();
        boolean z2 = o9vVar instanceof androidx.media3.exoplayer.hls.playlist.c;
        String str = this.k;
        if (z2) {
            List<Uri> list = ((androidx.media3.exoplayer.hls.playlist.c) o9vVar).d;
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    evk.a a2 = ynk.c(list.get(i)).a();
                    a2.j = str;
                    arrayList.add(a2.a());
                } else {
                    arrayList.add(ynk.c(list.get(i)));
                }
            }
        } else {
            evk.a a3 = ynk.c(Uri.parse(o9vVar.a)).a();
            a3.j = str;
            arrayList.add(a3.a());
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            evk evkVar = (evk) it.next();
            arrayList2.add(new ynk.b(0L, evkVar));
            try {
                androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) d(aVar, evkVar, z);
                if (!z) {
                    this.m.b(this.l, str, bVar.a);
                }
                ImmutableList immutableList = bVar.r;
                b.e eVar = null;
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    b.e eVar2 = (b.e) immutableList.get(i2);
                    b.e eVar3 = eVar2.c;
                    if (eVar3 != null && eVar3 != eVar) {
                        i(bVar, eVar3, hashSet, arrayList2);
                        eVar = eVar3;
                    }
                    i(bVar, eVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
