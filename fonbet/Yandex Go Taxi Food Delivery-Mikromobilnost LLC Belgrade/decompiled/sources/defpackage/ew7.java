package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ew7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CancelTypeDto.values().length];
        try {
            iArr[CancelTypeDto.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelTypeDto.PAID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
