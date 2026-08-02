package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerPinTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class l0c0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PerformerPinTypeDto.values().length];
        try {
            iArr[PerformerPinTypeDto.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PerformerPinTypeDto.PEDESTRIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
