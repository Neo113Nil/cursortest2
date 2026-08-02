package xsna;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.video.player.model.VideoContentType;

/* compiled from: DownloadTask.kt */
/* loaded from: classes8.dex */
public final class iao implements DownloadHelper.a {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ hao b;
    public final /* synthetic */ AtomicReference<DownloadRequest> c;
    public final /* synthetic */ AtomicReference<Exception> d;
    public final /* synthetic */ CountDownLatch e;

    public iao(AtomicBoolean atomicBoolean, hao haoVar, AtomicReference<DownloadRequest> atomicReference, AtomicReference<Exception> atomicReference2, CountDownLatch countDownLatch) {
        this.a = atomicBoolean;
        this.b = haoVar;
        this.c = atomicReference;
        this.d = atomicReference2;
        this.e = countDownLatch;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void a(DownloadHelper downloadHelper, boolean z) {
        CountDownLatch countDownLatch = this.e;
        hao haoVar = this.b;
        try {
            if (this.a.get()) {
                return;
            }
            try {
                boolean contains = e43.l(VideoContentType.HLS, VideoContentType.DASH).contains(haoVar.l.a.a);
                if (z && contains && downloadHelper.i() > 0) {
                    hao.e(haoVar, downloadHelper);
                }
                this.c.set(hao.f(haoVar, downloadHelper));
                countDownLatch.countDown();
            } catch (Exception e) {
                this.d.set(e);
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void b(IOException iOException) {
        if (this.a.get()) {
            return;
        }
        this.d.set(iOException);
        this.e.countDown();
    }
}
