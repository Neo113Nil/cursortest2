package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BubblePosition.values().length];
        try {
            iArr[BubblePosition.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BubblePosition.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
