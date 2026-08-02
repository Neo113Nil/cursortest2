package xsna;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VelocityTrackerCompat.java */
/* loaded from: classes11.dex */
public final class nmr0 {
    public static final Map<VelocityTracker, omr0> a = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: VelocityTrackerCompat.java */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map<VelocityTracker, omr0> map = a;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new omr0());
            }
            omr0 omr0Var = map.get(velocityTracker);
            long[] jArr = omr0Var.b;
            long eventTime = motionEvent.getEventTime();
            if (omr0Var.d != 0 && eventTime - jArr[omr0Var.e] > 40) {
                omr0Var.d = 0;
                omr0Var.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int i = (omr0Var.e + 1) % 20;
            omr0Var.e = i;
            int i2 = omr0Var.d;
            if (i2 != 20) {
                omr0Var.d = i2 + 1;
            }
            omr0Var.a[i] = motionEvent.getAxisValue(26);
            jArr[omr0Var.e] = eventTime;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(VelocityTracker velocityTracker) {
        long j;
        float f;
        float f2;
        float[] fArr;
        float f3;
        float f4 = Float.MAX_VALUE;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        omr0 omr0Var = a.get(velocityTracker);
        if (omr0Var == null) {
            return;
        }
        float[] fArr2 = omr0Var.a;
        long[] jArr = omr0Var.b;
        int i = omr0Var.d;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i >= 2) {
            int i2 = omr0Var.e;
            int i3 = ((i2 + 20) - (i - 1)) % 20;
            long j2 = jArr[i2];
            while (true) {
                j = jArr[i3];
                if (j2 - j <= 100) {
                    break;
                }
                omr0Var.d--;
                i3 = (i3 + 1) % 20;
            }
            int i4 = omr0Var.d;
            if (i4 >= 2) {
                if (i4 != 2) {
                    int i5 = 0;
                    int i6 = 0;
                    float f6 = 0.0f;
                    while (true) {
                        if (i5 >= omr0Var.d - 1) {
                            break;
                        }
                        int i7 = i5 + i3;
                        long j3 = jArr[i7 % 20];
                        int i8 = (i7 + 1) % 20;
                        if (jArr[i8] == j3) {
                            f2 = f4;
                            fArr = fArr2;
                        } else {
                            i6++;
                            f2 = f4;
                            fArr = fArr2;
                            float sqrt = (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                            float f7 = fArr[i8] / (jArr[i8] - j3);
                            f6 += Math.abs(f7) * (f7 - sqrt);
                            if (i6 == 1) {
                                f6 *= 0.5f;
                            }
                        }
                        i5++;
                        f4 = f2;
                        fArr2 = fArr;
                    }
                    f = f4;
                    f5 = (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                    f3 = f5 * 1000;
                    omr0Var.c = f3;
                    if (f3 >= (-Math.abs(f))) {
                        omr0Var.c = -Math.abs(f);
                        return;
                    } else {
                        if (omr0Var.c > Math.abs(f)) {
                            omr0Var.c = Math.abs(f);
                            return;
                        }
                        return;
                    }
                }
                int i9 = (i3 + 1) % 20;
                if (j != jArr[i9]) {
                    f5 = fArr2[i9] / (r4 - j);
                }
            }
        }
        f = Float.MAX_VALUE;
        f3 = f5 * 1000;
        omr0Var.c = f3;
        if (f3 >= (-Math.abs(f))) {
        }
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        omr0 omr0Var = a.get(velocityTracker);
        return (omr0Var == null || i != 26) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : omr0Var.c;
    }
}
