package com.yandex.div2;

import defpackage.i8l;
import defpackage.kvo;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class x1 {
    public static final kvo a;
    public static final qkj b;
    public static final i8l c;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = new kvo(divSizeUnit);
        b = new qkj(DivSizeUnitValueJsonParser$Companion$TYPE_HELPER_UNIT$1.w, divSizeUnit);
        c = new i8l(5);
    }
}
