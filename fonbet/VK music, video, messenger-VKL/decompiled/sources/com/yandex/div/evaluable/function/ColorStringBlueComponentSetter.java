package com.yandex.div.evaluable.function;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorStringBlueComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringBlueComponentSetter INSTANCE = new ColorStringBlueComponentSetter();
    private static final String name = "setColorBlue";

    private ColorStringBlueComponentSetter() {
        super(ColorBlueComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
