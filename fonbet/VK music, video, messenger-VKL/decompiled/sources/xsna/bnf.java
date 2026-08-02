package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.metrics.ComparableVideoFragmentInfo;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsVideoQualityMetricsProcessor.kt */
/* loaded from: classes17.dex */
public final class bnf {
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public final MediaPipelineComponent a;
    public final xke b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new sje(this, 2));

    public bnf(MediaPipelineComponent mediaPipelineComponent, xke xkeVar) {
        this.a = mediaPipelineComponent;
        this.b = xkeVar;
    }

    public static File c(Context context, Uri uri) {
        PrivateFiles.a b;
        File i = com.vk.core.files.a.i(context, uri);
        b = e8r.a.b(r0, PrivateSubdir.INTERNAL_TEMP_UPLOADS.h(), true);
        File file = new File(b.a, "video-metrics-" + System.currentTimeMillis() + '-' + i.getName());
        try {
            com.vk.core.files.a.b(i, file);
            return file;
        } catch (Throwable th) {
            try {
                vhk0.b(file);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qts0 a(Context context, Uri uri, ComparableVideoFragmentInfo comparableVideoFragmentInfo) {
        xke xkeVar = this.b;
        qts0 qts0Var = null;
        try {
            b(context);
            StringBuilder sb = new StringBuilder("Start video quality metrics calculation for uri=");
            Uri uri2 = comparableVideoFragmentInfo.b;
            sb.append(uri2);
            xkeVar.d("ClipsVideoQualityMetricsProcessor", sb.toString());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qts0 b = ((gat0) this.c.getValue()).b(context, uri, comparableVideoFragmentInfo);
            if (b != null) {
                xkeVar.d("ClipsVideoQualityMetricsProcessor", "Video quality metrics for uri=" + uri2 + " calculated: " + b + ". Took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                qts0Var = b;
            }
            try {
                vhk0.b(up2.u(uri2));
            } catch (Throwable unused) {
            }
            return qts0Var;
        } catch (Throwable th) {
            try {
                xkeVar.e("ClipsVideoQualityMetricsProcessor", "Failed to calculate video quality metrics for uri=" + comparableVideoFragmentInfo.b, th);
                return null;
            } finally {
                try {
                    vhk0.b(up2.u(comparableVideoFragmentInfo.b));
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.availMem;
        long j2 = 1024;
        long j3 = (j / j2) / j2;
        long j4 = (memoryInfo.totalMem / j2) / j2;
        long j5 = 100;
        long j6 = j5 - ((j3 * j5) / j4);
        long j7 = memoryInfo.threshold;
        xke xkeVar = this.b;
        if (j <= j7 || memoryInfo.lowMemory) {
            xkeVar.h("ClipsVideoQualityMetricsProcessor", qlb0.a(j6, "Critical memory usage (", "%)"));
        } else {
            if (j6 <= 80) {
                xkeVar.d("ClipsVideoQualityMetricsProcessor", qlb0.a(j6, "Normal memory usage (", "%)"));
                return;
            }
            xkeVar.h("ClipsVideoQualityMetricsProcessor", qlb0.a(j6, "High memory consumption (", "%)"));
        }
        throw new OutOfMemoryError("Failed to calculate video metrics due to memory deficit");
    }
}
