package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kg01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransactionsState.values().length];
        try {
            iArr[TransactionsState.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionsState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionsState.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
