package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import defpackage.k9e0;
import defpackage.mps0;
import defpackage.sp31;
import defpackage.zo31;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes6.dex */
public final class mps0 extends dy4 {
    public static final /* synthetic */ int V = 0;
    public final aq80 T;
    public final xz3 U;

    public mps0(k9e0 k9e0Var, aq80 aq80Var, xz3 xz3Var) {
        super(k9e0Var, 1);
        this.T = aq80Var;
        this.U = xz3Var;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.dy4, defpackage.wys
    public final void c(Object obj) {
        c8e0 c8e0Var = (c8e0) obj;
        k9e0 k9e0Var = (k9e0) ((zo31) this.R);
        SliderButtonView sliderButtonView = k9e0Var.b;
        sliderButtonView.setTitleIdle(c8e0Var.c);
        sliderButtonView.setSubtitleIdle(c8e0Var.d);
        sliderButtonView.setTrackBackgroundColor(s8o.m(c8e0Var.e, sliderButtonView.getContext()));
        sliderButtonView.setTextColor(c8e0Var.f);
        sliderButtonView.setSlideFinishedListener(new ykn0(15, this));
        sliderButtonView.setSliderActionsListener(new wor0(this));
        this.U.invoke(new gas0(7, sliderButtonView));
        FrameLayout frameLayout = k9e0Var.a;
        WeakHashMap weakHashMap = b.a;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.modal.popup.adapter.SliderItemVH$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    mps0 mps0Var = mps0.this;
                    int i = mps0.V;
                    SliderButtonView sliderButtonView2 = ((k9e0) ((zo31) mps0Var.R)).b;
                    int paddingTop = view.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams = sliderButtonView2.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i2 = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    int width = view.getWidth();
                    int height = view.getHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams2 = sliderButtonView2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                    List singletonList = Collections.singletonList(new Rect(0, i2, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)));
                    WeakHashMap weakHashMap2 = b.a;
                    sp31.c(view, singletonList);
                }
            });
            return;
        }
        SliderButtonView sliderButtonView2 = k9e0Var.b;
        int paddingTop = frameLayout.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = sliderButtonView2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight() - frameLayout.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = sliderButtonView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        sp31.c(frameLayout, Collections.singletonList(new Rect(0, i, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0))));
    }
}
