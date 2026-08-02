package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import xsna.wzs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorAlphaComponentSetter extends ColorComponentSetter {
    public static final ColorAlphaComponentSetter INSTANCE = new ColorAlphaComponentSetter();
    private static final String name = "setColorAlpha";

    private ColorAlphaComponentSetter() {
        super(new wzs<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorAlphaComponentSetter.1
            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ Color invoke(Color color, Double d) {
                return Color.m184boximpl(m147invokeGnj5c28(color.m192unboximpl(), d.doubleValue()));
            }

            /* renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m147invokeGnj5c28(int i, double d) {
                return Color.Companion.m193argbH0kstlE(ColorFunctionsKt.toColorIntComponentValue(d), Color.m190redimpl(i), Color.m188greenimpl(i), Color.m183blueimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
