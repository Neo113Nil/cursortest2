package xsna;

/* compiled from: DropFramesFrameScheduler.kt */
/* loaded from: classes12.dex */
public final class emo {
    public final rp2 a;
    public long b = -1;

    public emo(an2 an2Var) {
        this.a = an2Var;
    }

    public final long a() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0L;
        int frameCount = this.a.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.b += r0.getFrameDurationMs(i);
        }
        return this.b;
    }
}
