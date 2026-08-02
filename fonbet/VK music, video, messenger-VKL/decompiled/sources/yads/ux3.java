package yads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class ux3 implements Runnable {
    public final /* synthetic */ zx3 b;

    public ux3(zx3 zx3Var) {
        this.b = zx3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        zx3 zx3Var = this.b;
        int streamVolume = zx3Var.c.getStreamVolume(3);
        int streamMaxVolume = zx3Var.c.getStreamMaxVolume(3);
        zx3Var.d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        this.b.g.set(false);
        if (((Float) this.b.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
            this.b.a.post(new sx3(this, f));
        }
    }
}
