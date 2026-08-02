package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes10.dex */
public final class l implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ ScrollingTabContainerView b;

    public l(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.b = scrollingTabContainerView;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        int left = view.getLeft();
        ScrollingTabContainerView scrollingTabContainerView = this.b;
        scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
        scrollingTabContainerView.mTabSelector = null;
    }
}
