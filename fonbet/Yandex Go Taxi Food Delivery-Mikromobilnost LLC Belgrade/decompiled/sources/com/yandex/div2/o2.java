package com.yandex.div2;

import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.j73;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.y7l;

/* loaded from: classes11.dex */
public abstract class o2 {
    public static final kvo a = ngd0.m(-9120);
    public static final kvo b = ngd0.m(-872415232);
    public static final kvo c = ngd0.m(300L);
    public static final kvo d;
    public static final kvo e;
    public static final kvo f;
    public static final kvo g;
    public static final kvo h;
    public static final kvo i;
    public static final kvo j;
    public static final DivEdgeInsets k;
    public static final qkj l;
    public static final qkj m;
    public static final qkj n;
    public static final qkj o;
    public static final qkj p;
    public static final y7l q;
    public static final y7l r;
    public static final y7l s;
    public static final y7l t;
    public static final y7l u;
    public static final y7l v;
    public static final y7l w;

    static {
        DivTabs$TabTitleStyle.AnimationType animationType = DivTabs$TabTitleStyle.AnimationType.SLIDE;
        d = ngd0.m(animationType);
        e = ngd0.m(12L);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f = ngd0.m(divSizeUnit);
        DivFontWeight divFontWeight = DivFontWeight.REGULAR;
        g = ngd0.m(divFontWeight);
        h = ngd0.m(Integer.MIN_VALUE);
        i = ngd0.m(0L);
        j = ngd0.m(Double.valueOf(0.0d));
        k = new DivEdgeInsets(ngd0.m(6L), ngd0.m(8L), ngd0.m(8L), ngd0.m(6L), 82);
        l = new qkj(DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1.w, j73.C(DivFontWeight.values()));
        m = new qkj(DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ANIMATION_TYPE$1.w, animationType);
        n = new qkj(DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1.w, divSizeUnit);
        o = new qkj(DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1.w, divFontWeight);
        p = new qkj(DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1.w, j73.C(DivFontWeight.values()));
        q = new y7l(22);
        r = new y7l(23);
        s = new y7l(24);
        t = new y7l(25);
        u = new y7l(26);
        v = new y7l(27);
        w = new y7l(28);
    }
}
