package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div2.DivSeparator;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.qkj;

/* loaded from: classes.dex */
public abstract class s1 {
    public static final kvo a = ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
    public static final kvo b;
    public static final qkj c;

    static {
        DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
        b = ngd0.m(orientation);
        c = new qkj(DivSeparatorDelimiterStyleJsonParser$Companion$TYPE_HELPER_ORIENTATION$1.w, orientation);
    }
}
