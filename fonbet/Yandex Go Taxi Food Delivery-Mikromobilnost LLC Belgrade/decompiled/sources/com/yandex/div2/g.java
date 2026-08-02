package com.yandex.div2;

import com.yandex.div2.DivAccessibility;
import defpackage.c4x;
import defpackage.exq;
import defpackage.ft6;
import defpackage.hex;
import defpackage.lb7;
import defpackage.ngd0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;
    public final exq f;
    public final exq g;

    static {
        ngd0.m(DivAccessibility.Mode.DEFAULT);
        ngd0.m(Boolean.FALSE);
        b bVar = DivAccessibility.Type.Converter;
    }

    public g(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5, exq exqVar6, exq exqVar7) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
        this.f = exqVar6;
        this.g = exqVar7;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        d dVar = (d) ft6.b.I.getValue();
        lb7 lb7Var = ft6.a;
        dVar.getClass();
        return d.c(lb7Var, this);
    }
}
