package defpackage;

import android.view.View;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardCommentSelectorContainerView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ebw implements zo31 {
    public final IntercityDashboardCommentSelectorContainerView a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public ebw(IntercityDashboardCommentSelectorContainerView intercityDashboardCommentSelectorContainerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = intercityDashboardCommentSelectorContainerView;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
