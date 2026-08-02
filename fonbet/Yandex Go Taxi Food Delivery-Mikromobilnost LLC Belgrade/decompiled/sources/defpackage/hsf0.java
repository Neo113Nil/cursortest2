package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.function.Consumer;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes6.dex */
public abstract class hsf0 {
    public final ModalView a;
    public final gsf0 b;
    public float d;
    public ValueAnimator f;
    public final ArgbEvaluator c = new ArgbEvaluator();
    public Rect e = new Rect();

    public hsf0(ModalView modalView, gsf0 gsf0Var) {
        this.a = modalView;
        this.b = gsf0Var;
    }

    public static void h(View view, float f, float f2, float f3, float f4, float f5) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setTranslationX(f3);
        view.setTranslationY(f4);
        view.setAlpha(f5);
    }

    public static void l(float f, float f2, View view) {
        view.setPivotX(f);
        view.setPivotY(f2);
    }

    public final void a(float f, Runnable runnable, Runnable runnable2) {
        int i = 0;
        int i2 = 1;
        if (f == 0.0f) {
            d();
            g(b(1.0f, 0.0f, 300L, new fsf0(this, i)), true, runnable, runnable2);
        } else if (f >= 0.5f) {
            d();
            g(b(0.0f, 1.0f, 200L, new fsf0(this, i2)), false, runnable, runnable2);
        } else {
            g(b(f, 0.5f, 100L, new fsf0(this, 2)), true, null, new ud30(21, this, runnable, runnable2));
        }
    }

    public final ValueAnimator b(float f, float f2, long j, Consumer consumer) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new vf2(14, this, consumer));
        return ofFloat;
    }

    public abstract Rect c();

    public void d() {
        this.e = c();
        m(0.0f, 0.0f);
    }

    public float e() {
        return 0.0f;
    }

    public void f() {
        ModalView modalView = this.a;
        m(modalView.getWidth() / 2.0f, modalView.getHeight() / 2.0f);
    }

    public final void g(ValueAnimator valueAnimator, boolean z, Runnable runnable, Runnable runnable2) {
        if (runnable == null) {
            runnable = new d82(1);
        }
        valueAnimator.addListener(new AnimUtils$AnimationStartEndListener(runnable, new uf4(this, z, runnable2, 5)));
        valueAnimator.start();
        this.f = valueAnimator;
    }

    public abstract void i(float f, float f2, float f3, float f4, float f5);

    public abstract void j(float f, float f2, float f3, float f4);

    public void k(float f, float f2) {
    }

    public abstract void m(float f, float f2);

    public final void n(float f) {
        ModalView modalView = this.a;
        if (modalView.getWidth() == 0 || modalView.getHeight() == 0) {
            return;
        }
        float width = this.e.width() / modalView.getWidth();
        float height = this.e.height() / modalView.getHeight();
        float H = uh6.H(width, 1.0f, f);
        float H2 = uh6.H(height, 1.0f, f);
        float H3 = uh6.H(this.e.left, 0.0f, f);
        float H4 = uh6.H(this.e.top, 0.0f, f);
        float H5 = uh6.H(e() / width, 0.0f, f);
        float H6 = uh6.H(e() / height, 0.0f, f);
        int intValue = ((Integer) this.c.evaluate(f, 0, Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR))).intValue();
        i(H, H2, H3, H4, (float) Math.min(f / 0.33f, 1.0d));
        k(H5, H6);
        j(H, H2, H3, H4);
        modalView.setBackgroundColor(intValue);
    }

    public final void o(float f) {
        this.d = f;
        ModalView modalView = this.a;
        if (modalView.getWidth() == 0 || modalView.getHeight() == 0) {
            return;
        }
        float min = (float) Math.min(2.0f * f, 1.0d);
        float H = uh6.H(1.0f, 0.8f, min);
        float H2 = uh6.H(1.0f, 0.8f, min);
        float H3 = uh6.H(0.0f, e() / 0.8f, min);
        float H4 = uh6.H(0.0f, modalView.getHeight(), f);
        int intValue = ((Integer) this.c.evaluate(min, Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR), 0)).intValue();
        i(H, H2, 0.0f, H4, 1.0f);
        k(H3, H3);
        j(H, H2, 0.0f, H4);
        modalView.setBackgroundColor(intValue);
    }
}
