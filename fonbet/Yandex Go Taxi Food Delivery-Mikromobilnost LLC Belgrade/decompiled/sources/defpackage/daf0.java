package defpackage;

import com.ybsdk.feature.main.internal.data.network.dto.ProductTypeDto;
import com.ybsdk.feature.main.internal.data.network.dto.SubtitleTypeDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class daf0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SubtitleTypeDto.values().length];
        try {
            iArr[SubtitleTypeDto.ULTRA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubtitleTypeDto.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ProductTypeDto.values().length];
        try {
            iArr2[ProductTypeDto.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ProductTypeDto.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ProductTypeDto.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProductTypeDto.CORP_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProductTypeDto.PROMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ProductTypeDto.OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
