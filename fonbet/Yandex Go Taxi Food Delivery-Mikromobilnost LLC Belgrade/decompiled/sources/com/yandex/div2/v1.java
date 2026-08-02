package com.yandex.div2;

import defpackage.i8l;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.pdk;
import defpackage.qkj;
import defpackage.zrk;

/* loaded from: classes.dex */
public abstract class v1 {
    public static final pdk a;
    public static final kvo b;
    public static final kvo c;
    public static final j9l d;
    public static final kvo e;
    public static final i9l f;
    public static final qkj g;
    public static final qkj h;
    public static final qkj i;
    public static final zrk j;
    public static final i8l k;
    public static final i8l l;
    public static final i8l m;

    static {
        kvo m2 = ngd0.m(100L);
        kvo m3 = ngd0.m(Double.valueOf(0.6d));
        kvo m4 = ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        a = new pdk(m2, m3, m4, ngd0.m(valueOf));
        b = ngd0.m(valueOf);
        c = ngd0.m(Boolean.TRUE);
        d = new j9l(new lql(null, null, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        e = ngd0.m(divVisibility);
        f = new i9l(new nzk(null, null, null));
        g = new qkj(DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        h = new qkj(DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        i = new qkj(DivSeparatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        j = new zrk(29);
        k = new i8l(0);
        l = new i8l(1);
        m = new i8l(2);
    }
}
