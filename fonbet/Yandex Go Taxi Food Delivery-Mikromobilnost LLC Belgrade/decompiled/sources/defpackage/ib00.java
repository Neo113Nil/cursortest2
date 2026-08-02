package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes9.dex */
public final class ib00 implements zo31 {
    public final LinearLayout a;

    public ib00(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, TooltipView tooltipView, ImageView imageView) {
        this.a = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
