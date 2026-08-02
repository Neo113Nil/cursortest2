package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.KycStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class epx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KycStatus.values().length];
        try {
            iArr[KycStatus.LOCATION_DEMAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycStatus.LOCATION_DEADEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
