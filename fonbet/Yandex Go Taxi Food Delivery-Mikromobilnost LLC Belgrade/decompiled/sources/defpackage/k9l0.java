package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class k9l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalViewOrigin.values().length];
        try {
            iArr[ModalViewOrigin.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalViewOrigin.SUPERAPP_MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalViewOrigin.SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ModalViewOrigin.ON_ORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
