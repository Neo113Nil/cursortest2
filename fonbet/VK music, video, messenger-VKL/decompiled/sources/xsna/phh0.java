package xsna;

import android.view.View;
import com.vk.core.ui.swipes.ButtonsSwipeView;

/* compiled from: ScrollableVh.kt */
/* loaded from: classes17.dex */
public interface phh0 {
    View M4();

    default void h0() {
        if (p3().getInitialScrollOffset() - p3().getScrollX() != 0) {
            if (M4().isAttachedToWindow()) {
                p3().b();
            } else {
                ButtonsSwipeView p3 = p3();
                p3.scrollTo(p3.getInitialScrollOffset(), 0);
            }
        }
    }

    ButtonsSwipeView p3();
}
