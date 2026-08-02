package defpackage;

import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class hpy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkedOrderStatusDto.values().length];
        try {
            iArr[LinkedOrderStatusDto.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderStatusDto.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkedOrderStatusDto.SCHEDULING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LinkedOrderStatusDto.SCHEDULED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LinkedOrderStatusDto.DRIVING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LinkedOrderStatusDto.WAITING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LinkedOrderStatusDto.TRANSPORTING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LinkedOrderStatusDto.COMPLETE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LinkedOrderStatusDto.CANCELLED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LinkedOrderStatusDto.FAILED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[LinkedOrderStatusDto.EXPIRED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
