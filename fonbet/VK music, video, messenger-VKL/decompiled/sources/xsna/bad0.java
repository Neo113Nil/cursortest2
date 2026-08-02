package xsna;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PrimaryParticipantViewPagerHelper.kt */
/* loaded from: classes7.dex */
public final class bad0 extends ViewPager2.g {
    public final /* synthetic */ dad0 d;

    public bad0(dad0 dad0Var) {
        this.d = dad0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.d.d.c.onNext(Integer.valueOf(i));
    }
}
