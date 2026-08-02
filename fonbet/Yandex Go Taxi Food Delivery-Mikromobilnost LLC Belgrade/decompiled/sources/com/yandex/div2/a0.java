package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class a0 {
    public static final kvo a;
    public static final qkj b;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = new kvo(divSizeUnit);
        b = new qkj(DivDimensionJsonParser$Companion$TYPE_HELPER_UNIT$1.w, divSizeUnit);
    }
}
