package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.wzs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorGreenComponentSetter extends ColorComponentSetter {
    public static final ColorGreenComponentSetter INSTANCE = new ColorGreenComponentSetter();
    private static final String name = "setColorGreen";

    private ColorGreenComponentSetter() {
        super(new wzs<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentSetter.1
            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ Color invoke(Color color, Double d) {
                return Color.m184boximpl(m151invokeGnj5c28(color.m192unboximpl(), d.doubleValue()));
            }

            /* renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m151invokeGnj5c28(int i, double d) {
                return Color.Companion.m193argbH0kstlE(Color.m182alphaimpl(i), Color.m190redimpl(i), ColorFunctionsKt.toColorIntComponentValue(d), Color.m183blueimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
