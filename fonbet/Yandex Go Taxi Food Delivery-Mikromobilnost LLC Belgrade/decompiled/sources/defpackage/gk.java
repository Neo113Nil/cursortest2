package defpackage;

import ru.yandex.taxi.am.GoAccountType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class gk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GoAccountType.values().length];
        try {
            iArr[GoAccountType.Yandex.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GoAccountType.Lite.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GoAccountType.Phonish.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GoAccountType.Social.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GoAccountType.None.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
