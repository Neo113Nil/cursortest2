package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.altpins.map.AlternativeDestinationOnMapControl;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes5.dex */
public final class bx1 implements zo31 {
    public final AlternativeDestinationOnMapControl a;
    public final AppCompatImageView b;
    public final ShimmeringRobotoTextView c;

    public bx1(AlternativeDestinationOnMapControl alternativeDestinationOnMapControl, AppCompatImageView appCompatImageView, ShimmeringRobotoTextView shimmeringRobotoTextView) {
        this.a = alternativeDestinationOnMapControl;
        this.b = appCompatImageView;
        this.c = shimmeringRobotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
