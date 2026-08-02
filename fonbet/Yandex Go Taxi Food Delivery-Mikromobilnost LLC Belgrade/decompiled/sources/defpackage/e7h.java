package defpackage;

import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e7h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultBubbleDecorator$Direction.values().length];
        try {
            iArr[DefaultBubbleDecorator$Direction.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
