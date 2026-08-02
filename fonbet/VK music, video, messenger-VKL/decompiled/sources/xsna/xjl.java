package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;

/* compiled from: Pager.kt */
/* loaded from: classes11.dex */
public final class xjl implements d160 {
    public final mc90 b;
    public final Orientation c;

    public xjl(mc90 mc90Var, Orientation orientation) {
        this.b = mc90Var;
        this.c = orientation;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        mc90 mc90Var = this.b;
        float l = mc90Var.l();
        bml bmlVar = mc90Var.k;
        if (Math.abs(l) <= 1.0E-6d) {
            return 0L;
        }
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.c;
        if (Math.abs(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & 4294967295L))) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        ob90 n = mc90Var.n();
        float l2 = mc90Var.l() * mc90Var.p();
        float e = ((n.e() + n.d()) * (-Math.signum(mc90Var.l()))) + l2;
        if (mc90Var.l() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e = l2;
            l2 = e;
        }
        float f = swe0.f(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & 4294967295L)), l2, e);
        float d = (orientation2 == orientation && n.i()) ? bmlVar.d(f) : -bmlVar.d(-f);
        float intBitsToFloat = orientation2 == orientation ? d : Float.intBitsToFloat((int) (j >> 32));
        if (orientation2 != Orientation.Vertical) {
            d = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(d));
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j2 >> 32 : 4294967295L & j2)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // xsna.d160
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        return new jmr0(this.c == Orientation.Vertical ? jmr0.a(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2) : jmr0.a(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1));
    }
}
