package com.yandex.div2;

import defpackage.ivk;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class g1 {
    public static final kvo a;
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final qkj f;
    public static final ivk g;
    public static final ivk h;
    public static final ivk i;
    public static final ivk j;

    static {
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        a = ngd0.m(divAnimationInterpolator);
        Double valueOf = Double.valueOf(1.0d);
        b = ngd0.m(valueOf);
        c = ngd0.m(valueOf);
        d = ngd0.m(valueOf);
        e = ngd0.m(valueOf);
        f = new qkj(DivPageTransformationSlideJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        g = new ivk(11);
        h = new ivk(12);
        i = new ivk(13);
        j = new ivk(14);
    }
}
