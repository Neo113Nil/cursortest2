package com.yandex.div2;

import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.qkj;
import defpackage.zgl;

/* loaded from: classes11.dex */
public abstract class d3 {
    public static final kvo a;
    public static final kvo b;
    public static final j9l c;
    public static final kvo d;
    public static final kvo e;
    public static final kvo f;
    public static final kvo g;
    public static final kvo h;
    public static final kvo i;
    public static final i9l j;
    public static final qkj k;
    public static final qkj l;
    public static final qkj m;
    public static final qkj n;
    public static final zgl o;
    public static final zgl p;
    public static final zgl q;
    public static final zgl r;
    public static final zgl s;

    static {
        Double valueOf = Double.valueOf(1.0d);
        a = ngd0.m(valueOf);
        Boolean bool = Boolean.FALSE;
        b = ngd0.m(bool);
        c = new j9l(new lql(null, null, null));
        d = ngd0.m(bool);
        e = ngd0.m(valueOf);
        f = ngd0.m(bool);
        g = ngd0.m(bool);
        DivVideoScale divVideoScale = DivVideoScale.FIT;
        h = ngd0.m(divVideoScale);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        i = ngd0.m(divVisibility);
        j = new i9l(new nzk(null, null, null));
        k = new qkj(DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        l = new qkj(DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        m = new qkj(DivVideoJsonParser$Companion$TYPE_HELPER_SCALE$1.w, divVideoScale);
        n = new qkj(DivVideoJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        o = new zgl(2);
        p = new zgl(3);
        q = new zgl(4);
        r = new zgl(5);
        s = new zgl(6);
    }
}
