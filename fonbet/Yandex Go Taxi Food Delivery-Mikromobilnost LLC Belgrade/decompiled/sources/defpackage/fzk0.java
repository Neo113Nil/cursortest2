package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fzk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoundingStatusDto.values().length];
        try {
            iArr[RoundingStatusDto.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoundingStatusDto.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
