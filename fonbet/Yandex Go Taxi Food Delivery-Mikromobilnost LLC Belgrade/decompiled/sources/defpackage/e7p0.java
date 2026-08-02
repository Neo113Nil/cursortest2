package defpackage;

import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.a;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes6.dex */
public final class e7p0 {
    public final FrameLayout a;
    public final rju b;
    public final i3y c;
    public d7p0 d;

    public e7p0(FrameLayout frameLayout) {
        this.a = frameLayout;
        rju rjuVar = new rju(frameLayout.getContext());
        rjuVar.E = tje.y(dzg0.bubble_default_frame, frameLayout.getContext()).mutate();
        rjuVar.f();
        this.b = rjuVar;
        this.c = a.a(new b7p0(0, this));
    }

    public final void a(boolean z) {
        c().a.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        BubbleComponent bubbleComponent = c().a;
        FrameLayout frameLayout = this.a;
        if (frameLayout.indexOfChild(bubbleComponent) != -1) {
            frameLayout.removeView(c().a);
        }
        d7p0 d7p0Var = this.d;
        if (d7p0Var != null) {
            View view = d7p0Var.a;
            view.removeOnAttachStateChangeListener(d7p0Var.h);
            yln ylnVar = d7p0Var.i;
            view.removeOnLayoutChangeListener(ylnVar);
            d7p0Var.f.removeOnLayoutChangeListener(ylnVar);
            d7p0Var.b.removeOnLayoutChangeListener(ylnVar);
        }
        BubbleComponent.hide$default(c().a, false, 1, null);
    }

    public final a7p0 c() {
        return (a7p0) this.c.getValue();
    }

    public final void d(ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent, String str, ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment) {
        c().a.setImportantForAccessibility(2);
        c().b.setImportantForAccessibility(2);
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), c().b.getPaint(), tje.u(112, scootersVehicleActualPhotoButtonIconComponent.getContext())).build();
        int lineCount = build.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, build.getLineWidth(i) + 1.0f);
        }
        int i2 = (int) f;
        AccessibilityLiveRegionTextView accessibilityLiveRegionTextView = c().b;
        accessibilityLiveRegionTextView.setMaxWidth(i2);
        accessibilityLiveRegionTextView.setLayoutParams(new ViewGroup.LayoutParams(i2, -2));
        accessibilityLiveRegionTextView.setText(str);
        d7p0 d7p0Var = this.d;
        if (scootersVehicleActualPhotoButtonIconComponent == (d7p0Var != null ? d7p0Var.a : null) && c().a.getVisibility() == 0) {
            return;
        }
        b();
        BubbleComponent bubbleComponent = c().a;
        if (bubbleComponent.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c().b.getPaddingEnd() + c().b.getPaddingStart() + i2, -2);
            layoutParams.leftMargin = tje.r(mrg0.go_design_m_space, scootersVehicleActualPhotoButtonIconComponent.getContext());
            layoutParams.rightMargin = tje.r(mrg0.go_design_m_space, scootersVehicleActualPhotoButtonIconComponent.getContext());
            layoutParams.gravity = 8388611;
            bubbleComponent.setBubbleColor(new bdc(xng0.bgInvert));
            this.a.addView(bubbleComponent, layoutParams);
        }
        d7p0 d7p0Var2 = new d7p0(scootersVehicleActualPhotoButtonIconComponent, bubbleComponent, this.b, scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment);
        this.d = d7p0Var2;
        scootersVehicleActualPhotoButtonIconComponent.addOnAttachStateChangeListener(d7p0Var2.h);
        yln ylnVar = d7p0Var2.i;
        scootersVehicleActualPhotoButtonIconComponent.addOnLayoutChangeListener(ylnVar);
        d7p0Var2.f.addOnLayoutChangeListener(ylnVar);
        bubbleComponent.addOnLayoutChangeListener(ylnVar);
        BubbleComponent.show$default(c().a, false, 1, null);
    }
}
