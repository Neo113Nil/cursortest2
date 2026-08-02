package xsna;

import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.d;
import java.util.concurrent.CancellationException;
import xsna.dy8;

/* compiled from: ImagesDownloader.kt */
/* loaded from: classes3.dex */
public final class onw implements androidx.media3.exoplayer.offline.d {
    public final a.b a;
    public final zos b;
    public volatile boolean c;
    public volatile dy8 d;
    public final evk e;

    /* compiled from: ImagesDownloader.kt */
    public static final class a implements dy8.a {
        public long b;
        public long c;
        public final d.a d;

        public a(long j, long j2, d.a aVar) {
            this.b = j;
            this.c = j2;
            this.d = aVar;
        }

        @Override // xsna.dy8.a
        public final void a(long j, long j2, long j3) {
            long j4 = this.b;
            long j5 = j < j4 ? j4 : j;
            this.b = j5;
            long j6 = this.c + j3;
            this.c = j6;
            d.a aVar = this.d;
            if (aVar != null) {
                aVar.b(j5, j6, (j5 == -1 || j5 == 0) ? -1.0f : (j6 * 100.0f) / j5);
            }
        }
    }

    public onw(DownloadRequest downloadRequest, a.b bVar, zos zosVar) {
        this.a = bVar;
        this.b = zosVar;
        this.e = new evk(downloadRequest.c);
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void a(d.a aVar) {
        if (this.c) {
            throw new CancellationException();
        }
        dy8 dy8Var = this.d;
        if (dy8Var != null) {
            dy8Var.j = true;
        }
        androidx.media3.datasource.cache.a b = this.a.b();
        String k = b.e.k(this.e);
        long j = this.e.h;
        if (j == -1) {
            long j2 = b.a.getContentMetadata(k).get("exo_len");
            if (j2 != -1) {
                j = j2 - this.e.g;
            }
        }
        long j3 = j;
        long b2 = b.a.b(this.e.g, j3, k);
        dy8 dy8Var2 = new dy8(b, this.e, new byte[8192], new a(j3, b2, aVar));
        this.d = dy8Var2;
        dy8Var2.a();
        this.b.invoke(this.e.a);
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void cancel() {
        this.c = true;
        dy8 dy8Var = this.d;
        if (dy8Var != null) {
            dy8Var.j = true;
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void remove() {
        if (this.c) {
            throw new CancellationException();
        }
        a.b bVar = this.a;
        androidx.media3.datasource.cache.a c = bVar.c(null, bVar.h | 1, -4000);
        try {
            c.a.c(this.a.c.k(this.e));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        }
    }
}
