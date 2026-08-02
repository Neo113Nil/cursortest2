package defpackage;

import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorPaymentConfiguration$PreferredMode;
import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorScreen;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class eia0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusTarifficatorScreen.values().length];
        try {
            iArr[PlusTarifficatorScreen.UPSALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusTarifficatorScreen.FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusTarifficatorScreen.CONTACTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusTarifficatorScreen.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusTarifficatorScreen.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusTarifficatorPaymentConfiguration$PreferredMode.values().length];
        try {
            iArr2[PlusTarifficatorPaymentConfiguration$PreferredMode.SILENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlusTarifficatorPaymentConfiguration$PreferredMode.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
