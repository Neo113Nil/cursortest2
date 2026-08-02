package com.yandex.div2;

import defpackage.i8l;
import defpackage.j73;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class x2 {
    public static final kvo a = ngd0.m(Double.valueOf(0.0d));
    public static final kvo b;
    public static final kvo c;
    public static final qkj d;
    public static final qkj e;
    public static final qkj f;
    public static final qkj g;
    public static final qkj h;
    public static final i8l i;
    public static final i8l j;
    public static final i8l k;
    public static final i8l l;
    public static final i8l m;
    public static final i8l n;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        b = ngd0.m(divSizeUnit);
        c = ngd0.m(0L);
        d = new qkj(DivTextRangeJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivTextAlignmentVertical.values()));
        e = new qkj(DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1.w, divSizeUnit);
        f = new qkj(DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1.w, j73.C(DivFontWeight.values()));
        g = new qkj(DivTextRangeJsonParser$Companion$TYPE_HELPER_STRIKE$1.w, j73.C(DivLineStyle.values()));
        h = new qkj(DivTextRangeJsonParser$Companion$TYPE_HELPER_UNDERLINE$1.w, j73.C(DivLineStyle.values()));
        i = new i8l(24);
        j = new i8l(25);
        k = new i8l(26);
        l = new i8l(27);
        m = new i8l(28);
        n = new i8l(29);
    }
}
