package defpackage;

import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class id8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[YbCardStatusEntity.values().length];
        try {
            iArr[YbCardStatusEntity.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[CardCarouselProductType.values().length];
        try {
            iArr2[CardCarouselProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[CardCarouselProductType.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardCarouselProductType.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardCarouselProductType.CORP_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CardCarouselProductType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[SamsungPayState.InitializationResult.values().length];
        try {
            iArr3[SamsungPayState.InitializationResult.NOT_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[SamsungPayState.InitializationResult.NEED_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[SamsungPayState.InitializationResult.NEED_ACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SamsungPayState.InitializationResult.READY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
