package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.Align;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gqs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Align.values().length];
        try {
            iArr[Align.LEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Align.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
