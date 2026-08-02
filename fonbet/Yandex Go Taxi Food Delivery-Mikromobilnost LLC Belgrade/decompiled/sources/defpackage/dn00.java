package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.Callback;
import defpackage.f4c0;
import defpackage.oyr;
import defpackage.pp60;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes9.dex */
public abstract class dn00 {
    public static final Animation a = new Animation(Animation.Type.SMOOTH, 0.2f);
    public static final LinearInterpolator b = new LinearInterpolator();

    public static final lz2 a(float f, ym00 ym00Var, Float f2) {
        v35 v35Var = (v35) ym00Var;
        if ((v35Var.h() != MapObjectComponentType.BODY && v35Var.h() != MapObjectComponentType.IMAGE_OVERLAY) || f2 == null) {
            for (lz2 lz2Var : v35Var.a()) {
                if (lz2Var.b() == AppearanceType.NORMAL) {
                    return lz2Var;
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return null;
        }
        if (v35Var.h() == MapObjectComponentType.IMAGE_OVERLAY && v35Var.a().size() == 1) {
            return (lz2) a.O(v35Var.a());
        }
        for (lz2 lz2Var2 : v35Var.a()) {
            if (f <= f2.floatValue()) {
                if (lz2Var2.b() == AppearanceType.SIMPLIFIED) {
                    return lz2Var2;
                }
            } else if (lz2Var2.b() == AppearanceType.NORMAL) {
                return lz2Var2;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    public static final ym00 b(lm00 lm00Var, MapObjectComponentType mapObjectComponentType) {
        Object obj;
        Iterator it = lm00Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v35) ((ym00) obj)).h() == mapObjectComponentType) {
                break;
            }
        }
        return (ym00) obj;
    }

    public static final e2r c(Iterable iterable) {
        return b.k(new h73(1, iterable), new p0u(24));
    }

    public static final void d(ym00 ym00Var) {
        ym00Var.g().i(false);
    }

    public static final void e(ym00 ym00Var, boolean z) {
        boolean z2 = !z;
        if (ym00Var.g().b == z2) {
            return;
        }
        vm00 animation = ym00Var.getAnimation();
        if (animation instanceof tm00) {
            ym00Var.g().j(z2, a, null);
        } else if (animation instanceof um00) {
            f(ym00Var.g(), z2, (um00) ym00Var.getAnimation());
        } else {
            ym00Var.g().i(z2);
        }
        f4c0 g = ym00Var.g();
        Object obj = g.d;
        pp60 pp60Var = (pp60) (obj instanceof pp60 ? obj : null);
        if (pp60Var == null) {
            pp60Var = oyr.c(g);
        }
        wls e = pp60Var.e();
        if (e != null) {
            e.invoke(Boolean.valueOf(z2), ym00Var);
        }
    }

    public static final void f(final f4c0 f4c0Var, final boolean z, um00 um00Var) {
        Object obj = f4c0Var.d;
        if (!(obj instanceof pp60)) {
            obj = null;
        }
        pp60 pp60Var = (pp60) obj;
        if (pp60Var == null) {
            pp60Var = oyr.c(f4c0Var);
        }
        ValueAnimator a2 = pp60Var.a();
        if (a2 != null) {
            a2.cancel();
        }
        Object obj2 = f4c0Var.d;
        pp60 pp60Var2 = (pp60) (obj2 instanceof pp60 ? obj2 : null);
        if (pp60Var2 == null) {
            pp60Var2 = oyr.c(f4c0Var);
        }
        long a3 = um00Var.a();
        if (z) {
            f4c0Var.A(0.0f);
            f4c0Var.i(true);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : f4c0Var.s(), z ? 1.0f : 0.0f);
        ofFloat.setDuration(a3);
        ofFloat.setInterpolator(b);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.yandex.taxi.layers.presentation.MapObjectConvienciesKt$animateFade$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f4c0.this.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.layers.presentation.MapObjectConvienciesKt$setVisible$$inlined$animateFade$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f4c0.this.i(z);
                f4c0 f4c0Var2 = f4c0Var;
                Object obj3 = f4c0Var2.d;
                if (!(obj3 instanceof pp60)) {
                    obj3 = null;
                }
                pp60 pp60Var3 = (pp60) obj3;
                if (pp60Var3 == null) {
                    pp60Var3 = oyr.c(f4c0Var2);
                }
                pp60Var3.b = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        pp60Var2.f(ofFloat);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [cn00] */
    public static final void g(lm00 lm00Var, xm00 xm00Var, final float f) {
        for (final ym00 ym00Var : lm00Var.f) {
            if (ym00Var.g().f == null) {
                f4c0 g = ym00Var.g();
                xm00Var.getClass();
                g.b(xm00Var);
            }
            wp31 wp31Var = lm00Var.d;
            final boolean z = lm00Var.g;
            ym91.f(ym00Var.g(), a(f, ym00Var, wp31Var.e()), z, new Callback() { // from class: cn00
                @Override // com.yandex.mapkit.map.Callback
                public final void onTaskFinished() {
                    boolean z2 = z;
                    ym00 ym00Var2 = ym00Var;
                    float f2 = f;
                    if (!z2) {
                        if (ru.yandex.taxi.layers.source.factory.a.d(ym00Var2.c(), f2)) {
                            return;
                        }
                        dn00.e(ym00Var2, true);
                    } else {
                        if (ym00Var2 instanceof sl6) {
                            sl6 sl6Var = (sl6) ym00Var2;
                            if (sl6Var.t != BubbleType.PLAIN_TEXT) {
                                sl6Var.s.i(ru.yandex.taxi.layers.source.factory.a.d(sl6Var.m, f2));
                                return;
                            }
                        }
                        ym00Var2.g().i(true);
                    }
                }
            });
        }
    }
}
