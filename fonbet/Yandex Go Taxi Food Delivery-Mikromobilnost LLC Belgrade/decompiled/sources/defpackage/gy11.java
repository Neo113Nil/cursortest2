package defpackage;

import com.yandex.go.drive.unifiedpolling.dto.DriveOrderStatusDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gy11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveOrderStatusDto.values().length];
        try {
            iArr[DriveOrderStatusDto.RESERVATION_FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveOrderStatusDto.RESERVATION_PAID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveOrderStatusDto.ACCEPTANCE_FREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DriveOrderStatusDto.ACCEPTANCE_PAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DriveOrderStatusDto.RIDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DriveOrderStatusDto.PARKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DriveOrderStatusDto.UNRECOGNIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
