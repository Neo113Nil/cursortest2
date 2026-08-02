package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nvd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PointTypeDto.values().length];
        try {
            iArr[PointTypeDto.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointTypeDto.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointTypeDto.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PointType.values().length];
        try {
            iArr2[PointType.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PointType.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PointType.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PointType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
