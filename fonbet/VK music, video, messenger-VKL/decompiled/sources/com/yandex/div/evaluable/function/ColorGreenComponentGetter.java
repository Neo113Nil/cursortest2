package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.izs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorGreenComponentGetter extends ColorComponentGetter {
    public static final ColorGreenComponentGetter INSTANCE = new ColorGreenComponentGetter();
    private static final String name = "getColorGreen";

    private ColorGreenComponentGetter() {
        super(new izs<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentGetter.1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m150invokecIhhviA(color.m192unboximpl());
            }

            /* renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m150invokecIhhviA(int i) {
                return Integer.valueOf(Color.m188greenimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
