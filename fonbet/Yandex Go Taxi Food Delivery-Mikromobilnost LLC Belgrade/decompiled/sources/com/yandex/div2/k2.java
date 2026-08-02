package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.qkj;
import defpackage.y7l;

/* loaded from: classes11.dex */
public abstract class k2 {
    public static final kvo a = ngd0.m(Double.valueOf(1.0d));
    public static final kvo b;
    public static final kvo c;
    public static final j9l d;
    public static final kvo e;
    public static final kvo f;
    public static final kvo g;
    public static final DivEdgeInsets h;
    public static final kvo i;
    public static final DivEdgeInsets j;
    public static final kvo k;
    public static final i9l l;
    public static final qkj m;
    public static final qkj n;
    public static final qkj o;
    public static final y7l p;
    public static final y7l q;
    public static final y7l r;
    public static final y7l s;
    public static final y7l t;
    public static final y7l u;

    static {
        Boolean bool = Boolean.FALSE;
        b = ngd0.m(bool);
        c = ngd0.m(bool);
        d = new j9l(new lql(null, null, null));
        e = ngd0.m(bool);
        f = ngd0.m(0L);
        g = ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        h = new DivEdgeInsets(ngd0.m(0L), ngd0.m(12L), ngd0.m(12L), ngd0.m(0L), 82);
        i = ngd0.m(Boolean.TRUE);
        j = new DivEdgeInsets(ngd0.m(8L), ngd0.m(12L), ngd0.m(12L), ngd0.m(0L), 82);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        k = ngd0.m(divVisibility);
        l = new i9l(new nzk(null, null, null));
        m = new qkj(DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        n = new qkj(DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        o = new qkj(DivTabsJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        p = new y7l(16);
        q = new y7l(17);
        r = new y7l(18);
        s = new y7l(19);
        t = new y7l(20);
        u = new y7l(21);
    }
}
