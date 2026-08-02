package com.yandex.div2;

import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.qkj;
import defpackage.sqk;
import defpackage.zrk;

/* loaded from: classes.dex */
public abstract class h1 {
    public static final kvo a = ngd0.m(Double.valueOf(1.0d));
    public static final kvo b;
    public static final kvo c;
    public static final j9l d;
    public static final kvo e;
    public static final sqk f;
    public static final kvo g;
    public static final kvo h;
    public static final kvo i;
    public static final kvo j;
    public static final i9l k;
    public static final qkj l;
    public static final qkj m;
    public static final qkj n;
    public static final qkj o;
    public static final qkj p;
    public static final qkj q;
    public static final zrk r;
    public static final zrk s;
    public static final zrk t;
    public static final zrk u;
    public static final zrk v;

    static {
        DivPager$ItemAlignment divPager$ItemAlignment = DivPager$ItemAlignment.START;
        b = ngd0.m(divPager$ItemAlignment);
        c = ngd0.m(0L);
        d = new j9l(new lql(null, null, null));
        Boolean bool = Boolean.FALSE;
        e = ngd0.m(bool);
        f = new sqk(ngd0.m(0L));
        DivPager$Orientation divPager$Orientation = DivPager$Orientation.HORIZONTAL;
        g = ngd0.m(divPager$Orientation);
        h = ngd0.m(bool);
        DivPager$ItemAlignment divPager$ItemAlignment2 = DivPager$ItemAlignment.CENTER;
        i = ngd0.m(divPager$ItemAlignment2);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = ngd0.m(divVisibility);
        k = new i9l(new nzk(null, null, null));
        l = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        m = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        n = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_CROSS_AXIS_ALIGNMENT$1.w, divPager$ItemAlignment);
        o = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1.w, divPager$Orientation);
        p = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_SCROLL_AXIS_ALIGNMENT$1.w, divPager$ItemAlignment2);
        q = new qkj(DivPagerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        r = new zrk(21);
        s = new zrk(22);
        t = new zrk(23);
        u = new zrk(24);
        v = new zrk(25);
    }
}
