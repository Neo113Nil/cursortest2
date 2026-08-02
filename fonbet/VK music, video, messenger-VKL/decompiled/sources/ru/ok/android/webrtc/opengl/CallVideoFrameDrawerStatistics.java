package ru.ok.android.webrtc.opengl;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.opengl.CallRenderereStatistics;
import xsna.cgn;
import xsna.gzs;
import xsna.h5s;
import xsna.jax0;

/* loaded from: classes9.dex */
public final class CallVideoFrameDrawerStatistics implements CallRenderereStatistics {
    public final String a;
    public final gzs b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final String e;
    public int f;
    public long g;
    public long h;
    public long i;

    public CallVideoFrameDrawerStatistics(String str, gzs<Boolean> gzsVar) {
        this.a = str;
        this.b = gzsVar;
        this.e = "CallOpenGL_stat_".concat(str);
    }

    public final void frameDropped() {
        this.d.incrementAndGet();
    }

    public final void frameReceived() {
        this.c.incrementAndGet();
    }

    public final void frameRendered() {
        this.f++;
    }

    @Override // ru.ok.android.webrtc.opengl.CallRenderereStatistics
    public void log(RTCLog rTCLog) {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        long j = nanoTime - this.g;
        if (j > 0) {
            if (((Boolean) this.b.invoke()).booleanValue() && this.c.get() == 0) {
                return;
            }
            float nanos = (TimeUnit.SECONDS.toNanos(1L) * this.f) / j;
            long millis = TimeUnit.NANOSECONDS.toMillis(j);
            String str = this.e;
            String str2 = this.a;
            int i = this.c.get();
            int i2 = this.d.get();
            int i3 = this.f;
            String format = decimalFormat.format(nanos);
            CallRenderereStatistics.Companion companion = CallRenderereStatistics.Companion;
            String averageTimeAsString = companion.getAverageTimeAsString(this.h, this.f);
            String averageTimeAsString2 = companion.getAverageTimeAsString(this.i, this.f);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" -> Duration: ");
            sb.append(millis);
            sb.append(" ms. received: ");
            cgn.a(i, i2, ", dropped: ", ", rendered: ", sb);
            jax0.a(i3, ", fps: ", format, ",avg render time: ", sb);
            rTCLog.log(str, h5s.d(sb, averageTimeAsString, ", avg swapBuffer time: ", averageTimeAsString2, "."));
            reset(nanoTime);
        }
    }

    @Override // ru.ok.android.webrtc.opengl.CallRenderereStatistics
    public void reset(long j) {
        this.g = j;
        this.f = 0;
        this.h = 0L;
        this.i = 0L;
        this.c.set(0);
        this.d.set(0);
    }

    public final void trackDurations(long j, long j2) {
        this.h += j;
        this.i += j2;
    }
}
