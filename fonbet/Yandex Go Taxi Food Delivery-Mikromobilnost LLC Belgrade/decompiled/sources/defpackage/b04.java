package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b04 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AutoTopupType.values().length];
        try {
            iArr[AutoTopupType.BALANCE_THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupType.UP_TO_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupShowOnly.values().length];
        try {
            iArr2[AutoTopupShowOnly.AUTO_TOP_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AutoTopupShowOnly.AUTO_FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
