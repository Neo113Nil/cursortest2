package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.izs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorAlphaComponentGetter extends ColorComponentGetter {
    public static final ColorAlphaComponentGetter INSTANCE = new ColorAlphaComponentGetter();
    private static final String name = "getColorAlpha";

    private ColorAlphaComponentGetter() {
        super(new izs<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorAlphaComponentGetter.1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m146invokecIhhviA(color.m192unboximpl());
            }

            /* renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m146invokecIhhviA(int i) {
                return Integer.valueOf(Color.m182alphaimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
