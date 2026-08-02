package xsna;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline.java */
/* loaded from: classes11.dex */
public abstract class w0u0 extends jlk0 {

    /* compiled from: ViewSpline.java */
    public static class a extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class b extends w0u0 {
        public SparseArray<ConstraintAttribute> f;
        public float[] g;

        public b() {
            throw null;
        }

        @Override // xsna.jlk0
        public final void b(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // xsna.jlk0
        public final void c(int i) {
            SparseArray<ConstraintAttribute> sparseArray = this.f;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.g = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, c);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                ConstraintAttribute valueAt = sparseArray.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.b(this.g);
                int i3 = 0;
                while (true) {
                    if (i3 < this.g.length) {
                        dArr2[i2][i3] = r7[i3];
                        i3++;
                    }
                }
            }
            this.a = emk.a(i, dArr, dArr2);
        }

        @Override // xsna.w0u0
        public final void d(View view, float f) {
            this.a.d(f, this.g);
            cok.b(this.f.valueAt(0), view, this.g);
        }
    }

    /* compiled from: ViewSpline.java */
    public static class c extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class e extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class f extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class g extends w0u0 {
        public boolean f;

        @Override // xsna.w0u0
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    public static class h extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class i extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class j extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class k extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class l extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class m extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class n extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class o extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);

    /* compiled from: ViewSpline.java */
    public static class d extends w0u0 {
        @Override // xsna.w0u0
        public final void d(View view, float f) {
        }
    }
}
