package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.izs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorRedComponentGetter extends ColorComponentGetter {
    public static final ColorRedComponentGetter INSTANCE = new ColorRedComponentGetter();
    private static final String name = "getColorRed";

    private ColorRedComponentGetter() {
        super(new izs<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorRedComponentGetter.1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m152invokecIhhviA(color.m192unboximpl());
            }

            /* renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m152invokecIhhviA(int i) {
                return Integer.valueOf(Color.m190redimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
