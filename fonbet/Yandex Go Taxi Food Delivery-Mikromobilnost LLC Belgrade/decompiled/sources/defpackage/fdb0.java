package defpackage;

import com.ybsdk.feature.pfm.internal.domain.entities.PfmTextEntity$Amount$SignType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fdb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PfmTextEntity$Amount$SignType.values().length];
        try {
            iArr[PfmTextEntity$Amount$SignType.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmTextEntity$Amount$SignType.DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmTextEntity$Amount$SignType.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
