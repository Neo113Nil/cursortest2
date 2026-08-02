package com.yandex.div2;

import com.yandex.div2.DivAccessibility;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class f {
    public static final kvo a;
    public static final kvo b;
    public static final DivAccessibility.Type c;
    public static final qkj d;

    static {
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        a = ngd0.m(mode);
        b = ngd0.m(Boolean.FALSE);
        c = DivAccessibility.Type.AUTO;
        d = new qkj(DivAccessibilityJsonParser$Companion$TYPE_HELPER_MODE$1.w, mode);
    }
}
