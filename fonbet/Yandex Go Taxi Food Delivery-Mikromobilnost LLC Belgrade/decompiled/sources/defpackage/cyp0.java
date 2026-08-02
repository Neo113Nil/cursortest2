package defpackage;

import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class cyp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UpgradeFormEntity$SecondDocumentType.values().length];
        try {
            iArr[UpgradeFormEntity$SecondDocumentType.SNILS_OR_INN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeFormEntity$SecondDocumentType.SNILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeFormEntity$SecondDocumentType.INN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
