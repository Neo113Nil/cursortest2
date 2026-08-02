package com.yandex.div2;

import com.yandex.div2.DivSlideTransition;
import defpackage.i8l;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class c2 {
    public static final kvo a = ngd0.m(200L);
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final qkj e;
    public static final qkj f;
    public static final i8l g;
    public static final i8l h;

    static {
        DivSlideTransition.Edge edge = DivSlideTransition.Edge.BOTTOM;
        b = ngd0.m(edge);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        c = ngd0.m(divAnimationInterpolator);
        d = ngd0.m(0L);
        e = new qkj(DivSlideTransitionJsonParser$Companion$TYPE_HELPER_EDGE$1.w, edge);
        f = new qkj(DivSlideTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        g = new i8l(6);
        h = new i8l(7);
    }
}
