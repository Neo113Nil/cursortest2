package com.yandex.go.eboks.objects.analytics;

import android.view.Choreographer;
import defpackage.ey40;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/go/eboks/objects/analytics/EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/yandex/go/eboks/objects/analytics/a;)V", "", "frameTimeNs", "Lzy11;", "doFrame", "(J)V", "start", "()V", "stop", "", "toString", "()Ljava/lang/String;", "Ley40;", "frameTimes", "Ley40;", "getFrameTimes", "()Ley40;", "lastFrameTimeNs", "J", "startTimeMs", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot implements Choreographer.FrameCallback {
    private final ey40 frameTimes = new ey40((Object) null);
    private long lastFrameTimeNs;
    private long startTimeMs;
    final /* synthetic */ a this$0;

    public EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot(a aVar) {
        this.this$0 = aVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNs) {
        if (frameTimeNs > 0) {
            long j = (frameTimeNs - this.lastFrameTimeNs) / 1000000;
            ey40 ey40Var = this.frameTimes;
            int b = ey40Var.b(j);
            ey40Var.e((b >= 0 ? ey40Var.c[b] : 0) + 1, j);
        }
        this.lastFrameTimeNs = frameTimeNs;
        ((Choreographer) this.this$0.d.getValue()).postFrameCallback(this);
    }

    public final ey40 getFrameTimes() {
        return this.frameTimes;
    }

    public final void start() {
        this.startTimeMs = System.currentTimeMillis();
        ((Choreographer) this.this$0.d.getValue()).postFrameCallback(this);
    }

    public final void stop() {
        ((Choreographer) this.this$0.d.getValue()).removeFrameCallback(this);
        ey40 ey40Var = this.frameTimes;
        if (ey40Var.e == 0) {
            ey40Var.e(1, System.currentTimeMillis() - this.startTimeMs);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ey40 ey40Var = this.frameTimes;
        long[] jArr = ey40Var.b;
        int[] iArr = ey40Var.c;
        long[] jArr2 = ey40Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            boolean z = false;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            int i5 = iArr[i4];
                            if (z) {
                                sb.append(Extension.FIX_SPACE);
                            } else {
                                z = true;
                            }
                            vfc.y(sb, j2, "=", i5);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }
}
