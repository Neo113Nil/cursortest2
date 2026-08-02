package defpackage;

import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class lrj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PromoCodeStatus.values().length];
        try {
            iArr[PromoCodeStatus.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromoCodeStatus.RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
