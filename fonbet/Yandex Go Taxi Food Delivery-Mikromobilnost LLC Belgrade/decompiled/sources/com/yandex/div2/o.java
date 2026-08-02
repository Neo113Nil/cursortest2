package com.yandex.div2;

import defpackage.dac;
import defpackage.duk;
import defpackage.j73;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.okk;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class o {
    public static final kvo a = ngd0.m(300L);
    public static final kvo b;
    public static final okk c;
    public static final kvo d;
    public static final qkj e;
    public static final qkj f;
    public static final dac g;
    public static final dac h;

    static {
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.SPRING;
        b = ngd0.m(divAnimationInterpolator);
        c = new okk(new duk());
        d = ngd0.m(0L);
        e = new qkj(DivAnimationJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1.w, divAnimationInterpolator);
        f = new qkj(DivAnimationJsonParser$Companion$TYPE_HELPER_NAME$1.w, j73.C(DivAnimation$Name.values()));
        g = new dac(15);
        h = new dac(16);
    }
}
