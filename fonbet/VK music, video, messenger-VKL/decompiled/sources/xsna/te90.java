package xsna;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import xsna.se90;

/* compiled from: PaginationScreenContent.kt */
/* loaded from: classes18.dex */
public final class te90 extends ViewPager2.g {
    public final /* synthetic */ se90 d;
    public final /* synthetic */ ValueAnimator e;

    public te90(se90 se90Var, ValueAnimator valueAnimator) {
        this.d = se90Var;
        this.e = valueAnimator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        if (this.d.e() == se90.a.Progress) {
            this.e.start();
        }
    }
}
