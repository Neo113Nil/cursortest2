package defpackage;

import android.animation.ValueAnimator;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.RadioGroupView;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class dl11 extends nx4 {
    public final ButtonSectionView h;
    public final ValueAnimator i;

    public dl11(ButtonSectionView buttonSectionView, RadioGroupView radioGroupView) {
        super(radioGroupView);
        this.h = buttonSectionView;
        this.i = new ValueAnimator();
    }

    @Override // defpackage.nx4
    public final Collection a() {
        return Collections.singletonList(this.i);
    }

    @Override // defpackage.nx4
    public final void b() {
        this.i.removeAllUpdateListeners();
    }

    @Override // defpackage.nx4
    public final void c() {
        int[] iArr = {this.h.getView().getPaddingTop(), 0};
        ValueAnimator valueAnimator = this.i;
        valueAnimator.setIntValues(iArr);
        kxa1.b(new jl01(28, this), valueAnimator);
    }
}
