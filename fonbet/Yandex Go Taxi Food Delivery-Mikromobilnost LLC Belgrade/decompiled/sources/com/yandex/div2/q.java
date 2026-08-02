package com.yandex.div2;

import defpackage.cqk;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.nkk;
import defpackage.qkj;
import defpackage.z3k;

/* loaded from: classes11.dex */
public abstract class q {
    public static final kvo a;
    public static final kvo b;
    public static final nkk c;
    public static final kvo d;
    public static final qkj e;
    public static final qkj f;
    public static final z3k g;
    public static final z3k h;

    static {
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        a = ngd0.m(divAnimationDirection);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        b = ngd0.m(divAnimationInterpolator);
        c = new nkk(new cqk(ngd0.m(1L)));
        d = ngd0.m(0L);
        e = new qkj(DivColorAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1.w, divAnimationDirection);
        f = new qkj(DivColorAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        g = new z3k(9);
        h = new z3k(10);
    }
}
