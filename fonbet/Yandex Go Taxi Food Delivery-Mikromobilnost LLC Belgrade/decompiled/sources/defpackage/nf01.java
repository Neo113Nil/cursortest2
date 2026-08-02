package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nf01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransactionsLoadType.values().length];
        try {
            iArr[TransactionsLoadType.NEXT_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionsLoadType.INITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionsLoadType.REFRESH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
