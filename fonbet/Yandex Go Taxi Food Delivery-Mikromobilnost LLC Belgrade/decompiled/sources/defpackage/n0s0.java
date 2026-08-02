package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.VerticalContentAlignment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class n0s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerticalContentAlignment.values().length];
        try {
            iArr[VerticalContentAlignment.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalContentAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerticalContentAlignment.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
