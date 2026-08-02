package xsna;

import com.vk.navigation.SwipableTabsView;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oln0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ SwipableTabsView c;

    public /* synthetic */ oln0(int i, SwipableTabsView swipableTabsView) {
        this.b = i;
        this.c = swipableTabsView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Integer> list = SwipableTabsView.u;
        SwipableTabsView swipableTabsView = this.c;
        int width = swipableTabsView.getWidth();
        int i = this.b;
        int i2 = width * i;
        if (swipableTabsView.getScrollX() == i2 || i < 0 || i >= swipableTabsView.getChildCount()) {
            return;
        }
        swipableTabsView.k = i;
        swipableTabsView.r.forceFinished(true);
        swipableTabsView.o = -1;
        swipableTabsView.scrollTo(i2, 0);
        swipableTabsView.invalidate();
    }
}
