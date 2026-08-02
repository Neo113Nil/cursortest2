package defpackage;

import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k1s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TileStyle.values().length];
        try {
            iArr[TileStyle.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TileStyle.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
