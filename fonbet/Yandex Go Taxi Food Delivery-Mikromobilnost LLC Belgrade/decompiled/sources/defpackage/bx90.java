package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class bx90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonSize.values().length];
        try {
            iArr[ButtonSize.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonSize.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonSize.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
