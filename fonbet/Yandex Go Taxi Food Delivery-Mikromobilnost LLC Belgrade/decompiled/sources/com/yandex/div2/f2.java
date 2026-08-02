package com.yandex.div2;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.j73;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;
import defpackage.y7l;

/* loaded from: classes11.dex */
public abstract class f2 {
    public static final kvo a = ngd0.m(12L);
    public static final kvo b;
    public static final kvo c;
    public static final kvo d;
    public static final qkj e;
    public static final qkj f;
    public static final y7l g;
    public static final y7l h;

    static {
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        b = ngd0.m(divSizeUnit);
        c = ngd0.m(Double.valueOf(0.0d));
        d = ngd0.m(Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR));
        e = new qkj(DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1.w, divSizeUnit);
        f = new qkj(DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1.w, j73.C(DivFontWeight.values()));
        g = new y7l(6);
        h = new y7l(7);
    }
}
