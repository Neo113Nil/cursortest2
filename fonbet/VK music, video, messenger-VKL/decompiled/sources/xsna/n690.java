package xsna;

import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;

/* compiled from: PlaybackErrorStat.kt */
/* loaded from: classes3.dex */
public final class n690 implements wnv {
    public final ThreadStuckAnalyzer.ThreadStuckException a;
    public final chd0 b;

    public n690(ThreadStuckAnalyzer.ThreadStuckException threadStuckException, chd0 chd0Var) {
        this.a = threadStuckException;
        this.b = chd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n690)) {
            return false;
        }
        n690 n690Var = (n690) obj;
        return this.a.equals(n690Var.a) && epx.f(this.b, n690Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PNRErrorStat(exception=" + this.a + ", lastFrameProcessingInfo=" + this.b + ')';
    }
}
