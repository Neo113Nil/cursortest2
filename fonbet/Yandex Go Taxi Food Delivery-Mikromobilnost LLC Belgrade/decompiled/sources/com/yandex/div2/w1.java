package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div2.DivSeparator;
import defpackage.c4x;
import defpackage.exq;
import defpackage.ft6;
import defpackage.hex;
import defpackage.lb7;
import defpackage.ngd0;
import defpackage.wcx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w1 implements c4x, hex {
    public final exq a;
    public final exq b;

    static {
        ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        ngd0.m(DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
    }

    public w1(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        q1 q1Var = (q1) ft6.b.a7.getValue();
        lb7 lb7Var = ft6.a;
        q1Var.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.p(this.a, com.yandex.div.internal.parser.b.a, lb7Var, "color", jSONObject);
        wcx.p(this.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING, lb7Var, "orientation", jSONObject);
        return jSONObject;
    }
}
