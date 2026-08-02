package xsna;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import one.video.player.OneVideoPlayer;
import xsna.uuv0;

/* compiled from: VkTransferListener.kt */
/* loaded from: classes3.dex */
public final class uuv0 implements one.video.player.g {
    public final Executor a;
    public long e;
    public long f;
    public long g;
    public long h;
    public long j;
    public long k;
    public int l;
    public final HashSet<a> b = new HashSet<>();
    public final ypn0 c = dvf.a;
    public final AtomicInteger d = new AtomicInteger(0);
    public final b2k0 i = new b2k0(2000);
    public final AtomicInteger m = new AtomicInteger(0);

    /* compiled from: VkTransferListener.kt */
    public interface a {
        void a(long j);

        void b(int i);
    }

    public uuv0(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final synchronized void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
        if (z) {
            try {
                final int addAndGet = this.m.addAndGet(i);
                if (addAndGet >= 50000) {
                    Iterator<a> it = this.b.iterator();
                    while (it.hasNext()) {
                        final a next = it.next();
                        this.a.execute(new Runnable() { // from class: xsna.tuv0
                            @Override // java.lang.Runnable
                            public final void run() {
                                uuv0.a.this.b(addAndGet);
                            }
                        });
                    }
                    this.m.set(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:8:0x0005, B:11:0x000f, B:15:0x0039, B:17:0x004f, B:20:0x0065, B:22:0x006d, B:26:0x008d, B:29:0x0094, B:30:0x009c, B:32:0x00a2, B:34:0x005a, B:35:0x00b8), top: B:7:0x0005 }] */
    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        long j2;
        if (z) {
            try {
                if (this.d.get() != 0) {
                    this.c.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
                    long totalRxBytes = TrafficStats.getTotalRxBytes() - this.f;
                    this.j += elapsedRealtime;
                    this.k += totalRxBytes;
                    if (elapsedRealtime > 25 && totalRxBytes > 512) {
                        this.i.a((int) Math.sqrt(totalRxBytes), totalRxBytes / elapsedRealtime);
                        if (this.j < 500) {
                            if (this.k >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                            }
                            j2 = this.g;
                            if (j2 > 0) {
                                int i = (int) elapsedRealtime;
                                long j3 = 8000;
                                long j4 = j2 * j3;
                                long b = ((long) this.i.b(0.9f)) * j3;
                                long b2 = ((long) this.i.b(1.0f)) * j3;
                                if (i != 0 || totalRxBytes != 0 || j4 != this.h) {
                                    this.h = j4;
                                    Iterator<a> it = this.b.iterator();
                                    while (it.hasNext()) {
                                        long j5 = b;
                                        long j6 = b2;
                                        this.a.execute(new cwq(it.next(), this, i, totalRxBytes, j4, j5, j6));
                                        b2 = j6;
                                        b = j5;
                                    }
                                }
                            }
                        }
                        this.g = (long) this.i.b(0.5f);
                        j2 = this.g;
                        if (j2 > 0) {
                        }
                    }
                    this.d.set(0);
                    this.m.set(0);
                }
            } finally {
            }
        }
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final synchronized void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        if (z) {
            if (this.d.getAndIncrement() == 0) {
                this.c.getClass();
                this.e = SystemClock.elapsedRealtime();
                this.f = TrafficStats.getTotalRxBytes();
                this.l++;
            }
        }
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }
}
