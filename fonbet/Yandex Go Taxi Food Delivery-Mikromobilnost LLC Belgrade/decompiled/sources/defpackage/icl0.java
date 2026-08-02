package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class icl0 extends ncl0 {
    public final pvn O;
    public final ListItemComponent P;

    public icl0(View view) {
        super(view);
        this.O = pvn.a;
        int i = h7h0.route_stop_item_title;
        WeakHashMap weakHashMap = b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i));
        this.P = listItemComponent;
        listItemComponent.setLeadImage(yyg0.ic_order_card_source);
        listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
    }

    @Override // defpackage.ncl0
    public final void W(zfu0 zfu0Var) {
        String h = zfu0Var.h();
        ListItemComponent listItemComponent = this.P;
        listItemComponent.setTitle(h);
        listItemComponent.setSubtitle(zfu0Var.g());
    }

    @Override // defpackage.ncl0
    public final void X(int i, boolean z) {
    }

    @Override // defpackage.ncl0
    public final tpr Y() {
        return this.O;
    }

    @Override // defpackage.ncl0
    public final boolean Z() {
        return false;
    }
}
