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
import defpackage.zrk;

/* loaded from: classes.dex */
public abstract class w0 {
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
    public static final kvo k;
    public static final kvo l;
    public static final i9l m;
    public static final qkj n;
    public static final qkj o;
    public static final qkj p;
    public static final qkj q;
    public static final qkj r;
    public static final qkj s;
    public static final qkj t;
    public static final zrk u;
    public static final zrk v;
    public static final zrk w;
    public static final zrk x;

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
        Boolean bool = Boolean.FALSE;
        g = ngd0.m(bool);
        h = ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        i = ngd0.m(bool);
        DivImageScale divImageScale = DivImageScale.FILL;
        j = ngd0.m(divImageScale);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        k = ngd0.m(divBlendMode);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        l = ngd0.m(divVisibility);
        m = new i9l(new nzk(null, null, null));
        n = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        o = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        p = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1.w, divAlignmentHorizontal);
        q = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1.w, divAlignmentVertical);
        r = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_SCALE$1.w, divImageScale);
        s = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1.w, divBlendMode);
        t = new qkj(DivImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        u = new zrk(6);
        v = new zrk(7);
        w = new zrk(8);
        x = new zrk(9);
    }
}
