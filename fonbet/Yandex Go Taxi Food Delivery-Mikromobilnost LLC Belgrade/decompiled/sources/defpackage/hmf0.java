package defpackage;

import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeStatusDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class hmf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PromoCodeStatusDto.values().length];
        try {
            iArr[PromoCodeStatusDto.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromoCodeStatusDto.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PromoCodeStatusDto.RESTRICTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PromoCodeStatusDto.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
