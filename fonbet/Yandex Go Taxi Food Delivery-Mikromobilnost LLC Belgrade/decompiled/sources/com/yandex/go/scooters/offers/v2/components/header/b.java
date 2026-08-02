package com.yandex.go.scooters.offers.v2.components.header;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.b5n0;
import defpackage.c0n0;
import defpackage.k7x0;
import defpackage.pav;
import defpackage.qfh0;
import defpackage.sls;
import defpackage.wro0;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final pav b;
    public final k7x0 c;
    public final c0n0 d;
    public final wro0 e;
    public final b5n0 f;
    public final ScootersCardV2.ChargeConfig g;
    public final sls h;
    public final ScootersCardV2.a i;
    public final GoLinearLayout j;

    public b(Context context, pav pavVar, k7x0 k7x0Var, c0n0 c0n0Var, wro0 wro0Var, b5n0 b5n0Var, ScootersCardV2.ChargeConfig chargeConfig, sls slsVar, ScootersCardV2.a aVar) {
        this.a = context;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = c0n0Var;
        this.e = wro0Var;
        this.f = b5n0Var;
        this.g = chargeConfig;
        this.h = slsVar;
        this.i = aVar;
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        goLinearLayout.setOrientation(1);
        goLinearLayout.setId(qfh0.scooters_component_header);
        this.j = goLinearLayout;
    }

    public final ScootersCardHeaderComponent a() {
        ScootersCardHeaderComponent scootersCardHeaderComponent = new ScootersCardHeaderComponent(this.a, null, 0, 0, 14, null);
        scootersCardHeaderComponent.init(this.b, this.c, this.d, this.e, this.g, this.i, new ScootersCardHeaderComponentDelegate$newCardHeaderComponent$1$1(0, this.f, b5n0.class, "insuranceIconClicked", "insuranceIconClicked$preorder()V", 0));
        return scootersCardHeaderComponent;
    }
}
