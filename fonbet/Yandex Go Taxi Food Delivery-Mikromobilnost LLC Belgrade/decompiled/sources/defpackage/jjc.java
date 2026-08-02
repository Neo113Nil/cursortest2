package defpackage;

import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jjc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultBubbleDecorator$Position.values().length];
        try {
            iArr[DefaultBubbleDecorator$Position.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultBubbleDecorator$Position.OFFSET_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultBubbleDecorator$Position.OFFSET_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DefaultBubbleDecorator$Position.RELATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
