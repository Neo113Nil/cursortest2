package com.yandex.div2;

import defpackage.i8l;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.sqk;

/* loaded from: classes.dex */
public abstract class v2 {
    public static final kvo a;
    public static final sqk b;
    public static final kvo c;
    public static final kvo d;
    public static final kvo e;
    public static final sqk f;
    public static final qkj g;
    public static final qkj h;
    public static final qkj i;
    public static final i8l j;

    static {
        DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.CENTER;
        a = ngd0.m(divTextAlignmentVertical);
        b = new sqk(ngd0.m(20L));
        DivText$Image$IndexingDirection divText$Image$IndexingDirection = DivText$Image$IndexingDirection.NORMAL;
        c = ngd0.m(divText$Image$IndexingDirection);
        d = ngd0.m(Boolean.FALSE);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        e = ngd0.m(divBlendMode);
        f = new sqk(ngd0.m(20L));
        g = new qkj(DivTextImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1.w, divTextAlignmentVertical);
        h = new qkj(DivTextImageJsonParser$Companion$TYPE_HELPER_INDEXING_DIRECTION$1.w, divText$Image$IndexingDirection);
        i = new qkj(DivTextImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1.w, divBlendMode);
        j = new i8l(14);
    }
}
