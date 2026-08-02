package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class c8y0 {
    public final BubbleComponent a;
    public final rju b;
    public final nzm c;

    public c8y0(GoFrameLayout goFrameLayout) {
        BubbleComponent bubbleComponent = new BubbleComponent(goFrameLayout.getContext(), null, 0, 6, null);
        this.a = bubbleComponent;
        rju rjuVar = new rju(goFrameLayout.getContext());
        this.b = rjuVar;
        View inflate = LayoutInflater.from(goFrameLayout.getContext()).inflate(eph0.taxi_panorama_bubble_pin_out_screen_bubble, (ViewGroup) bubbleComponent, false);
        bubbleComponent.addView(inflate);
        int i = zch0.title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            throw null;
        }
        this.c = new nzm(robotoTextView, 12, (GoFrameLayout) inflate);
        bubbleComponent.setDecorator(rjuVar);
        rjuVar.b(new gdc(mqg0.component_gray_600_cold));
        bubbleComponent.setAlpha(0.0f);
    }
}
