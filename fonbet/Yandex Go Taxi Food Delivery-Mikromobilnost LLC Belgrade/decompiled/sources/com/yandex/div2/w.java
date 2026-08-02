package com.yandex.div2;

import com.yandex.div2.DivContainer;
import defpackage.dac;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.pdk;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class w {
    public static final pdk a;
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final kvo f;
    public static final j9l g;
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
    public static final dac u;
    public static final dac v;
    public static final dac w;
    public static final dac x;
    public static final dac y;
    public static final dac z;

    static {
        kvo m2 = ngd0.m(100L);
        kvo m3 = ngd0.m(Double.valueOf(0.6d));
        kvo m4 = ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        a = new pdk(m2, m3, m4, ngd0.m(valueOf));
        b = ngd0.m(valueOf);
        Boolean bool = Boolean.TRUE;
        c = ngd0.m(bool);
        d = ngd0.m(bool);
        DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.START;
        e = ngd0.m(divContentAlignmentHorizontal);
        DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
        f = ngd0.m(divContentAlignmentVertical);
        g = new j9l(new lql(null, null, null));
        h = ngd0.m(0L);
        DivContainer.LayoutMode layoutMode = DivContainer.LayoutMode.NO_WRAP;
        i = ngd0.m(layoutMode);
        j = ngd0.m(0L);
        DivContainer.Orientation orientation = DivContainer.Orientation.VERTICAL;
        k = ngd0.m(orientation);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        l = ngd0.m(divVisibility);
        m = new i9l(new nzk(null, null, null));
        n = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        o = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        p = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1.w, divContentAlignmentHorizontal);
        q = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1.w, divContentAlignmentVertical);
        r = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_LAYOUT_MODE$1.w, layoutMode);
        s = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1.w, orientation);
        t = new qkj(DivContainerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        u = new dac(20);
        v = new dac(21);
        w = new dac(22);
        x = new dac(23);
        y = new dac(24);
        z = new dac(25);
    }
}
