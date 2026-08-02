package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cgi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DisplayTargetsItemDto.values().length];
        try {
            iArr[DisplayTargetsItemDto.DELIVERY_DASHBOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DisplayTargetsItemDto.MULTIORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DisplayTargetsItemDto.SUMMARY_TRAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
