package defpackage;

import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o24 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SettingStatus.values().length];
        try {
            iArr[SettingStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SettingStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentMethodType.values().length];
        try {
            iArr2[PaymentMethodType.SavingsAccount.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PaymentMethodType.Me2Me.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PaymentMethodType.Card.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PaymentMethodType.YandexAccount.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
