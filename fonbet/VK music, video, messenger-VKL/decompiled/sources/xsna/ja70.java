package xsna;

import com.unity3d.services.UnityAdsConstants;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja70 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja70(int i, pl70 pl70Var) {
        this.b = 1;
        this.c = i;
        this.d = pl70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ka70) this.d).s.smoothScrollTo(this.c, 0);
                break;
            case 1:
                pl70 pl70Var = (pl70) this.d;
                if (this.c <= 0) {
                    d3m.e(pl70Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    break;
                } else {
                    d3m.c(pl70Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
            default:
                ((SurfaceTextureHelper) this.d).lambda$setFrameRotation$4(this.c);
                break;
        }
    }

    public /* synthetic */ ja70(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
