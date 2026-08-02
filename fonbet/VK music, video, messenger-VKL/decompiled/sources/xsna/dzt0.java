package xsna;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOscillator.java */
/* loaded from: classes11.dex */
public abstract class dzt0 extends gdy {

    /* compiled from: ViewOscillator.java */
    public static class a extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class b extends dzt0 {
        public final float[] g = new float[1];
        public ConstraintAttribute h;

        @Override // xsna.gdy
        public final void b(ConstraintAttribute constraintAttribute) {
            this.h = constraintAttribute;
        }

        @Override // xsna.dzt0
        public final void d(View view, float f) {
            float a = a(f);
            float[] fArr = this.g;
            fArr[0] = a;
            cok.b(this.h, view, fArr);
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class c extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class e extends dzt0 {
        public boolean g;

        @Override // xsna.dzt0
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class f extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class g extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class h extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class i extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class j extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class k extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class l extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class m extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public dzt0() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = new ArrayList<>();
    }

    public abstract void d(View view, float f2);

    /* compiled from: ViewOscillator.java */
    public static class d extends dzt0 {
        @Override // xsna.dzt0
        public final void d(View view, float f) {
        }
    }
}
