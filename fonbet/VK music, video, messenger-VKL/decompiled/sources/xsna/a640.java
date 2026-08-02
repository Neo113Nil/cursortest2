package xsna;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: MultiSegmentInterpolator.kt */
/* loaded from: classes16.dex */
public final class a640 implements Interpolator {
    public final a[] a;
    public final float b;

    /* compiled from: MultiSegmentInterpolator.kt */
    public static final class a {
        public final float a;
        public final PathInterpolator b;

        public a(float f, PathInterpolator pathInterpolator) {
            this.a = f;
            this.b = pathInterpolator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Segment(duration=" + this.a + ", interpolator=" + this.b + ')';
        }
    }

    public a640(a... aVarArr) {
        this.a = aVarArr;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        for (a aVar : aVarArr) {
            d += aVar.a;
        }
        this.b = (float) d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r12 = r12 - r3;
        r0 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 <= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r5 = xsna.swe0.f(r12 / r0, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return (r7.b.getInterpolation(r5) * r8) + r4;
     */
    @Override // android.animation.TimeInterpolator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float getInterpolation(float f) {
        float f2 = this.b;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        float f3 = f * f2;
        int i = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (true) {
            float f6 = 1.0f;
            if (i >= 2) {
                return 1.0f;
            }
            a[] aVarArr = this.a;
            a aVar = aVarArr[i];
            float f7 = aVar.a;
            float f8 = f4 + f7;
            float f9 = f7 / f2;
            if (f3 <= f8 || aVar == rl3.b0(aVarArr)) {
                break;
            }
            f5 += f9;
            i++;
            f4 = f8;
        }
    }
}
