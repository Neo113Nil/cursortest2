package com.yandex.div2;

import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.z3k;

/* loaded from: classes11.dex */
public abstract class v0 {
    public static final kvo a = ngd0.m(Double.valueOf(1.0d));
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final qkj f;
    public static final qkj g;
    public static final qkj h;
    public static final z3k i;

    static {
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        b = ngd0.m(divAlignmentHorizontal);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        c = ngd0.m(divAlignmentVertical);
        d = ngd0.m(Boolean.FALSE);
        DivImageScale divImageScale = DivImageScale.FILL;
        e = ngd0.m(divImageScale);
        f = new qkj(DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1.w, divAlignmentHorizontal);
        g = new qkj(DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1.w, divAlignmentVertical);
        h = new qkj(DivImageBackgroundJsonParser$Companion$TYPE_HELPER_SCALE$1.w, divImageScale);
        i = new z3k(23);
    }
}
