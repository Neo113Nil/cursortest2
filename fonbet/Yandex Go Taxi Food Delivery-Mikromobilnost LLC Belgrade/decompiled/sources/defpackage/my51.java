package defpackage;

import ru.yandex.taxi.settings.main.NativeMenuState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class my51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NativeMenuState.values().length];
        try {
            iArr[NativeMenuState.OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeMenuState.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeMenuState.OPENING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeMenuState.CLOSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
