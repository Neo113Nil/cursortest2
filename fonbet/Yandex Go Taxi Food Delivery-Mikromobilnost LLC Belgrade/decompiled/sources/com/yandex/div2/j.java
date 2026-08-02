package com.yandex.div2;

import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class j {
    public static final kvo a = ngd0.m(Boolean.TRUE);
    public static final kvo b = ngd0.m(0L);
    public static final kvo c = ngd0.m(0L);
    public static final kvo d;
    public static final qkj e;

    static {
        DivActionScrollBy$Overflow divActionScrollBy$Overflow = DivActionScrollBy$Overflow.CLAMP;
        d = ngd0.m(divActionScrollBy$Overflow);
        e = new qkj(DivActionScrollByJsonParser$Companion$TYPE_HELPER_OVERFLOW$1.w, divActionScrollBy$Overflow);
    }
}
