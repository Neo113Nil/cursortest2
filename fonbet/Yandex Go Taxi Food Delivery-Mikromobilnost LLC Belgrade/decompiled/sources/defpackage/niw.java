package defpackage;

import android.view.View;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardSeatsSelectorContainerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class niw implements zo31 {
    public final IntercityDashboardSeatsSelectorContainerView a;
    public final RobotoTextView b;
    public final ListItemComponent c;

    public niw(IntercityDashboardSeatsSelectorContainerView intercityDashboardSeatsSelectorContainerView, RobotoTextView robotoTextView, ListItemComponent listItemComponent) {
        this.a = intercityDashboardSeatsSelectorContainerView;
        this.b = robotoTextView;
        this.c = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
