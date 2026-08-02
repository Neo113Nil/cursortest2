package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class drq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransactionsListShimmerType.values().length];
        try {
            iArr[TransactionsListShimmerType.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionsListShimmerType.SHORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
