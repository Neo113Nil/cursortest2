package defpackage;

import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class f130 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalViewCoordinator$StackChangeType.values().length];
        try {
            iArr[ModalViewCoordinator$StackChangeType.PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalViewCoordinator$StackChangeType.POLL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalViewCoordinator$StackChangeType.CLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
