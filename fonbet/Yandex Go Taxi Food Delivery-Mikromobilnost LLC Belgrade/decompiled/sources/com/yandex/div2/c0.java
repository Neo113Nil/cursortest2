package com.yandex.div2;

import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.tlk;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final kvo a = ngd0.m(Double.valueOf(0.0d));
    public static final kvo b = ngd0.m(200L);
    public static final kvo c;
    public static final kvo d;
    public static final qkj e;
    public static final tlk f;
    public static final tlk g;
    public static final tlk h;

    static {
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        c = ngd0.m(divAnimationInterpolator);
        d = ngd0.m(0L);
        e = new qkj(DivFadeTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        f = new tlk(15);
        g = new tlk(16);
        h = new tlk(17);
    }
}
