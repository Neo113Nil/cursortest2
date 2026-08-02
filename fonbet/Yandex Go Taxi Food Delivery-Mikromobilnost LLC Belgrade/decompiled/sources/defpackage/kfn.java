package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.superapp.orders.card.OrderCardView;
import ru.yandex.taxi.design.BackButtonIconComponent;

/* loaded from: classes14.dex */
public final class kfn implements zo31 {
    public final LinearLayout a;
    public final BackButtonIconComponent b;
    public final OrderCardView c;
    public final View d;

    public kfn(LinearLayout linearLayout, BackButtonIconComponent backButtonIconComponent, OrderCardView orderCardView, View view) {
        this.a = linearLayout;
        this.b = backButtonIconComponent;
        this.c = orderCardView;
        this.d = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
