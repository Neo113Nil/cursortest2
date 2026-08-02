package defpackage;

import android.view.View;
import com.yandex.go.taxi.summary.shared.expanded.SummaryExpandedView$ScrollingState;

/* loaded from: classes6.dex */
public interface efv0 extends nwy0 {
    View asView();

    View getFocusedView();

    void onGoingToExpand();

    void onGoingToHide();

    void setScrollingState(SummaryExpandedView$ScrollingState summaryExpandedView$ScrollingState);
}
