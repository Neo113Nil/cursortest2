package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import defpackage.a3c;
import defpackage.azo;
import defpackage.c48;
import defpackage.c94;
import defpackage.d48;
import defpackage.d6z;
import defpackage.geb1;
import defpackage.o0r0;
import defpackage.rdv;
import defpackage.sgb1;
import defpackage.sy80;
import defpackage.z38;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    z38 mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final d48 mCaptureResultImageMatcher = new d48();
    final Object mLock = new Object();
    HashMap<Integer, Pair<rdv, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, sy80 sy80Var, boolean z) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        z38 z38Var = new z38(surface, size, z);
        this.mCaptureOutputSurface = z38Var;
        captureProcessorImpl.onOutputSurface(z38Var.e, 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = sy80Var != null;
        if (sy80Var != null) {
            c94 c94Var = c94.B;
            if (a3c.b(c94Var) && azo.f(c94Var)) {
                d6z.n(sy80Var.a() == 35);
                captureProcessorImpl.onResolutionUpdate(size, sy80Var.b());
                captureProcessorImpl.onPostviewOutputSurface(sy80Var.c());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public void lambda$process$1(boolean z, HashMap hashMap, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        sgb1.e(TAG, "mCaptureProcessorImpl.process exception ", e);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e);
                        }
                        sgb1.g(3, TAG);
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                        }
                    }
                    if (this.mIsClosed) {
                        sgb1.g(3, TAG);
                        sgb1.g(3, TAG);
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    sgb1.g(3, TAG);
                    c94 c94Var = c94.B;
                    if (azo.f(c94Var) && a3c.b(c94Var) && z && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j, list);
                            }

                            public void onCaptureProcessProgressed(int i) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i);
                            }
                        }, geb1.b());
                    } else {
                        c94 c94Var2 = c94.A;
                        if (azo.f(c94Var2) && a3c.b(c94Var2)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j, list);
                                }

                                public void onCaptureProcessProgressed(int i) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i);
                                }
                            }, geb1.b());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    }
                    sgb1.g(3, TAG);
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    sgb1.g(3, TAG);
                    OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback5 != null) {
                        onCaptureResultCallback5.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z, rdv rdvVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    ((o0r0) rdvVar).a();
                    sgb1.g(3, TAG);
                    return;
                }
                sgb1.g(3, TAG);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(rdvVar, totalCaptureResult));
                Objects.toString(this.mCaptureResults.keySet());
                sgb1.g(3, TAG);
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<rdv, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((o0r0) ((rdv) it.next().first)).a();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            sgb1.g(3, TAG);
            this.mIsClosed = true;
            clearCaptureResults();
            d48 d48Var = this.mCaptureResultImageMatcher;
            synchronized (d48Var.a) {
                d48Var.e = null;
            }
            this.mCaptureResultImageMatcher.b();
            z38 z38Var = this.mCaptureOutputSurface;
            synchronized (z38Var.a) {
                try {
                    z38Var.d = true;
                    if (z38Var.f) {
                        z38Var.c.x();
                        z38Var.c.close();
                        z38Var.b.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i) {
        Long l;
        this.mCaptureResultImageMatcher.a(totalCaptureResult, i);
        if (this.mTimeStampForOutputImage == -1 && (l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l.longValue();
            this.mTimeStampForOutputImage = longValue;
            z38 z38Var = this.mCaptureOutputSurface;
            if (z38Var.g) {
                z38Var.h = longValue;
            }
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(rdv rdvVar) {
        this.mCaptureResultImageMatcher.c(rdvVar);
    }

    public void process(Map<Integer, Pair<rdv, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z) {
        final HashMap hashMap = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<rdv, TotalCaptureResult> pair = map.get(num);
                    hashMap.put(num, new Pair(((o0r0) ((rdv) pair.first)).b, (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        geb1.d().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.i
            @Override // java.lang.Runnable
            public final void run() {
                StillCaptureProcessor.this.lambda$process$1(z, hashMap, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        sgb1.g(3, TAG);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            d6z.y("StillCaptureProcessor is closed. Can't invoke startCapture()", !this.mIsClosed);
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.b();
        d48 d48Var = this.mCaptureResultImageMatcher;
        c48 c48Var = new c48() { // from class: androidx.camera.extensions.internal.sessionprocessor.j
            @Override // defpackage.c48
            public final void a(rdv rdvVar, TotalCaptureResult totalCaptureResult, int i) {
                StillCaptureProcessor.this.lambda$startCapture$0(list, onCaptureResultCallback, z, rdvVar, totalCaptureResult, i);
            }
        };
        synchronized (d48Var.a) {
            d48Var.e = c48Var;
        }
    }
}
