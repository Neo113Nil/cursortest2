package xsna;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes11.dex */
public final class fb30 implements Comparable<fb30> {
    public static final String[] s = {X3.i.L, "x", "y", "width", "height", "pathRotate"};
    public guo b;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int c = 0;
    public float j = Float.NaN;
    public int k = -1;
    public int l = -1;
    public float m = Float.NaN;
    public ea30 n = null;
    public LinkedHashMap<String, ConstraintAttribute> o = new LinkedHashMap<>();
    public int p = 0;
    public double[] q = new double[18];
    public double[] r = new double[18];

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f4) / 2.0f);
        float f9 = f5 - ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void a(b.a aVar) {
        int i;
        this.b = guo.c(aVar.d.d);
        b.c cVar = aVar.d;
        this.k = cVar.e;
        this.l = cVar.b;
        this.j = cVar.h;
        this.c = cVar.f;
        this.m = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.g.get(str);
            if (constraintAttribute != null && (i = ConstraintAttribute.a.a[constraintAttribute.c.ordinal()]) != 1 && i != 2 && i != 3) {
                this.o.put(str, constraintAttribute);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        ea30 ea30Var = this.n;
        if (ea30Var != null) {
            float[] fArr2 = new float[2];
            ea30Var.b(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) (((Math.sin(d4) * d3) + d2) - (f3 / 2.0f));
            f2 = (float) ((f7 - (Math.cos(d4) * d3)) - (f4 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[i + 1] = (f4 / 2.0f) + f2 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull fb30 fb30Var) {
        return Float.compare(this.e, fb30Var.e);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    public final void f(ea30 ea30Var, fb30 fb30Var) {
        double d = (((this.h / 2.0f) + this.f) - fb30Var.f) - (fb30Var.h / 2.0f);
        double d2 = (((this.i / 2.0f) + this.g) - fb30Var.g) - (fb30Var.i / 2.0f);
        this.n = ea30Var;
        this.f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.m)) {
            this.g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.g = (float) Math.toRadians(this.m);
        }
    }
}
