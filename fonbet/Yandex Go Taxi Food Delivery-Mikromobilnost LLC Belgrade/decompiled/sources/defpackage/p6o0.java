package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

/* loaded from: classes6.dex */
public final class p6o0 implements zo31 {
    public final ScootersOrderSelectorView a;
    public final ButtonComponent b;
    public final CircleButtonImageView c;
    public final SegmentedComponent d;

    public p6o0(ScootersOrderSelectorView scootersOrderSelectorView, ButtonComponent buttonComponent, CircleButtonImageView circleButtonImageView, SegmentedComponent segmentedComponent) {
        this.a = scootersOrderSelectorView;
        this.b = buttonComponent;
        this.c = circleButtonImageView;
        this.d = segmentedComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
