package com.yandex.go.taxi.order.change.source.analytics.pin;

import android.content.Context;
import defpackage.b1c0;
import defpackage.c0c0;
import defpackage.e0c0;
import defpackage.f1h0;
import defpackage.g92;
import defpackage.ig9;
import defpackage.me0;
import defpackage.p2c0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.xzb0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes14.dex */
public final class e extends b1c0 {
    public final me0 a;
    public final ig9 b;
    public final p2c0 c;
    public final SourceOnMapControl.a d;
    public final SourceOnMapControl.a e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(me0 me0Var, ig9 ig9Var, p2c0 p2c0Var) {
        this.a = me0Var;
        this.b = ig9Var;
        this.c = p2c0Var;
        CharSequence charSequence = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        ru.yandex.taxi.widget.map.b bVar = null;
        this.d = new SourceOnMapControl.a(new c0c0(tje.y(f1h0.ic_source_pin_24, me0Var.a)), charSequence, str, z, z2, bVar, null, 2046);
        this.e = new SourceOnMapControl.a(e0c0.a, str, null, z2, false, 0 == true ? 1 : 0, null, 2046);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.b.a.b, new ChangeSourcePointPinV2DataRepository$positionFlow$1(this.c.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        ig9 ig9Var = this.b;
        return new d(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.K(ig9Var.b, new b(ig9Var.a.a)), 100L)), this);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        me0 me0Var = this.a;
        me0Var.getClass();
        xzb0 xzb0Var = PinSlot.Companion;
        Context context = me0Var.a;
        xzb0Var.getClass();
        return new g92(2, xzb0.a(context));
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
