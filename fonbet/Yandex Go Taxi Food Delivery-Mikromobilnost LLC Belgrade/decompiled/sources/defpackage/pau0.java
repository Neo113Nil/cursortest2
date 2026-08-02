package defpackage;

import ru.yandex.taxi.communications.stepsinstructions.model.LoadingState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class pau0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadingState.values().length];
        try {
            iArr[LoadingState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoadingState.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
