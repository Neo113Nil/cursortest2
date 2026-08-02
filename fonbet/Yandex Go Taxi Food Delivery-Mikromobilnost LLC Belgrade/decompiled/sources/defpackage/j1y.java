package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestView;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes12.dex */
public final class j1y implements zo31 {
    public final OrderWithTariffSuggestView a;
    public final RecyclerView b;
    public final ListTitleComponent c;

    public j1y(OrderWithTariffSuggestView orderWithTariffSuggestView, RecyclerView recyclerView, ListTitleComponent listTitleComponent) {
        this.a = orderWithTariffSuggestView;
        this.b = recyclerView;
        this.c = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
