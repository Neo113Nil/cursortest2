package defpackage;

import com.yandex.go.layers.api.model.params.Mode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class arf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Mode.values().length];
        try {
            iArr[Mode.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Mode.SCOOTERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
