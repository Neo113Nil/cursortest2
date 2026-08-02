package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.card.internal.network.dto.YbCardTypeResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ggs0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[YbCardTypeResponse.values().length];
        try {
            iArr[YbCardTypeResponse.DIGITAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardTypeResponse.PLASTIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CardProductTypeEntity.values().length];
        try {
            iArr2[CardProductTypeEntity.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardProductTypeEntity.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardProductTypeEntity.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CardProductTypeEntity.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CardProductTypeEntity.SPLIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[YbCardStatusEntity.values().length];
        try {
            iArr3[YbCardStatusEntity.FROZEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[YbCardStatusEntity.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[YbCardStatusEntity.DELETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[YbCardStatusEntity.BLOCKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[YbCardStatusEntity.REISSUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[YbCardStatusEntity.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
    }
}
