package com.yandex.div2;

import com.yandex.div2.DivSlideTransition;
import defpackage.c4x;
import defpackage.exq;
import defpackage.ft6;
import defpackage.hex;
import defpackage.ngd0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d2 implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;

    static {
        ngd0.m(200L);
        ngd0.m(DivSlideTransition.Edge.BOTTOM);
        ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
        ngd0.m(0L);
    }

    public d2(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((a2) ft6.b.s7.getValue()).b(ft6.a, this);
    }
}
