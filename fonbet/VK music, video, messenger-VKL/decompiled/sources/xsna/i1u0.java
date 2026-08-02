package xsna;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes11.dex */
public abstract class i1u0 extends pto0 {

    /* compiled from: ViewTimeCycle.java */
    public static class a extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setAlpha(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class b extends i1u0 {
        public String i;
        public SparseArray<ConstraintAttribute> j;
        public SparseArray<float[]> k;
        public float[] l;
        public float[] m;

        public b() {
            throw null;
        }

        @Override // xsna.pto0
        public final void b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // xsna.pto0
        public final void c(int i) {
            SparseArray<ConstraintAttribute> sparseArray = this.j;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i2 = c + 2;
            this.l = new float[i2];
            this.m = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                ConstraintAttribute valueAt = sparseArray.valueAt(i3);
                float[] valueAt2 = this.k.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                valueAt.b(this.l);
                int i4 = 0;
                while (true) {
                    if (i4 < this.l.length) {
                        dArr2[i3][i4] = r10[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[c] = valueAt2[0];
                dArr3[c + 1] = valueAt2[1];
            }
            this.a = emk.a(i, dArr, dArr2);
        }

        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            this.a.d(f, this.l);
            float[] fArr = this.l;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = nt8Var.g(view, this.i);
                if (Float.isNaN(this.last_cycle)) {
                    this.last_cycle = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            this.last_cycle = (float) ((((j2 * 1.0E-9d) * f2) + this.last_cycle) % 1.0d);
            this.last_time = j;
            float a = a(this.last_cycle);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.m;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float f4 = this.l[i];
                this.h = z | (((double) f4) != ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                fArr2[i] = (f4 * a) + f3;
                i++;
            }
            cok.b(this.j.valueAt(0), view, this.m);
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.h = true;
            }
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class c extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setElevation(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class d extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class e extends i1u0 {
        public boolean i;

        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            Method method;
            e eVar;
            float d;
            if (view instanceof MotionLayout) {
                float d2 = d(f, j, view, nt8Var);
                eVar = this;
                ((MotionLayout) view).setProgress(d2);
            } else {
                if (this.i) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.i = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        d = d(f, j, view, nt8Var);
                        eVar = this;
                    } catch (IllegalAccessException e) {
                        e = e;
                        eVar = this;
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        eVar = this;
                    }
                    try {
                        method.invoke(view, Float.valueOf(d));
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                        return eVar.h;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                        return eVar.h;
                    }
                } else {
                    eVar = this;
                }
            }
            return eVar.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class f extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setRotation(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class g extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setRotationX(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class h extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setRotationY(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class i extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setScaleX(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class j extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setScaleY(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class k extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setTranslationX(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class l extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setTranslationY(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class m extends i1u0 {
        @Override // xsna.i1u0
        public final boolean e(float f, long j, View view, nt8 nt8Var) {
            view.setTranslationZ(d(f, j, view, nt8Var));
            return this.h;
        }
    }

    public i1u0() {
        this.b = 0;
        this.c = new int[10];
        this.d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
        this.g = new float[3];
        this.h = false;
    }

    public final float d(float f2, long j2, View view, nt8 nt8Var) {
        this.a.d(f2, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f3 = fArr[1];
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            this.last_cycle = nt8Var.g(view, this.f);
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        this.last_cycle = (float) (((((j2 - this.last_time) * 1.0E-9d) * f3) + this.last_cycle) % 1.0d);
        String str = this.f;
        float f4 = this.last_cycle;
        HashMap hashMap = (HashMap) nt8Var.b;
        if (hashMap.containsKey(view)) {
            HashMap hashMap2 = (HashMap) hashMap.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (hashMap2.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f4;
                hashMap2.put(str, fArr2);
            } else {
                hashMap2.put(str, new float[]{f4});
                hashMap.put(view, hashMap2);
            }
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str, new float[]{f4});
            hashMap.put(view, hashMap3);
        }
        this.last_time = j2;
        float f5 = this.g[0];
        float a2 = (a(this.last_cycle) * f5) + this.g[2];
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z = false;
        }
        this.h = z;
        return a2;
    }

    public abstract boolean e(float f2, long j2, View view, nt8 nt8Var);
}
