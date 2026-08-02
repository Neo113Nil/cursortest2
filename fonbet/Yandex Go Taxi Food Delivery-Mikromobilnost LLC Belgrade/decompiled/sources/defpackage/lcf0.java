package defpackage;

import com.ybsdk.feature.main.api.domain.entity.ProductsV4GradientEntity$GradientImageScaleType;
import com.ybsdk.feature.main.internal.domain.entities.ProductType;
import com.ybsdk.feature.main.internal.domain.entities.SubtitleTypeEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class lcf0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ProductType.values().length];
        try {
            iArr[ProductType.PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductType.OTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductType.WALLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductType.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductType.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ProductType.CORP_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[SubtitleTypeEntity.values().length];
        try {
            iArr2[SubtitleTypeEntity.ULTRA.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SubtitleTypeEntity.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[ProductsV4GradientEntity$GradientImageScaleType.values().length];
        try {
            iArr3[ProductsV4GradientEntity$GradientImageScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ProductsV4GradientEntity$GradientImageScaleType.FIT_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
