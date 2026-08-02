package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class kho {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OfferTypeDto.values().length];
        try {
            iArr[OfferTypeDto.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OfferTypeDto.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OfferTypeDto.COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
