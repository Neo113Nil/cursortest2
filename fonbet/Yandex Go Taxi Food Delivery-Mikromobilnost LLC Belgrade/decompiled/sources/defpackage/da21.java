package defpackage;

import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class da21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SimpleIdFormFieldEntity.values().length];
        try {
            iArr[SimpleIdFormFieldEntity.BIRTHDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SimpleIdFormFieldEntity.LAST_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SimpleIdFormFieldEntity.FIRST_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SimpleIdFormFieldEntity.MIDDLE_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SimpleIdFormFieldEntity.INN_OR_SNILS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SimpleIdFormFieldEntity.PASSPORT_NUMBER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
