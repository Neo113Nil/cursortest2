package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.d;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import xsna.kr10;

/* compiled from: FixProgressiveDownloader.java */
/* loaded from: classes3.dex */
public final class pmr implements androidx.media3.exoplayer.offline.d {
    public final evk a;
    public final androidx.media3.datasource.cache.a b;
    public final dy8 c;

    @Nullable
    public final PriorityTaskManager d;

    @Nullable
    public d.a e;
    public volatile bsg0<Void, IOException> f;
    public volatile boolean g;

    /* compiled from: FixProgressiveDownloader.java */
    public class a extends bsg0<Void, IOException> {
        public a() {
        }

        @Override // xsna.bsg0
        public final void b() {
            pmr.this.c.j = true;
        }

        @Override // xsna.bsg0
        public final Void c() throws Exception {
            pmr.this.c.a();
            return null;
        }
    }

    /* compiled from: FixProgressiveDownloader.java */
    public class b extends bsg0<Void, IOException> {
        public b() {
        }

        @Override // xsna.bsg0
        public final void b() {
            pmr.this.c.j = true;
        }

        @Override // xsna.bsg0
        public final Void c() throws Exception {
            pmr.this.c.a();
            return null;
        }
    }

    public pmr(kr10 kr10Var, a.b bVar) {
        kr10.f fVar = kr10Var.b;
        fVar.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = fVar.a;
        String str = fVar.d;
        fxc0.t(uri, "The uri must be set.");
        evk evkVar = new evk(uri, 0L, 1, null, map, 0L, -1L, str, 4, null);
        this.a = evkVar;
        androidx.media3.datasource.cache.a b2 = bVar.b();
        this.b = b2;
        this.c = new dy8(b2, evkVar, null, new k7(this, 18));
        this.d = bVar.f;
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void a(@Nullable d.a aVar) throws IOException, InterruptedException {
        this.e = aVar;
        this.f = new a();
        PriorityTaskManager priorityTaskManager = this.d;
        if (priorityTaskManager != null) {
            priorityTaskManager.a(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                PriorityTaskManager priorityTaskManager2 = this.d;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.b();
                }
                this.f.run();
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = y2r0.a;
                        throw cause;
                    }
                    this.f = new b();
                }
            } catch (Throwable th) {
                this.f.a();
                PriorityTaskManager priorityTaskManager3 = this.d;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.d(-4000);
                }
                throw th;
            }
        }
        this.f.a();
        PriorityTaskManager priorityTaskManager4 = this.d;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.d(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void cancel() {
        this.g = true;
        bsg0<Void, IOException> bsg0Var = this.f;
        if (bsg0Var != null) {
            bsg0Var.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void remove() {
        androidx.media3.datasource.cache.a aVar = this.b;
        aVar.a.c(aVar.e.k(this.a));
    }
}
