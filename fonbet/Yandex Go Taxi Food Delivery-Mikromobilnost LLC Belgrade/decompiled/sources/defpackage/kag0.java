package defpackage;

import com.ybsdk.feature.qr.payments.internal.domain.v2.result.Funding;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kag0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ResultStatus.values().length];
        try {
            iArr[ResultStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResultStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResultStatus.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ResultStatus.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ResultStatus.PROCESSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[Funding.values().length];
        try {
            iArr2[Funding.BOOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
