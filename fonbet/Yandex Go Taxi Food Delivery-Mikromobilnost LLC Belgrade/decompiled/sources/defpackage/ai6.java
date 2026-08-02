package defpackage;

import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ai6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodVerificationSession.Backend.values().length];
        try {
            iArr[PaymentMethodVerificationSession.Backend.PROFILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodVerificationSession.Backend.DOMAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
