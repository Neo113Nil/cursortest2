package com.yandex.div2;

import defpackage.fcl;
import defpackage.i8l;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.pcl;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class h2 {
    public static final fcl a = new fcl(new pcl());
    public static final kvo b;
    public static final kvo c;
    public static final qkj d;
    public static final i8l e;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        b = ngd0.m(divSizeUnit);
        c = ngd0.m(Double.valueOf(1.0d));
        d = new qkj(DivStrokeJsonParser$Companion$TYPE_HELPER_UNIT$1.w, divSizeUnit);
        e = new i8l(13);
    }
}
