package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes6.dex */
public final class k9e0 implements zo31 {
    public final FrameLayout a;
    public final SliderButtonView b;

    public k9e0(FrameLayout frameLayout, SliderButtonView sliderButtonView) {
        this.a = frameLayout;
        this.b = sliderButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
