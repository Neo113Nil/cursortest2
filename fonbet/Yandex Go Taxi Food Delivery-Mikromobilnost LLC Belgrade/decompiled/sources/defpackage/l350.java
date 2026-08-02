package defpackage;

import ru.yandex.taxi.settings.main.NativeMenuState;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class l350 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NativeMenuState.values().length];
        try {
            iArr[NativeMenuState.OPENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeMenuState.CLOSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeMenuState.OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeMenuState.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
