package defpackage;

import com.yandex.quark.js.QuarkJsState;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class nm41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QuarkJsState.values().length];
        try {
            iArr[QuarkJsState.NOT_CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QuarkJsState.DESTROYED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QuarkJsState.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QuarkJsState.CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
