package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTypeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gw9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersDiscountsTypeDto.values().length];
        try {
            iArr[ChargersDiscountsTypeDto.RENTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersDiscountsTypeDto.PARTNERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersDiscountsTypeDto.TASKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
