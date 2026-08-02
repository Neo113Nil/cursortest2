package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import defpackage.a3c;
import defpackage.azo;
import defpackage.c94;
import defpackage.d48;
import defpackage.geb1;
import defpackage.o0r0;
import defpackage.rdv;
import defpackage.sgb1;
import java.util.List;

/* loaded from: classes10.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final d48 mCaptureResultImageMatcher = new d48();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, rdv rdvVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    ((o0r0) rdvVar).a();
                    sgb1.g(3, TAG);
                    return;
                }
                try {
                    c94 c94Var = c94.A;
                    if (a3c.b(c94Var) && azo.f(c94Var)) {
                        this.mPreviewImageProcessor.process(((o0r0) rdvVar).b, totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j, list);
                            }

                            public void onCaptureProcessProgressed(int i2) {
                            }
                        }, geb1.d());
                    } else {
                        this.mPreviewImageProcessor.process(((o0r0) rdvVar).b, totalCaptureResult);
                    }
                    ((o0r0) rdvVar).a();
                } catch (Throwable th) {
                    ((o0r0) rdvVar).a();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.b();
            d48 d48Var = this.mCaptureResultImageMatcher;
            synchronized (d48Var.a) {
                d48Var.e = null;
            }
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, 0);
    }

    public void notifyImage(rdv rdvVar) {
        this.mCaptureResultImageMatcher.c(rdvVar);
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(OnCaptureResultCallback onCaptureResultCallback) {
        d48 d48Var = this.mCaptureResultImageMatcher;
        b bVar = new b(this, onCaptureResultCallback);
        synchronized (d48Var.a) {
            d48Var.e = bVar;
        }
    }
}
