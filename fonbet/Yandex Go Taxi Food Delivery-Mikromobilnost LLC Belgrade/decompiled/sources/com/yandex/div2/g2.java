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

/* loaded from: classes.dex */
public abstract class g2 {
    public static final pdk a;
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final j9l e;
    public static final kvo f;
    public static final kvo g;
    public static final i9l h;
    public static final qkj i;
    public static final qkj j;
    public static final qkj k;
    public static final qkj l;
    public static final i8l m;
    public static final i8l n;
    public static final i8l o;
    public static final i8l p;
    public static final i8l q;

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
        e = new j9l(new lql(null, null, null));
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.STATE_CHANGE;
        f = ngd0.m(divTransitionSelector);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        g = ngd0.m(divVisibility);
        h = new i9l(new nzk(null, null, null));
        i = new qkj(DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        j = new qkj(DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        k = new qkj(DivStateJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1.w, divTransitionSelector);
        l = new qkj(DivStateJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        m = new i8l(8);
        n = new i8l(9);
        o = new i8l(10);
        p = new i8l(11);
        q = new i8l(12);
    }
}
