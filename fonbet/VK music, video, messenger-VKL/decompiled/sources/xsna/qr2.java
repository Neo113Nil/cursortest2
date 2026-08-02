package xsna;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import com.vk.ml.a;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import xsna.or2;

/* compiled from: AnimojiDependencyImpl.kt */
/* loaded from: classes7.dex */
public final class qr2 implements or2, w8i {
    public final za9 b;
    public final io.reactivex.rxjava3.subjects.f<Object> c = new io.reactivex.rxjava3.subjects.f<>();
    public final bpn0 d = new bpn0(new na(this, 5));
    public final bpn0 e = new bpn0(new ra0(this, 4));
    public volatile a.InterfaceC1280a f;

    public qr2(za9 za9Var) {
        this.b = za9Var;
    }

    @Override // xsna.or2
    public final io.reactivex.rxjava3.core.q<Object> a() {
        return this.c;
    }

    @Override // xsna.or2
    public final void b() {
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

    @Override // xsna.or2
    public final boolean c() {
        return g().length() > 0;
    }

    @Override // xsna.or2
    public final void d(UserId userId) {
        this.c.onNext(new pr2(userId));
    }

    @Override // xsna.or2
    public final or2.a e() {
        return this.b;
    }

    @Override // xsna.or2
    public final w5w0 f(b6w0 b6w0Var, UserId userId) {
        n5x0 n5x0Var = (n5x0) this.e.getValue();
        return n5x0Var.a.a(Collections.singletonList(userId), b6w0Var).get(userId);
    }

    @Override // xsna.or2
    public final String g() {
        zb00 b;
        a.InterfaceC1280a interfaceC1280a;
        if (this.f == null) {
            MLFeatures.MLFeature mLFeature = MLFeatures.MLFeature.ANIMOJI_VOWELS;
            com.vk.ml.b bVar = MLFeatures.a;
            if (bVar.f() && com.vk.ml.b.g(bVar.d(mLFeature)) && bVar.h(mLFeature)) {
                try {
                    interfaceC1280a = com.vk.ml.a.a(mLFeature);
                } catch (Exception e) {
                    L.g("Ml model access error", e);
                    interfaceC1280a = null;
                }
                this.f = interfaceC1280a;
            }
        }
        a.InterfaceC1280a interfaceC1280a2 = this.f;
        if (interfaceC1280a2 == null) {
            return "";
        }
        File parentFile = new File(interfaceC1280a2.I3()).getParentFile();
        if (parentFile != null && parentFile.exists() && new File(parentFile, "model.tflite").exists() && new File(parentFile, "config.cfg").exists()) {
            String file = parentFile.toString();
            if (file == null) {
                return "";
            }
            StringBuilder e2 = fw3.e(file);
            e2.append(File.separator);
            String sb = e2.toString();
            return sb != null ? sb : "";
        }
        MLFeatures.MLFeature mLFeature2 = MLFeatures.MLFeature.ANIMOJI_VOWELS;
        com.vk.ml.b bVar2 = MLFeatures.a;
        bVar2.getClass();
        bVar2.f.incrementAndGet();
        bVar2.c = false;
        j330 j330Var = bVar2.d;
        if (j330Var != null && (b = j330Var.b(mLFeature2.name())) != null) {
            bVar2.i(mLFeature2);
            try {
                j330 j330Var2 = bVar2.d;
                if (j330Var2 != null) {
                    j330Var2.e(b.a, true);
                }
            } finally {
                bVar2.k(mLFeature2);
            }
        }
        s3q0 s3q0Var = s3q0.a;
        b();
        return "";
    }
}
