package com.yandex.div.internal.graphics;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import xsna.epx;

/* compiled from: Colormap.kt */
/* loaded from: classes7.dex */
public final class ColormapKt {
    public static final Colormap checkIsNotEmpty(Colormap colormap, Div2View div2View) {
        if (epx.f(colormap, Colormap.EMPTY)) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
        return colormap;
    }
}
