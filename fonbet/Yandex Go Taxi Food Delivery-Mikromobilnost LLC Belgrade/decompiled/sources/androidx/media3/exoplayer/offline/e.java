package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.scheduler.Requirements;
import defpackage.j7m;
import defpackage.l7m;
import defpackage.tw21;
import defpackage.u6m;
import defpackage.v8e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.video.m3.offline.ExoDownloaderFactory;
import ru.yandex.video.m3.player.impl.offline.ExoWritableDownloadIndex;

/* loaded from: classes10.dex */
public final class e {
    public static final Requirements o = new Requirements(1);
    public final Context a;
    public final DownloadManager$InternalHandler b;
    public final v8e c;
    public int e;
    public int f;
    public boolean g;
    public int k;
    public boolean l;
    public androidx.media3.exoplayer.scheduler.b n;
    public int i = 3;
    public int j = 5;
    public boolean h = true;
    public List m = Collections.EMPTY_LIST;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public e(Context context, ExoWritableDownloadIndex exoWritableDownloadIndex, ExoDownloaderFactory exoDownloaderFactory) {
        this.a = context.getApplicationContext();
        Handler o2 = tw21.o(new j7m(0, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        DownloadManager$InternalHandler downloadManager$InternalHandler = new DownloadManager$InternalHandler(handlerThread, exoWritableDownloadIndex, exoDownloaderFactory, o2, this.i, this.j, this.h);
        this.b = downloadManager$InternalHandler;
        v8e v8eVar = new v8e(25, this);
        this.c = v8eVar;
        androidx.media3.exoplayer.scheduler.b bVar = new androidx.media3.exoplayer.scheduler.b(context, v8eVar, o);
        this.n = bVar;
        int b = bVar.b();
        this.k = b;
        this.e = 1;
        downloadManager$InternalHandler.obtainMessage(1, b, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((l7m) it.next()).onWaitingForRequirementsChanged(this, this.l);
        }
    }

    public final void b(androidx.media3.exoplayer.scheduler.b bVar, int i) {
        Requirements requirements = bVar.c;
        if (this.k != i) {
            this.k = i;
            this.e++;
            this.b.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean d = d();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((l7m) it.next()).onRequirementsStateChanged(this, requirements, i);
        }
        if (d) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        this.e++;
        this.b.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean d = d();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((l7m) it.next()).onDownloadsPausedChanged(this, z);
        }
        if (d) {
            a();
        }
    }

    public final boolean d() {
        boolean z;
        if (!this.h && this.k != 0) {
            for (int i = 0; i < this.m.size(); i++) {
                if (((u6m) this.m.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.l != z;
        this.l = z;
        return z2;
    }
}
