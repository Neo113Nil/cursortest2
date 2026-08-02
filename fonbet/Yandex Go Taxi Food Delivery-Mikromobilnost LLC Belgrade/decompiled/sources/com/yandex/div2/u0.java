package com.yandex.div2;

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
public abstract class u0 {
    public static final pdk a;
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final j9l f;
    public static final kvo g;
    public static final i9l h;
    public static final qkj i;
    public static final qkj j;
    public static final qkj k;
    public static final qkj l;
    public static final qkj m;
    public static final zrk n;
    public static final zrk o;
    public static final zrk p;
    public static final zrk q;
    public static final zrk r;

    static {
        kvo m2 = ngd0.m(100L);
        kvo m3 = ngd0.m(Double.valueOf(0.6d));
        kvo m4 = ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        a = new pdk(m2, m3, m4, ngd0.m(valueOf));
        b = ngd0.m(valueOf);
        c = ngd0.m(Boolean.TRUE);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        d = ngd0.m(divAlignmentHorizontal);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        e = ngd0.m(divAlignmentVertical);
        f = new j9l(new lql(null, null, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        g = ngd0.m(divVisibility);
        h = new i9l(new nzk(null, null, null));
        i = new qkj(DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        j = new qkj(DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        k = new qkj(DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1.w, divAlignmentHorizontal);
        l = new qkj(DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1.w, divAlignmentVertical);
        m = new qkj(DivGridJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        n = new zrk(1);
        o = new zrk(2);
        p = new zrk(3);
        q = new zrk(4);
        r = new zrk(5);
    }
}
