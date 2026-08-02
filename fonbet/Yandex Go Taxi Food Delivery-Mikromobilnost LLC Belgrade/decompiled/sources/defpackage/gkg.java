package defpackage;

import com.ybsdk.feature.dashboard.api.model.ProductId;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class gkg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductId.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductId.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ProductId.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
