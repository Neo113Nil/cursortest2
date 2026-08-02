package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderStatusDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class jl9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersActiveOrderStatusDto.values().length];
        try {
            iArr[ChargersActiveOrderStatusDto.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersActiveOrderStatusDto.RESERVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersActiveOrderStatusDto.EXECUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersActiveOrderStatusDto.LEASING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersActiveOrderStatusDto.CANCELED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChargersActiveOrderStatusDto.FINISHED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
