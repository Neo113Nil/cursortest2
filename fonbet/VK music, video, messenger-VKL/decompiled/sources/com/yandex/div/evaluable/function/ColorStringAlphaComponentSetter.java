package com.yandex.div.evaluable.function;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorStringAlphaComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringAlphaComponentSetter INSTANCE = new ColorStringAlphaComponentSetter();
    private static final String name = "setColorAlpha";

    private ColorStringAlphaComponentSetter() {
        super(ColorAlphaComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
