package xsna;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: Slide.java */
/* loaded from: classes12.dex */
public class a0k0 extends p4u0 {
    public static final DecelerateInterpolator d = new DecelerateInterpolator();
    public static final AccelerateInterpolator e = new AccelerateInterpolator();
    public static final a f = new a();
    public static final b g = new b();
    public static final c h = new c();
    public static final d i = new d();
    public static final e j = new e();
    public static final f k = new f();
    public g b = k;
    public int c = 80;

    /* compiled from: Slide.java */
    public class a extends h {
        @Override // xsna.a0k0.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class b extends h {
        @Override // xsna.a0k0.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class c extends i {
        @Override // xsna.a0k0.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    public class d extends h {
        @Override // xsna.a0k0.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class e extends h {
        @Override // xsna.a0k0.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class f extends i {
        @Override // xsna.a0k0.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    public interface g {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    /* compiled from: Slide.java */
    public static abstract class h implements g {
        @Override // xsna.a0k0.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.java */
    public static abstract class i implements g {
        @Override // xsna.a0k0.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    public a0k0() {
        a(80);
    }

    public final void a(int i2) {
        if (i2 == 3) {
            this.b = f;
        } else if (i2 == 5) {
            this.b = i;
        } else if (i2 == 48) {
            this.b = h;
        } else if (i2 == 80) {
            this.b = k;
        } else if (i2 == 8388611) {
            this.b = g;
        } else {
            if (i2 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.b = j;
        }
        this.c = i2;
        elj0 elj0Var = new elj0();
        elj0Var.c = i2;
        setPropagation(elj0Var);
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        super.captureEndValues(gnp0Var);
        int[] iArr = new int[2];
        gnp0Var.b.getLocationOnScreen(iArr);
        gnp0Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureStartValues(gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        int[] iArr = new int[2];
        gnp0Var.b.getLocationOnScreen(iArr);
        gnp0Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // xsna.p4u0
    public final Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) gnp0Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return fop0.a(view, gnp0Var2, iArr[0], iArr[1], this.b.a(view, viewGroup), this.b.b(view, viewGroup), translationX, translationY, d, this);
    }

    @Override // xsna.p4u0
    public final Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        int[] iArr = (int[]) gnp0Var.a.get("android:slide:screenPosition");
        return fop0.a(view, gnp0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.b.a(view, viewGroup), this.b.b(view, viewGroup), e, this);
    }

    public a0k0(int i2) {
        a(i2);
    }
}
