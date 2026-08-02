package com.yandex.div2;

import defpackage.ivk;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class m1 {
    public static final kvo a = ngd0.m(200L);
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final kvo f;
    public static final qkj g;
    public static final ivk h;
    public static final ivk i;
    public static final ivk j;
    public static final ivk k;
    public static final ivk l;

    static {
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        b = ngd0.m(divAnimationInterpolator);
        Double valueOf = Double.valueOf(0.5d);
        c = ngd0.m(valueOf);
        d = ngd0.m(valueOf);
        e = ngd0.m(Double.valueOf(0.0d));
        f = ngd0.m(0L);
        g = new qkj(DivScaleTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        h = new ivk(19);
        i = new ivk(20);
        j = new ivk(21);
        k = new ivk(22);
        l = new ivk(23);
    }
}
