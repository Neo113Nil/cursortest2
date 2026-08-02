package xsna;

import android.view.View;
import com.vkontakte.android.ui.widget.PagerSlidingTabStripBase;

/* compiled from: PagerSlidingTabStripBase.java */
/* loaded from: classes7.dex */
public final class dc90 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ PagerSlidingTabStripBase c;

    public dc90(PagerSlidingTabStripBase pagerSlidingTabStripBase, int i) {
        this.c = pagerSlidingTabStripBase;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.f.setCurrentItem(this.b);
    }
}
