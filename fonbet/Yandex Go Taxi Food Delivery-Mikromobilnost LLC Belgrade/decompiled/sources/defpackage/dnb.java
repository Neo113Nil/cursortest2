package defpackage;

import com.yandex.go.masstransit.sdk.client_api.ErrorCode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dnb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorCode.values().length];
        try {
            iArr[ErrorCode.MosmetroAuthRequired.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorCode.ClientError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
