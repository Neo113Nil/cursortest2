package defpackage;

import android.view.View;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes10.dex */
public final class kdt0 implements zo31 {
    public final SourceOnMapControl a;
    public final PinSlot b;
    public final ShimmeringRobotoTextView c;
    public final ShimmeringRobotoTextView d;

    public kdt0(SourceOnMapControl sourceOnMapControl, PinSlot pinSlot, ShimmeringRobotoTextView shimmeringRobotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView2) {
        this.a = sourceOnMapControl;
        this.b = pinSlot;
        this.c = shimmeringRobotoTextView;
        this.d = shimmeringRobotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
