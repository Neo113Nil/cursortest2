package com.yandex.go.payments.shared.wizard.accountsaving;

import com.yandex.go.payments.shared.v;
import defpackage.ad5;
import defpackage.h3y;
import defpackage.il;
import defpackage.izl0;
import defpackage.jzl0;
import defpackage.lq31;
import defpackage.tje;
import defpackage.vnr0;
import defpackage.x42;
import defpackage.ycq0;
import defpackage.zor0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class b extends ad5 implements x42 {
    public final zor0 A;
    public final vnr0 B;
    public final ycq0 C;
    public final h3y D;
    public final il E;
    public final jzl0 x;
    public final a y;
    public final v z;

    public b(jzl0 jzl0Var, a aVar, v vVar, zor0 zor0Var, vnr0 vnr0Var, ycq0 ycq0Var, h3y h3yVar) {
        super(izl0.class);
        this.x = jzl0Var;
        this.y = aVar;
        this.z = vVar;
        this.A = zor0Var;
        this.B = vnr0Var;
        this.C = ycq0Var;
        this.D = h3yVar;
        this.E = jzl0Var.a;
    }

    public final void Kg() {
        tje.N(Jg(), null, null, new SaveAccountPresenter$updateView$1(this, null), 3);
    }

    @Override // defpackage.x42
    public final Map getEventAnalyticsParams(lq31 lq31Var) {
        String str = this.E.b;
        vnr0 vnr0Var = this.B;
        LinkedHashMap linkedHashMap = vnr0Var.s;
        vnr0Var.v(str, linkedHashMap);
        return linkedHashMap;
    }
}
