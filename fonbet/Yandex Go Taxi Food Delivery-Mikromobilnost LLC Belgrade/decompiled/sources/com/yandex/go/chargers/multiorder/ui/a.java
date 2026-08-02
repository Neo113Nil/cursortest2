package com.yandex.go.chargers.multiorder.ui;

import android.view.View;
import defpackage.kdc;
import defpackage.lys;
import defpackage.mcb1;
import defpackage.p5a;
import defpackage.pav;
import defpackage.tje;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class a extends lys {
    public static final /* synthetic */ int T = 0;
    public final pav S;

    public a(ButtonComponent buttonComponent, pav pavVar) {
        super(buttonComponent);
        this.S = pavVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        p5a p5aVar = (p5a) obj;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) this.R);
        buttonComponent.setButtonSize(3);
        View view = this.a;
        buttonComponent.setRoundedCornersRadius(ru.yandex.taxi.design.utils.c.h(16, view));
        buttonComponent.setText(mcb1.b(buttonComponent, p5aVar.a, "", 0, 12));
        kdc kdcVar = p5aVar.d;
        buttonComponent.setButtonBackground(kdcVar);
        buttonComponent.setDisabledButtonBackground(kdcVar);
        buttonComponent.setTextIconPadding(tje.v(view.getContext(), 4.0f));
        String str = p5aVar.b;
        if (str != null) {
            Z(new ButtonViewHolder$bindImageLoading$1$1(this, str, null), "IMAGE_LOADING_TASK_KEY_BUTTON", true);
        }
        buttonComponent.setEnabled(p5aVar.e);
    }
}
