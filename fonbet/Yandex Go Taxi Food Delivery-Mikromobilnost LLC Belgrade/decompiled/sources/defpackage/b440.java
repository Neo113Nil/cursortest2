package defpackage;

import ru.yandex.taxi.masstransit.utils.RefreshState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class b440 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        try {
            iArr[RefreshState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RefreshState.ERROR_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RefreshState.SILENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
