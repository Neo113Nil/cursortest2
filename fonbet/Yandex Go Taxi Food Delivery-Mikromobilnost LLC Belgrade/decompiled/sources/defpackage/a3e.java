package defpackage;

import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a3e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerificationStatus.values().length];
        try {
            iArr[VerificationStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerificationStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerificationStatus.REQUIRED_3DS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VerificationStatus.AMOUNT_EXPECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VerificationStatus.CVN_EXPECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
