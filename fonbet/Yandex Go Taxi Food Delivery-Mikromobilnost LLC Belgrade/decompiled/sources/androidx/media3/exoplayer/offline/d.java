package androidx.media3.exoplayer.offline;

import defpackage.n7m;
import defpackage.t7m;
import defpackage.u7m;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class d extends Thread implements t7m {
    public Exception A;
    public long B = -1;
    public final DownloadRequest a;
    public final u7m b;
    public final n7m c;
    public final boolean w;
    public final int x;
    public volatile DownloadManager$InternalHandler y;
    public volatile boolean z;

    public d(DownloadRequest downloadRequest, u7m u7mVar, n7m n7mVar, boolean z, int i, DownloadManager$InternalHandler downloadManager$InternalHandler) {
        this.a = downloadRequest;
        this.b = u7mVar;
        this.c = n7mVar;
        this.w = z;
        this.x = i;
        this.y = downloadManager$InternalHandler;
    }

    public final void a(boolean z) {
        if (z) {
            this.y = null;
        }
        if (this.z) {
            return;
        }
        this.z = true;
        this.b.cancel();
        interrupt();
    }

    @Override // defpackage.t7m
    public final void b(long j, float f, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.B) {
            this.B = j;
            DownloadManager$InternalHandler downloadManager$InternalHandler = this.y;
            if (downloadManager$InternalHandler != null) {
                downloadManager$InternalHandler.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.w) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.z) {
                    try {
                        this.b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.z) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.x) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.A = e2;
        }
        DownloadManager$InternalHandler downloadManager$InternalHandler = this.y;
        if (downloadManager$InternalHandler != null) {
            downloadManager$InternalHandler.obtainMessage(10, this).sendToTarget();
        }
    }
}
