package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class bda {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersActiveOrderStatus.values().length];
        try {
            iArr[ChargersActiveOrderStatus.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersActiveOrderStatus.RESERVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersActiveOrderStatus.EXECUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersActiveOrderStatus.LEASING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersActiveOrderStatus.CANCELED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChargersActiveOrderStatus.FINISHED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
