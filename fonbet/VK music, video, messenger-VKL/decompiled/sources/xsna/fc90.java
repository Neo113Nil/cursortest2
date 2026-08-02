package xsna;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;
import com.vkontakte.android.ui.widget.PagerSlidingTabStripBase;

/* compiled from: PagerSlidingTabStripBase.java */
/* loaded from: classes7.dex */
public final class fc90 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ PagerSlidingTabStripBase b;

    public fc90(PagerSlidingTabStripBase pagerSlidingTabStripBase) {
        this.b = pagerSlidingTabStripBase;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    @SuppressLint({"NewApi"})
    public final boolean onPreDraw() {
        PagerSlidingTabStripBase pagerSlidingTabStripBase = this.b;
        pagerSlidingTabStripBase.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = PagerSlidingTabStripBase.G;
        pagerSlidingTabStripBase.e();
        return true;
    }
}
