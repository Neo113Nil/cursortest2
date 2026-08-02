package com.yandex.go.scooters.offers.v2.surge.info;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.ho4;
import defpackage.lys;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.srh0;
import defpackage.xng0;
import defpackage.z2p0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.BalanceBarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final /* synthetic */ int U = 0;
    public final ru.yandex.taxi.widget.utils.e S;
    public final ho4 T;

    public a(ListItemComponent listItemComponent, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent);
        this.S = eVar;
        View inflate = LayoutInflater.from(listItemComponent.getContext()).inflate(srh0.scooters_surge_info_balance_item_content, (ViewGroup) null, false);
        int i = qfh0.balance_content_bar;
        BalanceBarView balanceBarView = (BalanceBarView) cma1.O(i, inflate);
        if (balanceBarView != null) {
            i = qfh0.balance_content_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                this.T = new ho4((ViewGroup) goLinearLayout, (View) balanceBarView, (Object) robotoTextView, 14);
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
                listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent2.setCustomCenterView(goLinearLayout);
                listItemComponent2.setLeadContentDescription("");
                listItemComponent2.setTrailContentDescription("");
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        z2p0 z2p0Var = (z2p0) obj;
        b0(new BalanceItemViewHolder$bind$1(this, z2p0Var, null));
        b0(new BalanceItemViewHolder$bind$2(this, z2p0Var, null));
        ho4 ho4Var = this.T;
        ((RobotoTextView) ho4Var.d).setText(z2p0Var.c);
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        Integer num = z2p0Var.b;
        robotoTextView.setTextColor(num != null ? num.intValue() : ru.yandex.taxi.design.utils.c.c(xng0.textMain, this.a));
        b0(new BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1(this, z2p0Var.d, z2p0Var.b, z2p0Var.a, null));
        ((ListItemComponent) ((View) this.R)).setDividers(DividerPosition.BOTTOM, z2p0Var.g ? DividerType.MARGIN : DividerType.NONE);
    }
}
