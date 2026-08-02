package defpackage;

import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class iv3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupType.values().length];
        try {
            iArr[AutoTopupType.THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupType.AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
