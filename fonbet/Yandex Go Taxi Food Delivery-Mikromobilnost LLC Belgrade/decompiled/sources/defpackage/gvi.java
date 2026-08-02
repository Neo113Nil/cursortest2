package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryBubblePosition;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gvi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryBubblePosition.values().length];
        try {
            iArr[DeliveryBubblePosition.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryBubblePosition.OFFSET_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryBubblePosition.OFFSET_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryBubblePosition.TOP_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[HintBubbleDecorator$Position.values().length];
        try {
            iArr2[HintBubbleDecorator$Position.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.OFFSET_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.OFFSET_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.TOP_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
