package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ahf;
import defpackage.zgf;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ahf implements ugf {
    public static final vr21 k = (vr21) ((zxf0) pwf0.c(vr21.class));
    public final Context a;
    public final xm00 b;
    public final vub c;
    public final f4c0 d;
    public zgf e;
    public g3c0 f;
    public vr21 g;
    public ValueAnimator h;
    public ValueAnimator i;
    public float j;

    public ahf(Context context, xm00 xm00Var) {
        this.a = context;
        this.b = xm00Var;
        Circle circle = new Circle(new Point(0.0d, 0.0d), 0.0f);
        xm00Var.getClass();
        vub vubVar = new vub(circle);
        vubVar.b(xm00Var);
        vubVar.p(2.0f);
        vubVar.u(context.getColor(qqg0.current_location_stroke));
        vubVar.r(context.getColor(mqg0.transparent));
        vubVar.l = true;
        vubVar.t(vubVar.g, true);
        this.c = vubVar;
        f4c0 r = xm00Var.r(new Point(0.0d, 0.0d));
        r.i(false);
        this.d = r;
        this.g = k;
    }

    @Override // defpackage.ugf
    public final float a() {
        return ((g3c0) b()).A;
    }

    public final vr21 b() {
        g3c0 g3c0Var = this.f;
        if (g3c0Var != null) {
            return g3c0Var;
        }
        g3c0 g3c0Var2 = new g3c0(this.a, this.b);
        this.f = g3c0Var2;
        return g3c0Var2;
    }

    @Override // defpackage.ugf
    public final Point getGeometry() {
        return (Point) ((g3c0) b()).c.h;
    }

    @Override // defpackage.ugf
    public final float getZIndex() {
        return ((g3c0) b()).c.c;
    }

    @Override // defpackage.ugf
    public final void s0() {
        this.c.d();
        this.d.d();
        g3c0 g3c0Var = this.f;
        if (g3c0Var != null) {
            g3c0Var.s0();
        }
        this.g.s0();
    }

    @Override // defpackage.ugf
    public final void setVisible(boolean z) {
        ((g3c0) b()).f6(z);
        this.g.f6(z);
        this.c.i(z);
        if (z) {
            return;
        }
        ((g3c0) b()).w9(false);
        this.g.w9(false);
    }

    @Override // defpackage.ugf
    public final void t0(boolean z) {
        g3c0 g3c0Var = (g3c0) b();
        ValueAnimator valueAnimator = g3c0Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ArrayList arrayList = g3c0Var.B;
        ValueAnimator ofInt = ValueAnimator.ofInt(z ? arrayList.size() - 1 : 0, z ? 0 : arrayList.size() - 1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(arrayList.size() * 100);
        ofInt.addUpdateListener(new vf2(9, g3c0Var, arrayList));
        ofInt.start();
        g3c0Var.C = ofInt;
    }

    @Override // defpackage.ugf
    public final g18 u0(oxf0 oxf0Var) {
        return ((g3c0) b()).y.h(oxf0Var);
    }

    @Override // defpackage.ugf
    public final void updateAzimuth(float f) {
        if (((g3c0) b()).c.b) {
            ((g3c0) b()).ob(f);
            this.g.ob(f);
            ((g3c0) b()).w9(true);
            this.g.w9(true);
        }
    }

    @Override // defpackage.ugf
    public final boolean v0() {
        return !((g3c0) b()).B.isEmpty();
    }

    @Override // defpackage.ugf
    public final void w0(Point point, float f) {
        ((g3c0) b()).setGeometry(point);
        this.g.setGeometry(point);
        this.d.o(point);
        Circle circle = new Circle(point, f);
        vub vubVar = this.c;
        vubVar.o(circle);
        ((g3c0) b()).kc(point);
        this.g.kc(point);
        if (vubVar.b) {
            ((g3c0) b()).f6(true);
            this.g.f6(true);
        }
    }

    @Override // defpackage.ugf
    public final void x0(ro21 ro21Var) {
        ((g3c0) b()).gg(this.a, ro21Var);
    }

    @Override // defpackage.ugf
    public final void y0(ro21 ro21Var, ro21 ro21Var2) {
        g3c0 g3c0Var = (g3c0) b();
        Context context = this.a;
        g3c0Var.gg(context, ro21Var);
        vr21 vr21Var = this.g;
        vr21 vr21Var2 = k;
        if (ro21Var2 == null) {
            vr21Var.s0();
            this.g = vr21Var2;
            return;
        }
        if (vr21Var == vr21Var2) {
            b();
            g3c0 g3c0Var2 = new g3c0(context, this.b);
            g3c0Var2.gg(context, ro21Var2);
            f4c0 f4c0Var = g3c0Var2.b;
            g3c0Var2.ob(f4c0Var.i);
            f4c0 f4c0Var2 = g3c0Var2.c;
            f4c0Var2.o(f4c0Var2.h);
            f4c0Var.o(f4c0Var.h);
            f4c0Var2.i(f4c0Var2.b);
            f4c0Var.i(f4c0Var.b);
            f4c0Var2.k(f4c0Var2.c - 1.0f);
            f4c0Var.k(f4c0Var.c - 1.0f);
            this.g = g3c0Var2;
        }
        this.g.gg(context, ro21Var2);
    }

    @Override // defpackage.ugf
    public final void z0(boolean z) {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int i = 0;
        final int i2 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j, z ? 0.0f : 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ygf
            public final /* synthetic */ ahf b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i3 = i;
                ahf ahfVar = this.b;
                switch (i3) {
                    case 0:
                        ahfVar.j = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        ((g3c0) ahfVar.b()).c.A(ahfVar.j);
                        ((g3c0) ahfVar.b()).b.A(ahfVar.j);
                        break;
                    default:
                        int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        zgf zgfVar = ahfVar.e;
                        if (zgfVar != null) {
                            ahfVar.d.y(((ImageProvider[]) zgfVar.b)[intValue]);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.start();
        this.h = ofFloat;
        ValueAnimator valueAnimator2 = this.i;
        f4c0 f4c0Var = this.d;
        if (!z) {
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            f4c0Var.i(false);
        } else if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            if (this.e == null) {
                this.e = new zgf(this.a, 0);
            }
            f4c0Var.i(true);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 18);
            ofInt.setDuration(1300L);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ygf
                public final /* synthetic */ ahf b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    int i3 = i2;
                    ahf ahfVar = this.b;
                    switch (i3) {
                        case 0:
                            ahfVar.j = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ((g3c0) ahfVar.b()).c.A(ahfVar.j);
                            ((g3c0) ahfVar.b()).b.A(ahfVar.j);
                            break;
                        default:
                            int intValue = ((Integer) valueAnimator22.getAnimatedValue()).intValue();
                            zgf zgfVar = ahfVar.e;
                            if (zgfVar != null) {
                                ahfVar.d.y(((ImageProvider[]) zgfVar.b)[intValue]);
                                break;
                            }
                            break;
                    }
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.map.overlay.CurrentPlaceMapObjectImpl$startSharingCircleAnimation$1$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    ahf ahfVar = ahf.this;
                    zgf zgfVar = ahfVar.e;
                    if (zgfVar == null) {
                        return;
                    }
                    ahfVar.d.y(((ImageProvider[]) zgfVar.b)[18]);
                }
            });
            ofInt.setRepeatCount(-1);
            ofInt.start();
            this.i = ofInt.setDuration(1300L);
        }
    }
}
