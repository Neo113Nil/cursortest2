package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;

/* loaded from: classes3.dex */
public final class n6g0 extends ViewPager2.a {
    public final /* synthetic */ QrContainerFragment a;

    public n6g0(QrContainerFragment qrContainerFragment) {
        this.a = qrContainerFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        v40 tryToGetViewPagerFragmentAt;
        tryToGetViewPagerFragmentAt = this.a.tryToGetViewPagerFragmentAt(i);
        mt31 mt31Var = tryToGetViewPagerFragmentAt instanceof mt31 ? (mt31) tryToGetViewPagerFragmentAt : null;
        if (mt31Var != null) {
            mt31Var.onShownInViewPager();
        }
    }
}
