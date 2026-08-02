package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.izs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorBlueComponentGetter extends ColorComponentGetter {
    public static final ColorBlueComponentGetter INSTANCE = new ColorBlueComponentGetter();
    private static final String name = "getColorBlue";

    private ColorBlueComponentGetter() {
        super(new izs<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentGetter.1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m148invokecIhhviA(color.m192unboximpl());
            }

            /* renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m148invokecIhhviA(int i) {
                return Integer.valueOf(Color.m183blueimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
