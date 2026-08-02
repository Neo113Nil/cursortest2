package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.pdk;
import defpackage.qkj;
import defpackage.tlk;
import defpackage.zrk;

/* loaded from: classes.dex */
public abstract class t0 {
    public static final pdk a;
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final j9l f;
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
    public static final tlk r;
    public static final tlk s;
    public static final tlk t;
    public static final zrk u;

    static {
        kvo m2 = ngd0.m(100L);
        kvo m3 = ngd0.m(Double.valueOf(0.6d));
        kvo m4 = ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        a = new pdk(m2, m3, m4, ngd0.m(valueOf));
        b = ngd0.m(valueOf);
        c = ngd0.m(Boolean.TRUE);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        d = ngd0.m(divAlignmentHorizontal);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        e = ngd0.m(divAlignmentVertical);
        f = new j9l(new lql(null, null, null));
        g = ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        h = ngd0.m(Boolean.FALSE);
        DivImageScale divImageScale = DivImageScale.FILL;
        i = ngd0.m(divImageScale);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = ngd0.m(divVisibility);
        k = new i9l(new nzk(null, null, null));
        l = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        m = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        n = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1.w, divAlignmentHorizontal);
        o = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1.w, divAlignmentVertical);
        p = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_SCALE$1.w, divImageScale);
        q = new qkj(DivGifImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        r = new tlk(27);
        s = new tlk(28);
        t = new tlk(29);
        u = new zrk(0);
    }
}
