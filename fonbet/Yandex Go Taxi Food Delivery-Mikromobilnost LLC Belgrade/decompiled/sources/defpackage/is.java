package defpackage;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.ButtonActionType;
import com.yandex.go.overdraft.data.model.ComparisonType;
import com.yandex.go.overdraft.data.model.ConditionType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class is {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ConditionType.values().length];
        try {
            iArr[ConditionType.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConditionType.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ButtonActionType.values().length];
        try {
            iArr2[ButtonActionType.TOP_UP_YANDEX_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ButtonActionType.TOP_UP_YANGO_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[PaymentMethod$Type.values().length];
        try {
            iArr3[PaymentMethod$Type.YB_WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[PaymentMethod$Type.YANGO_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
        int[] iArr4 = new int[ComparisonType.values().length];
        try {
            iArr4[ComparisonType.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[ComparisonType.AT_LEAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[ComparisonType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
        int[] iArr5 = new int[OverdraftContext.values().length];
        try {
            iArr5[OverdraftContext.SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[OverdraftContext.MAIN_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[OverdraftContext.ACTIVE_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[OverdraftContext.ORDER_PAY_CASH.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[OverdraftContext.ORDER_WITH_DEBT.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
    }
}
