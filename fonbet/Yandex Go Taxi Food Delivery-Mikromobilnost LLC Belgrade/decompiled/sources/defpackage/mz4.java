package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.b;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.home.common.utils.a;

/* loaded from: classes2.dex */
public abstract class mz4 extends z75 {
    public final b5d0 c;
    public final float d;
    public final ddg e;

    public mz4(View view, b5d0 b5d0Var, boolean z, jse jseVar) {
        super(view, jseVar);
        this.c = b5d0Var;
        this.d = view.getResources().getDimension(nvg0.plus_sdk_panel_daily_action_button_corner_radius);
        this.e = new ddg(z);
        b.p(view, new lz4());
    }

    public static void e(wky0 wky0Var, TextView textView, tls tlsVar) {
        textView.setVisibility((wky0Var == null || evu0.J(wky0Var.a)) ? 8 : 0);
        if (wky0Var != null) {
            aob1.c(textView, wky0Var.b, tlsVar);
            textView.setText(wky0Var.a);
        }
    }

    @Override // defpackage.z75
    public final void b() {
        ddg ddgVar = this.e;
        i3y i3yVar = ddgVar.d;
        if (ddgVar.a) {
            ((ValueAnimator) i3yVar.getValue()).removeAllUpdateListeners();
            ((ValueAnimator) i3yVar.getValue()).cancel();
        }
        a.b(this.b);
    }

    public final void c(mz6 mz6Var, TextView textView) {
        textView.setVisibility(mz6Var != null ? 0 : 8);
        if (mz6Var != null) {
            textView.setText(mz6Var.a);
            aob1.c(textView, mz6Var.b, new ej40(8));
            PlusColor plusColor = mz6Var.c;
            float f = this.d;
            textView.setBackground(s2d0.a(plusColor, f, f, f, f));
        }
    }

    public final void d(shr0 shr0Var, final ShapeableImageView shapeableImageView) {
        shapeableImageView.setVisibility(shr0Var != null ? 0 : 8);
        if (shr0Var != null) {
            ((com.yandex.plus.glide.b) this.c).b(shr0Var.a).b(shapeableImageView);
            if (bb1.y(shapeableImageView)) {
                shr0Var = new shr0(shr0Var.a, shr0Var.c, shr0Var.b, shr0Var.e, shr0Var.d);
            }
            b.a m = shapeableImageView.getShapeAppearanceModel().m();
            float f = shr0Var.c;
            m.k(eja1.m(0));
            m.l(f);
            float f2 = shr0Var.b;
            m.i(eja1.m(0));
            m.j(f2);
            float f3 = shr0Var.d;
            m.e(eja1.m(0));
            m.f(f3);
            float f4 = shr0Var.e;
            m.g(eja1.m(0));
            m.h(f4);
            final com.google.android.material.shape.b a = m.a();
            if (!shapeableImageView.isLaidOut() || shapeableImageView.isLayoutRequested()) {
                shapeableImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internal.shortcuts.daily.BaseDailyPartViewController$applyFor$lambda$5$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        ShapeableImageView.this.setShapeAppearanceModel(a);
                    }
                });
            } else {
                shapeableImageView.setShapeAppearanceModel(a);
            }
        }
    }

    public final void g(ShapeableImageView shapeableImageView, wls wlsVar) {
        if ((shapeableImageView.getVisibility() == 0 ? shapeableImageView : null) != null) {
            w04 w04Var = new w04(8, wlsVar, shapeableImageView);
            ddg ddgVar = this.e;
            if (ddgVar.a) {
                ((ValueAnimator) ddgVar.d.getValue()).addUpdateListener(new yi(16, w04Var));
            }
        }
    }
}
