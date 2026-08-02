package defpackage;

import com.yandex.go.lifecycle.ObtainType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ir60 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ObtainType.values().length];
        try {
            iArr[ObtainType.DO_NOT_WAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObtainType.WAIT_WITHOUT_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ObtainType.WAIT_UNTIL_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
