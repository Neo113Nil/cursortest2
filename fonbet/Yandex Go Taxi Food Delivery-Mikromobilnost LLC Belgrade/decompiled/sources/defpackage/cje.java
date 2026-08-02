package defpackage;

import ru.yandex.taxi.eatskit.Controller$State;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cje {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Controller$State.values().length];
        try {
            iArr[Controller$State.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Controller$State.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Controller$State.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Controller$State.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Controller$State.NO_AUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
