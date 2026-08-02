package xsna;

import android.os.Debug;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: TraceProfiler.kt */
/* loaded from: classes6.dex */
public final class vdp0 {
    public final File a;
    public final long b;
    public final e750 c;
    public final ygm0 d;
    public a e;

    /* compiled from: TraceProfiler.kt */
    public final class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            vdp0 vdp0Var = vdp0.this;
            File file = vdp0Var.a;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    long j = vdp0Var.b;
                    if (j >= 0) {
                        Debug.startMethodTracingSampling(file.getAbsolutePath(), 33554432, (int) Math.max(1L, TimeUnit.NANOSECONDS.toMicros(j)));
                    } else {
                        Debug.startMethodTracing(file.getAbsolutePath(), 33554432);
                    }
                    Thread.sleep(Long.MAX_VALUE);
                } catch (Throwable unused) {
                }
                Debug.stopMethodTracing();
                vdp0Var.c.invoke(file);
            } catch (Throwable th) {
                vdp0Var.d.invoke(th);
            }
        }
    }

    public vdp0(File file, long j, e750 e750Var, ygm0 ygm0Var) {
        this.a = file;
        this.b = j;
        this.c = e750Var;
        this.d = ygm0Var;
    }
}
