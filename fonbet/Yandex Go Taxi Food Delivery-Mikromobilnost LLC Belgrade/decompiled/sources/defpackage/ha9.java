package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ha9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClickSource.values().length];
        try {
            iArr[ClickSource.ACTIONS_BLOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClickSource.DYNAMIC_CONTENT_BLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
