package defpackage;

import com.yandex.go.scooters.misc.api.attention.domain.ScootersAttention$Chelka$Style;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class nzm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersAttention$Chelka$Style.values().length];
        try {
            iArr[ScootersAttention$Chelka$Style.PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersAttention$Chelka$Style.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersAttention$Chelka$Style.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
