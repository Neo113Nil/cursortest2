package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.search.ui.driver.DriverAcceptanceGradientView;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes14.dex */
public final class eim {
    public final Context a;
    public final ValueAnimator b;
    public final DriverAcceptanceGradientView c;
    public WeakReference d;

    public eim(ViewGroup viewGroup) {
        this.a = viewGroup.getContext();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.5f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new yi(25, this));
        this.b = ofFloat;
        DriverAcceptanceGradientView driverAcceptanceGradientView = new DriverAcceptanceGradientView(viewGroup.getContext());
        viewGroup.addView(driverAcceptanceGradientView);
        this.c = driverAcceptanceGradientView;
        this.d = new WeakReference(null);
    }

    public final void a(IconCircleButton iconCircleButton) {
        View findViewById = iconCircleButton != null ? iconCircleButton.findViewById(ndh0.icon_circle_button_image) : null;
        if (jl40.l((View) this.d.get(), findViewById)) {
            return;
        }
        this.d = new WeakReference(findViewById);
        this.b.cancel();
        View view = (View) this.d.get();
        if (view != null) {
            view.setAlpha(1.0f);
        }
    }
}
