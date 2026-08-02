package com.yandex.div.evaluable.function;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorStringBlueComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringBlueComponentGetter INSTANCE = new ColorStringBlueComponentGetter();
    private static final String name = "getColorBlue";

    private ColorStringBlueComponentGetter() {
        super(ColorBlueComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
