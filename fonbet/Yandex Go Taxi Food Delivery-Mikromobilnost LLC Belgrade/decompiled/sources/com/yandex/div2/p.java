package com.yandex.div2;

import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.z3k;

/* loaded from: classes11.dex */
public abstract class p {
    public static final kvo a = ngd0.m(200L);
    public static final kvo b;
    public static final kvo c;
    public static final qkj d;
    public static final z3k e;
    public static final z3k f;

    static {
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        b = ngd0.m(divAnimationInterpolator);
        c = ngd0.m(0L);
        d = new qkj(DivChangeBoundsTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        e = new z3k(4);
        f = new z3k(5);
    }
}
