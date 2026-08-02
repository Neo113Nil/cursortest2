package defpackage;

import ru.yandex.logistics.care.camera.ui.ConfirmAction;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gs8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConfirmAction.values().length];
        try {
            iArr[ConfirmAction.Reject.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConfirmAction.Accept.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
