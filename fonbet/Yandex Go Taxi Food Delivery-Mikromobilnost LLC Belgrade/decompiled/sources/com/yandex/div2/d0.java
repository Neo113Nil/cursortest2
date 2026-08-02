package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;
import defpackage.tlk;

/* loaded from: classes.dex */
public abstract class d0 {
    public static final kvo a;
    public static final qkj b;
    public static final tlk c;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = new kvo(divSizeUnit);
        b = new qkj(DivFixedSizeJsonParser$Companion$TYPE_HELPER_UNIT$1.w, divSizeUnit);
        c = new tlk(18);
    }
}
