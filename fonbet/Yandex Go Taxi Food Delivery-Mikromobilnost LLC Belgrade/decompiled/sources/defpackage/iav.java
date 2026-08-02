package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class iav {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContentAlignment.values().length];
        try {
            iArr[ContentAlignment.LEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentAlignment.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
