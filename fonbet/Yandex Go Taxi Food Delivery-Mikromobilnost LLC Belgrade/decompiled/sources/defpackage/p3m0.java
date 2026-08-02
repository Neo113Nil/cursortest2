package defpackage;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class p3m0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SavingsActionStatus.values().length];
        try {
            iArr[SavingsActionStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsActionStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsActionStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SavingsClosingVersion.values().length];
        try {
            iArr2[SavingsClosingVersion.V1.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SavingsClosingVersion.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
