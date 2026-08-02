package defpackage;

import com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ezm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersAttentionDto.Style.values().length];
        try {
            iArr[ScootersAttentionDto.Style.PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersAttentionDto.Style.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersAttentionDto.Style.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
