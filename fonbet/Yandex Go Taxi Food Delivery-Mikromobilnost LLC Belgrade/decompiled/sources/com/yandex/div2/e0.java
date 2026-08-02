package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class e0 {
    public static final kvo a;
    public static final qkj b;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = new kvo(divSizeUnit);
        b = new qkj(DivFixedTranslationJsonParser$Companion$TYPE_HELPER_UNIT$1.w, divSizeUnit);
    }
}
