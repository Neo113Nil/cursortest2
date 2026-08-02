package com.yandex.go.pin.api.v2;

import android.view.View;
import com.yandex.go.pin.api.BasePinVersionController$init$1;
import com.yandex.go.pin.api.BasePinVersionController$listenState$1;
import defpackage.ah00;
import defpackage.b1c0;
import defpackage.hbp0;
import defpackage.pwy0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.weu;
import defpackage.x65;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c extends x65 {
    public final PinV2Component i;
    public final b1c0 j;
    public final pwy0 k;

    public c(PinV2Component pinV2Component, b1c0 b1c0Var, pwy0 pwy0Var, ah00 ah00Var, tt2 tt2Var) {
        super(tt2Var, ah00Var);
        this.i = pinV2Component;
        this.j = b1c0Var;
        this.k = pwy0Var;
        c().setVisibility(4);
        c().addOnAttachStateChangeListener(new BasePinVersionController$init$1(this));
        this.g = ru.yandex.taxi.design.utils.c.i(6.0f, c());
    }

    @Override // defpackage.x65
    public final void a() {
        PinV2Controller$attach$2 pinV2Controller$attach$2 = new PinV2Controller$attach$2(1, this.i, PinV2Component.class, "updateControlState", "updateControlState(Lru/yandex/taxi/widget/map/SourceOnMapControl$State;)V", 0);
        b1c0 b1c0Var = this.j;
        r0 r0Var = this.f;
        tpr b = b1c0Var.b(r0Var);
        hbp0 hbp0Var = this.e;
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(b, this, pinV2Controller$attach$2, true, null), 3);
        PinV2Controller$attach$3 pinV2Controller$attach$3 = new PinV2Controller$attach$3(1, this.i, PinV2Component.class, "updateControlStyle", "updateControlStyle(Lru/yandex/taxi/widget/map/PinV2Style;)V", 0);
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(new m0(e.t(b1c0Var.c()), this.k.a(), new PinV2Controller$getThemeDependentStyleFlow$1$1(3, null)), this, pinV2Controller$attach$3, false, null), 3);
        weu weuVar = new weu(23, this);
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(b1c0Var.a(r0Var), this, weuVar, true, null), 3);
        PinV2Controller$attach$7 pinV2Controller$attach$7 = new PinV2Controller$attach$7(1, this, c.class, "updateVisibility", "updateVisibility(Z)V", 0);
        tje.N(hbp0Var.c(), null, null, new BasePinVersionController$listenState$1(b1c0Var.d(), this, pinV2Controller$attach$7, true, null), 3);
    }

    public final View c() {
        return this.i;
    }
}
