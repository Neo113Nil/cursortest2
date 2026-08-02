package defpackage;

import com.yandex.go.payments.data.model.CostCenters;
import com.yandex.go.payments.data.model.TransportCardDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class jyz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[VerifyStrategy.values().length];
        try {
            iArr[VerifyStrategy.ANTIFRAUD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[CostCenters.InputFormat.values().length];
        try {
            iArr2[CostCenters.InputFormat.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[CostCenters.InputFormat.MIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CostCenters.InputFormat.SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ListPaymentMethodDtoType.values().length];
        try {
            iArr3[ListPaymentMethodDtoType.FAMILY_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ListPaymentMethodDtoType.BUSINESS_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
        int[] iArr4 = new int[TransportCardDto.CardStatus.values().length];
        try {
            iArr4[TransportCardDto.CardStatus.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[TransportCardDto.CardStatus.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
    }
}
