package com.yandex.div.evaluable.function;

import defpackage.eob1;
import defpackage.jdc;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljdc;", "color", "", "blue", "invoke-Gnj5c28", "(ID)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class ColorBlueComponentSetter$1 extends Lambda implements wls {
    public static final ColorBlueComponentSetter$1 w = new ColorBlueComponentSetter$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((jdc) obj).a;
        int i2 = i >>> 24;
        int i3 = (i >> 16) & 255;
        return new jdc((((i >> 8) & 255) << 8) | (i2 << 24) | (i3 << 16) | eob1.c(((Number) obj2).doubleValue()));
    }
}
