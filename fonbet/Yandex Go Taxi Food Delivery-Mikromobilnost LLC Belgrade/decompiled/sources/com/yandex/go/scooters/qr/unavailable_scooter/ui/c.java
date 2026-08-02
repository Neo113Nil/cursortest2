package com.yandex.go.scooters.qr.unavailable_scooter.ui;

import android.view.View;
import android.view.ViewGroup;
import defpackage.kyh0;
import defpackage.lys;
import defpackage.mrg0;
import defpackage.nzs;
import defpackage.sqo0;
import defpackage.tje;
import defpackage.tls;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class c extends lys {
    public static final /* synthetic */ int U = 0;
    public final e S;
    public sqo0 T;

    public c(ListItemComponent listItemComponent, final tls tlsVar, e eVar) {
        super(listItemComponent);
        this.S = eVar;
        ButtonComponent buttonComponent = new ButtonComponent(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int r = tje.r(mrg0.go_design_s_space, buttonComponent.getContext());
        marginLayoutParams.setMargins(r, 0, r, 0);
        buttonComponent.setLayoutParams(marginLayoutParams);
        buttonComponent.setButtonSize(0);
        buttonComponent.setMaxLines(1);
        buttonComponent.setTextSize(tje.s(mrg0.component_text_size_caption, buttonComponent.getContext()));
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.scooters_qr_unavailable_scooter_nearest_scooter_show_button));
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.qr.unavailable_scooter.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                sqo0 sqo0Var = c.this.T;
                if (sqo0Var != null) {
                    ((ScootersQrUnavailableScooterModalView$adapter$1) tlsVar).invoke(sqo0Var.b);
                }
            }
        });
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
        nzs.s(listItemComponent2, -1, -2);
        listItemComponent2.setTitle(listItemComponent2.getContext().getString(kyh0.scooters_qr_unavailable_scooter_nearest_scooter_title));
        listItemComponent2.setTrailView(buttonComponent);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.T = null;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        sqo0 sqo0Var = (sqo0) obj;
        this.T = sqo0Var;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        b0(new NearestScooterItemViewHolder$bind$1$1(listItemComponent, this, sqo0Var, null));
        listItemComponent.setSubtitle(sqo0Var.c);
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.MARGIN);
    }
}
