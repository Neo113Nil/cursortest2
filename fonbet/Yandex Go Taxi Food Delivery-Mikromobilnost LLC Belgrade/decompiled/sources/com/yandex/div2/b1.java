package com.yandex.div2;

import com.yandex.div2.DivIndicator;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.k7l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.qkj;
import defpackage.s8l;
import defpackage.sqk;
import defpackage.zrk;

/* loaded from: classes.dex */
public abstract class b1 {
    public static final kvo a = ngd0.m(16768096);
    public static final kvo b = ngd0.m(Double.valueOf(1.3d));
    public static final kvo c = ngd0.m(Double.valueOf(1.0d));
    public static final kvo d;
    public static final j9l e;
    public static final kvo f;
    public static final kvo g;
    public static final s8l h;
    public static final sqk i;
    public static final kvo j;
    public static final i9l k;
    public static final qkj l;
    public static final qkj m;
    public static final qkj n;
    public static final qkj o;
    public static final zrk p;
    public static final zrk q;
    public static final zrk r;
    public static final zrk s;
    public static final zrk t;
    public static final zrk u;

    static {
        DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
        d = ngd0.m(animation);
        e = new j9l(new lql(null, null, null));
        f = ngd0.m(865180853);
        g = ngd0.m(Double.valueOf(0.5d));
        h = new s8l(new k7l(0));
        i = new sqk(ngd0.m(15L));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = ngd0.m(divVisibility);
        k = new i9l(new nzk(null, null, null));
        l = new qkj(DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        m = new qkj(DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        n = new qkj(DivIndicatorJsonParser$Companion$TYPE_HELPER_ANIMATION$1.w, animation);
        o = new qkj(DivIndicatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        p = new zrk(10);
        q = new zrk(11);
        r = new zrk(12);
        s = new zrk(13);
        t = new zrk(14);
        u = new zrk(15);
    }
}
