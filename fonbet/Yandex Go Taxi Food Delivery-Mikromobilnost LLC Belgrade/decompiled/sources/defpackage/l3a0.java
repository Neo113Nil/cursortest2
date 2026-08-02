package defpackage;

import ru.yandex.tankerapp.models.dto.PaymentKitArguments;
import ru.yandex.tankerapp.models.dto.PaymentKitEnvironment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class l3a0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentKitEnvironment.values().length];
        try {
            iArr[PaymentKitEnvironment.Release.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentKitEnvironment.Debug.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentKitEnvironment.MiminoTesting.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentKitEnvironment.LocalTesting.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentKitEnvironment.CrowdTesting.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentKitArguments.PaymentOption.values().length];
        try {
            iArr2[PaymentKitArguments.PaymentOption.Sbp.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentKitArguments.PaymentOption.NewSbp.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
