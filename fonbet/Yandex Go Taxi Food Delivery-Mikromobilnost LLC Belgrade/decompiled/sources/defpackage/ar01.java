package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$HcsFormItemType;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$LegalFormItemType;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$PersonFormItemType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ar01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.ACCOUNT_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.BIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ItemType.INN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ItemType.PAYMENT_PERIOD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ItemType.BENEFICIARY_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ItemType.PAYMENT_PURPOSE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ItemType.VAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ItemType.LAST_NAME.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ItemType.FIRST_NAME.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ItemType.MIDDLE_NAME.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ItemType.MIDDLE_NAME_RADIO_BUTTON.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ItemType.DIV_WIDGET.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ItemType.PERSONAL_ACCOUNT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferRequisiteFormItemType$LegalFormItemType.values().length];
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.DIV_WIDGET.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.ACCOUNT_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.BIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.INN.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.BENEFICIARY_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.VAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[TransferRequisiteFormItemType$LegalFormItemType.PAYMENT_PURPOSE.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        b = iArr2;
        int[] iArr3 = new int[TransferRequisiteFormItemType$PersonFormItemType.values().length];
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.DIV_WIDGET.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.ACCOUNT_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.BIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.LAST_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.FIRST_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME_RADIO_BUTTON.ordinal()] = 7;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[TransferRequisiteFormItemType$PersonFormItemType.PAYMENT_PURPOSE.ordinal()] = 8;
        } catch (NoSuchFieldError unused28) {
        }
        c = iArr3;
        int[] iArr4 = new int[TransferRequisiteFormItemType$HcsFormItemType.values().length];
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.DIV_WIDGET.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.ACCOUNT_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.BIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.INN.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.BENEFICIARY_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.PERSONAL_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PERIOD.ordinal()] = 7;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.VAT.ordinal()] = 8;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr4[TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PURPOSE.ordinal()] = 9;
        } catch (NoSuchFieldError unused37) {
        }
        d = iArr4;
    }
}
