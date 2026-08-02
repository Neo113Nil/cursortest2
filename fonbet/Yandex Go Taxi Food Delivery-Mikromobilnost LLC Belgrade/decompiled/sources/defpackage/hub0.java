package defpackage;

import com.yandex.go.pin.api.v1.Pin$State;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class hub0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Pin$State.values().length];
        try {
            iArr[Pin$State.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Pin$State.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Pin$State.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Pin$State.MOVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Pin$State.IN_PROGRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
