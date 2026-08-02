package com.yandex.div.evaluable.function;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorStringGreenComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringGreenComponentSetter INSTANCE = new ColorStringGreenComponentSetter();
    private static final String name = "setColorGreen";

    private ColorStringGreenComponentSetter() {
        super(ColorGreenComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
