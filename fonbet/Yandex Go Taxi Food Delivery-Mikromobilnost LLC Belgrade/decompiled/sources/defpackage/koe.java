package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.shortcuts.impl.ui.feed.CoordinatorFeedView;
import com.yandex.go.shortcuts.impl.ui.feed.StickyView;

/* loaded from: classes13.dex */
public final class koe implements zo31 {
    public final CoordinatorFeedView a;
    public final FrameLayout b;

    public koe(CoordinatorFeedView coordinatorFeedView, FrameLayout frameLayout, FrameLayout frameLayout2, StickyView stickyView) {
        this.a = coordinatorFeedView;
        this.b = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
