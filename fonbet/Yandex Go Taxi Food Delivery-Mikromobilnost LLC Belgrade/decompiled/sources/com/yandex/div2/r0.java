package com.yandex.div2;

import com.yandex.div2.DivGallery;
import defpackage.i9l;
import defpackage.j73;
import defpackage.j9l;
import defpackage.kvo;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nzk;
import defpackage.qkj;
import defpackage.tlk;

/* loaded from: classes.dex */
public abstract class r0 {
    public static final tlk A;
    public static final kvo a = ngd0.m(Double.valueOf(1.0d));
    public static final kvo b;
    public static final kvo c;
    public static final j9l d;
    public static final kvo e;
    public static final kvo f;
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
    public static final qkj r;
    public static final qkj s;
    public static final tlk t;
    public static final tlk u;
    public static final tlk v;
    public static final tlk w;
    public static final tlk x;
    public static final tlk y;
    public static final tlk z;

    static {
        DivGallery.ContentAlignment contentAlignment = DivGallery.ContentAlignment.START;
        b = ngd0.m(contentAlignment);
        c = ngd0.m(0L);
        d = new j9l(new lql(null, null, null));
        e = ngd0.m(8L);
        DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
        f = ngd0.m(orientation);
        g = ngd0.m(Boolean.FALSE);
        DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
        h = ngd0.m(scrollMode);
        DivGallery.Scrollbar scrollbar = DivGallery.Scrollbar.NONE;
        i = ngd0.m(scrollbar);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = ngd0.m(divVisibility);
        k = new i9l(new nzk(null, null, null));
        l = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1.w, j73.C(DivAlignmentHorizontal.values()));
        m = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, j73.C(DivAlignmentVertical.values()));
        n = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_CROSS_CONTENT_ALIGNMENT$1.w, contentAlignment);
        o = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_ORIENTATION$1.w, orientation);
        p = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLL_CONTENT_ALIGNMENT$1.w, j73.C(DivGallery.ContentAlignment.values()));
        q = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLL_MODE$1.w, scrollMode);
        r = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLLBAR$1.w, scrollbar);
        s = new qkj(DivGalleryJsonParser$Companion$TYPE_HELPER_VISIBILITY$1.w, divVisibility);
        t = new tlk(19);
        u = new tlk(20);
        v = new tlk(21);
        w = new tlk(22);
        x = new tlk(23);
        y = new tlk(24);
        z = new tlk(25);
        A = new tlk(26);
    }
}
