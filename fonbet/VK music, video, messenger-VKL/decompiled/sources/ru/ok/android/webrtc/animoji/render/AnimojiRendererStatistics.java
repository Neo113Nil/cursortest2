package ru.ok.android.webrtc.animoji.render;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.opengl.CallRenderereStatistics;
import xsna.cgn;
import xsna.n6j;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiRendererStatistics implements CallRenderereStatistics {
    public final String a;
    public final String b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);
    public int e;
    public long f;
    public long g;

    public AnimojiRendererStatistics(String str) {
        this.a = str;
        this.b = "AnimojiRenderWrapper_stat_".concat(str);
    }

    public final void frameDispatched(long j) {
        this.c.incrementAndGet();
        this.d.addAndGet(j);
    }

    public final void frameRendered(long j) {
        this.e++;
        this.f += j;
    }

    @Override // ru.ok.android.webrtc.opengl.CallRenderereStatistics
    public void log(RTCLog rTCLog) {
        long nanoTime = System.nanoTime();
        long j = nanoTime - this.g;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(j);
            long seconds = timeUnit.toSeconds(j);
            int i = seconds > 0 ? (int) (this.e / seconds) : 0;
            String str = this.b;
            String str2 = this.a;
            int i2 = this.e;
            int i3 = this.c.get();
            CallRenderereStatistics.Companion companion = CallRenderereStatistics.Companion;
            String averageTimeAsString = companion.getAverageTimeAsString(this.f, this.e);
            String averageTimeAsString2 = companion.getAverageTimeAsString(this.d.get(), this.c.get());
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" -> Duration: ");
            sb.append(millis);
            sb.append(" ms. rendered: ");
            cgn.a(i2, i3, ", dispatched: ", ", avg render time: ", sb);
            n6j.b(sb, averageTimeAsString, ", avg dispatch time: ", averageTimeAsString2, ",fps: ");
            sb.append(i);
            sb.append(".");
            rTCLog.log(str, sb.toString());
            reset(nanoTime);
        }
    }

    @Override // ru.ok.android.webrtc.opengl.CallRenderereStatistics
    public void reset(long j) {
        this.g = j;
        this.e = 0;
        this.c.set(0);
        this.d.set(0L);
        this.f = 0L;
    }
}
