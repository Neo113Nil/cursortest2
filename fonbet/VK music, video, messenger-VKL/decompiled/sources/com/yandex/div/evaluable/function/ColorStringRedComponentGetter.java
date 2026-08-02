package com.yandex.div.evaluable.function;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public final class ColorStringRedComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringRedComponentGetter INSTANCE = new ColorStringRedComponentGetter();
    private static final String name = "getColorRed";

    private ColorStringRedComponentGetter() {
        super(ColorRedComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
