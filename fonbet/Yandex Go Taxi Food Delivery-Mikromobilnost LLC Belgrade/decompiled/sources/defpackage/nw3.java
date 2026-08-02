package defpackage;

import com.ybsdk.feature.autotopup.api.dto.AutoTopupType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nw3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupType.values().length];
        try {
            iArr[AutoTopupType.LIMIT_EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupType.LIMIT_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoTopupType.REGULAR_PERIOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
