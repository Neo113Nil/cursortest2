package yads;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class ny3 implements tx3 {
    public static ny3 f;
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final ey3 b;
    public final ex3 c;
    public zx3 d;
    public rx3 e;

    public ny3(ey3 ey3Var, ex3 ex3Var) {
        this.b = ey3Var;
        this.c = ex3Var;
    }

    @Override // yads.tx3
    public final void a(boolean z) {
        if (!z) {
            ba3.g.getClass();
            Handler handler = ba3.i;
            if (handler != null) {
                handler.removeCallbacks(ba3.k);
                ba3.i = null;
                return;
            }
            return;
        }
        ba3.g.getClass();
        if (ba3.i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            ba3.i = handler2;
            handler2.post(ba3.j);
            ba3.i.postDelayed(ba3.k, 200L);
        }
    }

    public static ny3 a() {
        if (f == null) {
            f = new ny3(new ey3(), new ex3());
        }
        return f;
    }
}
