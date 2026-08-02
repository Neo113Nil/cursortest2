package defpackage;

import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dfn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EatsOrderStatusDto.values().length];
        try {
            iArr[EatsOrderStatusDto.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EatsOrderStatusDto.COOKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EatsOrderStatusDto.DELIVERING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EatsOrderStatusDto.DELIVERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EatsOrderStatusDto.CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
