package defpackage;

import ru.yandex.taxi.cashback.router.real.typed.screen.TypedScreen;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class no11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TypedScreen.values().length];
        try {
            iArr[TypedScreen.PLUS_BURNS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TypedScreen.CATCHING_UP_CASHBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
