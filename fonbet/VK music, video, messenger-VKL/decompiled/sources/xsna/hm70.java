package xsna;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import com.vk.ml.MLFeatures;
import com.vk.ml.a;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import xsna.l570;

/* compiled from: NsModel.kt */
/* loaded from: classes7.dex */
public final class hm70 implements l570.a {
    public final MLFeatures.MLFeature b;
    public final int c;
    public final int d;
    public final int e;
    public a.InterfaceC1280a f;

    public hm70(MLFeatures.MLFeature mLFeature, int i) {
        mLFeature.name();
        this.b = mLFeature;
        this.c = 48000;
        this.d = 48000;
        this.e = i;
    }

    @Override // xsna.l570.a
    public final int E2() {
        return this.e;
    }

    @Override // xsna.l570.a
    public final int S0() {
        return this.d;
    }

    @Override // xsna.l570.a
    public final int U1() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        AutoCloseable autoCloseable = this.f;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
            }
        }
        this.f = null;
    }

    @Override // xsna.l570.a
    public final l570.b open() {
        close();
        a.InterfaceC1280a a = com.vk.ml.a.a(this.b);
        this.f = a;
        File parentFile = new File(a.I3()).getParentFile();
        if (parentFile != null) {
            return new l570.b(parentFile, a.B1());
        }
        return null;
    }
}
