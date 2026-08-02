package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.header.OrderCardHeaderView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SearchProgressBar;

/* loaded from: classes14.dex */
public final class gm70 implements zo31 {
    public final OrderCardHeaderView a;
    public final ListItemComponent b;

    public gm70(OrderCardHeaderView orderCardHeaderView, ListItemComponent listItemComponent, SearchProgressBar searchProgressBar) {
        this.a = orderCardHeaderView;
        this.b = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
