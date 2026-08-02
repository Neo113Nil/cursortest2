package defpackage;

import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nst0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SplitContractDraftStatusResponse.Status.values().length];
        try {
            iArr[SplitContractDraftStatusResponse.Status.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SplitContractDraftStatusResponse.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
