package defpackage;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiState$Content$DiscountsTabType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fu9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ChargersDiscountsListEntryPoint.values().length];
        try {
            iArr[ChargersDiscountsListEntryPoint.DISCOVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersDiscountsListEntryPoint.OFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersDiscountsListEntryPoint.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersDiscountsListEntryPoint.FEEDBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersDiscountsListEntryPoint.DISCOVERY_PROMO_NOTCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ChargersDiscountsListUiState$Content$DiscountsTabType.values().length];
        try {
            iArr2[ChargersDiscountsListUiState$Content$DiscountsTabType.RENTAL_PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ChargersDiscountsListUiState$Content$DiscountsTabType.PARTNER_PROMO.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ChargersDiscountsListUiState$Content$DiscountsTabType.TASKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
